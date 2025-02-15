package com.dominikdorn.javavienna.multilang;

import com.dominikdorn.javavienna.multilang.samples.RandomNumberGen;
import com.dominikdorn.javavienna.multilang.samples.s00x_randomnumber.S001_JSRandomNumberGen;
import com.dominikdorn.javavienna.multilang.samples.s00x_randomnumber.S002_PyRandomNumberGen;
import com.dominikdorn.javavienna.multilang.samples.s00x_randomnumber.S003_RubyRandomNumberGen;
import com.dominikdorn.javavienna.multilang.samples.s00x_randomnumber.S004_WasmRandomNumberGen;
import com.dominikdorn.javavienna.multilang.samples.s10x_call_functions.S101_JSCalculator;
import com.dominikdorn.javavienna.multilang.samples.s10x_call_functions.S102_PyCalculator;
import com.dominikdorn.javavienna.multilang.samples.s10x_call_functions.S103_RubyCalculator;
import com.dominikdorn.javavienna.multilang.samples.s10x_call_functions.S104_AdvancedJSCalculator;
import com.dominikdorn.javavienna.multilang.samples.s20x_value_access.S201_JSPersonJsonParserUnsafe;
import java.util.Scanner;

public class SelectorApp {

  public static void main(String[] args) throws Exception{
    System.out.println("Welcome Java Vienna Community!");

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Please choose your sample!");
      System.out.println("001 - Get a random number from Javascript");
      System.out.println("002 - Get a random number from python");
      System.out.println("003 - Get a random number from ruby");
      System.out.println("004 - Get a random number from wasm");
      System.out.println("101 - Simple JS Calculator");
      System.out.println("102 - Simple Python Calculator");
      System.out.println("103 - Ruby Calculator");
      System.out.println("104 - Advanced JS Calculator");
//      System.out.println("201 - JSON Parser JS Unsafe");
//      System.out.println("301 - JSON Parser JS Safe");
//      System.out.println("302 - Json Parser Python");
//      System.out.println("303 - Json Parser Ruby");
//      System.out.println("401 - exposing java methods");



      System.out.println("exit - Exit the program");

      String input = scanner.nextLine();
      switch (input) {
        case "001": {
          RandomNumberGen gen = new S001_JSRandomNumberGen();
          System.out.println("Generated random number: " + gen.getRandomNumber());
          break;
        }
        case "002": {
          RandomNumberGen gen = new S002_PyRandomNumberGen();
          System.out.println("Generated random number: " + gen.getRandomNumber());
          break;
        }
        case "003": {
          RandomNumberGen gen = new S003_RubyRandomNumberGen();
          System.out.println("Generated random number: " + gen.getRandomNumber());
          break;
        }
        case "004": {
          RandomNumberGen gen = new S004_WasmRandomNumberGen();
          System.out.println("Generated random number: " + gen.getRandomNumber());
          break;
        }

        case "101": {
          try(var calc = new S101_JSCalculator()) {
            var result = calc.add(5,3);
            System.out.println("Result 5+3 = " + result);
          }
        }
        case "102": {
          try(var calc = new S102_PyCalculator()) {
            var result = calc.add(5,3);
            System.out.println("Result 5+3 = " + result);
          }
        }
        case "103": {
          try(var calc = new S103_RubyCalculator()) {
            var result = calc.add(5,3);
            System.out.println("Result 5+3 = " + result);
          }
        }

        case "104": {
          try(var calc = new S104_AdvancedJSCalculator()) {
            var result = calc.add(5,3);
            System.out.println("Result 5+3 = " + result);
          }
        }
//        case "201": {
//          try(var parser = new S201_JSPersonJsonParserUnsafe()){
//            parser.
//          }
//        }


        case "exit":
          System.out.println("bye bye");
          System.exit(0);
        default:
          System.out.println("Invalid input!");
          break;
      }

    }
  }
}
