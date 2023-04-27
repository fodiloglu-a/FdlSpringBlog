package com.fdlSpring.Facades.ReaderDTO;

import lombok.Data;

@Data
public class ReaderResponse {
    private String readerId;
    private String readerName;
    private String readerSurname;
    private String readerEmail;
    private String readerUserName;
}
