public class PessoaFisica extends Pessoa {
    String cpf;

    public PessoaFisica(){}
    
    public PessoaFisica(String nome, int cpf;){
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf(String cpf){
        return this.cpf;
    }
    public String setcpf(String cpf){
        this.cpf= cpf;
    }
    @Override
  public void identificacao(){
    System.out.println("nome: " + super.nome + ", cpf: " + this.cpf );
  }
}
