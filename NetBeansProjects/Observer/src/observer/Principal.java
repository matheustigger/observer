package observer;

/**
 *
 * @author Matheus
 */
public class Principal {
    
    public static void main(String args []){
        StatusGitLab git = new StatusGitLab();
        Usuario u1 = new Usuario("Matheus Stigger");
        git.addObserver(u1);
        Usuario u2 = new Usuario("Matheus Souza");
        git.addObserver(u2);
        
        git.mudaStatus("#gitdown");
        
        git.delObserver(u2);
        
        git.notifyObservers();
    }
}
