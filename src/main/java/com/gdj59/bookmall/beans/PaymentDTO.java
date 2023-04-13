package com.gdj59.bookmall.beans;

import lombok.Data;

@Data
public class PaymentDTO {
    private String imp_uid; // 아임포트 거래 ID
    private String merchant_uid; // 가맹점 거래 ID
    private int paid_amount; // 결제 금액
    private String buyer_name; // 구매자 이름
    private String buyer_tel; // 구매자 전화번호
    private String buyer_addr; // 구매자 주소
    private String orderNo;

    public PaymentDTO() {
    }

    public PaymentDTO(String imp_uid, String merchant_uid, int paid_amount, String buyer_name, String buyer_tel, String buyer_addr) {
        this.imp_uid = imp_uid;
        this.merchant_uid = merchant_uid;
        this.paid_amount = paid_amount;
        this.buyer_name = buyer_name;
        this.buyer_tel = buyer_tel;
        this.buyer_addr = buyer_addr;
    }
}


