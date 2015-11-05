

package boletin.pkg74;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class NewClass74 {
    String nome;
    float peso;
    
    public String RecibirNome(){
         String res =JOptionPane.showInputDialog("Introduce o nome");
         return res;
        
   }
    
    public float RecibirPeso(){
        float pes;
        String res =JOptionPane.showInputDialog("Introduce o peso");
        pes=Float.parseFloat(res);
      return pes;
    }
    public void diferencia(String nome1,String nome2,float peso1,float peso2){
       if (peso1>peso2) 
           JOptionPane.showMessageDialog(null, nome1+"pesa"+peso1+"kg"+"a diferencia e"+(peso1-peso2)+"kg");
       else if(peso2>peso1)
            JOptionPane.showMessageDialog(null, nome2+"pesa"+peso2+"kg"+"a diferencia e"+(peso2-peso1)+"kg");
       else
            JOptionPane.showMessageDialog(null, nome1+"pesa"+peso1+"kg"+nome2+"kg"+peso2+"kg"+"teñen o mismo peso");
    
    }
}
