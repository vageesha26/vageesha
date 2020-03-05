import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listdemo {
    public static void main(String[] args){
        List<Float> numbers = new ArrayList<Float>();
        float sum=0;
        numbers.add((float) 1.1);
        numbers.add((float) 2.2);
        numbers.add((float) 3.3);
        numbers.add((float) 4.4);
        numbers.add((float) 5.5);
        Iterator<Float> itr=numbers.iterator();

            while (itr.hasNext()) {
                float j=  itr.next();
                sum = j + sum;
            }
                System.out.println("Total sum is : " +sum);

        }
    }

