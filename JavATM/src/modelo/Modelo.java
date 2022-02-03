package modelo;

import java.util.ArrayList;

public class Modelo {
	
	private static ArrayList<String> titles = new ArrayList();
	private static ArrayList<String> texts = new ArrayList();
	private static ArrayList<String> textsButtons = new ArrayList();
	
	public Modelo() {
		titles.add("JavATM - Inicio de Sesión"); //0
		titles.add("JavATM - "); //1
		titles.add("JavATM"); //2
		
		texts.add("Usuario"); //0
		texts.add("PIN"); //1
		texts.add("JavATM"); //2
		
		textsButtons.add("Iniciar Sesión"); //0
	}

	public static ArrayList<String> getTexts() {
		return texts;
	}

	public static ArrayList<String> getTitles() {
		return titles;
	}

	public static void setTitles(ArrayList<String> titles) {
		Modelo.titles = titles;
	}

	public static ArrayList<String> getTextsButtons() {
		return textsButtons;
	}

	public static void setTextsButtons(ArrayList<String> textsButtons) {
		Modelo.textsButtons = textsButtons;
	}

	public static void setTexts(ArrayList<String> textos) {
		Modelo.texts = textos;
	}
}
