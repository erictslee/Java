package homework;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

        int input1 = Integer.parseInt(sc.nextLine());

        System.out.print("두 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

        int input2 = Integer.parseInt(sc.nextLine());

        System.out.print("사칙연산 기호를 입력하세요: ");
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

        String input3= sc.nextLine();

        if(input3.equals("+")){
            System.out.println(input1 + input2);
        }else if(input3.equals("-")){
            System.out.println(input1 - input2);
        }else if(input3.equals("*")){
            System.out.println(input1*input2);
        }else if(input3.equals("/")){
            System.out.println(input1/input2);
        }
    }
}