package com.meeting.mypage.model;

/**
 * tblManagerSOS DTO
 */
public class ManagerSOSDTO {
	
	private String seq;
	private String content;
	private String status;
	private String statuscontent;
	private String regdate;
	private String statusregdate;
	private String cseq;
	private String mseq;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatuscontent() {
		return statuscontent;
	}
	public void setStatuscontent(String statuscontent) {
		this.statuscontent = statuscontent;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getStatusregdate() {
		return statusregdate;
	}
	public void setStatusregdate(String statusregdate) {
		this.statusregdate = statusregdate;
	}
	public String getCseq() {
		return cseq;
	}
	public void setCseq(String cseq) {
		this.cseq = cseq;
	}
	public String getMseq() {
		return mseq;
	}
	public void setMseq(String mseq) {
		this.mseq = mseq;
	}
	@Override
	public String toString() {
		return "ManagerSOSDTO [seq=" + seq + ", content=" + content + ", status=" + status + ", statuscontent="
				+ statuscontent + ", regdate=" + regdate + ", statusregdate=" + statusregdate + ", cseq=" + cseq
				+ ", mseq=" + mseq + "]";
	}
	
	

}
