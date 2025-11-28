package GenralPracties;

import java.util.*;

public class Student {
    static  int rollNo;
   static  String name;
   static int []marks;

    public Student(int rollNo,String name,int marks[]){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;

    }
    static double Avg=0;
    public static double calculateAverage(){
        double sum=0;
        for(int i=0;i<5;i++){
            sum+=marks[i];
        }
        Avg=sum/5.0;
        return Avg;
    }
    public static char calculateGrade(){
        if(Avg>=90){
            return 'A';
        }
        else if(Avg>=75){
            return 'B';
        }
        else if(Avg>=60){
            return 'C';
        }
        return 'D';
    }
    public static void DisplayDetails(){
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(calculateAverage());
        System.out.println(calculateGrade());

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rollNo=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        int marks[]=new int[5];
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        Student s=new Student(rollNo,name,marks);
        s.DisplayDetails();
    }
}
