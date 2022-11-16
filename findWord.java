import java.beans.Transient;

public class findWord {
    char array[]={'a','b','c','d','e'};
    
    private String name = "mau";
    int age = 22;
    private int num(int x){
        return x+2;                               
    }

    public static void main(String[] args) {
        findWord n = new findWord();
      
        System.out.println(  n.num(22));
    }
    
 
}
