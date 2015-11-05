

package boletin.pkg74;

/**
 *
 * @author jpatriciodasilva
 */
public class Boletin74 {

   
    public static void main(String[] args) {
    
        NewClass74 obx=new NewClass74();
        String nome1, nome2;
        float peso1, peso2;
         
        nome1=obx.RecibirNome();
        nome2=obx.RecibirNome();
        
        peso1=obx.RecibirPeso();
        peso2=obx.RecibirPeso();
       
        obx.diferencia(nome1, nome2, peso1, peso2);
        





    }
    
}
