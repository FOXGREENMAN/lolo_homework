package com.account;

import java.math.BigDecimal;
import java.util.*;

public class Demo {

    private List<Account> createAccount(){
        List<Account> accountList = new ArrayList<>();

        Account account0 = new Account();
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();

        account0.setType("201106");
        account1.setType("202106");
        account2.setType("201106");
        account3.setType("201107");
        account4.setType("201108");

        account0.setUid("10027");
        account1.setUid("10025");
        account2.setUid("10024");
        account3.setUid("10021");
        account4.setUid("10027");

        account0.setBalance(new BigDecimal("100"));
        account1.setBalance(new BigDecimal("100"));
        account2.setBalance(new BigDecimal("100"));
        account3.setBalance(new BigDecimal("10"));
        account4.setBalance(new BigDecimal("50"));

        accountList.add(account0);
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);

        return accountList;
     }

    public static void main(String[] args) {
        Demo demo = new Demo();
        List<Account> list = demo.createAccount();
        Map<String,Object> map = new HashMap<>();
        for (Account account : list){
            if (map.containsKey(account.getUid().toString())){
                Object a = map.get(account.getUid().toString());
                map.put(account.getUid().toString(),new BigDecimal(a.toString()).add(account.getBalance()));
                continue;
            }
                    map.put(account.getUid().toString(),account.getBalance());

            }

        System.out.println(map);
    }
}
