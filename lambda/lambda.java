package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambda {

	public static void main(String[] args)

	{
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emily");

		// Filter names starting with "E" using a lambda expression:
		List<String> filteredNames = names.stream().filter(name -> name.startsWith("E")).collect(Collectors.toList());

		System.out.println(filteredNames); // Output: [Alice]
	}
}
