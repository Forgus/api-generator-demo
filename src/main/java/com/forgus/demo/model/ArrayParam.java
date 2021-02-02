package com.forgus.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 孤峰
 * @since 2019/10/14
 */
@Data
public class ArrayParam implements Serializable {
    private static final long serialVersionUID = 6949495909966580478L;

    private Long[] ids;

}
