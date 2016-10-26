package observer;

/**
 *
 * @author Matheus
 */
public class Usuario implements Observer {
    
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
    
    public void update(Object obj){
         System.out.println("Caro Usuário " + this.nome + ": o status do GitLab "
                 + "é: " + (String)obj);
     }
}
