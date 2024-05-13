package com.sparta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test // 테스트 에너테이션 이게 붙어있으면 테스트 환경에서 실행하는 거다 알면된다.
    @DisplayName("더하기 테스트")
    void test1() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "+", 2);
        System.out.println("더하기 결과 = " + result);
        // 예상값을 넣는곳, expected 항목에 예상되는 값을 넣어서 구동했을때 에러가 나오면 예상값과 다르다는 것이다.
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 2);
        System.out.println("나누기 결과 = " + result);

        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void test3() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "*", 2);
        System.out.println("곱하기 결과 = " + result);

        Assertions.assertEquals(16, result);
    }

    @Test
    @DisplayName("빼기 테스트")
    void test4() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "-", 2 );
        System.out.println("빼기 결과 = " + result);

        Assertions.assertEquals(6, result);
    }
}