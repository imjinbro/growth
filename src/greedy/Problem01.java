package greedy;

import java.util.Scanner;

public class Problem01 {

    /*
        컴파일
        - 컴파일러
        - 패키지

        케이스 테스트 - 포맷팅
        최솟값, 최댓값
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pasta = new int[3];
        int[] juice = new int[2];

        // 입력
        for (int i = 0; i < 5; i++) {
            if (i < 3) {
                pasta[i] = Integer.parseInt(scanner.nextLine());
            } else {
                juice[i - pasta.length] = Integer.parseInt(scanner.nextLine());
            }
        }

        // int minPasta = IntStream.of(pasta).min().getAsInt();
        int minPasta = pasta[1];

        if (minPasta > pasta[0]) {
            minPasta = pasta[0];
        }

        if (minPasta > pasta[2]) {
            minPasta = pasta[2];
        }

        int minJuice = Math.min(juice[0], juice[1]);

        // 출력
        double total = minPasta + minJuice + ((minPasta + minJuice) * 0.1);
        System.out.printf("%.1f%n", total);
    }
}