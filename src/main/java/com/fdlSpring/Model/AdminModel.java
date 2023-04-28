package com.fdlSpring.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class AdminModel {

    private String adminId;
    private String adminName;
    private String adminEmail;
    private String adminUserName;




}
