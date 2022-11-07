package com.nttdata.bootcamp.msyankitransactionvalidate.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**.*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YankiTransactionValidate {

	
	private String yankiAccountCellPhoneSendsPay;
	private String yankiAccountCellPhoneReceivesPay;
	private double yankiTransactionAmount;
	private boolean yankiTransactionPayWithAccountBank;
}
