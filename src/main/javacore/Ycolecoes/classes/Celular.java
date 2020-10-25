package main.javacore.Ycolecoes.classes;


import java.util.Comparator;



public class Celular {
    private String nome;
    private String IMEI;

    public Celular(String nome, String iMEI) {
        this.nome = nome;
        this.IMEI = iMEI;
    }

    // Reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null;
    // Simetrico = para x e y diferentes de null, se x.equals(y) == true logo
    // y.equals(x) tem que ser true;
    // Transitividade = para x, y, z diferente de null, se x.equals(y) == true, logo
    // y.equals(x) == true e x.equals(z) == true logo y.equals(z) também tem que ser
    // true;
    // Consistente = x.equals(y) deve sempre retornar o mesmo valor;
    // para x diferente de null x.equals(null) tem que retornar false;

    // Para hascode
    // Se x.equals(y) == true y.hashcode() == x.hashCode();
    // y.hashCode() == x.hashCode() não necessariamente o equals deverá retornar
    // true,
    // x.equals(y) == false
    //y.hashCode() != x.hashCode() x.equals(y) deverá ser false;

    // @Override
    // public boolean equals(Object obj) {
    // if (obj == null) return false;
    // if(this == obj) return true;
    // if(this.getClass() != obj.getClass()) return false;
    // Celular outroCelular = (Celular) obj;
    // return IMEI != null && IMEI.equals(outroCelular.getIMEI());
    // }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        IMEI = IMEI;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((IMEI == null) ? 0 : IMEI.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Celular other = (Celular) obj;
        if (IMEI == null) {
            if (other.IMEI != null)
                return false;
        } else if (!IMEI.equals(other.IMEI))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }
}