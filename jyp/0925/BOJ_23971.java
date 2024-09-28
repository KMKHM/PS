import java.io.*;

public class BOJ_23971 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        Double height = Double.parseDouble(input[0]);
        Double width = Double.parseDouble(input[1]);
        Double n = Double.parseDouble(input[2]);
        Double m = Double.parseDouble(input[3]);
        /* 
        * 한명이 앉기 위해서는 1 + 거리두기 만큼 필요함(딱 맞는 경우에는 거리두기 거리가 없어도 된다. -> O | X | X | O) 
        * H / (1 + 거리두기(N)) 
        */

        double maxWidth = Math.ceil(width/(1+m)); 
        double maxHeight = Math.ceil(height/(1+n));

        int answer = (int) (maxHeight * maxWidth);    
        bw.write(String.valueOf(answer));
        bw.newLine();
        
        bw.flush();
        bw.close();
    }
}
