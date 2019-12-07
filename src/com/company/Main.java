package com.company;
import java.util.Comparator;
import java.util.*;
public class Main {
    public static class CompareLections implements Comparator<Schedule> {
        @Override
        public int compare(Schedule a,Schedule b){
            return (a.getStart()-a.getEnd());
        }
    }
    public static void main(String[] args) {
        System.out.println("Какое ваше количество лекций?");
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int N=in.nextInt();
        CompareLections compareLections = new CompareLections();
        Set<Schedule> Schedule1=new TreeSet<>(compareLections);
        for(int i=0;i<N;i++){
            System.out.println("Введите время старта и время конца лекци,а также название предмета.\t");
            int start = in.nextInt();
            int end = in1.nextInt();
            String name = in2.nextLine();
            Schedule var = new Schedule(start,end,name);
            Schedule1.add(var);
        }
        for (Schedule i:Schedule1){
           System.out.println( i.toString());
        }


    }
}
