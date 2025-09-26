package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {
        // ----------------------------------
        // 1.예금 | 2. 출금 3. 잔고 | 4. 종료
        // ----------------------------------
        // 선택 >> 1
        // 입금액 >> 100000
        // ----------------------------------
        // 1.예금 | 2. 출금 3. 잔고 | 4. 종료
        // ----------------------------------
        // 선택 >> 2
        // 출금액 >> 20000
        // ----------------------------------
        // 1.예금 | 2. 출금 3. 잔고 | 4. 종료
        // ----------------------------------
        // 선택 >> 3
        // 잔고 >> 80000
        // ----------------------------------
        // 1.예금 | 2. 출금 3. 잔고 | 4. 종료
        // ----------------------------------
        // 선택 >> 4
        // 프로그램 종료

        Scanner sc = new Scanner(System.in);
        int balance = 0; // 잔액
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("원하시는 메뉴를 선택해주세요.");
            System.out.println("--------------------------------------");
            System.out.println("선택 >>");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.print("입금액 >> ");
                    // int money = Integer.parseInt(sc.nextLine());
                    balance += Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.print("출금액 >> ");
                    // int money = Integer.parseInt(sc.nextLine());
                    balance -= Integer.parseInt(sc.nextLine());

                    break;
                case 3:
                    System.out.print("잔액 >> " + balance);
                    break;
                case 4:
                    run = false;
                    break;

                default:
                    break;
            }

        }

    }

}
