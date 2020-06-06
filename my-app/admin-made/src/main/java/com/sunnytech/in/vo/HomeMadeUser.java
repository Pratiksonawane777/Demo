package com.sunnytech.in.vo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;

@Data
@Document(collection = "Users")
public class HomeMadeUser {

    String firstName;
    String lastName;
    String userName;
    @Email
    String email;
    String password;
    String address;
    String pinCode;
    WorkTheyCanDO workTheyCanDO;

}
