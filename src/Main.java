public class Main {
    public static void main(String[] args) {
        //aula introdutora de introduçâo a objetos

        Pessoa adao  =  new Pessoa();

        //declraçao de classes
        Pessoa qualquer;

        //instanciaçao de objeto
        qualquer = new Pessoa();
        Pessoa adulta = new Pessoa();
        //definir forma do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenoe = "Lee";
        // definir comportamento do objeto
        qualquer.falar();
        adao.falar("baixo");
    }
}