import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        Colas cola = new Colas();
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar un elemento en la cola\n" +
                                "2. Quitar un elemento de la cola\n" +
                                "3. ¿La Cola esta vacia?\n" +
                                "4. Elemento ubicado al Inicio de la Cola\n" +
                                "5.Tamaño de la cola\n" +
                                "6. Salir\n", "Menu", JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a Insertar", "Solicitando elemento", JOptionPane.INFORMATION_MESSAGE));
                        cola.insertar(elemento);
                        break;
                    case 2:
                        if(!cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento atendido es : " + cola.quitar(), "Quitando Elementos de la cola", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola está vacía", "Cola vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, "La cola está vacia", "Cola vacía", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola no está vacía", "Cola  no vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio de la cola es : " + cola.inicioCola(), "Inicio de la cola", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola está vacía", "Cola vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la cola es : " + cola.tamañoCola(), "Tamaño de la cola", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        }while(opcion!=6);
    }
}