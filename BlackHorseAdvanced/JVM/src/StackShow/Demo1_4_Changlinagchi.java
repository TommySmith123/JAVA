package StackShow;

public class Demo1_4_Changlinagchi {
    public static void main(String[] args) {
        String s1="a";
        String s2="b";
        String s3="ab";

        String x2=new String("c")+new String("d");
        x2.intern();
        String x1="cd";
        System.out.println(x1==x2);
    }
}
