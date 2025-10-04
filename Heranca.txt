class Animal {
    public String nome;
    public String raca;  
    public float peso;

    public void emitirSom() {
        System.out.println("O animal faz um som genérico.");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miaaauuuu!");
    }
}

class Camelo extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O camelo blatera: Urffff urfff!");
    }
}

class Tubarao extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O tubarão faz estalidos: stac!");
    }
}

class Cavalo extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cavalo relincha: Uirriiiiii!");
    }
}

public class Heranca {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.emitirSom();

        Cachorro c = new Cachorro();
        c.nome = "Lili";
        c.raca = "Shitzu";
        c.peso = 10.00f; // corrigido para float

        c.emitirSom();
        System.out.println("Nome do cachorro: " + c.nome + " - " + c.raca + " - " + c.peso + "kg");

        Gato g = new Gato();
        g.nome = "Mavie";
        g.raca = "Angorá";
        g.peso = 4.00f;

        g.emitirSom();
        System.out.println("Nome do gato: " + g.nome + " - " + g.raca + " - " + g.peso + "kg");

        Camelo ca = new Camelo();
        ca.nome = "Khalid";
        ca.raca = "Targui";
        ca.peso = 480.00f;

        ca.emitirSom();
        System.out.println("Nome do camelo: " + ca.nome + " - " + ca.raca + " - " + ca.peso + "kg");
        
        Cavalo cv = new Cavalo();
        cv.nome = "Spirit";
        cv.raca = "Kiger Mustang";
        cv.peso = 350.00f;

        cv.emitirSom();
        System.out.println("Nome do cavalo: " + cv.nome + " - " + cv.raca + " - " + cv.peso + "kg");

        Tubarao t = new Tubarao(); // corrigido para "Tubarao" (maiúsculo)
        t.nome = "Tigger";
        t.raca = "Tubarão Tigre";
        t.peso = 800.00f;

        t.emitirSom();
        System.out.println("Nome do tubarão: " + t.nome + " - " + t.raca + " - " + t.peso + "kg");
    }
}
