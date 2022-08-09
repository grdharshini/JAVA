public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        for (int i = 1; i <= 10; i++) {
            fact = fact * i;
        }
        System.out.println("factorial d of:" + fact);
    }
}
//                int num = 5, i = 1;
//                long factorial = 1;
//                while(i <= num)
//                {
//                    factorial *= i;
//                    i++;
//                }
//                System.out.println("Factorial of five:"+factorial);
//            }
//        }

