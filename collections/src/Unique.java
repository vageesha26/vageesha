  import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string");
        String str = s.nextLine();
        String[] character = str.split("");
        int c = 1;
        for (int i = 0; i < character.length; i++) {
            for (int j = i+1; j < character.length; j++) {
                if (character[i].equals(character[j])) {

                        c++;
                        character[j] = "0";

                    }
                }
                if (c < 2) {
                    System.out.println(character[i]);
                }
                c = 1;

            }

        }
    }





