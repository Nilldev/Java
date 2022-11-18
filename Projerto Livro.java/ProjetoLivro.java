public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa ("Nill", 36,"M");

        p[1] = new Pessoa("Simone", 37,"F");


        l[0] = new Livro("Dom Casmurro", "Machado de Assis", 400, p[1]);

        l[1] = new Livro ("O segredo", "Dan Brown", 350, p[0]);


        l[2]= new Livro( "Livro do Espíritos", "Chico Xavier", 700, p[0]);

        l[0].abrir();
        

        System.out.println(l[0].detalhes());
    }
}
