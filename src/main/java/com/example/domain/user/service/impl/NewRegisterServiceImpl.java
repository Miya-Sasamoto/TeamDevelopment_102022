package com.example.domain.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org. springframework. stereotype.Service;

import com.example.domain.user.service.NewRegisterService;
import com.example.form.NewRegisterForm;
import com.example.repository.SugawaraMapper;

@Service
public class NewRegisterServiceImpl implements NewRegisterService {
    
    @Autowired 
    private SugawaraMapper mapper;
    
    /**ユーザー登録*/
//    @Override 
//    public void signup(MUser user) { 
//        
//    mapper.insertOne(user);
//    }

    @Override
    public void add(NewRegisterForm form) {
        
        mapper.add(form);
        
    }
    
}