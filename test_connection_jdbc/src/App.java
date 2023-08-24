import DAO.amigosDAO;
import entity.amigos;

public class App {
    public static void main(String[] args) throws Exception {
        

        amigos new_user = new amigos();
        new_user.setNome("Mad Max");
        new_user.setApelido("MadMax42");
        new_user.setIdade(42);

        new amigosDAO().cadastrarUsuario(new_user);
    }
}
