package com.cn.dp.behavior.strategy.template;

import java.util.List;

public class BubbleSortStrategy implements Strategy{
    public void sort(List<Integer> list) {
        System.out.println("bubbleSort");

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size()-1-i;++j){
                if(list.get(j)>list.get(j+1)){
                    int temp=list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }

    }
}
