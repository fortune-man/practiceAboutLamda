package translateProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buildTranslate {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int a;
        String b;

        System.out.println("English to Al Bhed, input 1.");
        System.out.println("Al Bhed to English, input 2.");
        b = dataIn.readLine();
        a = Integer.parseInt(b);
        if (a == 1)
        {
            System.out.println("Enter English characters to translate.");
            String x = dataIn.readLine();
            int y = x.length();
            String z[] = x.split("");
            System.out.println("The translated characters from English to Al Bhed:");
            boolean mustTranslate = true;
            for(int i = 0; i < y; i++)

            {
                if (z[i].equals("[")) { mustTranslate = false; }
                else if (z[i].equals("]")) { mustTranslate = true; }
                else  {
                    if (mustTranslate) {
                        switch (z[i]){
                            // (....)
                         else{
                            System.out.print(z[i]);
                        }
                    }


    }
}


}
