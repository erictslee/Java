package homework;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator calculator=new Calculator();

        int index=0; //
        while (true){

        System.out.println("첫 번째 숫자를 입력하세요 : ");
        int num1= sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요 : ");
        int num2= sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요 : ");
        Character operator= sc.next().charAt(0);

        int result= calculator.calculate(num1, num2, operator);

        calculator.getResults().add(result);

        System.out.println("결과 : "+result);


        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
        if(Objects.equals(sc.next(),"remove")){
            calculator.getResults().remove(index);
        }

        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        if(Objects.equals(sc.next(),"inquiry")){
            for (Integer res : calculator.getResults()) {
                System.out.println("Answers : "+ res);
            }
        }

        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료:)");
        String str2= sc.next();
        if(Objects.equals(str2, "exit")){
            break;
        }


        }


    }
}
