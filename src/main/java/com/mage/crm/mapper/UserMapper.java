package com.mage.crm.mapper;

import com.mage.crm.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select id ,user_name ,user_pwd ,true_name,email ," +
            " phone ,is_valid ,create_date ,update_date from " +
            " t_user where is_valid = 1")
    List<User> findAll();
}
