package all_java;
class Modifier{
    // public modifier
    public int a=10;
    // private modifier
    private int b;
    // default modifier
    int c=20;
    //protected modifier
    protected int d=60;
    void display(){
        System.out.println(a);
    }
    public void setdata(int f){
        b=f;
    }
    public int getdata(){
        return b;
    }
}
public class Accessmodifier {
    public static void main(String args[]){
        System.out.print("\033c");
        Modifier obj = new Modifier();
        obj.setdata(45);
        System.out.println("The value of public modifier is: "+obj.a);
        System.out.println("The value of default modifier is: "+obj.c);
        System.out.println("the value of protected modifier is: "+obj.d);
        System.out.println("The value of private modifier is: "+obj.getdata());
    }
}
