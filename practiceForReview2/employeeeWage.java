package practiceForReview2;

import java.util.Random;

public class employeeeWage {
    Random random = new Random();
    // constant
    int IS_FULL_TIME = 1;
    int EMP_RATE_PER_HR = 20;
    int empHr =0;
    int empWage = 0;
    int Hours;
    public void presentOrAbsent() {
        int num = random.nextInt(3);
        if (num == 1) {
            System.out.println("present");
            EMP_RATE_PER_HR =20;
             Hours =8;
        } else if(num == 2) {
            System.out.println("partTime");
            EMP_RATE_PER_HR = 20;
            Hours = 4;
        }else{
            System.out.println("absent");

        }
        
        empWage = EMP_RATE_PER_HR*Hours;
        System.out.println("employee wage" + " "+empWage);

    }

    public static void main(String[] args) {
        employeeeWage emp = new employeeeWage();
        emp.presentOrAbsent();
    }
}
