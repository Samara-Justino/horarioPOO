/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horario;

/**
 *
 * @author alunos
 */
public class Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia objeto da classe Relogio
        //Utilizando construtor vazio
        Relogio r = new Relogio();
        System.out.println("utilizando construtor vazio");
        System.out.println("horario: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());

        System.out.println("\n\n");

        //Instancia do objeto da classe Relogio
        //Utilizando construtor que requer hora, minuto e segundo
        r = new Relogio(115, 70, 98);
        System.out.println("utilizando construtor que requer hora, minuto e segundo");
        System.out.println("horario: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());

        System.out.println("\n\n");

        //Instancia objeto da classe Relogio
        //Utilizando construtor que requer apenas hora
        r = new Relogio(20);
        System.out.println("utlizando construtor que requer apenas a hora");
        System.out.println("horario: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());

        System.out.println("\n\n");

        //Instancia objeto da classe Relogio
        //Utilizando construtor que requer hora e minuto
        r = new Relogio(10, 30);
        System.out.println("utlizando construtor que requer hora e minuto");
        System.out.println("horario: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());

        System.out.println("\n\n");

        //Instancia objeto da classe Relogio
        //Utilizando construtor vazio
        r = new Relogio();
        System.out.println("utilizando construtor vazio");
        System.out.println("mas atribuindo valores atraves de metodos de acesso");

        //mas atribuindo valores atraves dos metodos de acesso
        r.setHora(13);
        r.setMinuto(40);
        r.SetSegundo(10);
        //System.out.println(r.getHora() + "horario:" + ":" + r.getMinuto() + ":" + r.getSegundo());
        System.out.println("horario:" + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());

        System.out.println("\n\n");

    }

}
