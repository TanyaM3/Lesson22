package by.epam.hw.less22.controller.command;

import by.epam.hw.less22.bean.User;
import by.epam.hw.less22.service.ServiceFactory;
import by.epam.hw.less22.service.UserService;
import by.epam.hw.less22.service.exception.ServiceException;

public class Register implements Command {
	private final String paramDelimeter = ", ";

	@Override
	public String execute(String request) {
		String username = null;
		String password = null;
		String email = null;

		String stringData[] = request.split(paramDelimeter);

		username = stringData[1];
		password = stringData[2];
		email = stringData[3];

		String response = null;

		User user = new User(username, password, email);

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();

		try {
			userService.register(user);
			response = "Welcome";
		} catch (ServiceException e) {
			response = "Error";
		}
		return response;
	}
}