package GenralPracties;

import java.util.*;

public class PqObjects {

    static class Student implements Comparable<Student>{
        String name;
        int rank;

         public Student(String name,int rank){
             this.name=name;
             this.rank=rank;
         }

         @Override
        public int compareTo(Student s2){
             return this.rank-s2.rank;
         }
    }

    public static void main(String[] args) {

        PriorityQueue<Student>pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A",23));
        pq.add(new Student("B",32));
        pq.add(new Student("C",45));
        pq.add(new Student("D",23));
        pq.add(new Student("C",3));


        while (!pq.isEmpty()){
            System.out.println(pq.peek().name + " "+pq.peek().rank);
            pq.remove();
        }

    }
}
