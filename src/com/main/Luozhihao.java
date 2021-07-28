package com.main;

public class Luozhihao {
    /**
     * 主键id
     */
    private Integer id;

    /**
     *   项目申请编号
     */
    private Integer projectId;
    /**
     * 申请id
     */
    private Integer applyId;
    /**
     *  项目币种
     */
    private String coinSymbol;

    @Override
    public String toString() {
        return "Luozhihao{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", applyId=" + applyId +
                ", coinSymbol='" + coinSymbol + '\'' +
                '}';
    }
}
