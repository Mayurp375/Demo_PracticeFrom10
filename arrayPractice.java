public class arrayPractice{
    public static void main (String agrs[]){
        int[][] array3 = new int[2][4];
        array3 [1][2] = 34;
        array3[0][3] = 32;
        array3[0][2] = 23;

        for (int i = 0 ; i < array3.length ; i++);
            for (int j = 0 ; j < array3[0].length ; j++){
                int i = 0;
                System.out.println(array3[i][j] );
            }
        // System.out.println();
    }
}

