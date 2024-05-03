package homework;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private  List<Integer> results=new ArrayList<>();

    public int calculate(int num1, int num2,char operator) {

     int result=0;

     switch(operator){

         case '+':
             result= num1 + num2;
             break;

         case '-':
             result= num1 - num2;
             break;

         case'*':
             result =num1 * num2;
             break;

         case '/':
             if(num2 !=0){
                 result= num1 / num2;
             }else{
                 throw new ArithmeticException("나눗셈 연산에서 부모에 0이 입력될 수 없습니다.");
             }

         default:
             throw new ArithmeticException("유효하지 않은 연산자입니다.");


        }
        return result;

    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void removeResult(int index{
        this.results.remove(index);
    }


}