public class Main {
    public static void main(String[] args) {
        // 1: Prime Number
        int num=3;
        String prime= primeNumber(num);
        System.out.println(prime);

        //2: calculate Tax
        double price=200;
        calculateTax(price);


        //3: palindrome
        String name="BoB";
        if(palindrome(name)==true){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
    public static String primeNumber(int num){
        for (int i = 2; i < num ; i++) {
            if (num%i==0){
                return"Not Prime Number";
            }
        }
        return "Prime Number";
    }

    public static void calculateTax(double price){
        if (price<100 || price>500) {
            System.out.println("the price outside the given range");
            return;
        }
        double tax= price*(15.0/100.0);
        System.out.println("Tax= "+tax);
    }


    public static boolean palindrome(String s){
        String reverse="";
        for (int i = s.length()-1; i >=0; i--) {
            reverse+=s.charAt(i);
        }
        if(!s.equals(reverse)){
           return false;
        }
        return true;
    }
}