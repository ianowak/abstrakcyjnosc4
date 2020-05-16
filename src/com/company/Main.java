package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Kolo kolo1 = new Kolo(4);
        //Kwadrat kwadrat1 = new Kwadrat(5);

        ArrayList<Ksztalt> ksztalty = new ArrayList<>();
        ksztalty.add(new Kwadrat(4));
        ksztalty.add(new Kolo(5));

        for(Ksztalt x : ksztalty){
            System.out.println("Powierzchnia ksztaltu to: "+x.obliczPowierzchnie());
        }

        //System.out.println(kolo1.obliczObwod());
        //System.out.println(kolo1.obliczPowierzchnie());
        //System.out.println( kwadrat1.obliczObwod());
        //System.out.println(kwadrat1.obliczPowierzchnie());

    }
}
interface Ksztalt{
    double obliczPowierzchnie();
    double obliczObwod();
}

class Kwadrat implements Ksztalt{
    double dlugoscBoku;


    public Kwadrat(double dlugoscBoku){
        this.dlugoscBoku=dlugoscBoku;
    }

    public double obliczPowierzchnie(){
        return dlugoscBoku*dlugoscBoku;
    }

    public double obliczObwod(){
        return dlugoscBoku*4;
    }
}

class Kolo implements Ksztalt{
    private double promien;

    public Kolo(double promien){
        this.promien=promien;
    }

    @Override
    public double obliczPowierzchnie() {
        return Math.PI*promien*promien;
    }

    @Override
    public double obliczObwod() {
        return 2*Math.PI*promien;
    }
}