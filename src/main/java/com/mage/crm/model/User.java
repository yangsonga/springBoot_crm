package com.mage.crm.model;

import com.mage.crm.base.BaseVo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseVo {
    private String id="1";
    private String userName="杨松";
    private String userPwd;
    private String trueName;
    private String phone;
    private String email;
}
