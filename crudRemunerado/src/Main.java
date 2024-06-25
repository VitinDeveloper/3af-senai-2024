import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsuarioCRUD usuarioCRUD = new UsuarioCRUD();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Selecione uma opção =====");
            System.out.println("1. Criar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Atualizar usuário");
            System.out.println("4. Deletar usuário");
            System.out.println("5. Buscar usuário por email");
            System.out.println("6. Criar usuários falsos");
            System.out.println("7. Sair");
            System.out.println("===============================");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    String email;
                    while (true) {
                        System.out.print("Digite o email: ");
                        email = scanner.nextLine();
                        if (usuarioCRUD.emailJaCadastrado(email)) {
                            System.out.println("Email já cadastrado. Por favor, digite um email diferente.");
                        } else {
                            break;
                        }
                    }
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();
                    Usuario usuario = new Usuario(nome, email, senha);
                    usuarioCRUD.criarUsuario(usuario);
                    break;

                case 2:
                    List<Usuario> usuarios = usuarioCRUD.lerUsuarios();
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        System.out.println("Usuários cadastrados:");
                        for (Usuario user : usuarios) {
                            System.out.println("Nome: " + user.getNome() + ", Email: " + user.getEmail());
                        }
                    }
                    break;

                case 3:
                    boolean autenticado = false;
                    String emailParaAtualizar = "";
                    while (!autenticado) {
                        System.out.print("Digite o email do usuário a ser atualizado: ");
                        emailParaAtualizar = scanner.nextLine();
                        System.out.print("Digite a senha do usuário: ");
                        String senhaParaAtualizar = scanner.nextLine();
                        if (usuarioCRUD.verificarEmailESenha(emailParaAtualizar, senhaParaAtualizar)) {
                            autenticado = true;
                        } else {
                            System.out.println("Email ou senha incorretos. Tente novamente.");
                        }
                    }
                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo email: ");
                    String novoEmail = scanner.nextLine();
                    System.out.print("Digite a nova senha: ");
                    String novaSenha = scanner.nextLine();
                    Usuario usuarioAtualizado = new Usuario(novoNome, novoEmail, novaSenha);
                    usuarioCRUD.atualizarUsuario(emailParaAtualizar, usuarioAtualizado);
                    break;

                case 4:
                    System.out.print("Digite o email do usuário a ser deletado: ");
                    String emailParaDeletar = scanner.nextLine();
                    usuarioCRUD.deletarUsuario(emailParaDeletar);
                    break;

                case 5:
                    System.out.print("Digite o email do usuário a ser buscado: ");
                    String emailParaBuscar = scanner.nextLine();
                    Usuario usuarioBuscado = usuarioCRUD.buscarUsuarioPorEmail(emailParaBuscar);
                    if (usuarioBuscado != null) {
                        System.out.println("Usuário encontrado: " + usuarioBuscado.getNome() + ", Email: " + usuarioBuscado.getEmail());
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 6:
                    usuarioCRUD.criarUsuariosFalsos();
                    break;

                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}