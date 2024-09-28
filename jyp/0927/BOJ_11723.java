import java.util.*;
import java.io.*;
public class BOJ_11723 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int testCase = Integer.parseInt(input[0]);

        // STEP 1. 집합 생성(모든 값이 채워져 있는 사전도 미리 생성)
        HashMap<Integer, Boolean> mySet = new HashMap<>();
        HashMap<Integer, Boolean> allSet = new HashMap<>();
        for(int i=1; i<=20; i++)
            allSet.put(i, true);

        while (testCase != 0) {
            testCase--;

            // STEP2. input에 맞게 동작
            input = br.readLine().split(" ");
            int key = -1;
            switch (input[0]) {
                case "add":
                    // add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
                    key = Integer.parseInt(input[1]);
                    if(mySet.getOrDefault(key, false) == false){
                        mySet.put(key, true);
                    }
                    break;
                case "remove":
                    // remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
                    key = Integer.parseInt(input[1]);
                    if(mySet.getOrDefault(key, false)){
                        mySet.put(key, false);
                    }
                    break;
                case "check":
                    // check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
                    key = Integer.parseInt(input[1]);
                    if(mySet.getOrDefault(key, false)){
                        bw.write("1");
                    }else
                        bw.write("0");
                    bw.newLine();
                    break;
                case "toggle":
                    // toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
                    key = Integer.parseInt(input[1]);
                    if(mySet.getOrDefault(key, false)){
                        mySet.put(key, false);
                    }else{
                        mySet.put(key, true);
                    }
                    break;
                case "all":
                    // all: S를 {1, 2, ..., 20} 으로 바꾼다.
                    mySet = (HashMap<Integer, Boolean>) allSet.clone();
                    break;
                case "empty":
                    mySet.clear();
                    break;
                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
    }    
}
