package com.forgus.demo.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.List;

/**
 * 图书
 *
 * @author 孤峰
 * @since 2019/10/11
 */
@Data
public class Book implements Serializable {

    private static final long serialVersionUID = -371529167360182645L;

    /**
     * 编号
     */
    @NotNull
    @Min(1)
    private Long id;
    /**
     * 书名
     */
    @NotBlank
    @Length(min = 1,max = 20)
    private String name;
    /**
     * 定价
     */
    @NotNull
    @Range(min = 0,max = 99)
    private Long price;
    /**
     * 作者
     */
    @NotBlank
    @Length(max = 10)
    private String author;

    /**
     * 所属分类
     */
    @NotEmpty
    @Size(max = 10)
    private List<String> categories;

}
