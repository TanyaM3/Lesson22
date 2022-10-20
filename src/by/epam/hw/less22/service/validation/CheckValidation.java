package by.epam.hw.less22.service.validation;

import by.epam.hw.less22.bean.User;

public class CheckValidation {
	Validator emailV = new EmailValidator();
	Validator passwordV = new PasswordValidator();
	Validator usernameV = new UsernameValidator();

	public boolean validatorCheck(User user) {
		return emailV.isValid(user.getEmail()) && passwordV.isValid(user.getPassword())
				&& usernameV.isValid(user.getUsername());
	}
}