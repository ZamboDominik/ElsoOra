package main;

public class Main {
    static void Casting(){
         double d = 2;
         int a = (int) d;
        System.out.println(a);
    }
    static void Parsing(){
        String x = "123";
        double z = Double.parseDouble("12.5");
        int y = Integer.parseInt(x);

        String s = String.valueOf(z);
        boolean b = Boolean.parseBoolean("true");
        char c = s.charAt(0);
        System.out.println(c);


    }
    static void F1()
    {
        int a = 1;
        double b = 2.2;
        //System.out.println(a + b);
    }
    static void F2()
    {
        String a = "2";
        int b = 2;
        //System.out.println(a + b);
    }
    static void F3()
    {
        double a = 2.2;
        String b = "2";
        //System.out.println(a + b);
    }
    static void F4()
    {
        char a = 'a';
        int b = 2;
        //System.out.println(a+b);
    }
    static void F5()
    {
        char a = 'a';
        double b = 2.2;
        //System.out.println(a + b);
    }
    static void F6()
    {
        float a = 3.14f;
        int b = 2;
        //System.out.println(a + b);
    }
    static void F7()
    {
        float a = 3.14f;
        String b = "abc";

        //System.out.println(a + b);
    }
    static void F8()
    {
        boolean a = true;
        int b = 2;
        //System.out.println(a+b);
    }
    static void F9()
    {
        boolean a = true;
        String b = "abc";
        //System.out.println(a+b);
    }
    public static void main(String[] args) {
       /* int szam = 1;
        double tortszam = 1.0;
        float tortszam2 = 3.75f;
        String szoveg = "szoveg";
        System.out.println(szoveg);
        int number = 5;
        String text = "Hello, World!";
        System.out.println("Hello World!");
        System.out.printf("Text: %s Number: %s",number,text);*/
        //Casting();
        Parsing();
        //F1();
        //F2();
        //F3();
        //F4();
        //F5();
        //F6();
        //F7();
        //F9();


        }
    }

