
package exemploxenerico;


public class ExemploXenerico {

   
    public static void main(String[] args) {
        Xenerico<String>nome=new Xenerico<String>();
        nome.setVariable("abc");//mediante o set damoslle un valor
        nome.amosar();
        
       
        Xenerico<Periodico> peri=new Xenerico<Periodico>();
        peri.setVariable(new Periodico ("1/1/1","Faro de Vigo"));
        peri.amosar();
        /*Periodico peri=new Periodico();
        peri.setVariable(per);   Tamén o poderiamos crear así*/ 
        Xenerico<Publicacion> publi=new Xenerico <Publicacion>();
        publi.setVariable(new Publicacion (4,7f));
        publi.amosar();
        
        ListasXenericos <Periodico> lista1=new ListasXenericos <Periodico>();
        lista1.engadir(new Periodico ("1/7/12","Faro de Vigo"));
        lista1.engadir(new Periodico("23/6/89", "As"));
        lista1.engadir(new Periodico("12/6/99", "El correo"));
        lista1.amosar(lista1.getArray());
        
        /*Xenerico<Double> numDouble=new Xenerico <>();
        numDouble.setVariable(1.2222);
        numDouble.setVariable(1.3333);
        numDouble.amosar();*/
        
        ListasXenericos2 <Periodico> lista2=new ListasXenericos2 <Periodico>();
        lista2.engadir(new Periodico ("1/7/12","Faro de Vigo"));
        lista2.engadir(new Periodico ("1/7/12","Marca"));
        lista2.amosar(lista2.getArray());
        
        
        
        
    }
    
}
