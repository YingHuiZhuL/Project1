package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Helper {

    public static void main(String[] args) {
	// write your code here
        Lost[] lostArray=new Lost[];
        System.out.println("排序前: ");
        for(Lost a:LostArray){
            System.out.println(a);
        }
        System.out.println("  ");
        System.out.println("排序后: ");
        Solution s=new Solution();
        s.sortLost(LostArray);
        System.out.println(" ");
        System.out.println("请输入索要搜索物品: ");
        Scanner sc=new Scanner(System.in);
        String key=sc.nextLine();
        Lost[] array=s.selectByKeyword(lostArray,key);
        for(int i=0;i<array.length;i++){
            if(array[i]!=null){
                System.out.println(array[i]);
            }
        }
    }
}
