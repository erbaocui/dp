package com.cn.dp.struct.flyweight.example;

import java.util.Hashtable;

public class CharacterFactory {
    private Hashtable characters= new Hashtable();

    private static CharacterFactory instance;

    private CharacterFactory(){
        characters.put('A',new CharacterA());
        characters.put('B',new CharacterB());
    }

    public static CharacterFactory getInstance(){
        if(null== instance){
            instance= new CharacterFactory();
        }

           return  instance;
    }

    public Character getCharacte(char key){
        Character character=(Character)characters.get(key);
        if(null==character){
            switch (key){
                case 'A':
                    character=new CharacterA();
                    break;
                case 'B':
                    character=new CharacterB();
                    break;
            }
        }
        characters.put(key,character);
        return character;

    }


}
