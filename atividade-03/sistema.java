// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;

interface Iautenticavel{
    public void login(String usuario, String senha);
    public void logout();
}

class SistemaDeSeguranca implements Iautenticavel{
    private String usuario  = "admin";
    private String senha = "1234";
    private boolean on = false;

    public void login(String usuario, String senha){
        if(usuario.equals("admin")){
            if(senha.equals("1234")){
                System.out.println("Bem vindo, "+usuario);
                on = true;
            }
            else{
                System.out.println("Senha incorreta");
            }
        }
        else if(usuario != "admin"){
            System.out.println("Usuário incorreto");
        }
        else{
            System.out.println("Usuário e senha incorretos, tente novamente.");
        }
    }

    public void logout(){
        on = false;
        System.out.println("Saindo do usuário...");
    }

    public boolean isOn() {
        return on;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SistemaDeSeguranca user = new SistemaDeSeguranca();
        String usuario, senha, r;
        do{
        System.out.print("Digite seu usuário:");
        usuario = s.next();
        System.out.print("Digite sua senha:");
        senha = s.next();
        user.login(usuario, senha);
        }while(!user.isOn());

        System.out.println("Deseja sair do sistema?(s/n)");
        r = s.next();
        if(r.equals("s")){
            user.logout();
        }
        else{
            System.out.println("Ainda no sistema.");
        }

    }
}