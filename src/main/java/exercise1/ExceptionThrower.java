package exercise1;


public class ExceptionThrower extends Exception{
	void throwACustomExceptionWhenValueIs42(int value) throws Exception {

		if (value == 42) {
			throw new ExceptionThrower();
		}
	}
}
