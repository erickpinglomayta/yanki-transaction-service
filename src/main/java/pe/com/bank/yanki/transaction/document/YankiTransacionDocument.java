package pe.com.bank.yanki.transaction.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "yanki_transaction")
public class YankiTransacionDocument {
	
	@Id
	private String yankiTrasanctonId;
	private Double amount;
	private Date dateTransaction;
	private String sourceWalletId;
	private String destinationWalletId;

}
