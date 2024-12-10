package edu.miu.cs.cs544.sahid.spring.expensetrackersystem;

import edu.miu.cs.cs544.sahid.spring.expensetrackersystem.service.MainService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExpenseTrackerSystemApplication {
    @Bean
    public MainService mainService() {
        return new MainService();
    }

    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerSystemApplication.class, args);
    }

}
