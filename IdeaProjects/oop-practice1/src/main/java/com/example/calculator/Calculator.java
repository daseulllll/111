package com.example.calculator;

import com.example.calculator.calculate.*;

import java.util.List;

public class Calculator {

   private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new DivisionOperator(), new MultiplicationOperator()) ;
   public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2){
//   public static int calculate(int operand1, String operator, int operand2){
      return arithmeticOperators.stream()
              .filter(arithmeticOperator ->arithmeticOperator.supports(operator))
              .map(arithmeticOperator->arithmeticOperator.calculate(operand1,operand2))
              .findFirst()
              .orElseThrow(()->new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
   }

   /* Arithmetic enum으로 사용
   public static int calculate(int operand1, String operator, int operand2){
      return ArithmeticOperator.calculate(operand1,operator,operand2);
   }
*/

   /* Arithmetic enum 만들기 전
    public static int calculate(int operand1, String operator, int operand2) {
        if("+".equals(operator)){
            return operand1+operand2;
        } else if ("-".equals(operator)) {
            return operand1-operand2;
        } else if ("*".equals(operator)) {
            return operand1*operand2;
        } else if ("/".equals(operator)) {
                return operand1/operand2;
        }return 0;
    }
    */
}
