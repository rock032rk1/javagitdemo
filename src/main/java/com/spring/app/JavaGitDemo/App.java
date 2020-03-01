package com.spring.app.JavaGitDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App 
{
	public static Student st=new Student();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<String> slist=new ArrayList<String>();
        slist.add("Rakesh");
        slist.add("Satish");
        
        for(String s:slist) {
        	System.out.println(s);
        }
        
        System.out.println("Java Git demo Child branch of Master branch");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name :");
        st.setName(sc.nextLine());
        System.out.println("Enter the Mobile No");
        st.setMobile(sc.nextLine());
        
        System.out.println("Student Name :"+st.getName());
        System.out.println("Student Mobile No :"+st.getMobile());
        sc.close();
    }
}
