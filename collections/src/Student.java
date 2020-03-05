import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student
{
    private double age;
    private String name;
    private double score;
    public Student(double age, String name, double score)
    {
        this.age = age;
        this.name = name;
        this.score = score;
    }
    public double getAge()
    {
        return age;
    }
    public void setAge(double age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getScore()
    {
        return score;
    }
    public void setScore(double score)
    {
        this.score = score;
    }
    public String toString()
    {
        return name + " - " +score + " - " + age + " years old.";
    }
}
    class main1
    {
        public static void main(String[] a)
        {
            List<Student> lists = new ArrayList<Student>();
            lists.add(new Student(22,"aaa", 10));
            lists.add(new Student(23, "bbb", 20));
            lists.add(new Student(21, "ccc", 20));
            lists.add(new Student(21, "ddd", 40));
            lists.add(new Student(22, "eee", 50));
            Collections.sort(lists, new Comparator<Student>()
            {
                @Override
                public int compare(Student s, Student s1)
                {
                    if(s.getScore() > s1.getScore())
                    {
                        return -1;
                    }

                    else if(s.getScore() < s1.getScore())
                    {
                        return 1;
                    }
                    return 0;
                }
            });
            for (Student student : lists)
            {
                System.out.println(student);
            }
        }
    }
