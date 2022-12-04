package com.example.calculator.calculate;

//PositiveNumber 객체가 만들어졌다는 것은 0,음수가 아니라 양수라는 것,
//고로 int->PositiveNumber로 바껴~~
public class PositiveNumber {
    private final int value;

    public PositiveNumber(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if(isNagativeNumber(value)){
            throw new IllegalArgumentException("0 또는 음수를 전달할 수 없습니다.");
        }
    }

    private boolean isNagativeNumber(int value) {
        return value <=0;
    }

    public int toInt(){
        return value;
    }
}
