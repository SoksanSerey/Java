public class MailClass {
    public static void main(String arg[])
    {
        SingletonClass sc1=SingletonClass.getInstance();
        SingletonClass sc2=SingletonClass.getInstance();
        sc1.sayHello();
        sc2.sayHello();
    }
}
