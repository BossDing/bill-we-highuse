package com.geekq.billhighuse.controller;

import com.geekq.billhighuse.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @author 邱润泽 bullock
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private testService  testService;

    @ResponseBody
    @RequestMapping("/go")
    public String getTestData(){
//        Arrays.fill();

        Math.max(-1,1);
        int ho = testService.testNum();
        System.out.println(ho);
        return "2222222";
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("werrrrtgfdvfff"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] allChar = new int[256];
        Arrays.fill(allChar, -1);
        int res = 0;
        //子串的起点下标记.
        int left = -1;
        for (int i = 0; i < s.length(); i++) {
            //left 就是遍历之前的没有出现过的字符.
            left = Math.max(left, allChar[s.charAt(i)]);
            //更新出现过的字符位置.
            allChar [s.charAt(i)] = i;
            //遍历到当前字符串,最大的要么之前的最大的长,
            // 要么就是 left到当前字符的步长.
            res = Math.max(res, i - left);
        }
        return res;
    }
}
