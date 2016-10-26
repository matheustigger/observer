package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class StatusGitLab implements Observable{
    
    private List <Observer> observers;
    private String status;
    
    /**
     * Construtor: inicializa a lista de Observers como ArrayList
     */
    public StatusGitLab() {
        this.observers = new ArrayList<Observer>();
        this.status = "GitLab Vivo... Por enquanto";
    }
    
    public void addObserver(Observer obs){
        this.observers.add(obs);
        obs.update("Obrigado por se inscrever: "+this.status);
    }
    
    public void mudaStatus(String status){
        this.status=status;
        notifyObservers();
    }
 
    
    public void delObserver(Observer obs){
        this.observers.remove(obs);
    }
 
    
    public void notifyObservers(){
        for(Observer obs : this.observers){
            obs.update(status);
        }
    }
}
