class Encap1{
    private String name;
    private int rollno;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public int getRollno(){
        return rollno;
    }
}
public class Encap{
    public static void main(String[] args){
        Encap1 obj = new Encap1();
        obj.setName("Leela");
        obj.setRollno(101);
        System.out.println(obj.getName());
        System.out.println(obj.getRollno());
    }
}