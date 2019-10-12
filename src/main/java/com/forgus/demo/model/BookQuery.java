package com.forgus.demo.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * 图书搜索条件
 *
 * @author 孤峰
 * @since 2019/10/11
 */
@Data
public class BookQuery implements Serializable {

    private static final long serialVersionUID = -6745178893244109863L;

    /**
     * 书名
     */
    @Length(min = 1,max = 20)
    private String name;
    /**
     * 作者
     */
    @Length(max = 10)
    private String author;

}
