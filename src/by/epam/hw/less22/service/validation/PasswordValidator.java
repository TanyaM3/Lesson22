package by.epam.hw.less22.service.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements Validator {
	private Matcher matcher;

	private final String passwordPattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9@#$%]).{8,20}";
	private final Pattern pattern = Pattern.compile(passwordPattern);

	@Override
	public boolean isValid(String password) {
		matcher = pattern.matcher(password);

		return matcher.matches();
	}
}