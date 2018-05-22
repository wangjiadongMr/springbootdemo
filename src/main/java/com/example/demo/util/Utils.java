package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wang
 * @data on 2018/5/4
 */
public class  Utils{

    public  static String  getCurrent(){

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static void main(String[] args) {
        System.out.println(Utils.getCurrent());
    }
}
