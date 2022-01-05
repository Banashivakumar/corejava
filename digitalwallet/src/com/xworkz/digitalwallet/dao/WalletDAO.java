package com.xworkz.digitalwallet.dao;

import com.xworkz.digitalwallet.dto.WalletDTO;

public interface WalletDAO {
	
	 String createWallet(WalletDTO digi);
	   float getcurrentBalance(String name);
	   float addMoney(float credit,String name);
	   float pay(float debit,String name);
	   byte getRemainingTransaction(String name);
	   byte getTotalTodaysTransaction();
	   void printAll();
	   double totalAmountTransaction();

}
