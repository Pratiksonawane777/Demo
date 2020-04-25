package com.in.demo.practice;

import java.util.function.Function;
import java.util.function.Predicate;

public class Practice {

    public static void main(String[] args)
    {
        Function<Integer, Integer> f = i->i*i;
        Predicate<Integer> p = i -> i%2==0;
        test t=i->i*i;

        System.out.println("The square of 4 :"+ f.apply(78));
        System.out.println("The square of 4 :"+f.apply(89));
        System.out.println("Number is Even :"+p.test(26));
        System.out.println(t.getValue(10));
    }

    public int m1(int i)
    {
        return i;

    }
}

interface  test{

    int getValue(int j);

}