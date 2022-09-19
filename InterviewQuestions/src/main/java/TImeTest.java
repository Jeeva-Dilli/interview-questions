import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TImeTest {
    public static void main(String[] args) {

        int a[] = new int[]{1,8,3,2};
        int n= a.length;
        Map<String,String> m = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    for(int l=0;l<n;l++)
                    {
                        if(!(a[i]==a[j] || a[i]==a[k] || a[i]==a[l] || a[j]==a[k] || a[j]==a[l] || a[k]==a[l]))
                            m.put(String.valueOf(a[i])+String.valueOf(a[j]),String.valueOf(a[k])+String.valueOf(a[l]));
                    }
                }
            }
        }
        List<String> strings = new ArrayList<>();

        for(Map.Entry<String,String> entry: m.entrySet())
        {
            if(Integer.parseInt(entry.getKey())<24)
            {
                if(Integer.parseInt(entry.getValue())<60)
                {
                    strings.add(entry.getKey()+":"+entry.getValue());
                }
            }
        }
        m.entrySet().stream().forEach(System.out::println);
        strings.stream().forEach(System.out::println);
    }
}
