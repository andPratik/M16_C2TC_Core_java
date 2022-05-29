package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(123,"Ankita",550,true);
		NormalAcc n=new GSNormalAcc(124,"Pratenchya",500,10);
		System.out.println("Prime account ");
		p.bookProduct(p.getCharge());
		System.out.println("Normal account");
		n.bookProduct(n.getCharges());
		//System.out.println(s.getNewPrimeAcc(1, "Sathwik", 1236, true));
		//System.out.println(s.getNewNormalAcc(800, "Darshan", 1000, 50));
		
		System.out.println(p);
		System.out.println(n);
		}

	}