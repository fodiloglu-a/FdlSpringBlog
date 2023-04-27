package com.fdlSpring.Facades.ReaderDTO;

import lombok.Data;

@Data
public class ReaderRequest {
    private String readerId;
    private String readerName;
    private String readerSurname;
    private String readerEmail;
    private String readerUserName;
}
