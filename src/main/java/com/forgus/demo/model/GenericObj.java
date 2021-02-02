package com.forgus.demo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class GenericObj implements Serializable {
    private static final long serialVersionUID = -4915572176115165510L;

    /**
     * 值1
     */
    private String v1;
    /**
     * 值2
     */
    private String v2;

}
