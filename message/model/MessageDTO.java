package com.message.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {
	
	int num;
	String sendName;
	String receiveEmail;
	String content;
	String date;
	
	public MessageDTO(String sendName, String receiveEmail, String content) {
		this.sendName = sendName;
		this.receiveEmail = receiveEmail;
		this.content = content;
	}
	
	public String descMSG() {
		String result = content + "보낸 사람 : "+sendName+"보낸 날짜 : "+date;
		return result;
	}
	
}
