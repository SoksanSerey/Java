public class SingleTonClass {
    private static Object lock;
    private static SingleTonClass singleTonClass=new SingleTonClass();
    public static mainClass d;
    private SingleTonClass()
    {
        System.out.println("A new object created...");
    }
    public static mainClass getInstance()
    {
//        singleTonClass=new SingleTonClass();
//        return singleTonClass;
//        if(singleTonClass==null)
//        {
//            singleTonClass=new SingleTonClass();
//        }
//        return singleTonClass;
        if(d==null)
        {
            synchronized (lock)
            {
                if (d==null)
                {
                    d=new mainClass();
                }
            }
            return d;
        }
        return null;
    }
}
