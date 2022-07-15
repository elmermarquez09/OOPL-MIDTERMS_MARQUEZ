package ConvertionFormula;
import ConvertionProcess.Converter;
public class Formula {
	Double TotalConvertedAmount = 0d;
	public Boolean currencyConverter(Converter currencyConverter) {
		String currency = currencyConverter.getCurrency();
		Double amount = currencyConverter.getAmount(); Double rate=0d; Boolean sign = true;

		if(currency.equalsIgnoreCase("P-D")) { rate=0.018; // 1 Peso = 0.018 USD Dollar
		}else if(currency.equalsIgnoreCase("D-P")) { rate=56.38; // 1 Dollar = 56.38 Peso 
		}else if(currency.equalsIgnoreCase("P-E")) { rate=0.018; // 1 Peso = 0.018 Euro
		}else if(currency.equalsIgnoreCase("E-P")) { rate = 56.57; // 1 Euro= 56.57 Peso
		}else { sign= false; System.out.println("Sorry, this type of currency is not yet supported!");}
		TotalConvertedAmount= amount*rate;
		return sign;
	}
	public Double getTotalConvertedAmount() {
		return TotalConvertedAmount;
	}
}