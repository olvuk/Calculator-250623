package pro.sky.java.course2.calculator250623.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private int num1;
    private int num2;
    @Override
    public int getPlusResult() {
        return num1 + num2;
    }
    @Override
    public int getMinusResult() {
        return num1 - num2;
    }
    @Override
    public int getMultiplyResult() {
        return num1 * num2;
    }
    @Override
    public int getDivideResult() {
        return num1 / num2;
    }
}

