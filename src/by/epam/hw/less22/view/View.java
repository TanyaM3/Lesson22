package by.epam.hw.less22.view;

import by.epam.hw.less22.controller.Controller;

public class View {
	Controller controller = new Controller();

	public void doRequest(String request) {
		System.out.println(controller.executeTask(request));
	}
}