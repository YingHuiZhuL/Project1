package com.company;

import java.util.Comparator;

public abstract class Solution implements Comparator<Lost>(

        /**
         * 失物排序方法
         * @param lostArray 待排序的失物数组
         */
        public void sortLost(Lost[] lostArray){
            for(int i =0;i<lostArray.length;i++){
                for(int j=i+1;j<lostArray.length;j++){
                    String m=lostArray[i].replace(".","");
                    String n=lostArray[j].replace(".","");
                    int m1=Integer.parseInt(m);
                    int n1=Integer.parseInt(n);
                    if(m1>n1){
                        Lost temp=lostArray[j];
                        lostArray[j]=lostArray[i];
                        lostArray[i]=temp;
                    }
                }
            }
            for(Lost b:lostArray){
                System.out.println(b);
            }

}

    /**
     * 按关键字搜索失物的方法，这里假设按照失物的领取地点进行搜索
     * @param lostArray 失物数组
     * @param keyword 用户输入的关键字
     * @return 返回查找到的失物
     */
    public Lost[] selectByKeyword(Lost[] lostArray,String keyword){
        final int n=lostArray.length;
        Lost[]array=new Lost[n];
        for(int i=0;i<lostArray.length;i++){
            String a =lostArray[i].getPlace();
            if(a.lastIndexOf(keyword)>=0){
                array[i]=lostArray[i];
            }
        }
        return array;
    }
}
