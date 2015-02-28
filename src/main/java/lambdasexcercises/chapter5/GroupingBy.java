package lambdasexcercises.chapter5;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class GroupingBy<T extends K, K> implements Collector<T, Map<K, List<T>>, Map<K, List<T>>> {

	@Override
	public Supplier<Map<K, List<T>>> supplier() {
		System.out.println("Supplying new HashMap");
		return () -> new HashMap<>();
	}

	@Override
	public BiConsumer<Map<K, List<T>>, T> accumulator() {
		return (x, y) -> {
			System.out.println("Accumulate: " + x + " [" + y + "]");
			x.compute((K) y, (k, v) -> {
				if (v == null) {
					v = new ArrayList<>();
				}
				v.add(y);
				return v;
			});
		};
	}

	@Override
	public BinaryOperator<Map<K, List<T>>> combiner() {
		return (x, y) -> {
			x.putAll(y);
			return x;
		};
	}

	@Override
	public Function<Map<K, List<T>>, Map<K, List<T>>> finisher() {
		return (x) -> x;
	}

	@Override
	public Set<java.util.stream.Collector.Characteristics> characteristics() {
		return EnumSet.allOf(java.util.stream.Collector.Characteristics.class);
	}

}
