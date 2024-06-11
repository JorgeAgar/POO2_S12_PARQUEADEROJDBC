package poo2.parqueadero.model;

public class ParqueaderoFachada {
    private static ParqueaderoFachada instance;

    private ParqueaderoFachada(){}

    public static ParqueaderoFachada getInstance(){
        if(instance == null)
            instance = new ParqueaderoFachada();
        return instance;
    }
}
