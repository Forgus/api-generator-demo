package com.forgus.demo.controller;

import com.forgus.demo.model.ArrayParam;
import com.forgus.demo.model.Book;
import com.forgus.demo.model.Response;
import com.forgus.demo.model.TopObj;
import org.springframework.web.bind.annotation.*;

/**
 * 测试
 *
 * @author 孤峰
 * @since 2019/10/12
 */
@RestController
@RequestMapping(value = "/api/test")
public class TestController {

    /**
     * 多路径测试
     * @return
     */
    @RequestMapping(value = {"/api/restful/dd/sendDdNotify", "/api/restful/dd/sendNotify"}, method = RequestMethod.POST)
    public Response multiPath() {
        return null;
    }

    /**
     * 终极测试
     *
     * @param param
     * @return
     */
    @PostMapping(value = "/array")
    public TopObj<Book> testArray(@RequestBody ArrayParam param) {
        return null;
    }




}
