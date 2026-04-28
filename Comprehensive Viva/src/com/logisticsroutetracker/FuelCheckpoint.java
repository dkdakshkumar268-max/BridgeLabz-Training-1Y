package com.logisticsroutetracker;

class FuelCheckpoint extends Checkpoint{
    FuelCheckpoint(String id,String loc,double dist,int exp,int act){
        super(id,loc,dist,exp,act);
    }
    double calculatePenalty(){
        return isDelayed()?10:0;
    }
    boolean isCritical(){
        return true;
    }
    String getType(){
        return "Fuel";
    }
}