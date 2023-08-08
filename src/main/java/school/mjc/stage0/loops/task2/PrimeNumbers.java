package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
		if (printToInclusive >= 2) {
			int number = 2;
			while (number <= printToInclusive) {
				int counter = 2;
				boolean isPrime = true;
				while (counter <= number / 2) {
					if (0 == number % counter) {
						isPrime = false;
						break;
					}
					++counter;
				}
				if (isPrime) {
					System.out.println(number);
				}
				++number;
			}
		}
    }
}
