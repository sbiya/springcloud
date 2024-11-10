package com.icss.springcloud.singleproject.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.icss.springcloud.singleproject.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//@org.apache.ibatis.annotations.Mapper
@Mapper
public interface BookMapper extends BaseMapper<Book> {
    public List<Book> bookList(@Param("id") String id
            , @Param("bookAuthor") String bookAuthor
            , @Param("writeDate") String writeDate) throws Exception;
    public List<Book> bookVoList(@Param("id") String id
            , @Param("bookAuthor") String bookAuthor
            , @Param("writeDate") String writeDate) throws Exception;

    public int addBook(Book book) throws Exception;

}