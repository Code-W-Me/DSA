public class OOP {
    public static void main(String args[]) {


    

    // puppy.eat();
    // puppy.legs = 4;
    // System.out.println(puppy.legs);
    //      Pen p1 = new Pen(); // created a pen object called p1
    // p1.setColor("Blue");
    // System.out.println(p1.getColor());
    // p1.setTip("Ballpoint");
    // System.out.println(p1.getTip());

    // Student s1 = new Student();
    // s1.name = "Rohan";
    // s1.rollNo = 101;
    // s1.password = "abcd";
    // s1.marks[0] = 100;
    // s1.marks[1] = 95;
    // s1.marks[2] = 90;

    // Student s2 = new Student(s1);
    // s2.password = "xyz"; // this will not affect s1 password
    // s1.marks[2] = 100;
    // for(int i=0; i<3; i++){
    //     System.out.println(s2.marks[i]);
    // }
    // // Student s2 = new Student("Yash");
    // Student s3 = new Student(123);
    // System.out.println(s1.naaame);

    Fish shark = new Fish();
    Dog puppy = new Dog();
    Bird lilly = new Bird();
    lilly.eat();
    lilly.parrots = 1;
    lilly.dance();
    System.out.println(lilly.parrots);

    }
   
}

 // Inheritance : Inheritence is when propetries and method of base calss are passed on to derived class.
    // base class
    class Animal{
        String color;
        void eat(){
            System.out.println("eats");
        }
        void breathe(){
            System.out.println("breathes");
        }
        void dance(){
            System.out.println("dances");
        }

    }
    // derived class
    // class Fish extends Animal{
    //     int fins;
    //     void swim(){
    //         System.out.println("swims in water");
    //     }
    // }
    class Mammals extends Animal{
        int dogs;
        int cats;
        int humans;
    }
    class Fish extends Animal{
        int tuna;
        int sharks;
    }
    class Bird extends Animal{
        int parrots;
        int pigeons;
    }


class Student{
    String name;
    int rollNo;
    String password;
    int marks[];


    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.marks = s1.marks;
    // }

    Student(){
        marks = new int[3];
        System.out.println("Constructor called");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int rollNo){
        marks = new int[3];
        this.rollNo = rollNo;
    }
    // deep Copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    
}
// class Pen{
//     private String color;
//     private String tip;

//     String getColor(){
//         return this.color;
//     }
//     String getTip(){
//         return this.tip;
//     }
//     void setColor(String newColor){
//         this.color  = newColor;

//     }
//     void setTip(String newTip){
//         this.tip = newTip;
//     }

// }



