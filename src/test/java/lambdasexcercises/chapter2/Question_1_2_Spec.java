package lambdasexcercises.chapter2;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static lambdasexcercises.chapter2.Question_1_2.ABS;
import static lambdasexcercises.chapter2.Question_1_2.ADD;
import static lambdasexcercises.chapter2.Question_1_2.DIV;
import static lambdasexcercises.chapter2.Question_1_2.INV;
import static lambdasexcercises.chapter2.Question_1_2.MUL;
import static lambdasexcercises.chapter2.Question_1_2.SUB;
import lambdasexcercises.chapter2.Question_1_2;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_1_2_Spec {{

		final int maxValue = Integer.MAX_VALUE;

		describe("a calculator", it -> {

			it.should("abs(inv(1)) = 1", expect -> {
				expect.that(Question_1_2.exec(ABS, Question_1_2.exec(INV, 1))).is(1);
			});

			it.should("1 + 2 = 3", expect -> {
				expect.that(Question_1_2.exec(ADD, 1, 2)).is(3L);
			});

			it.should("1 - 2 = -1", expect -> {
				expect.that(Question_1_2.exec(SUB, 1, 2)).is(-1);
			});

			it.should("1 * 2 = 2", expect -> {
				expect.that(Question_1_2.exec(MUL, 1, 2)).is(2L);
			});

			it.should("1 / 2 = 0.5", expect -> {
				expect.that(Question_1_2.exec(DIV, 1, 2)).is(0.5);
			});

			it.should("MAX_VALUE + MAX_VALUE = 2 * MAX_VALUE", expect -> {
				expect.that(Question_1_2.exec(ADD, maxValue, maxValue)).is(2 * (long) maxValue);
			});
		});

}}
