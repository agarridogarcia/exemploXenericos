
package exemploxenerico;

import java.util.ArrayList;
import java.util.LinkedList;


public class ListasXenericos2 <T> {
    LinkedList <T>lista = new LinkedList<T>();

    public ListasXenericos2() {
       lista=new LinkedList<T>();//tamén se pode crear o arraylist aqui no constructor
    }
  public void amosar(LinkedList<T> list){
      for(int i =0;i< list.size();i++){
          System.out.println(list.get(i));
      }
  }
  public void engadir(T ele){
          lista.add(ele);
  }
  
  public LinkedList<T>getArray(){
      return lista;
  }
      
}
