class Logical {
    public static void main(String[] args){
          int a = 20;
          int b = 30;
          int c = 50;
         /* if((a>=b && b<c)||(a!=c)) {
            System.out.println("This conditions is true");}
        else{
            System.out.println("This condition is false");
        }*/
if ((a!=b && b!=c && c!=a) || (a<=b) && (b<=c))
{
    System.out.println("This is true");
}

else
{
    System.out.println("This condition is false");
}
    }
    }
