package com.example.form;
import lombok.Data;


@Data
public class NewRegisterForm{
    private int userId;
    private String name;
    private String nameKana;
    private String mailAddress;
    private String passWord;
}
