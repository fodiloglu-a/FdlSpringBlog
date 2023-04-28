package com.fdlSpring.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class ReaderModel {

    @Id
    private String readerId;
    private String readerName;
    private String readerSurname;
    private String readerEmail;
    private String readerUserName;



}
