package com.company;

import java.util.Comparator;

public class Schedule {
    private int Start;
    private int End;
    private String nameOfLection;
    public Schedule(int Start,int End,String nameOfLection){
        this.Start=Start;
        this.End=End;
        this.nameOfLection=nameOfLection;
    }

    @Override
    public String toString(){
        return this.nameOfLection +" : "+this.Start+" - "+this.End;
    }

    public int getStart() {
        return Start;
    }
    public int getEnd(){
        return End;
    }
}
