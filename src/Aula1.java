public class Aula1 {

    public static void main(String args[]){
        double st = System.currentTimeMillis();

        int it = Integer.parseInt(args[0]);
        int in = 0;
        for(int i=0;i<it;i++){
            double x = Math.random();
            double y = Math.random();
            if(x*x + y*y <= 1)
                in++;
        }
        double pi = 4*((double)in/(double)it);
        System.out.println("Número de iterações: " + it);
        System.out.println("Número de ins: " + in);
        System.out.println("pi: " + pi);

        double spent = (System.currentTimeMillis() - st)/1000;
        System.out.println("time: " + spent);
    }
}
