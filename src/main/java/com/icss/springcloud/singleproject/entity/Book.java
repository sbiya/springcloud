package com.icss.springcloud.singleproject.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

@TableName
public class Book {
    @TableId
//    @GeneratedValue(generator = "JDBC",strategy = GenerationType.IDENTITY)
    private Integer id;
//    @Column(name ="book_type_id")
    private Integer bookTypeId;
    private String bookName;
//    @Transient
//    private String bookNameEnglish;
    private String bookAuthor;
    private Double bookPrice;
    @JsonFormat(pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM")
    private Date writeDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creatDate;


    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }
}
