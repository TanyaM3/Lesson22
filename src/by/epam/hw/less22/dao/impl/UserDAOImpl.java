package by.epam.hw.less22.dao.impl;

import java.io.FileWriter;
import java.io.IOException;

import by.epam.hw.less22.bean.User;
import by.epam.hw.less22.dao.UserDAO;
import by.epam.hw.less22.dao.exception.DAOException;

public class UserDAOImpl implements UserDAO {
	private final String paramDelimeter = " ";
	private String path = "users.txt";

	@Override
	public void register(User user) throws DAOException {

		try {
			FileWriter writer = new FileWriter(path);
			writer.write(user.getUsername() + paramDelimeter);
			writer.write(user.getPassword() + paramDelimeter);
			writer.write(user.getEmail());
			writer.close();

		} catch (IOException e) {
			throw new DAOException(e);
		}
	}

	@Override
	public void signIn(String username, String password) throws DAOException {

	}
}