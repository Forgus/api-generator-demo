package com.forgus.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SubObj implements Serializable {
    private static final long serialVersionUID = -5847860901394632966L;

    private Date date;
    private SubObj sub;
    private List<SubObj> subList;
    private SubObj[] subArray;
    private TopObj topObj;
}
