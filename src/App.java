import java.time.LocalDate;
//import java.time.LocalDateTime;

/** import javax.imageio.IIOException;
import java.text.NumberFormat;*/

public class App {
public static void main(String[] args) throws Exception {
System.out.println("Hello, World!");
}
}

//definição da classe
class Produto {
private static final double margemPadrao =0.2;
public String descricao;
public double precoCusto;
public double margemLucro;
LocalDate dataValidade;



//inicializador
private void init(String descricao,double precoCusto,double margemLucro, LocalDate dataValidade){
	if(descricao.length()> 3 && precoCusto > 0 && margemLucro > 0 && dataValidade.isBefore(LocalDate.now())){
		this.descricao = descricao;
		this.precoCusto = precoCusto;
		this.margemLucro = margemLucro;
		this.dataValidade = dataValidade;

		if(LocalDate.now().compareTo(dataValidade)>7){
				
		}
	}
else{
		throw new IllegalArgumentException("Valores inválidos.");
}
}

//construtor com margem de lucro informada
public Produto (String descricao,Double precoCusto,Double margemLucro,LocalDate dataValidade){
	init(descricao,precoCusto,margemLucro,dataValidade);
/*this.descricao = descricao;
this.precoCusto = precoCusto;
this.margemLucro = margemLucro;*/

}

//construtor sem margem de lucro informada
public Produto (String descricao,Double precoCusto,LocalDate dataValidade){
	init(descricao,precoCusto,margemPadrao,dataValidade);
/*this.descricao = descricao;
this.precoCusto = precoCusto;*/

}
}