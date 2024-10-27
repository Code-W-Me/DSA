import java.util.*;
public class trappedrainwater {
    public static int TrappedDrainWater(int height[]){
        //calculate left max boundry
        int n= height.length;
        int leftmax[] = new int[n];
        leftmax[0]= height[0];
        for(int i = 1; i<n;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        //calculate right max Boundry
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trapedlevel = 0;
        for(int i=0;i<n;i++){
            //waterlevel = min(leftmaxx boud , rightmax bound)
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            //traped lavel =+ waterlevel - height * width;

            trapedlevel +=waterlevel - height[i];
        }
        return trapedlevel;
        
    }
public static void main(String args[]){
int height[] ={4,2,0,6,3,2,5};
System.out.println(TrappedDrainWater(height)); 
  }
}