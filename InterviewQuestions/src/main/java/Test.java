import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Emp
{
    String fname;
    String lname;
    int salary;

    public Emp(String fn, String ln, int sal){
        fname=fn;
        lname=ln;
        salary=sal;
    }
}

public class Test implements A,B{
    public static void main(String[] args) {

         Emp e1 = new Emp("jeeva","dilli", 10000);
        Emp e2 = new Emp("jsri","viswa", 12000);
        Emp e3 = new Emp("jallan","raj", 21000);
        Emp e4 = new Emp("java","dilli", 14000);
        Emp e5 = new Emp("balaji","b", 30000);

        List<Emp> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        List<Emp> emps = list.stream().sorted(Comparator.comparing(o -> o.fname)).filter(emp -> emp.fname.startsWith("j")&&emp.salary>10000).collect(Collectors.toList());

        emps.forEach(emp -> System.out.println(emp.fname));
        //Test1.sortString();

        Test t = new Test();
        //t.b();

    }

    @Override
    public void b() {
        System.out.println("test");
    }
}

class Test1{
    public static void sortString()
    {
        String s = "this is sentence arrange alphabetical order";
        String str[] = s.split(" ");
        Set<String> set = new TreeSet<>();
        for(String s1 : str)
        {
            set.add(s1);
        }

        set.forEach(System.out::println);
    }

    public static <Interger> void reverseStr()
    {

        String s = "Bo#un$ce";
        char c[] = s.toCharArray();

        Map<Interger,String> map = new HashMap<>();

        for (char str:c) {

            if((int)str<97 && (int)str>65)
            {

            }

        }
    }
}

interface A{
    void b();
}
interface B{
    void b();
}
/*class C implements A,B{

    @Override
    public void b() {
        System.out.println("test");
    }
}*/






