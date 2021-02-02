package com.forgus.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
public class SubObj implements Serializable {
    private static final long serialVersionUID = -5847860901394632966L;

    private Date date;
    private LocalDateTime localDateTime;
    private SubObj sub;
    private List<SubObj> subList;
    private Set<SubObj> subSet;
    private SubObj[] subArray;
}
