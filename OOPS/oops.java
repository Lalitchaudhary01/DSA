package OOPS;

public class oops {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("Blue");
        pen.setTip(0);
        System.out.println("Pen color: " + pen.color);
        System.out.println("Pen tip: " + pen.tip);

        Student student = new Student();
        student.setName("John");
        student.setAge(20);
        System.out.println("Student name: " + student.name);
        System.out.println("Student age: " + student.age);
    }
    
}
    
 class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }


 }

 class Student{
    String name;
    int age;

    void setName(String newName){
        name = newName;
    }
    void setAge(int newAge){
        age = newAge;
    }
 }
