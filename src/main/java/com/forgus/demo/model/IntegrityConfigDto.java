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
public class IntegrityConfigDto implements Serializable {

    private static final long serialVersionUID = 5948834173059659442L;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 子节点集合
     */
    private List<IntegrityConfigDto> children;

    /*
     * 透传 do 字段
     */
    private Boolean hasChildren;

    /**
     * 是否有子节点  dto 透传到 do
     *
     * @return
     */
    public boolean hasChild() {
        return children != null && children.size() > 0;
    }
}
