package com.suchorukov.tarouts.ex_gen;

public class Main {
	public static void main(String[] args) {

		ExceptionGenerator eg = new ExceptionGeneratorImpl();

		System.out.println("=== NullPointerException");
		try {
			eg.generateNullPointerException();
		} catch (NullPointerException e) {
			e.printStackTrace(System.out);
		}
		System.out.println("=== ClassCastException");
		try {
			eg.generateClassCastException();
		} catch (ClassCastException e) {
			e.printStackTrace(System.out);
		}
		System.out.println("=== NumberFormatException");
		try {
			eg.generateNumberFormatException();
		} catch (NumberFormatException e) {
			e.printStackTrace(System.out);
		}
		System.out.println("=== StackOverflowError");
		try {
			eg.generateStackOverflowError();
		} catch (StackOverflowError e) {
			e.printStackTrace(System.out);
		}
		System.out.println("=== OutOfMemoryError");
		try {
			eg.generateOutOfMemoryError();
		} catch (OutOfMemoryError e) {
			e.printStackTrace(System.out);
		}
		System.out.println("=== MyException");
		try {
			eg.generateMyException("Oops!");
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		System.out.println("=== END");
	}
}
