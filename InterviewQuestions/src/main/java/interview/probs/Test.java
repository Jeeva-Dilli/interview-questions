package interview.probs;

public class Test {
    static int B,H;
    static boolean flag = true;
    static{
        if(B<0 || H<0) {
            try {
                flag = false;
                throw new Exception("test");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        if(flag) {
            int a = B * H;
            System.out.println(a);
        }

        ConvertStringtoInt anInt = new ConvertStringtoInt();
        anInt.convert();

    }
}

class ConvertStringtoInt
{
    public void convert()
    {
        int i = -1;
        String s = String.valueOf(i);
        System.out.println(i==Integer.parseInt(s));
        System.out.println(s);
    }
}
