package com.example.screamitus_android;

public class Infection {

    public int calculateTotalInfected(int days) {

        if (days>0 && days<=7){
            int infectedInst = days*5;
            return infectedInst;
        }
        else if (days>7){
            int infectedInst = days*8;
            return infectedInst;
        }
        else {
            return -1;
        }
    }
}
