package com.xworkz.digitalwallet.dao;

import com.xworkz.digitalwallet.dto.WalletDTO;

public class WalletDAOIMP implements WalletDAO {
	
	WalletDTO[] dtos = new WalletDTO[5];
	int index=0;
	static byte count=0;
	double total_transaction=0;
	
	@Override
	public String createWallet(WalletDTO digi) {
		dtos[index]=digi;
		index++;
		return "Wallet created";
	}

	@Override
	public void printAll() {
		for (int index = 0; index < dtos.length; index++) {
			if(dtos[index]!=null) {
			System.out.println(dtos[index].toString());
			}
		}
		
	}
	@Override
	public float getcurrentBalance(String name) {
		for (int index = 0; index < dtos.length; index++) {
			if(dtos[index]!=null) {
			if(name.equals(dtos[index].getName())) {
				return dtos[index].getAvailableBalance();
			  }
			}
		}
		return 0;
	}

	@Override
	public float addMoney(float credit ,String name) {
		float totalBalance;
		for (int index = 0; index < dtos.length; index++) {
			if(dtos[index]!=null) {
				if(name.equals(dtos[index].getName())) {
					totalBalance=dtos[index].getAvailableBalance()+credit;
					dtos[index].setAvailableBalance(totalBalance);
					count++;
					total_transaction=credit;
					return  totalBalance;
					
				}
			}
			
		}
		return 0;
	}
	@Override
	public float pay(float debit, String name) {
		float totalAvailable;
		for (int index = 0; index < dtos.length; index++) {
			if(dtos[index]!=null) {
			if(name.equals(dtos[index].getName())) {
				totalAvailable=dtos[index].getAvailableBalance()-debit;
				dtos[index].setAvailableBalance(totalAvailable);
				count++;
				total_transaction=debit;
				return  totalAvailable;
			}
		}
			
		}
		return 0;
	}

	@Override
	public byte getRemainingTransaction(String name) {
		byte remainTrans;
		for (int index = 0; index < dtos.length; index++) {
			if(dtos[index]!=null) {
				if(name.equals(dtos[index].getName())) {
					remainTrans=(byte) (dtos[index].getNoOfTransaction()-count);
					return remainTrans;
				}
			}
			
		}
		return 0;
	}

	@Override
	public byte getTotalTodaysTransaction() {
		return count;
	}
	@Override
	public double totalAmountTransaction() {
		
		return  total_transaction;
	}


}
