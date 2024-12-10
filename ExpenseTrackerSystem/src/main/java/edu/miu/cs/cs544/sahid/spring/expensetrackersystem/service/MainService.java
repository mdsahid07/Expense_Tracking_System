package edu.miu.cs.cs544.sahid.spring.expensetrackersystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class MainService {
    public String helloService() {
        return "Hello World. This is Service.....";
    }
}
