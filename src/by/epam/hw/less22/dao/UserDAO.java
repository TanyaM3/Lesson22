package by.epam.hw.less22.dao;

import by.epam.hw.less22.bean.User;
import by.epam.hw.less22.dao.exception.DAOException;

public interface UserDAO {
	void register(User user) throws DAOException;

	void signIn(String username, String password) throws DAOException;
}