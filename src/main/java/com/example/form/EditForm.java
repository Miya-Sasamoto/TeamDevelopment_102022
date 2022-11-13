package com.example.form;
import lombok.Data;


@Data
public class EditForm{
    private String userId;
    private String name;
    private String nameKana;
    private String mailAddress;
    private String passWord;
}