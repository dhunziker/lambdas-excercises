package lambdasexcercises.chapter5;

import java.util.HashMap;
import java.util.Map;

public class Question_3 {

	private Map<Long, Long> m = new HashMap<>();

	public long fibonacci(long n) {
		if (n == 0) {
			return m.computeIfAbsent(n, x -> 0L);
		} else if (n == 1) {
			return m.computeIfAbsent(n, x -> 1L);
		}
		return m.computeIfAbsent(n, x -> m.get(n - 2) + m.get(n - 1));
	}

}
