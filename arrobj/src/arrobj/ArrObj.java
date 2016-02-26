package arrobj;
 
import java.math.BigInteger;
import javax.swing.JOptionPane;
 
public final class ArrObj {
 
    int contUser=0, cod=1; //variable llevar control usuarios ingresados
    userBanc usuario [] = new userBanc[5]; //creando el arreglo de objetos (clase userBanc)
 
    public ArrObj(){ //constructor de la clase ArrObj
 
        String ax;
        int op=0;
 
        do{
            ax = JOptionPane.showInputDialog(null, "1. Ingresar \n"
                                                  +"2. Mostrarn\n"
                                                  +"3. Buscarn\n"
                                                  +"4. Eliminarn"
                                                  +"5. Salir");
            if(ax!=null && !ax.equals("")){
                op = Integer.parseInt(ax);
 
                switch(op){
                    case 1:
                        ingresar();
                        break;
                    case 2:
                        mostrar();
                        break;
                    case 3:
                        buscar();
                        break;
                    case 4:
                        eliminar();
                        break;
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No es una opción valida!!!");                  
                }
            }
 
        }while(op!=5);
    }
 
    public void ingresar(){        
 
        BigInteger telefono;
        String nombre, apellido;
        Double saldo;        
 
        nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre del usuario: ");
        apellido = JOptionPane.showInputDialog(null, "Ingrese el Apellido del usuario: ");
        telefono =  new BigInteger(JOptionPane.showInputDialog(null, "Ingrese el Telefono del Usuario: ")) ;
        saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el Saldo inicial del Usuario: "));
 
        userBanc temp = new userBanc();
 
        temp.setCod(cod); 
        temp.setNombre(nombre); 
        temp.setApellido(apellido);
        temp.setTelefono(telefono);
        temp.setSaldo(saldo);        
 
        usuario[contUser] = temp;
        contUser++;  
        cod++;      
    }
 
    public void mostrar(){
 
        String ay="";
 
        for(int i=0; i<contUser; i++){
            ay+="Codigo: "+usuario[i].getCod()+"n"
              + "Nombre: "+usuario[i].getNombre()+"n"
              + "Apellido: "+usuario[i].getApellido()+"n"
              + "Telefono: "+usuario[i].getTelefono()+"n"
              + "Saldo: "+usuario[i].getSaldo()+"nn";        
        }
        JOptionPane.showMessageDialog(null, ay);
    }
 
    public void buscar(){
 
        String ax;
        int c;
 
        ax = JOptionPane.showInputDialog(null, "Digite el codigo a buscar");
        if(ax!=null && !ax.equals("")){
            c = Integer.parseInt(ax); ax="";
            if(contUser!=0){
                for(int i=0; i<contUser; i++){
                    if(usuario[i].getCod() == c){
                        ax="";
                        ax+="Codigo: "+usuario[i].getCod()+"n"
                          + "Nombre: "+usuario[i].getNombre()+"n"
                          + "Apellido: "+usuario[i].getApellido()+"n"
                          + "Telefono: "+usuario[i].getTelefono()+"n"
                          + "Saldo: "+usuario[i].getSaldo()+"n";
                          break;
                    }
                    else{
                        ax="No se ha encontrado el usuario :("; 
                    }
                }
                JOptionPane.showMessageDialog(null, ax);
            }
 
        }
    }
 
    public void eliminar(){
        int c;
        userBanc alumTemp[] = new userBanc[contUser-1];//creando un arreglo temporal con un campo menos
 
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el codigo del estudiante a eliminar: "));//pidiendo el codigo a eliminar
                        if(c<=contUser){ //si el codigo a eliminar es menor o igual al contador de estudiantes
 
                            for(int i=0; i<contUser; i++){ //Inicio ciclo para realizar la eliminacion
                                if(c == usuario[i].getCod()){
                                    //si el codigo a aliminar coincide con el codigo que hay en la posicion i
                                    //continua con el ciclo
                                                                    }
                                else{
                                    if(usuario[i].getCod() < c)
                                        alumTemp[i] = usuario[i];//si esl codigo es menor se almacena tal cual                     
                                    if(usuario[i].getCod() > c){
                                        usuario[i].setCod(i);//si el codigo es mayor se le resta para que quede en consecutivo
                                        alumTemp[i-1] = usuario[i]; //se almacena con el nuevo codigo
                                    }
                                }                                                                   
                            } //Fin ciclo para realizar la eliminacion
                            usuario=null; cod--; contUser--; //se hacen las modificaciones para los nuevos valores                   
                            usuario = new userBanc[5]; //se vuelve a crear el arreglo 
            System.arraycopy(alumTemp, 0, usuario, 0, alumTemp.length); //se almacenan los valores no eliminados
                        }
                        else
                            JOptionPane.showMessageDialog(null, "El estudiante a eliminar no existe !!!");
    }
 
    public static void main(String[] args) {
 
        ArrObj w = new ArrObj(); //creacion del objeto w, llamado al constructor de la clase ArrObj
        System.exit(0);        
    }
}
    

