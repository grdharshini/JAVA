public class Elseif {
    public static void main(String[] args){
        String[] names = {"seetha","sriaman","pradeep","jeni"}; //4

        for(int i =0; i< names.length;i++){
            if(names[i].indexOf('a')==5){
                System.out.println(names[i]);
            }
        }
    }
}