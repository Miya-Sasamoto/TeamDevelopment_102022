package com.example.form;
import lombok.Data;


@Data
public class EditForm{
    private Integer userId;
    private String name;
    private String nameKana;
    private String mailAddress;
    private String passWord;
}