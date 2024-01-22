package EX_4;

public class Gerente extends Funcionario {
	String setor;
	public Gerente(String nome, int salario, String setor){
		super(nome,salario);
		this.setor=setor;
	}

}
