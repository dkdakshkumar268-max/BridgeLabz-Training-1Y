package com.logisticsroutetracker;

class DeliveryCheckpoint extends Checkpoint{
    DeliveryCheckpoint(String id,String loc,double dist,int exp,int act){
        super(id,loc,dist,exp,act);
    }
    double calculatePenalty(){
        if (!isDelayed())
            return 0;
        return(actualDuration-expectedDuration)*2;
    }

    boolean isCritical(){
        return true;
    }
    String getType(){
        return "Delivery";
    }
}
