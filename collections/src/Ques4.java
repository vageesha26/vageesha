import java.util.*;

public class Ques4
    {
        public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> m)
        {
            List<Map.Entry<String, Integer> > list =
                    new LinkedList<Map.Entry<String, Integer> >(m.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer> >()
            {
                public int compare(Map.Entry<String, Integer> o1,
                                   Map.Entry<String, Integer> o2)

                {
                    return (o1.getValue()).compareTo(o2.getValue());
                }
            });

            HashMap<String, Integer> new1 = new LinkedHashMap<String, Integer>();
            for (Map.Entry<String, Integer> aa : list)
            {
                new1.put(aa.getKey(), aa.getValue());
            }
            return new1;
        }
        public static void main(String[] args)
        {
            HashMap<String, Integer> m = new HashMap<String, Integer>();
            m.put("a", 9);
            m.put("d", 1);
            m.put("f", 4);
            m.put("g", 0);
            m.put("h", 2);
            m.put("t", 3);
            Map<String, Integer> hm1 = sortByValue(m);
            for (Map.Entry<String, Integer> h : hm1.entrySet())
            {
                System.out.println("Key = " + h.getKey() +
                        ", Value = " + h.getValue());
            }
        }
    }
