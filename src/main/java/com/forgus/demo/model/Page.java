package com.forgus.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {

    /**
     * 数据集
     */
    private List<T> records;
    /**
     * 页码
     */
    private Integer pageNo;
}
