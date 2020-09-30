package com.fragment.use.vegetables.util;

import lombok.extern.slf4j.Slf4j;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

@Slf4j
public class MathUtil {

    /**
     * 计算百分比
     * @author tjy
     * @date 2020/6/5
     **/
    public static String accuracy(double num, double total, int scale){
        DecimalFormat df = (DecimalFormat) NumberFormat.getInstance();
        //可以设置精确几位小数
        df.setMaximumFractionDigits(scale);
        //模式 例如四舍五入
        df.setRoundingMode(RoundingMode.HALF_UP);
        double accuracyNum = num / total * 100;
        return df.format(accuracyNum)+"%"; // 53.8 45
    }

    public static void main(String[] args) {

        Thread thread = new Thread();
        thread.setName("nice啊马飞");
        thread.start();
        log.debug("11");

        Thread thread1 = new Thread();
        thread1.setName("nice啊马飞1");
        thread1.start();
        log.debug("22");
        /*  Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        };*/
    }
}
