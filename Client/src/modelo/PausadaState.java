package modelo;

import java.util.Date;

public class PausadaState implements State {
    
    private Tarea tarea;
            
    public PausadaState(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void abrir() {
        this.tarea.setEstado(new AbiertaState(this.tarea));
    }

    @Override
    public void pausado() {
        // ERROR, YA ESTA PAUSADA.
    }

    @Override
    public void cerrar() {
        this.tarea.setFechacierre(new Date());
        this.tarea.setEstado(new CerradaState(this.tarea));
    }
}