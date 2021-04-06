package com.example;

import org.jasypt.util.text.AES256TextEncryptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		AES256TextEncryptor textEncryptor = new AES256TextEncryptor();
		textEncryptor.setPassword("pass");
		String myEncryptedText = textEncryptor.encrypt("text");
		String plainText = textEncryptor.decrypt(myEncryptedText);
		System.out.println(plainText);
	}

}
