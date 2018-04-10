package com.paic.arch.interviews.model;

/** 时钟模型
 * @author chen
 *
 */
public class ClockModel {
	
	private String top;
	
	private String fiveHour;
	
	private String oneHour;
	
	private String fiveMinute;
	
	private String oneMinute;
	
	public String getTop() {
		return top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public String getFiveHour() {
		return fiveHour;
	}

	public void setFiveHour(String fiveHour) {
		this.fiveHour = fiveHour;
	}

	public String getOneHour() {
		return oneHour;
	}

	public void setOneHour(String oneHour) {
		this.oneHour = oneHour;
	}

	public String getFiveMinute() {
		return fiveMinute;
	}
	
	public void setFiveMinute(String fiveMinute) {
		this.fiveMinute = fiveMinute;
	}
	
	public String getOneMinute() {
		return oneMinute;
	}
	
	public void setOneMinute(String oneMinute) {
		this.oneMinute = oneMinute;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(top).append("\r\n")
		.append(fiveHour).append("\r\n")
		.append(oneHour).append("\r\n")
		.append(fiveMinute).append("\r\n")
		.append(oneMinute);
		return sb.toString();
	}

}
