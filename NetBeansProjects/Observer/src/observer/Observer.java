package observer;

/**
 *
 * @author Matheus
 */
public interface Observer {
    
    /**
     * Metodo que faz a notificação e recebe atualizações;
     * @param obj 
     */
    public void update(Object obj);

}
