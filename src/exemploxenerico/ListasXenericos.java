
package exemploxenerico;

import java.util.ArrayList;


public class ListasXenericos <T> {
    ArrayList <T>lista = new ArrayList<T>();

    public ListasXenericos() {
       lista=new ArrayList<T>();//tamén se pode crear o arraylist aqui no constructor
    }
  public void amosar(ArrayList<T> list){
      for(int i =0;i< list.size();i++){
          System.out.println(list.get(i));
      }
  }
  public void engadir(T ele){
          lista.add(ele);
  }
  
  public ArrayList<T>getArray(){
      return lista;
  }
      
}
