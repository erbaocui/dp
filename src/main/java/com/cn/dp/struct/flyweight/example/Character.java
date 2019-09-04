package com.cn.dp.struct.flyweight.example;

public abstract class Character {

    protected  char letter;
    protected   int fontSize;

    public void display(){
        System.out.println(this.letter+"  "+this.fontSize);
    }



    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
