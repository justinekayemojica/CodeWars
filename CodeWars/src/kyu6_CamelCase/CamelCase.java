package kyu6_CamelCase;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {

	public static void main(String[] args) {
		System.out.println(camelCase("camel  case word  "));

	}
	
	 public static String camelCase(String str) {
	 return str.isEmpty() ? str : Arrays.asList(str.strip().split(" ")).stream().map(s -> s.length() == 0 ? s : 
		 	s.replace(" ", "").substring(0, 1).toUpperCase().concat(s.substring(1))).collect(Collectors.joining());
	}

}
