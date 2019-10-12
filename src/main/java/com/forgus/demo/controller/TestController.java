package com.forgus.demo.controller;

import com.forgus.demo.model.IntegrityTemplateDto;
import com.forgus.demo.model.Response;
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
     * url测试
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}/copy", method = RequestMethod.GET)
    public Response<Boolean> copyTemplate(@PathVariable Long id) {
        return null;
    }

    /**
     * 循环引用测试
     *
     * @param id
     * @param templateDto
     * @return
     */
    @RequestMapping(value = "/{id}/update", method = RequestMethod.POST)
    public Response<Boolean> updateTemplate(@PathVariable Long id, @RequestBody IntegrityTemplateDto templateDto) {
        return null;
    }

}
