package com.lxwmmd;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lxwmmd.mapper.BookMapper;
import com.lxwmmd.mapper.UserMapper;
import com.lxwmmd.pojo.Book;
import com.lxwmmd.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class MyoneApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
   UserMapper userMapper;
    @Autowired
    BookMapper bookMapper;


    @Test
    void contextLoads()  {

    }

    @Test
    void ConnetMySqlText() throws SQLException{
        System.out.println("dataSource.getClass() = " + dataSource.getClass());
        System.out.println( dataSource.getConnection());
    }


    @Test
    void bookmsql(){
      // bookMapper.selectById(1);//sout
    Book book=new Book();
    book.setAuthor("mmd");
    book.setName("安卓开发入门到精通");
    bookMapper.insert(book);
        System.out.println("book = " + book);


    }

    @Test
    void bookup(){
        Book book = bookMapper.selectById(17);
        book.setAuthor("mmdxg");
        bookMapper.updateById(book);
    }
    @Test
    void booksql(){
        bookMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    //分页
    void fengye(){
        Page<Book> bookPage=new Page<>(1,2);
        Page<Book> result = bookMapper.selectPage(bookPage, null);
        result.getRecords();
    }
}
