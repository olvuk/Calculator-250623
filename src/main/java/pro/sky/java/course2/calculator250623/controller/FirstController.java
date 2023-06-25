package pro.sky.java.course2.calculator250623.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator250623.service.CalculatorService;
import pro.sky.java.course2.calculator250623.service.WelcomeService;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    private final CalculatorService calculatorService;
    private final WelcomeService welcomeService = new WelcomeService();

    public FirstController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String welcome() {
        return welcomeService.showWelcome();
    }

    @GetMapping("/plus")
    public String getPlusResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getPlusResult(num1, num2);

    }

    @GetMapping("/minus")
    public String getMinusResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.getMinusResult(num1, num2);

    }

    @GetMapping("/multiply")
    public String getMultiplyResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.getMultiplyResult(num1, num2);

    }

    @GetMapping("/divide")
    public String getDivideResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " / " + num2 + " = " + calculatorService.getDivideResult(num1, num2);

    }
}

