package com.forgus.demo.controller;

import com.forgus.demo.model.*;
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

    @GetMapping("/noName")
    public Response testNoName() {
        return null;
    }

    /**
     * 多路径测试
     * @return
     */
    @RequestMapping(value = {"/api/restful/dd/sendDdNotify", "/api/restful/dd/sendNotify"}, method = RequestMethod.POST)
    public Response multiPath() {
        return null;
    }

    /**
     * 嵌套泛型
     *
     * @param param
     * @return
     */
    @PostMapping(value = "/array")
    public Response<Page<Book>> testArray(@RequestBody ArrayParam param) {
        return null;
    }

    /**
     * 嵌套2
     * @return
     */
    @GetMapping(value = "/werewr")
    public GenericObj<Book> test2() {
        return null;
    }

    /**
     * 循环引用
     * @return
     */
    @GetMapping("/relSelf")
    public Response<Node> node() {
        return null;
    }

    /**
     * 复杂结构
     * @return
     */
    @GetMapping("/complex")
    public TopObj<SubObj> complex() {
        return null;
    }

}
