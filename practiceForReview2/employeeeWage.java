package practiceForReview2;

import java.util.Random;

public class employeeeWage {
    private static final int NUMBER_OF_WORKING_DAYS = 20;
    Random random = new Random();
    // constant
    int IS_FULL_TIME = 1;
    int EMP_RATE_PER_HR = 20;
    int empHr = 0;
    int empWage = 0;
    int Hours;
    int day;

    public void presentOrAbsent() {
        for (int day = 0; day < NUMBER_OF_WORKING_DAYS; day++) {
            {

                if (NUMBER_OF_WORKING_DAYS == 20 || Hours == 100) {

                    int num = random.nextInt(3);
                    if (num == 1) {
                        System.out.println("present");
                        EMP_RATE_PER_HR = 20;
                        Hours = 8;
                        empWage = EMP_RATE_PER_HR * Hours;
                        System.out.println(empWage + ":wage");
                    } else if (num == 2) {
                        System.out.println("partTime");
                        EMP_RATE_PER_HR = 20;
                        Hours = 4;
                        empWage = EMP_RATE_PER_HR * Hours;
                        System.out.println(empWage + ":wage");
                    } else {
                        System.out.println("absent");
                    }
                }
            }
        }
        empWage = EMP_RATE_PER_HR * Hours;
        int TotalWage = empWage * NUMBER_OF_WORKING_DAYS;
        System.out.println("employee wage" + " " + TotalWage);

    }

    public static void main(String[] args) {
        employeeeWage emp = new employeeeWage();
        emp.presentOrAbsent();
    }
}
