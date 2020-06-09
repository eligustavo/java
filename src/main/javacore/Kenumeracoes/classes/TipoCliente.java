package main.javacore.Kenumeracoes.classes;

public enum TipoCliente {
    // Constant specific class body
    // Corpo de classe específico constante
    PESSOA_FISICA(1, "Pessoa Física"), 
    PESSOA_JURIDICA(2, "Pessoa Jurídica") {
        public String getId() {
            return "B";
        }
    };

    private int tipo;
    private String nome;

    private TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId() {
        return "A";
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

}