package com.example.swordfingeroffer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SwordFingerOfferApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwordFingerOfferApplication.class, args);
    }

    public int[] twoSum(int[] nums, int target) {

        /**
         1、暴力求解
         2、hash空间换时间
         */
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int cur = nums[i];
            if (map.containsKey(target-cur)){
                return new int[]{i,map.get(target-cur)};
            }
            map.put(cur,i);

        }
        return new int[]{-1,-1};

    }


}
