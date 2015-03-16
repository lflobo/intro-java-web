package pt.lobo.java.intro.exercise.ex03;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;

public class MyRandom {

	private static SecureRandom random = new SecureRandom();

	public static String randomString() {
		return new BigInteger(130, random).toString(32);
	}

	public static Date randomDate(int yearStart, int yearEnd) {
		int start = yearStart - 1970;
		long startMs = 31556952000L * start;
		int end = yearEnd  - 1970;
		long endMs = 31556952000L * end;
		Random r = new Random();
		long ms = startMs + (long) (r.nextFloat() * (endMs - startMs));
		return new Date(ms);
	}
	
}
