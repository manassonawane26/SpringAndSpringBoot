package com.spring.app.service;

import com.spring.app.repo.LaptopRepository;
import com.spring.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        System.out.println("AddLaptop() Called");
        repo.save(lap);
    }
    public boolean isGoodForProgramming(Laptop lap){
        return true;
    }
}
