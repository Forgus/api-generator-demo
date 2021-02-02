package com.forgus.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class TopObj<T> implements Serializable {

    private static final long serialVersionUID = -884618193474865147L;

    private Integer integer;
    private int anInt;
    private Boolean aBoolean;
    private boolean bool;
    private String str;
    private String[] array;
    private List<String> strList;
    private Set<String> strSet;
    private Map<String,String> strMap;
    private T generic;
    private T[] genericArray;
    private List<T> genericList;
    private Set<T> genericSet;

    private SubObj obj;
    private List<SubObj> objList;
    private Set<SubObj> objSet;
    private SubObj[] objArray;


}
