package com.november12.red;

public class RedPacket {
    private int redAumont;	  // 红包金额总数
    private int count;	  // 红包总数
    private int aumont; // 金额

    RedPacket(){

    }
    RedPacket(int redAumont, int count){
        this.aumont = aumont;
        this.count = count;
        this.redAumont = redAumont;
        this.aumont = redAumont*count;
    }
    public int checkRed(){
        int i = redAumont;
        if (count != 0){
            count --;
            i--;
            return i;
        }
        return 0;
    }
}
