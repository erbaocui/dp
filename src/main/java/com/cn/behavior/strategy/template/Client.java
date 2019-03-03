package com.cn.behavior.strategy.template;



public class Client {
    public static void main(String[] args) {
        Context context=new Context();
        context.add(1);
        context.add(9);
        context.add(5);
        context.add(7);

        Strategy strategy=new QuickSortStrategy();
        context.setStrategy(strategy);
        context.sort();
        context.display();


        strategy=new BubbleSortStrategy();
        context.setStrategy(strategy);
        context.sort();
        context.display();
    }


}
