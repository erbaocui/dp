package com.cn.interview.tool;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMTest {
    public static void main(String[] args) throws Exception {
        //step1:获得解析器工厂
        DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
        //step2：获得具体的解析器实例
        DocumentBuilder builder=dbf.newDocumentBuilder();
        //step3:通过解析器实例来获获得Document对象
        Document document= builder.parse(new File("/Users/cuijp/github/dp/candidate.xml"));
        System.out.println(document.getImplementation());
    }
}
