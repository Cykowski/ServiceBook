package service_book.control;

import java.util.LinkedList;

import service_book.Book;

public class Mess {

	private static LinkedList<String> errors = new LinkedList<String>();
	private static LinkedList<String> infos = new LinkedList<String>();

	public static LinkedList<String> getErrors() {
		return Mess.errors;
	}
	
	public static LinkedList<String> getInfos() {
		return Mess.infos;
	}
	
	public static void setErrorMessage(String error)
	{
		Mess.errors.add(error);
	}
	public static void setInfoMessage(String info)
	{
		Mess.infos.add(info);
	}
	
	public static void showMessInConsole(int type){
		switch (type) {
		case Book.ALL:
			showErrors();
		case Book.INFO:
			showInfos();
			break;
		default:
			showErrors();
			break;
		}
	}

	private static void showErrors(){
		for (String error:Mess.errors){
			System.out.println("E: " + error);
		}
	}
	private static void showInfos(){
		for (String info:Mess.infos){
			System.out.println("I: " + info);
		}
	}
	
}
