package com.ist.svc.controller.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Author: sunhaitao
 */
@Setter
@Getter
public class QueryProdInfoByProdTypeReq extends BaseReq {
    @NotBlank(message = "prodType不能为空")
    private String prodType;
    @NotNull(message = "pageSize不能为null")
    @Min(value = 1,message = "pageSize不能小于1")
    private Integer pageSize;
    @NotNull(message = "pageNum不能为null")
    @Min(value = 1,message = "pageNum不能小于1")
    private Integer pageNum;
}
