package by.epam.hw.less22.service;

import by.epam.hw.less22.bean.User;
import by.epam.hw.less22.service.exception.ServiceException;

public interface UserService {
	void register(User user) throws ServiceException;

	void signIn(String username, String password) throws ServiceException;
}