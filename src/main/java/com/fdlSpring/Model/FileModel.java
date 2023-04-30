package com.fdlSpring.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class FileModel {//Kullanıcı file dosyası şeklinde blogunu yüklemelidir.
    @Id
    private String fileId;
    private byte[] file;
}
