package OOPS;

class Student{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
    }

    // public getter method to access values;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class Encapulation {
    public static void main(String[] args) {

        // create  object of Student
        Student s=new Student();
        s.setName("pawan");
        s.setAge(45);

        System.out.println(s.getAge());
        System.out.println(s.getName());

    }
}
