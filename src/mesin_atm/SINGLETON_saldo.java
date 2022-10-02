/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesin_atm;

/**
 *
 * @author bayua
 */
public class SINGLETON_saldo {
    private int saldo = 500000;
    public int limitsaldo = 100000;
    

    public int getsaldo() {
        return saldo;
    }

    public void setsaldo(int saldo) {
        this.saldo = saldo;
    }
}
