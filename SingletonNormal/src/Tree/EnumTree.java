package Tree;

public enum EnumTree {
    INSTANCE;
    private Integer id;
    public void setEnumTreeID(int id){
        this.id=id;
    }
    public void showEnumTreeID(){
        System.out.println("Enum tree id is "+id);
    }
}
