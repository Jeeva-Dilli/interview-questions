package maveric.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindOccurrence {
   private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        List<String> inputElements = new ArrayList<>();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the No. of Elements and Size : ");
        String input = s.nextLine();
        String[] str = input.split(" ");
        System.out.println("Enter the Elements");
        for (int i=0; i<Integer.parseInt(str[0]);i++)
        {
            String element = s.next();
            if(element.length()==Integer.parseInt(str[1]))
                list.add(element);
        }

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the Size of i/o elemnts : ");
        int size = s2.nextInt();
        System.out.println("Enter the Elements : ");
        for (int j=0;j<size;j++)
        {
            inputElements.add(s2.next().replaceAll("[^a-zA-z]",".*"));
        }

        List<Integer> finalcount = getOccurence(inputElements);

        finalcount.forEach(System.out::println);
    }

    public static List<Integer> getOccurence(List<String> input)
    {
        List<Integer> output = new ArrayList<>();
        int count = 0;
        for (String s : input)
        {
            for (String str: list)
            {
                if(str.matches(s))
                    count++;
            }
            output.add(count);
            count = 0;
        }

        return output;
    }
}
