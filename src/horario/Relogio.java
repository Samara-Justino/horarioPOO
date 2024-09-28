/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package horario;

/**
 *
 * @author alunos
 */
public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

//construtor1
    public Relogio() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

//construtor2
    public Relogio(int h) {
        if (h >= 0 || h < 24) {
            hora = h;
        }
        minuto = 0;
        segundo = 0;
    }

//construtor3
    public Relogio(int h, int m) {
        if (h >= 0 || h < 24) {
            hora = h;
        }

        if (m >= 0 || m < 60) {
            minuto = m;
        }
        segundo = 0;

    }

//construtor4
    public Relogio(int h, int m, int s) {
        if (h >= 0 || h < 24) {
            hora = h;
        }

        if (m >= 0 || m < 60) {
            minuto = m;
        }
        if (s >= 0 || s < 60) {
            segundo = s;
        }
        hora = h;
        minuto = m;
        segundo = s;
    }

//Métodos de Acesso
    public void setHora(int x) {
        if (x >= 0 || x < 24) {
            hora = x;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int x) {
        if (x >= 0 || x < 60) {
            minuto = x;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void SetSegundo(int x) {
        if (x >= 0 || x < 60) {
            segundo = x;
        }
    }

    public int getSegundo() {
        return segundo;
    }
}
