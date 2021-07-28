package com.main.june;

import sun.net.sdp.SdpSupport;

public class SDASD {
    public static void main(String[] args) {
        SDASD sdasd = new SDASD();
        System.out.println(SDASD.getDomain("https://h5.vtrading.com/ydz/#/"));


    }

    public static String getDomain(String url) {
        if (url.length() > url.indexOf("//") + 2) {

            int index = url.indexOf("?", url.indexOf("//") + 2);
            if (index == -1) return url;
            return url.substring(0, index);

        }

        return url;
    }

}