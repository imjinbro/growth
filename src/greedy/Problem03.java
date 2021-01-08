package greedy;

import java.util.Scanner;

public class Problem03 {

    /*
        https://codeup.kr/problemsetsol.php?psid=1
        여러 케이스 중 가장 "어떤" 케이스
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine());
        int cnt = 0;

        while (money != 0) {
            if (money >= 50000) {
                money -= 50000;
            } else if (money >= 10000) {
                money -= 10000;
            } else if (money >= 5000) {
                money -= 5000;
            } else if (money >= 1000) {
                money -= 1000;
            } else if (money >= 500) {
                money -= 500;
            } else if (money >= 100) {
                money -= 100;
            } else if (money >= 50) {
                money -= 50;
            } else {
                money -= 10;
            }

            cnt++;
        }

        System.out.println(cnt);
    }
}