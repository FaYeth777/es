public class Main {
    public static void main (String[] args) {
        //System.out.println("Hello World");

        //int firstnumber = 5;
        //float secondnumber = 8;
        //double result = firstnumber - secondnumber;

        //System.out.println(result);


       // boolean boolvalue1 = true;
       // boolean boolValue2 = false;


        //System.out.println(boolvalue1 || boolValue2);


        int imputnumber = 5;
        int testnumber = 7;

        boolean result = imputnumber > testnumber;


        if (imputnumber > testnumber) {
            System.out.println("Liczba " + imputnumber + " jest większa od liczby " + testnumber);
        }
        else if (imputnumber == testnumber) {
            System.out.println("Liczby są równe");
        }
        else{
            System.out.println("Liczba " + imputnumber + " jest mniejsza niż " + testnumber);
        }
    }
}
