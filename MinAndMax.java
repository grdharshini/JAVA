public class MinAndMax {
    public static void main(String[] args){
        int[] arrays = {1,8,4,6,9,4,5};
        int length = arrays.length;
        int max = arrays[0];
        for(int i=0; i< arrays.length; i++){
            if(arrays[i]>max){
                max = arrays[i];

            }
        }
        System.out.println(max);

    }
}