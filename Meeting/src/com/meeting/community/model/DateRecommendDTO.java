/**
 * 
 * tblDateRecommend DTO
 * @author 송미령
 * 
 */
package com.meeting.community.model;

public class DateRecommendDTO {

	private String seq;
	private String area;
	private String title;
	private String content;
	private String dcseq;
	private String mseq;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDcseq() {
		return dcseq;
	}

	public void setDcseq(String dcseq) {
		this.dcseq = dcseq;
	}

	public String getMseq() {
		return mseq;
	}

	public void setMseq(String mseq) {
		this.mseq = mseq;
	}

	@Override
	public String toString() {
		return "DateRecommendDTO [seq=" + seq + ", area=" + area + ", title=" + title + ", content=" + content
				+ ", dcseq=" + dcseq + ", mseq=" + mseq + "]";
	}
}
