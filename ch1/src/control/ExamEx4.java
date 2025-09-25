package control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        // 사칙 연산(+,-,*,/) 계산기
        // 사용자로부터 2개의 숫자와 연산자를 입력받기
        // 15,25 +
        // 15 + 25 = 40

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수 >>");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("두번째 수 >>");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("연산자 >>");
        String op = sc.nextLine();

        // op == "+" or op == "-" or op == "*" or op == "/"
        // op.equals("+")
        int result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
            case "/":
                result = num1 / num2;
                break;

            default:
                break;
        }
        System.out.printf("%d %s %d = %d", num1, op, num2, result);

    }

}
