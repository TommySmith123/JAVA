package StackShow;

public class Demo1_2_StackOverFlow {
    private static int count;
    public static void main(String[] args) {
        try {
            m1();
        }catch (Throwable e)
        {
            System.out.println(count);
        }
    }

    private static void m1()
    {
        count++;
        m1();

    }
}
