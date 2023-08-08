package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
		if (0 != multiplyByAndToInclusive) {
			int counter = 0;
			while (counter <= Math.abs(multiplyByAndToInclusive)) {
				System.out.println(counter * multiplyByAndToInclusive);
				++counter;
			}
		}
    }
}
