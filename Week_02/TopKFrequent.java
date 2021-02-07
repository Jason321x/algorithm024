/*
 * Create Author  : xinxin.ji
 * Create Date    : 2021-02-07
 * Project        : JCP
 * File Name      : TopKFrequent.java
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */
package main.java.subject;

import java.util.*;

/**
 * 功能描述:  <p>
 *
 * @author : xinxin.ji <p>
 * @version 1.0 2021-02-07
 * @since JCP 1.0
 */
public class TopKFrequent {

    // 返回非空整数数组的出现频率前k高的元素
    public int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0;i < nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(map.entrySet());
        List<Integer> list = new ArrayList<>();
        while (maxHeap.size() < k) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            list.add(entry.getKey());
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

}
