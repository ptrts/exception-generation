package com.suchorukov.tarouts.ex_gen;

public interface ExceptionGenerator {
	void generateNullPointerException();
	void generateClassCastException();
	void generateNumberFormatException();
	void generateStackOverflowError();
	void generateOutOfMemoryError();
	void generateMyException(String message) throws MyException;
}
