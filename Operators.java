import java.util.Scanner;
class Operators {
    public static void main(String[] args) {
        int box1 = 25;
        int box2 = 50;
        int box3 = 23;
       // int(total) = box1 + box2 + box3;
        System.out.println((box1<box2) && (box3<=box1));//true
        System.out.println(((box3<=box1)|| (box1==box3)));//true
        System.out.println(((box1<box2) && (box3<=box1))||((box1==box3))||((box1>=box3)));//true
        System.out.println(((box1<box2) && (box3<=box1))||((box1==box3)||(box1>=box3)));// true
        System.out.println(((box1==box2) && (box3<=box1) && (box1==box3) && (box1>=box3)));// false
         System.out.println(((box1<box2) && (box3<=box1) && (box1<=box2) && (box1>=box3)));//true
        System.out.println ((box1<box2) && (box3<=box1) && (box1>=box3) && (box1==box3));// false
         System.out.println(((box1<box2) && (box3<=box1))||((box1==box3==box1>=box3)));//true
         System.out.println((box1<box2) && (box1>=box2));// false
        System.out.println((box1>box2) && (box2==box1) && (box1==box3));//false
        System.out.println((box1==box2));//false
    }
}