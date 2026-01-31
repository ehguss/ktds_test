package com.ktdsuniversity.edu.homework.shop;

import com.ktdsuniversity.edu.homework.shop.item.Stuff;
import com.ktdsuniversity.edu.homework.shop.consumer.Consumer;
import com.ktdsuniversity.edu.homework.shop.consumer.VIP;
import com.ktdsuniversity.edu.homework.shop.consumer.VVIP;
import com.ktdsuniversity.edu.homework.shop.item.Mart;

public class Order {

	public static void main(String[] args) {
		
		Consumer kimDoHyeon = new Consumer("김도현", 10000, 900000);
		Consumer leeJaeYong = new VIP("이재용", 100_000, 500);
		Consumer stevenJobs= new VVIP("스티브잡스", 500_000, 100000);
		
		Stuff egg = new Stuff("계란", 1000, 10);
		Stuff mango = new Stuff("망고", 5000, 20);
		Stuff water = new Stuff("물", 500, 10);
		
		Mart nike = new GeneralMart("나이키", egg, mango, water);
		Mart adidas = new GeneralMart("아디다스", egg, mango, water);
		Mart puma = new GeneralMart("푸마", egg, mango, water);
		
		Mart cu = new ConvenienceStore("씨유", egg, mango, water);
		Mart gs = new ConvenienceStore("지에스", egg, mango, water);
		Mart sevenEleven = new ConvenienceStore("세븐일레븐", egg, mango, water);
		
		Mart shinSeGae = new DepartmentStore("신세계", egg, mango, water);
		Mart lotte = new DepartmentStore("롯데", egg, mango, water);
		Mart hyunDai= new DepartmentStore("현대", egg, mango, water);
		
//		nike.order(kimDoHyeon, nike, 1 , 2, 10000);
//		adidas.order(leeJaeYong, adidas,  1 , 9, 100000);
		
//		cu.order(stevenJobs, cu, 0, 10, 50000);
		
		shinSeGae.order(stevenJobs, shinSeGae, 2, 50, 10_000);
		shinSeGae.order(kimDoHyeon, shinSeGae, 2, 50, 10_000);
		shinSeGae.order(leeJaeYong, shinSeGae, 2, 50, 10_000);
		
		
		cu.order(stevenJobs, cu, 2, 50, 10_000);
		cu.order(kimDoHyeon, cu, 2, 50, 10_000);
		cu.order(leeJaeYong, cu, 2, 50, 10_000);
		
		
		adidas.order(stevenJobs, adidas, 2, 50, 10_000);
		adidas.order(kimDoHyeon, adidas, 2, 50, 10_000);
		adidas.order(leeJaeYong, adidas, 2, 50, 10_000);
		
		
	}

}
