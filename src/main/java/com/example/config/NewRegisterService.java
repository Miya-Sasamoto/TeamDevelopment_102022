package com.example.config;
import java.util.Map;

import org.springframework.beans.factory.annotation. Autowired;
import org.springframework.stereotype. Service;
@Service
public class NewRegisterService {
@Autowired
private NewRegisterRepository repository;
/* 従業員を1人取得する*/
public Employee getEmployee(String id) {
// 検索
Map<String, Object> map = repository.findById(id);
// Mapから値を取得
String employeeld = (String) map.get("id");
String name = (String) map.get("name"); int age = (Integer) map.get("age");
// Emploveeクラスに値をセット Emplovee emplovee= n e w Emplovee():
Employee employee = new Employee(); 
employee.setEmployeeld(employeeld); 
employee.setEmployeeName(name); 
employee.setEmployeeAge(age);
return employee;
}

}