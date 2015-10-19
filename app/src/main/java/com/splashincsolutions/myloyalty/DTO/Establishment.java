package com.splashincsolutions.myloyalty.DTO;

/**
 * Created by bob_l on 19-Oct-15.
 */
public class Establishment {
    int estRef;
    String estName;

    public Establishment(int estRef, String estName){
        this.estRef = estRef;
        this.estName = estName;
    }

    public void setRef(int estRef){
        this.estRef = estRef;
    }

    public void setName(String estName){
        this.estName = estName;
    }

    public int getRef(){
        return estRef;
    }

    public String getName(){
        return estName;
    }
}
