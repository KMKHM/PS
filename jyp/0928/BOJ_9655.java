import java.io.*;
import java.util.*;
public class BOJ_9655 {
    public static int MAX_VALUE = 1001;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        List<Boolean>dynamicTable = new ArrayList<>(MAX_VALUE);

        // Step1. 테이블 초기화(선공자가 이긴다면 true, 아니면 false)
        dynamicTable.add(false);
        dynamicTable.add( true);
        dynamicTable.add( false);
        dynamicTable.add(true);

        int N = Integer.parseInt(input);
        // Step2. N만큼 반복문 현재 가져갈 수 있는 만큼 뺏을 때 선공자의 반대결과가 나의 결과임
        for(int i=4; i<=N; i++){
            if(dynamicTable.get(i-1) != dynamicTable.get(i-3)){
                throw new NoAnswerException("정답이 없습니다.");
            }
            int pre_result = i-1;
            dynamicTable.add(!dynamicTable.get(pre_result));
        }

        String answer = "CY";
        if (dynamicTable.get(N)){
            answer = "SK";
        }
        bw.write(answer);
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
class NoAnswerException extends Exception {
    public NoAnswerException(String message) {
        super(message);
    }
}