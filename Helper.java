package TrabalhoPO;

import java.text.DecimalFormat;

public class Helper {
	
	public static String SearchResult(long cpf, Item[] items) {
		
		if(items[0] == null ) {
			return "CPF "+cpf+"\n"
					+ "N�O H� NENHUM REGISTRO COM O CPF "+cpf+"\n\n";
		}
				
		String res = "CPF "+cpf+"\n";
		String aux = "";
		double total = 0;
			
		for (Item item : items) {	
			aux = item.getPaid() == true ? "PAGO" : "N�O PAGO";
			if(item.getPaid() == false) {
				total += item.getValue();
			}
			res += "Inscr: "+item.getSubscription()+"	Imposto: "+item.getValue()+"	"+aux+"\n";
		}

		DecimalFormat df = new DecimalFormat("####,00");

		return res+"Total Imposto a pagar: "+df.format(total)+"\n\n";
	}

}
