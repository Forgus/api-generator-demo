package com.forgus.demo.service;

import com.forgus.demo.model.Book;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * 图书服务
 */
public interface BookService {

    /**
     * 根据书名查询图书
     *
     * @param name 书名
     * @return
     */
    List<Book> listBooks(@NotBlank String name);

}
