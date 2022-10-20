package by.epam.hw.less22.service.impl;

import by.epam.hw.less22.bean.User;
import by.epam.hw.less22.dao.DAOFactory;
import by.epam.hw.less22.dao.UserDAO;
import by.epam.hw.less22.dao.exception.DAOException;
import by.epam.hw.less22.service.UserService;
import by.epam.hw.less22.service.exception.ServiceException;
import by.epam.hw.less22.service.validation.CheckValidation;
import by.epam.hw.less22.service.validation.EmailValidator;
import by.epam.hw.less22.service.validation.PasswordValidator;
import by.epam.hw.less22.service.validation.UsernameValidator;

public class UserServiceImpl implements UserService {
	private final CheckValidation validator = new CheckValidation();

	@Override
	public void register(User user) throws ServiceException {

		EmailValidator em = new EmailValidator();
		UsernameValidator u = new UsernameValidator();
		PasswordValidator p = new PasswordValidator();
		em.isValid(user.getEmail());
		u.isValid(user.getUsername());
		p.isValid(user.getPassword());

		if (!validator.validatorCheck(user)) {
			return;
		}

		try {
			DAOFactory factory = DAOFactory.getInstance();
			UserDAO userDAO = factory.getUserDAO();
			userDAO.register(user);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public void signIn(String username, String password) throws ServiceException {

	}
}