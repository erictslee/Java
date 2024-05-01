package homework;

import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray= new int[10];
        int currentIndex=0; //현재 배열에 저장된 요소의 개수
        int answer = 0;
        int count=1;

        while(true) {

            System.out.println("첫 번째 숫자를 입력하세요 :");
            Integer input1 = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요 :");
            Integer input2 = sc.nextInt();


            System.out.println("사칙연산 기호를 입력하세요 :");
            String input3 = sc.next();

            System.out.println("count : "+count);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String input4 = sc.next();



            if (input4.equals("exit")) {
                break;
            }



            switch (input3) {

                case "+":
                    answer = input1 + input2;
                    if(currentIndex < intArray.length) {
                        intArray[currentIndex] = answer;
                        count++;
                    }else {

                        System.out.println("배열이 가득 찼습니다.");
                    }
                    break;

                case "-":
                    answer = input1 - input2;
                    if(currentIndex < intArray.length) {
                        intArray[currentIndex] = answer;
                        count++;
                    }else {

                        System.out.println("배열이 가득 찼습니다.");
                    }
                     break;

                case "*":
                    answer = input1 * input2;
                    if(currentIndex < intArray.length) {
                        intArray[currentIndex] = answer;
                        count++;
                    }else {

                        System.out.println("배열이 가득 찼습니다.");
                    }
                    break;

                case "/":
                    answer = input1 / input2;
                    if(currentIndex < intArray.length) {
                        intArray[currentIndex] = answer;
                        count++;
                    }else {

                        System.out.println("배열이 가득 찼습니다.");
                    }
                    break;



            }

        }


    }

}

