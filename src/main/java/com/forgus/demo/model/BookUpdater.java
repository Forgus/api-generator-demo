package com.forgus.demo.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * 图书更新模型
 *
 * @author 孤峰
 * @since 2019/10/11
 */
@Data
public class BookUpdater implements Serializable {

    private static final long serialVersionUID = -3118900817407593905L;

    /**
     * 书名
     */
    @Length(min = 1,max = 20)
    private String name;
    /**
     * 定价
     */
    @Range(min = 0,max = 99)
    private Long price;
    /**
     * 作者
     */
    @Length(max = 10)
    private String author;

    /**
     * 所属分类
     */
    @Size(max = 10)
    private List<String> categories;

}
