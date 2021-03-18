import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double st = System.currentTimeMillis();
        int it = Integer.parseInt(args[0]);
        int th=1;
        if(args.length > 1)
            th = Integer.parseInt(args[1]);


        List<MCthread> ths = new LinkedList<MCthread>();
        for(int i=0;i<th;i++){
            MCthread p = new MCthread(it,th);
            ths.add(p);
            p.start();
        }
        int in = 0;
        for(MCthread mc : ths){
            in += mc.getIn();
        }

        System.out.println("Número de iterações: " + it);
        System.out.println("Número de ins: " + in);
        System.out.println("pi: " + 4*((double)in/(double)it));

        double spent = (System.currentTimeMillis() - st)/1000;
        System.out.println("time: " + spent);
    }

}
