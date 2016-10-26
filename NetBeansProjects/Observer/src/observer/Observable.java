package observer;

/**
 *
 * @author Matheus
 */
public interface Observable {
    /**
     * Adiciona um novo Observer à lista de notificações.
     */
    public void addObserver(Observer obs);
 
    /**
     * Remove um Observer da lista.
     */
    public void delObserver(Observer obs);
 
    /**
     * Notifica todos os Observers registados.
     */
    public void notifyObservers();
}
