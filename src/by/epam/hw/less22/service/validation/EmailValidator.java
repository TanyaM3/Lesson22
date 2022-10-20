package by.epam.hw.less22.service.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
	private Matcher matcher;

	private final String emailPattern = "([.[^@\\s]]+)@([.[^@\\s]]+)\\.([a-z]+)";
	private final Pattern pattern = Pattern.compile(emailPattern);

	@Override
	public boolean isValid(String email) {
		matcher = pattern.matcher(email);

		return matcher.matches();
	}
}
