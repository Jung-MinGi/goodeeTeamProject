package com.gdj59.bookmall.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartVO {
	private int cart_id;
	private String user_id;
	private int b_num;
	private String b_name;
	private int b_price;
	private int ordercnt;
	private String b_category;
	public CartVO(String b_name, int ordercnt) {
		this.b_name = b_name;
		this.ordercnt = ordercnt;
	}
	
}
