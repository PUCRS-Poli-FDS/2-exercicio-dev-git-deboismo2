public class Irpf {
	
private String nome;
private String cpf;
private int idade;
private double totRendimentos;
private double contrPrev;
private int nroDep;
private double impostoDevido;


public Irpf(String nome,String cpf) {
	this.nome = nome;
	this.cpf = cpf;
	}

public double getTotRendimentos() {
	return totRendimentos;
	}

public void setTotRendimentos(double totRendimentos) {
	this.totRendimentos = totRendimentos;
	}

public double getContrPrev() {
	return contrPrev;
	}

public void setContrPrev(double contrPrev) {
	this.contrPrev = contrPrev;
	}

public int getNroDep() {
	return nroDep;
	}

public void setNroDep(int nroDep) {
	this.nroDep = nroDep;
	}

public int getIdade() {
	return idade;
	}

public void setIdade(int idade) {
	this.idade = idade;
	}

public String getNome() {
	return nome;
	}

public String getCpf() {
	return cpf;
	}

public double impostoDevido() {	
	double baseDeCalculo = totRendimentos - contrPrev;
	double desconto = 0;
		if (idade < 65) {
			if (nroDep <= 2) {
				desconto = (baseDeCalculo * 0.025);
			} else if (nroDep >= 3 && nroDep < 6) {
				desconto = (baseDeCalculo * 0.05);
			} else {
				desconto = (baseDeCalculo * 0.1);
			}
		} else if (nroDep <= 2) {
			desconto = (baseDeCalculo * 0.03);
		} else if (nroDep > 3 && nroDep < 6) {
			desconto = (baseDeCalculo * 0.045);
		} else {
			desconto = (baseDeCalculo * 0.06);
		}
		
	if (baseDeCalculo <= 10000) {
		impostoDevido = 0;
	} else if (baseDeCalculo > 10000 && baseDeCalculo < 20000) {
		impostoDevido = 0.15 * (baseDeCalculo - 10000);
	} else impostoDevido = (0.15 * (baseDeCalculo - 10000)) + 0.3 * (baseDeCalculo - 20000);
		return impostoDevido;
	}
}