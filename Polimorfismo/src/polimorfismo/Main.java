
package polimorfismo;


public class Main {

    public static void main(String[] args) {
        Pessoa [] pessoas = new Pessoa[6];
        Impressora imp1 = new Impressora();
        pessoas[0] = new Milico(23,"Juca","Cabo");
        pessoas[1] = new Politico (70,"Eneas","PPCC");
        pessoas[2] = new Milico (56,"Fernando","Tenente");
        pessoas[3] = new Milico(18,"Geremias","EV");
        pessoas[4] = new Politico(56,"Alfredo","PP");
        pessoas[5] = new Politico(62,"Roberto","PPS");
        imp1.Imprimir(pessoas[0]);
        imp1.Imprimir(pessoas[1]);
        imp1.Imprimir(pessoas[2]);
        imp1.Imprimir(pessoas[3]);
        imp1.Imprimir(pessoas[4]);
        imp1.Imprimir(pessoas[5]);
    }

}
