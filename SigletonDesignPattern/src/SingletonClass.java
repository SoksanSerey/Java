public class SingletonClass {
    static SingletonClass stc=new SingletonClass();
    private SingletonClass()
    {

    }
    public void sayHello()
    {
        System.out.println("Hello world...");
    }
    public static SingletonClass getInstance()
    {
        return stc;
    }
}
