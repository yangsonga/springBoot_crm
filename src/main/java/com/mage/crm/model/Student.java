package com.mage.crm.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    private Integer id;
    private String name;
    private Date birthday;
    private String phone;

}
