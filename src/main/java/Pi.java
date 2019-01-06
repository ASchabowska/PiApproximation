public class Pi {
    public static void main(String[] args) {
        System.out.println("pi approximation:");
        System.out.println(piApproximation(9000));
    }

    public static double piApproximation(int n){
        double x,y;
        int count = 0;

        for(int i = 0; i <= n; i++){
            x = Math.random();
            y = Math.random();

            if(x*x + y*y <= 1){
                count++;
            }
        }
        return 4*((double)count/n);

    }
}
