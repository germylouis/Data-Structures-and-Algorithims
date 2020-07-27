package main.java.RandomCodeChallenges;

import java.util.HashMap;
import java.util.Map;

public class OnlyOnce {

        public static int singleNumber(int[] nums) {
            final int[] single = new int[1];

            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i], 1);
                }   else {
                    map.replace(nums[i], map.get(nums[i]) + 1);
                }
            }
            map.forEach((k,v)->{
                if(v == 1) {
                    single[0] = k;
                }

            });
            return single[0];
        }
    }

