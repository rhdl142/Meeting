package com.meeting.mypage.model;

/**
 * tblOutCustomer DTO
 * @author 김석현
 *
 */
public class OutCustomerDTO {
	private String seq;
	private String regdate;
	private String cseq;
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getCseq() {
		return cseq;
	}
	public void setCseq(String cseq) {
		this.cseq = cseq;
	}
	@Override
	public String toString() {
		return "OutCustomerDTO [seq=" + seq + ", regdate=" + regdate + ", cseq=" + cseq + "]";
	}
	
	
	
	
}
