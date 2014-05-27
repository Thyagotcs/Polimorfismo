

package polimorfismo;


public class Politico extends Pessoa {
    String partido;
    public Politico(int i, String n, String p) {
        super(i, n);
        this.partido = p;
       
    }
    @Override
    public String mostrar(){
        return super.mostrar() + " é um politico de " + idade + " anos de idade, filiado ao " + partido;
    }
}
