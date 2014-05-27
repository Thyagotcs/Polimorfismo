

package polimorfismo;


public class Milico extends Pessoa {
    String patente;
    public Milico(int i, String n, String p) {
        super(i, n);
        this.patente =p;
    }
    @Override
   public String mostrar(){
	return super.mostrar() + " é um " + patente + " cuja idade é " + idade + " anos";
} 
}
