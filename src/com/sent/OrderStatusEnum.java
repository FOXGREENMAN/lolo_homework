package com.sent;

public enum OrderStatusEnum {


    STA_INIT(1,"stainit","新订单"),
    STA_FILL(2,"stafill","完全成交"),
    STA_CANC(3,"stacanc","已取消")
    ;

    public Integer value;
    public String confLanKey;
    public String description;

    OrderStatusEnum(Integer value, String confLanKey, String description){
        this.value = value;
        this.confLanKey = confLanKey;
        this.description = description;
    }
}
