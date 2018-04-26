package com.quantuncs;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Collection;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        Collection collection ;

        System.out.println( "Hello World!" );

        B b = new B() ;
        b.setA("123123");


        System.out.println(b.getA());

    }




}

class A {
    private String a ;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}

class  B extends  A {
    public void printA (){
        System.out.println(getA());
    }
}