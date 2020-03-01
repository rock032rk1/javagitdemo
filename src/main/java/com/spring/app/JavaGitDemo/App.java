package com.spring.app.JavaGitDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<String> slist=new ArrayList<String>();
        slist.add("Rakesh");
        slist.add("Satish");
        
        for(String s:slist) {
        	System.out.println(s);
        }
    }
}
