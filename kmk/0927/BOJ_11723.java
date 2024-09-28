import java.io.*;

public class BOJ_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int bit = 0;

        for (int i=0; i<N; i++) {
            String[] s = br.readLine().split(" ");

            if (s.length == 2) {
                int x = Integer.parseInt(s[1]);

                if (s[0].equals("add")) {
                    bit |= (1<<x);
                } else if (s[0].equals("remove")) {
                    bit &= ~(1<<x);
                } else if (s[0].equals("toggle")) {
                    bit ^= (1<<x);
                } else {
                    if ((bit & (1<<x)) != 0) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                }

            } else {
                if (s[0].equals("all")) {
                    bit = (1 << 21) - 1;
                } else {
                    bit = 0;
                }
            }

        }

        System.out.println(sb);
        br.close();

    }
}