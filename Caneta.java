public class Caneta {
    
    String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampada;
    void status (){
        System.out.print( " Uma caneta, " + this.cor);
        System.out.print(", ponta "+this.ponta);
        System.out.print(", carga "+this.carga);
        System.out.println(" está tampada? "+this.tampada);
        
    }

    void rabiscar(){
        if( this.tampada==true){
            System.out.println(" Error 402!!!, Não é permitido rabiscar");

        }else{
            System.out.print(" É permitido rabiscar");
        }
    }

    void tampar(){

        this.tampada =true;
    }
    void destampar(){

        this.tampada = false;

    }
}
