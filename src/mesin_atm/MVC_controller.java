/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesin_atm;

/**
 *
 * @author bayua
 */
public class MVC_controller {
    public MVC_view view;
    public DAO_model model;
    int pilih;
    
    MVC_controller(){
        this.view = new MVC_view();
        this.model = new DAO_model();
        
        while(pilih != 4){
            pilih = view.Menu();
            
            switch(pilih){
                case 1:
                    view.ceksaldo(this.model);
                    break;
                case 2:
                    view.tarik(this.model);
                    break;
                case 3:
                    view.setor(this.model);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
    }
}
