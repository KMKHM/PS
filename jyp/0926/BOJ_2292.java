import java.io.*;
import java.util.*;

public class BOJ_2292 {
    public static int WEIGHT_VALUE_SIX = 6;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int target = Integer.parseInt(input);
        int turn = 1;
        
        int currentValue = 1;
        while (true) {
            //~ STEP1. 2부터 시작해서 가중치 만큼 더해서 최댓값 설정
            if(currentValue >= target){ 
                bw.write(String.valueOf(turn));
                break;
            }
            //~ STEP2. 범위 밖이면 가중치 더해주기(기존값 + (6 * turn))
            currentValue += (WEIGHT_VALUE_SIX * turn);
            turn++;
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }    
}
