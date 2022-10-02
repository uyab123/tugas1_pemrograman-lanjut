/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesin_atm;

/**
 *
 * @author bayua
 */
public class DAO_model implements dao{
    SINGLETON_saldo ceksaldo;
    
    public DAO_model(){
        this.ceksaldo = new SINGLETON_saldo();
    }
    
    public int limit(){
        return this.ceksaldo.limitsaldo;
    }

    @Override
    public int getsaldo() {
        return this.ceksaldo.getsaldo();
    }

    @Override
    public void addsaldo(int s) {
        ceksaldo.setsaldo(ceksaldo.getsaldo() + s);
    }

    @Override
    public void tariksaldo(int s) {
        ceksaldo.setsaldo(ceksaldo.getsaldo() - s);
    }

    @Override
    public boolean maxlimit() {
        if(this.ceksaldo.getsaldo() <= this.ceksaldo.limitsaldo){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int cek(int s) {
        if(s % 50000 != 0){
            return 1;
        }
        return 0;
    }
}
