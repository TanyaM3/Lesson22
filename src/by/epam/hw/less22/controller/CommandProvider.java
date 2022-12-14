package by.epam.hw.less22.controller;

import java.util.HashMap;
import java.util.Map;

import by.epam.hw.less22.controller.command.Command;
import by.epam.hw.less22.controller.command.Register;
import by.epam.hw.less22.controller.command.SignIn;

public class CommandProvider {
	private final Map<CommandName, Command> repository = new HashMap<>();

	CommandProvider() {
		repository.put(CommandName.SIGN_IN, new SignIn());
		repository.put(CommandName.REGISTRATION, new Register());
	}

	Command getCommand(String name) {
		CommandName commandName = null;
		Command command = null;
		try {
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			command = repository.get(CommandName.WRONG_REQUEST);
		}
		return command;
	}
}