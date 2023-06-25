package pro.sky.java.course2.calculator250623.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator250623.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    private final CalculatorService calculatorService;

    public FirstController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String getPlusResult(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getPlusResult();

    }

    @GetMapping("/minus")
    public String getMinusResult(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.getMinusResult();

    }

    @GetMapping("/multiply")
    public String getMultiplyResult(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.getMultiplyResult();

    }

    @GetMapping("/divide")
    public String getDivideResult(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " / " + num2 + " = " + calculatorService.getDivideResult();

    }
}

