package com.forgus.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TopObj<T> implements Serializable {

    private static final long serialVersionUID = -884618193474865147L;

    private String str;
    private String[] strArray;
    private List<String> strList;
    private T generic;
    private T[] genericArray;
    private List<T> genericList;

    private SubObj obj;
    private Page<T> page;
    private List<SubObj> objList;
    private SubObj[] objArray;


}
