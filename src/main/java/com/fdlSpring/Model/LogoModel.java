package com.fdlSpring.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class LogoModel {
    @Id
    private String logoId;
    private byte[] logoImg;
    private String logoUri;
}
