public class Switch1 {
    public static void main(String[] args){
        String animal = "deer";
                switch (animal){
                    case "dog":
                        System.out.println("Pet");
                        break;
                    case "lion":
                        System.out.println("king");
                        break;
                    case "deer":
                        System.out.println("Nature");
                        break;
                    case "bee":
                        System.out.println("insect");
                        break;
                    default:
                        System.out.println("not matching");
                }


    }
}