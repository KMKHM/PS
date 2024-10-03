import java.io.*;
import java.util.*;
public class BOJ_2816 {
    public static List<String>channelList = new ArrayList<>();
    public static List<String>moveList = new ArrayList<>();

    public static int find_kbs_index(int numberOfchanel, String target){
        int index = 0;
        for(; index<numberOfchanel; index++){        
            if(channelList.get(index).equals(target)){
                break;
            }
            moveList.add("1");
        }
        return index;
    }
    public static void swap(int a, int b){
        String temp = channelList.get(a);
        channelList.set(a, channelList.get(b));
        channelList.set(b, temp);
    }
    public static void move_kbs_index(int index, int target){
        for(int i= index; i>target; i--){
            moveList.add("4");
            swap(i, i-1);
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int numberOfchanel = Integer.parseInt(input);

        for(int i=0; i<numberOfchanel; i++)
            channelList.add(br.readLine());

        // 2단계로 나눠서 진행 
        // STEP1. KBS1을 찾고 해당 채널을 맨위로 끌어 올림(맨 끝이라 생각해도 200번)
        int kbs1Index = find_kbs_index(numberOfchanel, "KBS1");
        move_kbs_index(kbs1Index, 0);

        // STEP2. KBS2을 찾고 해당 채널을 맨위로 끌어 올림(맨 끝이라 생각해도 200번)
        int kbs2Index = find_kbs_index(numberOfchanel, "KBS2");
        move_kbs_index(kbs2Index, 1);

        bw.write(moveList.toString().replaceAll("[,\\s\\[\\]]", ""));

        bw.flush();
        bw.close();
    }
    
}
