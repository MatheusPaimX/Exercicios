package model;

public class Funcionario {
    
    private String nome;
    private int matricula;
    private Double salario;
    
    public Funcionario(String nome, int matricula, Double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void finalizacao(){
        System.out.printf("Nomes: %s, \nNúmeros das Matriculas: %d, \nSalarios: %.2f" ,getNome(), getMatricula(), getSalario());

    }
   



}
