package com.main.whiteBoard;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by admin on 2020/9/8.
 */
public class JDK8Demo {

    public static void main(String[] args) {
        streamMapTest();
    }

    public static void streamMapTest(){

        List<Fox> foxList = new ArrayList<>();

        Fox foxA = new Fox();
        Fox foxB = new Fox();
        Fox foxC = new Fox();


        foxA.setUid(10001l);
        foxB.setUid(10002l);
        foxC.setUid(10003l);

        foxA.setInviteCode("10001labc");
        foxB.setInviteCode("10002lefg");
        foxC.setInviteCode("10003lhijk");

        foxList.add(foxA);
        foxList.add(foxB);
        foxList.add(foxC);

        List<Long> levelOneChildUidList = foxList.stream().map(Fox::getUid).collect(Collectors.toList());
        Map<String, Fox> levelOneChildInviteMap = foxList.stream().collect(Collectors.toMap(Fox::getInviteCode, a -> a, (k1, k2) -> k1));

        System.out.println(levelOneChildUidList);
        System.out.println(levelOneChildInviteMap);

    }
}
