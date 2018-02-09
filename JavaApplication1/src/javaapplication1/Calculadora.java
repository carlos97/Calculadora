package javaapplication1;

public class Calculadora {

    int x;
    int y;
    int r;

    public void sumar() {
        r = x + y;
    }
    
    public void restar(){
        if(x<0){
            x=-x;
            y=-y;
        }
        if(x<y){
            int aux;
            aux=x;
            x=y;
            y=aux;
        }
        r=x-y;
    }

}
