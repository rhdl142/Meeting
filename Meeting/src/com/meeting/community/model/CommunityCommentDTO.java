/**
 * 
 * tblCommunityComment DTO
 * @author 송미령
 * 
 */

package com.meeting.community.model;

public class CommunityCommentDTO {

	private String seq;
	private String content;
	private String regdate;
	private String cseq;
	private String cmseq;

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

	public String getCmseq() {
		return cmseq;
	}

	public void setCmseq(String cmseq) {
		this.cmseq = cmseq;
	}

	@Override
	public String toString() {
		return "CommunityCommentDTO [seq=" + seq + ", content=" + content + ", regdate=" + regdate + ", cseq=" + cseq
				+ ", cmseq=" + cmseq + "]";
	}

}
