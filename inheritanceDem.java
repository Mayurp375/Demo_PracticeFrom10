public class inheritanceDem {
      String name ;
      String age;
      String Salary;

}
class Data extends inheritanceDem{
   void data(){
    name = "mayur";
    age = "22";
    Salary= "6.2Lacs";
    System.out.println(name +age +Salary);
   }
  
   public static void main(String[] args) {
    Data data = new Data();
    System.out.println(data);
   
   }
}