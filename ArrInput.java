public class ArrInput {
  public static void  update(int marks[]){
    for(int i =0; i<marks.length; i++){
      marks[i] = marks[i]+1;
    }
  }
  public static int linearSearch(int number[],int key){
    for(int i =0; i<=number.length;i++){
      if(number[i]==key){
        return i;
      }
      
    }
    return -1;
  }
  public static int linearSearch(String fruits[], String key){
    for(int i =0; i<fruits.length;i++){
      if(fruits[i]==(key)){
        return i;
      }
    }
    return -1;
}
public static int largestNumber(int largestNumber[]){
  int largest = Integer.MIN_VALUE;
  for(int i =0; i<largestNumber.length; i++){
    if(largest<largestNumber[i]){
      largest = largestNumber[i];
    }
  }
  return largest;
}
public static int binarySearch(int number[], int key ){
  int start = 0;
  int end = number.length - 1;
  while(start <= end){
    int mid = (start + end) / 2;
    if(number[mid] == key){
      return mid;
    }else if(number[mid] < key){
      start = mid + 1;
    }else{
      end = mid - 1;
    }
  }
  return -1;
}
<<<<<<< HEAD
public static void main(String args[]){
  int number[] = {2,5,8,12,15,20,25,30,35,40,45,50};
  int key = 15;
  System.err.println("Binary Search Index: " + binarySearch(number, key));
=======

public static void reverse (int number[]){
  int start = 0;
  int last = number.length -1;
  while(start <last){
    int temp = number[start];
    number[start] = number[last];
    number[last] = temp;
    start++;
    last--;
  }
}
public static void maxSubArraySum (int number[]){
  int CurrSum = 0;
  int prefix[] = new int[number.length];
  int maxSum = Integer.MIN_VALUE;
  prefix[0] = number[0];
  for(int i =1; i<prefix.length; i++){
    prefix[i] = prefix[i - 1] + number[i];
  }
  for(int i = 0; i < number.length; i++){
    int start = i;
    for(int j = i; j < number.length; j++){
      int end = j;
      CurrSum = start ==0 ? prefix[end] : prefix[end] - prefix[start - 1];
      System.out.println(CurrSum + " ");
      if(maxSum < CurrSum){
        maxSum = CurrSum;
      }

    }

  }
  System.out.println("Maximum Subarray Sum: " + maxSum);  
}
public static void kadans(){
}

public static void main(String args[]){

  maxSubArraySum(new int[]{1,2,3,4,5});
// int number[] = {2,5,8,12,15,20,25,30,35,40,45,50};

// reverse(number);
// for(int i =0; i<number.length; i++){
//   System.out.print(number[i]+" ");
// }
// System.out.println();


  // int number[] = {2,5,8,12,15,20,25,30,35,40,45,50};
  // int key = 15;
  // System.err.println("Binary Search Index: " + binarySearch(number, key));
>>>>>>> ec164ed (Arraybasics)


// int largestNumber[] = {50, 40, 90, 20, 10};
// System.err.println("Largest number is: " + largestNumber(largestNumber));


  // int number [] = {2,5,8,12,15,20,25,30,35,40,45,50};
  // String fruits[] = {"Apple", "Banana", "Mango", "Orange", "Grapes"};
  // String key = "Apple";

  // int index = linearSearch(fruits,key);
  // if(index == -1){
  //   System.out.println("Key not found");
  // }else{
  //   System.out.println("Key found at index: " + index);
  // }

  // int marks[] = {97,88,95};
  // update(marks);
  // for(int i =0; i<marks.length; i++){
  //   System.out.print(marks[i]+" ");
  // }
  // System.out.println();


  
  
  //     int marks[] =new  int [50];

// Scanner scn = new Scanner(System.in);
// System.out.print("Enter the marks of physics:");
// marks[0] = scn.nextInt();
// System.out.print("Enter marks of chemistry:");
// marks[1] = scn.nextInt();
// System.out.print("Enter the marks of Maths:");
// marks[2] = scn.nextInt();


// System.out.println("physics:"+marks[0]);
// System.out.println("Chemistry:"+marks[1]);
// System.out.println("Maths:"+marks[2]);
// int percentage = (marks[0]+marks[1]+marks[2])/3;
// System.out.println("Percentage:"+percentage+"%");
  }
}