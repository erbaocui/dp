package com.cn.struct.flyweight.example;

public class Client {
    public static void main(String[] args) {
        CharacterFactory factory=CharacterFactory.getInstance();
        Character a=factory.getCharacte('A');
        a.setFontSize(20);
        a.display();
        Character b=factory.getCharacte('B');
        b.setFontSize(24);
        b.display();



    }
}
