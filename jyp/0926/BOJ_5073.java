import java.util.*;
import java.io.*;

public class BOJ_5073 {

    // 0 0 0 이 입력되면 종료
    public static boolean isDone(String input[]){
        if (input[0].equals("0") && input[1].equals("0") && input[2].equals("0")){
            return true;
        }
        return false;
    }

    // 삼각형 성립 조건을 확인하는 함수
    public static boolean isTriangle(int sides[]){
        // 두 짧은 변의 합이 가장 긴 변보다 커야 삼각형 성립
        return sides[0] + sides[1] > sides[2];
    }

    // 삼각형의 타입을 확인하는 함수
    public static void getTriangleType(int sides[], BufferedWriter bw) throws Exception {
        // Equilateral: 세 변의 길이가 모두 같을 경우
        // Isosceles: 두 변의 길이만 같을 경우
        // Scalene: 세 변의 길이가 모두 다를 경우
        if (sides[0] == sides[1] && sides[1] == sides[2]) {
            bw.write("Equilateral");
        } else if (sides[0] == sides[1] || sides[1] == sides[2]) {
            bw.write("Isosceles");
        } else {
            bw.write("Scalene");
        }
        bw.newLine();
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input[] = br.readLine().split(" ");
            // Step1. 0 0 0 입력 시 종료
            if (isDone(input))
                break;

            // Step2. 입력된 값을 정수 배열로 변환하고 정렬
            int[] sides = { Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]) };
            Arrays.sort(sides);

            // Step3. 삼각형 성립 여부 확인
            if (!isTriangle(sides)) {
                bw.write("Invalid");
                bw.newLine();
                continue;
            }
            // Step4. 삼각형의 타입 판별
            getTriangleType(sides, bw);
        }

        bw.flush();
        bw.close();
    }
}
