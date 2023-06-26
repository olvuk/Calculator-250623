package pro.sky.java.course2.calculator250623.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int getPlusResult(int num1, int num2) {
        return num1 + num2;
    }
    @Override
    public int getMinusResult(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int getMultiplyResult(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public double getDivideResult(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Divide by zero error");
        }
        else {
            return (double) num1 / num2;
        }
    }
}

