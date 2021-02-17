package com.qa.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Maps {
	
	 private HashMap<String, String> morseTranslate;
	
	public Maps() {
		
		this.morseTranslate = new HashMap<>();
		
		this.morseTranslate.put(".-", "a");
		this.morseTranslate.put("-...", "b");
		this.morseTranslate.put("-.-.", "c");
		this.morseTranslate.put("-..", "d");
		this.morseTranslate.put(".", "e");
		this.morseTranslate.put("..-.", "f");
		this.morseTranslate.put("--.", "g");
		this.morseTranslate.put("....", "h");
		this.morseTranslate.put("..", "i");
		this.morseTranslate.put(".---", "j");
		this.morseTranslate.put("-.-", "k");
		this.morseTranslate.put(".-..", "l");
		this.morseTranslate.put("--", "m");
		this.morseTranslate.put("-.", "n");
		this.morseTranslate.put("---", "o");
		this.morseTranslate.put(".--.", "p");
		this.morseTranslate.put("--.-", "q");
		this.morseTranslate.put(".-.", "r");
		this.morseTranslate.put("...", "s");
		this.morseTranslate.put("-", "t");
		this.morseTranslate.put("..-", "u");
		this.morseTranslate.put("...-", "v");
		this.morseTranslate.put(".--", "w");
		this.morseTranslate.put("-..-", "x");
		this.morseTranslate.put("-.--", "y");
		this.morseTranslate.put("--..", "z");
		this.morseTranslate.put("/", " ");

	}
	
	public String translate(String input) {
		
		 return Arrays.stream(input.split(" "))
				.map(i -> this.morseTranslate.get(i))
				.collect(Collectors.joining(""));
				
				
	}
	
	public static void main(String[] args) {
	
			//animals();
			Maps translator = new Maps();
			System.out.println(translator.translate(".- -.. . / .- / -- --- .-. ... . / -.-. --- -.. . / - .-. .- -. ... .-.. .- - --- .-."));
	
	}
	
	public static void animals() {
		
		HashMap<Integer, String> animals = new HashMap<Integer, String>();
		
		animals.put(1, "Human");
		animals.put(2, "Cucmber_weirdo");
		animals.put(3, "Panda");
		animals.put(4, "Polar Bear");
		
			System.out.println(animals.get(3) + "\n");
			
			//keyset
			for(Integer i : animals.keySet()) {
				System.out.println(i + "\n");				
			}
			
			//values
			for(String i : animals.values()) {
				System.out.println(i + "\n");				
			}
			
			//entry set
			for(Entry<Integer, String> i : animals.entrySet()) {
				System.out.println(i + "\n");				
			}
	}
}
