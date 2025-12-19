package String;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Collection;

public class JobSequence {

    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i,int d,int p){
            this.id=i;
            this.deadline=d;
            this.profit=p;
        }

    }

    public static void main(String[] args) {

        int jobsInfos[][]={{4,20},{1,20},{1,40},{1,30}};

        ArrayList<Job>jobs=new ArrayList<>();

        for(int i=0;i<jobsInfos.length;i++){
            jobs.add(new Job(i,jobsInfos[i][0],jobsInfos[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);


        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;

        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);

            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max Jobs = "+seq.size());

         for(int i=0;i<seq.size();i++){
             System.out.println(seq.get(i)+" ");
         }
        System.out.println();
    }

}
