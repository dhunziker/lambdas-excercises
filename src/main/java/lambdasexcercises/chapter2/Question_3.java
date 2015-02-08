package lambdasexcercises.chapter2;

import javax.swing.JButton;

@SuppressWarnings("unused")
public class Question_3 {

	public static void main(String[] args) {
		Runnable hellowWorld = () -> System.out.println("hello world");

		JButton button = new JButton();
		button.addActionListener(event -> System.out.println(event.getActionCommand()));
	}

}
