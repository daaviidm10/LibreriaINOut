package Visualizar;

public class FactoriaDeSalida {
    public static final int CONSOLA = 1;
    public static final int VENTANA = 3;
    public static class InterfaceMetodosComunes getProducto(int type, String){
switch (type){
    case CONSOLA:
        return new VisualizaConsola();
    case VENTANA:
        return new VisualizaVentana();
    default:
        return null;
}

    }
}
