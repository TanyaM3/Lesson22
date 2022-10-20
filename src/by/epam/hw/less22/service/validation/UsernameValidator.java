package by.epam.hw.less22.service.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator implements Validator {
	private Matcher matcher;

	private final String usernamePattern = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
	private final Pattern pattern = Pattern.compile(usernamePattern);

	@Override
	public boolean isValid(String username) {
		matcher = pattern.matcher(username);

		return matcher.matches();
	}

}