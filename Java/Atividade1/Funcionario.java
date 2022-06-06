package Atividade1;

public class Funcionario {

    public static void main(String[]args){

        Funcionario f1 = new Funcionario("José",30, "Estagiário", "Ativo");
        Funcionario f2 = new Funcionario("Angela",21, "Estagiário", "Ativo");
        Funcionario f3 = new Funcionario("Rodolfo",42, "Gerente", "Ativo");
        Funcionario f4 = new Funcionario("Mario",36, "Secretário", "Ativo");

        f1.demitirFuncionario();
        f2.trocarCargoFuncionario();
        f3.aniversario();
        f4.pagarSalario();
    }
    private String nome;
    private int idade;
    private String cargo;
    private String situacao;

    public Funcionario(String nome, int idade, String cargo, String situacao){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.situacao = cargo;
    }

    public void demitirFuncionario(){
        setSituacao("Inativo");
        System.out.println("O(A) funcionário(a) "+getNome()+" foi demitido(a). Sua situação agora é "+getSituacao()+".");
    }

    public void trocarCargoFuncionario(){
        setCargo("Promovido(a).");
        System.out.println("O(A) Funcionário(a) "+getNome()+" foi " + getCargo());
    }

    public void pagarSalario(){System.out.println("O salário do(a) funcionário(a) "+getNome()+" foi pago.");}

    public void aniversario(){
        setIdade(this.idade + 1);
        System.out.println("Hoje o "+getNome()+" faz aniversário, sua idade agora é "+ getIdade() + " anos.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}



