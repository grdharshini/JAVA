public class ArrayAverage{
public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    int sum = 0;
    int length = array.length;
    for (int i = 0; i < array.length; i++) {
        sum = sum + array[i];}
       int  Average = sum / length;

    System.out.println("Average of Array:"  +Average);
}
}