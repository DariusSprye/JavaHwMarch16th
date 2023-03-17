public class Distance {
    public static void main(String[] args) {

        /*
        Distance 0-4 = $2
        Distance 5-15 = $5
        Distance 16-25 = $10
        Distance 26-50 = $15
        Distance 51+ = $20
         */

        int distance = 10;

        if (distance <=4){
            System.out.println("Charged $2");
        }else if(distance <=15){
            System.out.println("Charged $5");
        }else if(distance <=25){
            System.out.println("Charged $10");
        }else if(distance <=50){
            System.out.println("Charged $15");
        }else{
            System.out.println("Charged $20");
        }
    }

}
