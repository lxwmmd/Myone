package com.lxwmmd.mapper;

import com.lxwmmd.pojo.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lxwmmd
 * @since 2021-04-20
 */
@Repository
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
