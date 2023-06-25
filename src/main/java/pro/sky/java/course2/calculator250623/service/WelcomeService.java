package pro.sky.java.course2.calculator250623.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }
}
