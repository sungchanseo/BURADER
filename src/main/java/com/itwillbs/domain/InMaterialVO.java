package com.itwillbs.domain;
import java.sql.Date;
import java.sql.Timestamp;



public class InMaterialVO {
	
	// in_material
	private String in_id;
	private String order_id;
	private String in_process;
	private int in_emp;
	
	// material
	private String shelt_position;
	private String ma_name;
	private int ma_qty;
	private String whs_id;
	
	// orders
	private int order_qty;
	private Date order_date;
	private Date due_date;
	private int order_emp;
	private Date in_date;
	
	
	// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ getter & setter ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	
	public String getIn_id() {
		return in_id;
	}
	public void setIn_id(String in_id) {
		this.in_id = in_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getIn_process() {
		return in_process;
	}
	public void setIn_process(String in_process) {
		this.in_process = in_process;
	}
	public int getIn_emp() {
		return in_emp;
	}
	public void setIn_emp(int in_emp) {
		this.in_emp = in_emp;
	}
	public String getShelt_position() {
		return shelt_position;
	}
	public void setShelt_position(String shelt_position) {
		this.shelt_position = shelt_position;
	}
	public String getMa_name() {
		return ma_name;
	}
	public void setMa_name(String ma_name) {
		this.ma_name = ma_name;
	}
	public int getMa_qty() {
		return ma_qty;
	}
	public void setMa_qty(int ma_qty) {
		this.ma_qty = ma_qty;
	}
	public String getWhs_id() {
		return whs_id;
	}
	public void setWhs_id(String whs_id) {
		this.whs_id = whs_id;
	}
	public int getOrder_qty() {
		return order_qty;
	}
	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public int getOrder_emp() {
		return order_emp;
	}
	public void setOrder_emp(int order_emp) {
		this.order_emp = order_emp;
	}
	public Date getIn_date() {
		return in_date;
	}
	public void setIn_date(Date in_date) {
		this.in_date = in_date;
	}
	
	
	@Override
	public String toString() {
		return "InMaterialVO [in_id=" + in_id + ", order_id=" + order_id + ", in_process=" + in_process + ", in_emp="
				+ in_emp + ", shelt_position=" + shelt_position + ", ma_name=" + ma_name + ", ma_qty=" + ma_qty
				+ ", whs_id=" + whs_id + ", order_qty=" + order_qty + ", order_date=" + order_date + ", due_date="
				+ due_date + ", order_emp=" + order_emp + ", in_date=" + in_date + "]";
	}


}
