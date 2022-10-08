public class ExJava2{

public static void main(String[] args) {
    
    Jogador J1 = new Jogador(1);
    Jogador J2 = new Jogador(2);
    Jogador J3 = new Jogador(3);
    

    J1.num = 10;
    J2.num = 20;
    J3.num = 30;
    System.out.printf("%n%d",J1.num);
    System.out.printf("%n%d",J2.num);
    System.out.printf("%n%d",J3.num);
}
}