package java8;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class StreamExample {
    int id;
    String name;
    float price;

    public StreamExample(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class JavaStreamExample {
    public static void main(String[] args) {
        List<StreamExample> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new StreamExample(1,"HP Laptop",25000f));
        productsList.add(new StreamExample(2,"Dell Laptop",30000f));
        productsList.add(new StreamExample(3,"Lenevo Laptop",35000f));
        productsList.add(new StreamExample(4,"Sony Laptop",40000f));
        productsList.add(new StreamExample(5,"Apple Laptop",50000f));

        Float totalPrice = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f, Float::sum);   // accumulating price
        System.out.println(totalPrice);
        // More precise code
        float totalPrice2 = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);

        productsList.stream().filter(p-> p.price>20000).map(p->p.name).forEach(System.out::println);

        // Using Collectors's method to sum the prices.

        Double s = productsList.stream().mapToDouble(product -> product.price).sum();
       // System.out.println(s);

       productsList.stream().max((o1, o2) -> o1.price>o2.price?1:-1).ifPresent(p-> System.out.println(p.name));

        // count number of products based on the filter
        long l= productsList.stream()
                .filter(product->product.price<30000)
                .count();
        System.out.println(l);

        // Converting product List into Set
        Set<Float> productPriceList =
                productsList.stream()
                        .filter(product->product.price < 30000)   // filter product on the base of price
                        .map(product->product.price)
                        .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)
        System.out.println(productPriceList);

        Double average = productsList.stream()
                .collect(Collectors.averagingDouble(p->p.price));
        System.out.println("Average price is: "+average);

        int a = productsList.stream().collect(Collectors.averagingInt(p->p.id)).intValue();
        System.out.println(a);

        IntSummaryStatistics stats = productsList.stream().mapToInt((x) -> (int) x.price).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}
