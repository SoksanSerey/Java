package Tree;

public class LateTree {
    private Integer id;
    private static LateTree lateTree;
    private LateTree(Integer id)
    {
        this.id=id;
    }
    public static synchronized LateTree getLateTree(){
        if(lateTree==null)
        {
            System.out.println("LateTree is Null");
            lateTree = new LateTree(200);
        }
        return lateTree;
    }
    public static LateTree getLateTreeWithSyncCodeBl()
    {
        synchronized (LateTree.class){
            if(lateTree==null)
            {
                System.out.println("late tree is null");
                lateTree=new LateTree(4500);
            }
            return lateTree;
        }
    }
    public void showLateTreeID(){
        System.out.println("latetree id is "+lateTree.id);
    }
}
