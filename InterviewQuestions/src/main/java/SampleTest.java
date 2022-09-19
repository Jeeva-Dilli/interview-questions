public class SampleTest {

    public static void main(String[] args) {

        String s[]=new String[]{"MyString&String","Ow SA"};


        for (String s1:s)
        {
            System.out.println(reverseCase(s1));
        }
    }

    public static String reverseCase(String text)
    {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}
