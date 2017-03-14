/**
 * Created by yoel.gallegos on 13/03/2017.
 */
public abstract class Padre {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void print(){
        System.out.println("default");
    }

    void print(int i){
        System.out.println("imprime con parametro:"+i);
    }


}
