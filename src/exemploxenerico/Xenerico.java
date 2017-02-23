
package exemploxenerico;

import javax.swing.JOptionPane;


public class Xenerico <T> {
    T variable;
    /*public void set (T e){
        variable= e;
    }
    public T get (){
        return variable;
    }*/

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }
    public void amosar (){
        JOptionPane.showMessageDialog(null, variable);
    }
}
