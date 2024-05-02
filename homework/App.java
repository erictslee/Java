package homework;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        List<Integer> results = new ArrayList<>();


        while (true) {

            System.out.println("첫 번째 숫자를 입력하세요 : ");
            int input1 = scanner.nextInt();

            System.out.println("두 번째 숫자를 입력하세요 :");
            int input2 = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요 :");
            String input3 = scanner.next();


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String input4 = scanner.next();


            if (input4.equals("exit")) {
                break;
            }

            switch (input3) {

                case "+": {
                    result = input1 + input2;
                    break;
                }

                case "-": {
                    result = input1 - input2;
                    break;
                }

                case "*": {
                    result = input1 * input2;
                    break;
                }

                case "/": {
                    result = input1 / input2;
                    break;
                }
                default:
                    System.out.println("올바른 접근이 아닙니다.");

                    break;


            }

            System.out.println("결과 : " + result);
            results.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (Objects.equals(scanner.next(), "remove")) {
                results.remove(0);

            }
            System.out.println("결과 저장소 : " + results);

        }
    }
}