package com.service.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("피연산자 두 개를 띄어쓰기로 입력해주세요. : ");
    String [] operations = bufferedReader.readLine().split(" ");
    double firstoperation = Integer.parseInt(operations[0]);
    double secondoperation = Integer.parseInt(operations[1]);
    System.out.print("연산자를 입력해주세요. : ");
    String operation = bufferedReader.readLine();
    new Calculator(firstoperation,secondoperation,operation);
  }

}
