public class Smily {

    public static void Little_Smily(int totRows ,int totCols) {
        if(totRows < 11 || totCols <11){
            System.out.println("Please enter rows and columns greater than 9");
            return;
        }
        int centerRow = (totRows +1)/2;
        int centerCol = (totCols +1)/2;

        for(int i =1; i <=totRows; i++){
            for(int  j =1; j<=totCols; j++){
                boolean isBorder = (i == 1 || i == totRows || j==1| j == totCols);

                boolean isLeftEye = (i == centerRow -1 && j == centerCol -1);
                boolean isRightEye = (i == centerRow -1 && j == centerCol +1);
                boolean isMouth = (i ==centerRow +1 && j>= centerCol-1 && j<= centerCol +1);
                if(isBorder || isLeftEye || isRightEye || isMouth){
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();;
        }
    }
    public static void main(String args[]) {
        Little_Smily(13,25);
    }
}
