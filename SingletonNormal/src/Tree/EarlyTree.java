package Tree;

public class EarlyTree {
    private int id;
    private EarlyTree(Integer id)
    {
        this.id=id;
    }
    private static EarlyTree earlyTree=new EarlyTree(100);
    public static EarlyTree getEarlyTree()
    {
        return earlyTree;
    }

    public void showEarlyTreeID()
    {
        System.out.println("The early tree id is "+ id);
    }
}
