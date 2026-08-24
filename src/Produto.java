import java.time.LocalDate;
//definição da classe
class Produto {
private static final double margemPadrao =0.2;
public String descricao;
public double precoCusto;
public double margemLucro;



//inicializador
private void init(String descricao,double precoCusto,double margemLucro){
	if(descricao.length()> 3 && precoCusto > 0 && margemLucro > 0){
		this.descricao = descricao;
		this.precoCusto = precoCusto;
		this.margemLucro = margemLucro;
		
	}
else{
		throw new IllegalArgumentException("Valores inválidos.");
}
}

//construtor com margem de lucro informada
public Produto (String descricao,Double precoCusto,Double margemLucro){
	init(descricao,precoCusto,margemLucro);


}

//construtor sem margem de lucro informada
public Produto (String descricao,Double precoCusto,LocalDate dataValidade,double valorVenda){
	init(descricao,precoCusto,margemPadrao);


}


}
class ProdutoPerecivel extends Produto{

	private static final double desconto = 0.25;
	LocalDate dataValidade;
	double valorVenda;
	
		//inicializador apenas com os parametros da classe Produto(pai)
		public ProdutoPerecivel(String descricao,Double precoCusto,Double margemLucro,LocalDate dataValidade,double valorVenda){
				super(descricao,precoCusto,margemLucro);

			//recebimentos da classe herdada

			//calcula o valor da venda com base no custo*margem de lucro
			this.valorVenda = precoCusto = (precoCusto*margemLucro);

			//verifica se a data de validade é antes do dia atual
			 if(dataValidade.isBefore(LocalDate.now())){
					this.dataValidade = dataValidade;

					//verifica se está a 7 dias do vencimento, se sim dá desconto
					if(LocalDate.now().compareTo(dataValidade)>7){
			 			valorVenda=valorVenda/desconto;

		}
			 }
			
			
	}
}

class ProdutoNaoPerecivel extends Produto{
		double valorVenda;

		public ProdutoNaoPerecivel(String descricao,Double precoCusto,Double margemLucro,LocalDate dataValidade,double valorVenda){
				super(descricao,precoCusto,margemLucro);

			//recebimentos da classe herdada

			//calcula o valor da venda com base no custo*margem de lucro
			this.valorVenda = precoCusto = (precoCusto*margemLucro);


}
}
