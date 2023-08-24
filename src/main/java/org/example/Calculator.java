package org.example;

public class Calculator {
    public int add(int a, int b) throws Exception{

        if(a > 10 || b > 10){
            throw new Exception();// 강제로 예외발생시키는 것

        } else {
            int result = a + b;
            return result; // 받은 결과 값을 반환해준다.
            
        }


    }

}
