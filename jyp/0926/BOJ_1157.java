import java.util.*;
import java.io.*;

public class BOJ_1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        // Step1. 대문자로 변환 후 데이터 삽입 26칸 배열에 삽입 (알파벳 등장 횟수 저장)
        input = input.toUpperCase();
        int alpha[] = new int[26];

        // Step2. 알파벳 번호에 맞게 배열에 삽입
        int max = 0;
        char target = ' '; // 초기화된 target

        for (int i = 0; i < input.length(); i++) {
            // 알파벳의 인덱스 찾기 ('A'의 아스키 코드 값은 65)
            int index = input.charAt(i) - 'A';
            alpha[index]++;  // 해당 알파벳의 등장 횟수 증가

            // 최대값과 그 알파벳 저장
            if (alpha[index] > max) {
                max = alpha[index];
                target = input.charAt(i);  // 가장 많이 등장한 알파벳 갱신
            }
        }

        // Step3. 가장 많이 등장한 알파벳이 여러 개인지 확인
        int count = 0;  // 최대값을 가진 알파벳의 개수를 셈
        for (int i = 0; i < 26; i++) {
            if (alpha[i] == max) {
                count++;
            }
        }

        // Step4. 중복이 있는지 확인
        if (count > 1) {
            bw.write("?");
        } else {
            bw.write(target);  // 가장 많이 등장한 알파벳 출력
        }
        
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
