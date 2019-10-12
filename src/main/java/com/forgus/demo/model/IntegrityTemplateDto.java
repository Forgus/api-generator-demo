package com.forgus.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 孤峰
 * @since 2019/10/12
 */
@Data
public class IntegrityTemplateDto implements Serializable {
    private static final long serialVersionUID = -4025601261955220805L;


    /**
     * 节点配置,树状结构存储
     */
    private List<IntegrityConfigDto> nodes;
}
