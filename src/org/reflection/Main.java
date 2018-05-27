package org.reflection;

import java.lang.reflect.InvocationTargetException;

import org.tg.Person;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Person isabel = new Person("Isabel", 19, "F", 69.9);
		Person weslei = new Person("Weslei", 21, "M", 67);
		Who.is(isabel, weslei);
	}

}
