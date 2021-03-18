import java.util.concurrent.ThreadLocalRandom;

public class Aula1 {
    public int in;
    public Aula1(){
        this.in = 0;
    }

    public void run(int it){
        for(int i=0;i<it;i++){
            double x = ThreadLocalRandom.current().nextDouble(0,1);
            double y = ThreadLocalRandom.current().nextDouble(0,1);
            if(x*x + y*y <= 1)
                in++;
        }
    }

    public int getIn(){
        return in;
    }
}