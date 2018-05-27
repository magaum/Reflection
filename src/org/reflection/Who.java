package org.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.annotation.Name;

public class Who {

	public static void is(Object... o) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		StringBuilder sb = new StringBuilder();
		for (Object obj : o) {
			Class<?> clazz = obj.getClass();
			for (Method m : clazz.getMethods()) {
				/**
				 * 
				 * A documentação com a descrição dos métodos abaixo está disponível no link:
				 * https://docs.oracle.com/javase/X/docs/api/java/lang/reflect/Method.html O X
				 * deve ser substituido com a versão do java desejada.
				 * 
				 */
				sb.append("\n\nMethods Reflection\n");
				sb.append("\nDeclaringClass: " + m.getDeclaringClass());
				sb.append("\nName: " + m.getName());
				sb.append("\nDefaultValue: " + m.getDefaultValue());
				sb.append("\nModifiers: " + m.getModifiers());
				sb.append("\nParameterCount: " + m.getParameterCount());
				sb.append("\nHashCode: " + m.hashCode());
				sb.append("\nAcessible: " + m.isAccessible());
				sb.append("\nBridge: " + m.isBridge());
				sb.append("\nDefault: " + m.isDefault());
				sb.append("\nSyntetic: " + m.isSynthetic());
				sb.append("\nVarArgs: " + m.isVarArgs());
				sb.append("\nGenericString: " + m.toGenericString());
				sb.append("\nAnnotatedExceptionTypes: " + m.getAnnotatedExceptionTypes());
				sb.append("\nAnnotatedParameterTypes: " + m.getAnnotatedParameterTypes());
				sb.append("\nAnnotatedReceiverType: " + m.getAnnotatedReceiverType());
				sb.append("\nAnnotatedReturnType: " + m.getAnnotatedReturnType());
				sb.append("\nAnnotation: " + m.getAnnotation(Name.class));
				sb.append("\nAnnotations: " + m.getAnnotations());
				sb.append("\nClass: " + m.getClass());
				sb.append("\nDeclaredAnnotations: " + m.getDeclaredAnnotations());
				sb.append("\nExceptionTypes: " + m.getExceptionTypes());
				sb.append("\nGenericExceptionTypes: " + m.getGenericExceptionTypes());
				sb.append("\nGenericParameterTypes: " + m.getGenericParameterTypes());
				sb.append("\nParameterAnnotations: " + m.getParameterAnnotations());
				sb.append("\nParameters: " + m.getParameters());
				sb.append("\nTypeParameters: " + m.getTypeParameters());
				sb.append("\nDeclared: " + m.DECLARED);
				sb.append("\nPublic: " + m.PUBLIC);
				if (m.getName().contains("isThis") && m.isAnnotationPresent(Name.class)) {
					sb.append("\nThis is one " + m.getDeclaringClass().getSimpleName() + ": " + m.invoke(obj) + "\n");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
