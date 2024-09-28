import java.util.*;
import java.io.*;

public class BOJ_10431 {
    public static void main(String args[]) throws Exception{
        // System.setIn(new );
        // BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int testCase = Integer.parseInt(input[0]);

        while(testCase != 0){
            testCase--;
            input = br.readLine().split(" ");

            int number = Integer.parseInt(input[0]);

            //~ STEP1. 정렬된 배열과 일반 배열 선언
            List<Integer> targetList = new ArrayList<>();
            Deque<Integer> deque = new LinkedList<>();

            for(int i=1; i<input.length; i++){
                deque.addLast(Integer.parseInt(input[i]));
                targetList.add(Integer.parseInt(input[i]));
            }
            targetList.sort((a,b) -> a-b);
            int answer = 0;

            //~ STEP2. target을 순회하면서 진행(N)
            for(int i=0; i<targetList.size(); i++){
                int target = targetList.get(i);

                //! 덱에서 해당 위치 찾음 최대(N)
                int index = 0;
                for (Integer student : deque) {
                    if (student == target)
                        break;
                    index++;
                }
                //! 해당 원소 제거 후 맨 앞으로 이동
                deque.remove(target);
                deque.addFirst(target);

                //! 해당 위치랑 i번째 target위치랑 연산 
                answer += index - i;
            }
            //~ STEP4. 정답 출력
            bw.write(String.valueOf(number) + " " + String.valueOf(answer));
            bw.newLine();
            
        }
        bw.flush();
        bw.close();

    }
}


