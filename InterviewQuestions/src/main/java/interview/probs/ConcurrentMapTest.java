package interview.probs;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapTest {
    public static void main(String[] args) {
        mapTest();
        StringBuilder builder = new StringBuilder("TestTestandTest");
       // builder.deleteCharAt(1);
       // builder.indexOf("Test");
        System.out.println(builder.indexOf("Test"));
    }
    public static void mapTest()
    {
        Map<String,String> map= new ConcurrentHashMap<>();
        map.put("one","one");
        map.put("two","two");
        map.put("three","three");
        map.put("four", "four");

        for(Map.Entry<String,String> set :map.entrySet())
        {
            if(set.getKey().equals("two"))
            {
                map.remove("two");
            }
        }

       /* Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            if(iterator.next().getKey().equals("two"))
            {
                iterator.next().setValue("TWO");
            }
        }*/

        map.entrySet().forEach(System.out::println);
    }
}
