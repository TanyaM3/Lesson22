package by.epam.hw.less22.dao;

import by.epam.hw.less22.dao.impl.UserDAOImpl;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	private final UserDAO userImpl = new UserDAOImpl();

	private DAOFactory() {

	}

	public static DAOFactory getInstance() {
		return instance;
	}

	public UserDAO getUserDAO() {
		return userImpl;
	}
}