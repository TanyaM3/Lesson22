package by.epam.hw.less22.main;

import by.epam.hw.less22.service.exception.ServiceException;
import by.epam.hw.less22.view.View;

public class Main {

	public static void main(String[] args) throws ServiceException {

		View view = new View();

		view.doRequest("registration, ivan34, Vanbrt61, ivanivanov33@mail.ru");
	}
}