package basic;

import java.util.Scanner;

//System.in : 키보드
//System.out : 화면

public class ScannerEx4 {
    public static void main(String[] args) {
        // ScannerEx3 개선
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자입력 : ");

        // 입력받기 : sc.nextLine() ==> ""
        // "" 을 없애야 한다면 Integer.parseInt 또는 Float.parseFloat
        // 또는 Double.parseDouble 사용

        // String num1 = sc.nextLine(); // 35 엔터
        int input1 = Integer.parseInt(sc.nextLine());
        // float input1 = Float.parseFloat(sc.nextLine());
        // double input1 = Double.parseDouble(sc.nextLine());

        System.out.println("연산자 입력 : "); // +,-,*,/
        String op = sc.nextLine();

        System.out.println("두번째 숫자입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());
        System.out.println(op);
        System.out.println(input1 + input2);
        sc.close();
    }

}
