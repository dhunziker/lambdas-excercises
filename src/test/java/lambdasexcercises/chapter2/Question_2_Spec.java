package lambdasexcercises.chapter2;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lambdasexcercises.chapter2.Question_2.Result;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

@RunWith(JunitSuiteRunner.class)
public class Question_2_Spec {

	private static Result formatDate(LocalDate date) throws InterruptedException,
			ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Result> f1 = executor.submit(() -> Question_2.formatDate(date));
		executor.shutdown();
		return f1.get();
	}

	{
		describe("a date formatter", it -> {

			it.should("today's date is 08-Feb-2015", expect -> {
				LocalDate date = LocalDate.of(2015, Month.FEBRUARY, 8);
				expect.that(formatDate(date).getFormattedDate()).is("08-Feb-2015");
			});

			it.should("epoch day 0 is 01-Jan-1970", expect -> {
				LocalDate date = LocalDate.ofEpochDay(0);
				expect.that(formatDate(date).getFormattedDate()).is("01-Jan-1970");
			});

			it.should("use separate format instances for each thread", expect -> {
				LocalDate date = LocalDate.ofEpochDay(0);
				Result r1 = formatDate(date);
				Result r2 = formatDate(date);
				expect.that(r1.getFormatIdentity()).is(not(equalTo(r2.getFormatIdentity())));
				expect.that(r1.getFormattedDate()).isEqualTo(r2.getFormattedDate());
			});
		});

}}
