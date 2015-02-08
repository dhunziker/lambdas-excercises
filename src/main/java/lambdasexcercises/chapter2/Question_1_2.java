package lambdasexcercises.chapter2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Question_1_2 {

	public static final Function<Integer, Integer> INV = x -> -x;

	public static final Function<Integer, Integer> ABS = x -> (x < 0) ? INV.apply(x) : x;

	public static final BiFunction<Integer, Integer, Long> ADD = (x, y) -> x + y.longValue();

	public static final BiFunction<Integer, Integer, Integer> SUB = (x, y) -> x - y;

	public static final BiFunction<Integer, Integer, Long> MUL = (x, y) -> x * y.longValue();

	public static final BiFunction<Integer, Integer, Double> DIV = (x, y) -> x / y.doubleValue();

	public <T, R> R exec(Function<T, R> operation, T operand) {
		return operation.apply(operand);
	}

	public <T, U, R> R exec(BiFunction<T, U, R> operation, T operand1, U operand2) {
		return operation.apply(operand1, operand2);
	}

}
