package _java.Strings.javaregex;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-regex/problem
 */

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}
