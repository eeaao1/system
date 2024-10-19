package od.ext.letcode.IO;

import java.io.*;

public class Eg {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StreamTokenizer streamTokenizer = new StreamTokenizer(in);

        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            out.println("--"+streamTokenizer.nval);
            out.println("---"+streamTokenizer.lineno());
            out.flush();

        }
    }
}
