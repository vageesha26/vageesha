import java.util.Scanner;
public class Unique1 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter a string");
            String str = s.nextLine();
            char[] c = str.toCharArray();
            int cnt=0;
            for (int i = 0; i < c.length; i++) {
                cnt=0;
                for (int j = 0; j < c.length; j++) {
                    if (c[i]==c[j])
                    {
                        cnt++;

                    }
                }

                System.out.println(c[i] + "--" + cnt);

            }

        }
    }

