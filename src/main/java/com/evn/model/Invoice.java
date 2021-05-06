package com.evn.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String idInvice;
	private int oldIndex;//chỉ số cũ
	private int newIndex;//chỉ số mới
	private float money;//thành tiền
	private float VAT;//vat
	private float total;//tổng tiền
	private int month;//thang
	private int year;// năm
	private int quarter;//quý
	private String status;//trang thái thanh toán
	
	@ManyToOne(fetch = FetchType.LAZY) // join quan hệ nhiều 1 trong csdl
	@JoinColumn(name = "id_Customer")
	private Customer customer;
}
