
import javax.swing.JOptionPane;


public class Turno {
    Persona cab;
  Turno(){
    cab=null;
  }
  
  public void asignar(String documento,String nombre, String hora, String tur){
       Persona nuevo=new Persona();
       nuevo.setNombre(nombre);
       nuevo.setDocumento(documento);
       nuevo.setHora(hora);
       nuevo.setTur(Integer.valueOf(tur));
       
   if(cab==null){
           cab=nuevo;
       }
       else{
    Persona temporal=cab;
    
   while(temporal.getSiguiente()!=null){
   temporal= temporal.getSiguiente();
    }// cierra el while
   temporal.setSiguiente(nuevo);
      
       }// cierra el else
   }

    public boolean atender(){
    boolean existe=false;

    if(cab==null){
        existe=false;
    }
    else{
    cab=cab.getSiguiente();
    existe=true;
    }
    return existe;
    }

    public boolean buscar(String buscar){
    boolean existe=false;
    Persona aux=cab;
    int contador=0;

    while(aux!=null){
        contador++;
    if(aux.getDocumento().equals(buscar)){
        existe=true;
         JOptionPane.showMessageDialog(null,"el valor existe y esta en la posicion "
                                               +contador+" y tiene el turno "+aux.getTur());
      aux.setNombre(JOptionPane.showInputDialog(this,"Digite el nuevo nombre"));

         break;

    }// cierra el if

    aux=aux.getSiguiente();
    }// cierra el ciclo


    return existe;
    }    
}
