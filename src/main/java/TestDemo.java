import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		int sum = a + b;
		if( a > 0 &&  b > 0) {
			return sum;
		}else {
			throw new IllegalArgumentException(
					"Both parameters must be positive!");
		}
	}
	public int randomNumberSquared() {
		int randomNumber = getRandomInt();
		int randomNumberSquared = randomNumber*randomNumber;
		return randomNumberSquared;
	}
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10)+1;
	}
}
