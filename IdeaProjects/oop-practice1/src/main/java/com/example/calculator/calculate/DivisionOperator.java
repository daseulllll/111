package com.example.calculator.calculate;

public class DivisionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
//    public int calculate(int operand1, int operand2) {
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
//        if (operand2 == 0){
      /* PositiveNumber자체가 이제 양수이기 때문에 필요x
        if (operand2.toInt() == 0){
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }*/
        return operand1.toInt() / operand2.toInt();
//        return operand1 / operand2;
    }
}
