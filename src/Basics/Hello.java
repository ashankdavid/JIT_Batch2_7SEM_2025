package Basics;

public class Hello {
    static void printHello(){
        System.out.println("Hello");
    }
    void Hii(){
        System.out.println("hiii");
    }

    public static void main(String[] args) {
        printHello();
        Hello obj = new Hello();
        obj.Hii();
    }
}

