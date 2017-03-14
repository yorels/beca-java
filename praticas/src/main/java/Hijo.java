/**
 * Created by yoel.gallegos on 13/03/2017.
 */
public class Hijo extends Padre{

    @Override
    public void print() {
        System.out.println("default hijo");
    }


    public void print(int i) {
        System.out.println("imprime parametro de hijo"+ i);
    }

    public void print(Integer i){
        System.out.println("imprime con parametro Integer:"+i);
    }

}
