import Tree.EarlyTree;
import Tree.EnumTree;
import Tree.LateTree;

public class TreeInfoDemo {
    public static void main(String[] args){
//        EarlyTree earlyTree=EarlyTree.getEarlyTree();
//        earlyTree.showEarlyTreeID();
//
//        Thread k1=new Thread(()->{
//            LateTree lateTree=LateTree.getLateTree();
//            lateTree.showLateTreeID();
//        });
//        Thread k2=new Thread(()->{
//            LateTree lateTree=LateTree.getLateTree();
//            lateTree.showLateTreeID();
//        });
//        k1.start();
//        k2.start();
//        Thread k3=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                LateTree lateTree=LateTree.getLateTreeWithSyncCodeBl();
//                lateTree.showLateTreeID();
//            }
//        });
//        Thread k4=new Thread(()->{
//            LateTree lateTree=LateTree.getLateTreeWithSyncCodeBl();
//            lateTree.showLateTreeID();
//        });
//        k3.start();
//        k4.start();
 
        EnumTree enumTree=EnumTree.INSTANCE;
        enumTree.setEnumTreeID(0703);
        enumTree.showEnumTreeID();
    }
}
