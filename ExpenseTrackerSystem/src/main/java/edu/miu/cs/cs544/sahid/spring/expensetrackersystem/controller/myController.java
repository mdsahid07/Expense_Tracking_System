package edu.miu.cs.cs544.sahid.spring.expensetrackersystem.controller;

import edu.miu.cs.cs544.sahid.spring.expensetrackersystem.service.MainService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class myController {
    private final MainService mainService;

    public myController(MainService mainService) {
        this.mainService = mainService;
    }

    @RequestMapping(method= RequestMethod.GET,path="/mySvc")
    public String helloSpring(){
        return mainService.helloService();
    }
}
