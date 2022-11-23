package com.example.domain.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org. springframework. stereotype.Service;

import com.example.domain.user.model.MasterUser;
import com.example.domain.user.service.NewRegisterService;
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
    public void addOne(MasterUser masterUser) {
        
        mapper.addOne(masterUser);
        
    }
    
}