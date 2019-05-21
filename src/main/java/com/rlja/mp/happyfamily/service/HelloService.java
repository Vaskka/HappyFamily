package com.rlja.mp.happyfamily.service;

import com.rlja.mp.happyfamily.dao.HelloRepository;
import com.rlja.mp.happyfamily.utils.Util;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: happyfamily
 * @description: HelloService
 * @author: Vaskka
 * @create: 2019/4/29 9:59 AM
 **/
@Service
public class HelloService {

    @Autowired
    private HelloRepository repository;

    public void insert(String name) {

        repository.insert(new HelloEntity(Util.md5(Util.current()), name));
    }

    public List<HelloEntity> getAll() {
        return repository.findAll();
    }
}
