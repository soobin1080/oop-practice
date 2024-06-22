package org.example;

import org.example.calculate.*;

import java.util.List;

public class Calculator {
    private static final List<NewArithMeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MutiplicationOperator(), new DivisionOperator());

    public static int calculate(PositiveNumber operand1, String opperator, PositiveNumber operand2) {
        return arithmeticOperators.stream()
                .filter(arithmeticOperators -> arithmeticOperators.support(opperator))
                .map(arithmeticOperators -> arithmeticOperators.calculate(operand1,operand2))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("올바른 사직연산이 아닙니다."));
    }
}
