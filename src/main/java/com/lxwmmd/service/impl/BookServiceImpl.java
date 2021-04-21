package com.lxwmmd.service.impl;

import com.lxwmmd.pojo.Book;
import com.lxwmmd.mapper.BookMapper;
import com.lxwmmd.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lxwmmd
 * @since 2021-04-20
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper,Book> implements IBookService {

}
