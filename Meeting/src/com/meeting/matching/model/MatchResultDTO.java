package com.meeting.matching.model;

/**
 * tblMatchResult DTO
 * 
 * @author 한상민
 *
 */
public class MatchResultDTO {
	private String seq;
	private String cseq;
	private String pcseq;
	private String accept;
	
	
	@Override
	public String toString() {
		return "MatchResultDTO [seq=" + seq + ", cseq=" + cseq + ", pcseq=" + pcseq + ", accept=" + accept + "]";
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getCseq() {
		return cseq;
	}
	public void setCseq(String cseq) {
		this.cseq = cseq;
	}
	public String getPcseq() {
		return pcseq;
	}
	public void setPcseq(String pcseq) {
		this.pcseq = pcseq;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	
	
}
