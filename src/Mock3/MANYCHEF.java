package Mock3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class MANYCHEF {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0) {
            char[] seq = br.readLine().toCharArray();

            for(int i= seq.length-4; i>=0; i--) {
                if(seq[i]=='C' || seq[i]=='?')
                    if(seq[i+1]=='H' || seq[i+1]=='?')
                        if(seq[i+2]=='E' || seq[i+2]=='?')
                            if(seq[i+3]=='F' || seq[i+3]=='?') {
                                seq[i] = 'C';
                                seq[i+1] = 'H';
                                seq[i+2] = 'E';
                                seq[i+3] = 'F';
                            }
            }
            Arrays.binarySearch();
            String string = new String(seq);
            //System.out.println(string);
            (string) =(string).replace('?', 'A');
            System.out.println(string);
        }
    }
}