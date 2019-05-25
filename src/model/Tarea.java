package model;

import java.util.TimerTask;
import view.Inicio;


public class Tarea extends TimerTask {
    
    Inicio contexto;
    
    public Tarea() {
        
    }

    @Override
    public void run() {
        System.out.println("NUEVO CICLO ok");
        contexto.cargartabla();
        
    }
  
}
