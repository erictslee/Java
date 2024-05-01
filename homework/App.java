package homework;

import java.util.Scanner;

import static java.awt.SystemColor.text;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("첫 번째 숫자를 입력하세요 :");
            Integer input1=sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요 :");
            Integer input2=sc.nextInt();


            System.out.println("사칙연산 기호를 입력하세요 :");
            String input3=sc.next();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String input4=sc.next();

            if(input4.equals("exit")){
                break;
            }

            int answer=0;

            switch (input3){

                case "+":
                    answer=input1+input2;
                    System.out.println("결과 : "+answer);
                    break;

                case "-":
                    answer=input1-input2;
                    System.out.println("결과 : "+answer);
                    break;

                case "*":
                    answer=input1*input2;
                    System.out.println("결과 : "+answer);
                    break;

                case "/":
                    answer=input1/input2;
                    System.out.println("결과 : "+answer);
                    break;
            }

        }


    }

}

