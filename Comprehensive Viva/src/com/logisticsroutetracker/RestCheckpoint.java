package com.logisticsroutetracker;

class RestCheckpoint extends Checkpoint{
    RestCheckpoint(String id,String loc,double dist,int exp,int act){
        super(id,loc,dist,exp,act);
    }
    double calculatePenalty(){
        if (!isDelayed())
            return 0;
        int delay=actualDuration-expectedDuration;
        if(delay>30){
            return delay*0.5;
        }
        return 0;
    }
    boolean isCritical(){
        return false;
    }

    String getType(){
        return "Rest";
    }
}
