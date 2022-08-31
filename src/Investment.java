public class Investment {

    public static double investment(double c, double r, int t, int n){
        return c * Math.pow(1+r/n, t * n);
    }

    public static void main(String [] args){

        // c = initial deposit
       // double c = 1.0;
        //r = yearly interest rate
       // double r = 1.0; // 100% interest
        //t = number of years
       // int t = 1;
        // n = number of times to compound the interest
      //  double n = 1e9; // a billion ( have to declare as a double if you want to use short hand notation)
        // p = final value of investment (p=c(1tr/n)^tn
       // double p = c * Math.pow(1+r/n, t * n);

        //System.out.println(p);
        System.out.println(investment(1.0, 1.0, 1, (int)1e9));
        System.out.println(investment(1000, .03, 10, 365));
    }
}
