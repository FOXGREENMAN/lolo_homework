package com.november22;

public class RedB extends  Thread{
    Integer total = 0;

    public RedB(Integer total) {
        this.total = total;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5 && total > 0; i++) {
            int max=100,min=1;
            long randomNum = System.currentTimeMillis();
            int ran3 = (int) (randomNum%(max-min)+min);
            System.out.println("RedB的Total = "+total);
            Integer real = ran3 > total ? total : ran3;
            Integer d = total - real;
            total = Integer.valueOf(d+"");
            System.out.println("RedB = " + "抢了" + real+", 余额 = "+total);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        super.run();
    }
}
