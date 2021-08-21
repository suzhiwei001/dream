package com.szw.dream.study;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableTest {

    public void testOne(){
        long l = System.currentTimeMillis();
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> this.add("111"));
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> this.add("222"));
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> this.add("333"));
        CompletableFuture.allOf(future1,future2,future3).join();
        String join1 = future1.join();
        String join2 = future2.join();
        String join3 = future3.join();
        System.out.println("--"+join1+"-------"+join2+"---------"+join3+"------");
        long ll = System.currentTimeMillis() - l;
        System.out.println("耗时："+ll);
    }
    public String add(String str){
        long l = System.currentTimeMillis();
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println(str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long ll = System.currentTimeMillis() - l;
        System.out.println("内耗时："+ll);
        return str;
    }
}
