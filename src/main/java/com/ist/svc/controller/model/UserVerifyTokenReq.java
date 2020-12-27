package com.ist.svc.controller.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;

/**
 * @Author: sunhaitao
 */

@Setter
@Getter
public class UserVerifyTokenReq extends BaseReq {
    @NotBlank(message = "userId不能为空")
    private String userId;
    @NotBlank(message = "tokenId不能为空")
    private String tokenId;
    private String loginName;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
