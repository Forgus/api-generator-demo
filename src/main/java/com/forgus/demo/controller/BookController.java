package com.forgus.demo.controller;

import com.forgus.demo.model.Book;
import com.forgus.demo.model.BookQuery;
import com.forgus.demo.model.Response;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 图书管理
 *
 * @author 孤峰
 * @since 2019/10/11
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

    /**
     * 添加图书
     *
     * @param book
     * @return
     */
    @PostMapping
    public Response addBook(@RequestBody Book book) {
        return null;
    }

    /**
     * 根据id删除图书
     *
     * @param id 图书编号
     * @return
     */
    @DeleteMapping("/{id}")
    public Response deleteBook(@PathVariable Long id) {
        return null;
    }

    /**
     * 更新图书
     *
     * @param id 图书编号
     * @param book
     * @return
     */
    @PatchMapping("/{id}")
    public Response updateBook(@PathVariable Long id,@RequestBody Book book) {
        return null;
    }

    /**
     * 根据id查询图书
     *
     * @param id 图书编号
     * @return
     */
    @GetMapping("/{id}")
    public Response<Book> getBook(@PathVariable Long id) {
        return null;
    }

    /**
     * 根据书名查询图书
     *
     * @param bookName 书名
     * @return
     */
    @GetMapping("/{bookName}")
    public Response<List<Book>> listBooks(@RequestParam("name") String bookName) {
        return null;
    }

    /**
     * 多条件查询图书
     *
     * @param query 查询参数
     * @return
     */
    @GetMapping("/query")
    public List<Book> listBooks(BookQuery query) {
        return null;
    }
}
