package com.gdj59.bookmall.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class BuyVO {
	private int pm_num;
	private String pm_date;
	private String pm_id;
	private int pm_b_price;
	private String pm_b_name;
}
