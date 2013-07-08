package com.suchorukov.tarouts.ex_gen;

public class ExceptionGeneratorImpl implements ExceptionGenerator {

	@Override
	public void generateNullPointerException() {
		((Object) null).toString();
	}

	@Override
	public void generateClassCastException() {
		Integer s = ((Integer) new Object());
	}

	@Override
	public void generateNumberFormatException() {
		Integer i = new Integer("a");
	}

	@Override
	public void generateStackOverflowError() {
		double
				a000, a001, a002, a003, a004, a005, a006, a007, a008, a009,
				a010, a011, a012, a013, a014, a015, a016, a017, a018, a019,
				a020, a021, a022, a023, a024, a025, a026, a027, a028, a029,
				a030, a041, a042, a043, a044, a045, a046, a047, a048, a049,
				a050, a051, a052, a053, a054, a055, a056, a057, a058, a059,
				a060, a061, a062, a063, a064, a065, a066, a067, a068, a069,
				a070, a071, a072, a073, a074, a075, a076, a077, a078, a079,
				a080, a081, a082, a083, a084, a085, a086, a087, a088, a089,
				a090, a091, a092, a093, a094, a095, a096, a097, a098, a099;
		generateStackOverflowError();
	}

	@Override
	public void generateOutOfMemoryError() {
		int[] ints = new int[Integer.MAX_VALUE];
	}

	@Override
	public void generateMyException(String message) throws MyException {
		throw new MyException(message);
	}
}
