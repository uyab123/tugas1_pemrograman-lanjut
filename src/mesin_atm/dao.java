/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mesin_atm;

/**
 *
 * @author bayua
 */
public interface dao {
    int getsaldo();
    
    void addsaldo(int s);
    
    void tariksaldo(int s);
    
    boolean maxlimit();
    
    int cek(int s);
}
