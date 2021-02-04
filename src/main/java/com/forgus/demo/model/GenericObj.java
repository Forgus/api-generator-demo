package com.forgus.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GenericObj<T> implements Serializable {
    private static final long serialVersionUID = -4915572176115165510L;

    private String str;
    private List<T> list;
    private Page<T> page;

}
