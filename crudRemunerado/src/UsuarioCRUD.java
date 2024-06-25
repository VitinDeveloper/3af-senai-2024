import java.util.ArrayList;
import java.util.List;

public class UsuarioCRUD {
    private List<Usuario> usuarios;

    public UsuarioCRUD() {
        usuarios = new ArrayList<>();
    }

    public void criarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> lerUsuarios() {
        return usuarios;
    }

    public void atualizarUsuario(String email, Usuario usuarioAtualizado) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                usuario.setNome(usuarioAtualizado.getNome());
                usuario.setEmail(usuarioAtualizado.getEmail());
                usuario.setSenha(usuarioAtualizado.getSenha());
                break;
            }
        }
    }

    public void deletarUsuario(String email) {
        usuarios.removeIf(usuario -> usuario.getEmail().equals(email));
    }

    public Usuario buscarUsuarioPorEmail(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }
    public boolean emailJaCadastrado(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public void criarUsuariosFalsos() {
        if (usuarios.isEmpty()) {
            criarUsuario(new Usuario("Dino1", "dino1@gmai.com", "senha1"));
            criarUsuario(new Usuario("Dino2", "dino2@gmail.com", "dino2"));
            criarUsuario(new Usuario("Dino3", "dino3@gmai.com", "dino3"));
            System.out.println("Usuários falsos criados com sucesso.");
        } else {
            System.out.println("Os usuários falsos já foram cadastrados.");
        }
    }

    public boolean verificarEmailESenha(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
}