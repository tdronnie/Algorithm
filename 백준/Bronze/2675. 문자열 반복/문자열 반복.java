import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test_case = Integer.parseInt(br.readLine());
        for(int T = 0; T < test_case; T++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for(char value : S.toCharArray()){
                sb.append(String.valueOf(value).repeat(R));
            }

            System.out.println(sb);

        }


    }
}