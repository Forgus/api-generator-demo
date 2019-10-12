package com.forgus.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一响应结构
 *
 * @author 孤峰
 * @since 2019/10/11
 */
@Data
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -5184306318720229111L;

    /**
     * 业务响应是否成功
     */
    private boolean success;

    /**
     * 业务响应体
     */
    private T data;

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误提示信息
     */
    private String message;

}
