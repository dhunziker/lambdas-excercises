package lambdasexcercises.chapter2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Question_2 {

	private static final ThreadLocal<DateFormat> TL = ThreadLocal
			.withInitial(() -> new SimpleDateFormat("dd-MMM-yyyy"));

	public Result formatDate(LocalDate date) {
		Instant instant = date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		DateFormat format = TL.get();
		String formattedDate = format.format(Date.from(instant));
		Result result = new Result(Thread.currentThread().getName(), System.identityHashCode(format), formattedDate);
		System.out.println(result);
		return result;
	}

	public static class Result {

		private String threadName;

		private int formatIdentity;

		private String formattedDate;

		public Result(String threadName, int formatIdentity, String formattedDate) {
			this.threadName = threadName;
			this.formatIdentity = formatIdentity;
			this.formattedDate = formattedDate;
		}

		public String getThreadName() {
			return threadName;
		}

		public int getFormatIdentity() {
			return formatIdentity;
		}

		public String getFormattedDate() {
			return formattedDate;
		}

		@Override
		public String toString() {
			return String.format("Result [threadName=%s, formatIdentity=%s, formattedDate=%s]", threadName,
					formatIdentity, formattedDate);
		}

	}

}
