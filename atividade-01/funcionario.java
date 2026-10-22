// Online Java Compiler (Editor)
// Write and run Java online using this editor.

interface Ifuncionario{
    public String baterPonto();
    default public String fecharCaixa(){
        return "Essa função não é do seu cargo!";
    }
    default public String realizarVenda(){
        return "Essa função não é do seu cargo!";
    }
    default public String solicitarVenda(){
        return "Essa função não é do seu cargo!";
    }
}
class Gerente implements Ifuncionario{

    public String baterPonto(){
        return "Você bateu o ponto!";
    }

    public String fecharCaixa(){
        return "Você fechou o caixa!";
    }

    public String solicitarVenda(){
        return "Você solicitou uma conta!";
    }
    
}

class Vendedor implements Ifuncionario{
    public String baterPonto(){
        return "Você bateu o ponto!";
    }

    public String realizarVenda(){
        return "Você realizou uma venda!";
    }
}

class Faxineiro implements Ifuncionario{
    public String baterPonto(){
        return "Você bateu o ponto!";
    }
}


class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        System.out.println(g1.baterPonto());
        System.out.println(g1.fecharCaixa());
        System.out.println(g1.realizarVenda());
    }
}