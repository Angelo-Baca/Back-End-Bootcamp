import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// a. Instantiate a new StringBuilder
		StringBuilder q1 = new StringBuilder();

		// b. Append the characters 0 through 9 to it separated by dashes
		for (int i = 0; i < 10; i++) {
			q1.append(i);
			if (i != 9) {
				q1.append("-");
			}
		}
		System.out.println("Q1: " + q1);

		// 2. List of String:
		// a. Create a list of Strings
		// b. Add 5 Strings to it, each with a different length
		List<String> q2 = new ArrayList<>();
		q2.add("Hello");
		q2.add("Java");
		q2.add("Buns");
		q2.add("Programming");
		q2.add("Fantastic");

		System.out.println("Q2 List: " + q2);

		// 3. Test shortest string method
		System.out.println("Q3 shortest string: " + lengthCheck(q2));

		// 4. Test first/last switch method
		System.out.println("Q4 switched list: " + switchFL(new ArrayList<>(q2)));

		// 5. Test concatenation method
		System.out.println("Q5 concatenated: " + concat(q2));

		// 6. Test search method
		System.out.println("Q6 search results: " + takeOneReturnTwo(q2, "a"));

		// 7. Test math grouping method
		List<Integer> batch = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			batch.add(i);
		}
		System.out.println("Q7 grouped lists: " + mathThings(batch));

		// 8. Test string length list method
		System.out.println("Q8 lengths: " + charCounter(q2));

		// 9. Create a set of strings and add 5 values
		Set<String> secondString = new HashSet<>();
		secondString.add("What is a set?");
		secondString.add("What is the meaning of life?");
		secondString.add("My first love broke my heart for the first time...");
		secondString.add("Glad I found a good church!");
		secondString.add("Some cheese would be fantastic right about now!");
		System.out.println("Q9 set: " + secondString);

		// 10. Test set filter by first character
		System.out.println("Q10 filtered set: " + inCharParam(secondString, 'W'));

		// 11. Test set to list conversion
		System.out.println("Q11 converted set to list: " + convertSetToList(secondString));

		// 12. Test even number filter
		Set<Integer> randomNums = new HashSet<>();
		randomNums.add(1);
		randomNums.add(2);
		randomNums.add(3);
		randomNums.add(4);
		randomNums.add(5);
		randomNums.add(6);
		System.out.println("Q12 only evens: " + onlyEvens(randomNums));

		// 13. Create a map of string and string and add 3 items
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("Hansel and Gretel", "A German fairy tale");
		dictionary.put("Coffee", "A brewed drink made from roasted beans");
		dictionary.put("Pilot", "A person who flies an aircraft");
		System.out.println("Q13 dictionary: " + dictionary);

		// 14. Test dictionary lookup
		System.out.println("Q14 search result: " + searchbar(dictionary, "Coffee"));

		// 15. Test first-character count map
		System.out.println("Q15 character count map: " + method15(q2));
	}

	// 3. Returns the shortest string from a list
	public static String lengthCheck(List<String> q2) {
		String shortest = q2.get(0);
		for (int i = 1; i < q2.size(); i++) {
			if (shortest.length() > q2.get(i).length()) {
				shortest = q2.get(i);
			}
		}
		return shortest;
	}

	// 4. Returns the list with the first and last element switched
	public static List<String> switchFL(List<String> q2) {
		String tempFirst = q2.get(0);
		q2.set(0, q2.get(q2.size() - 1));
		q2.set(q2.size() - 1, tempFirst);
		return q2;
	}

	// 5. Returns a comma-separated string of all list elements
	public static String concat(List<String> q2) {
		String result = "";
		for (int i = 0; i < q2.size(); i++) {
			result += q2.get(i);
			if (i != q2.size() - 1) {
				result += ",";
			}
		}
		return result;
	}

	// 6. Returns a new list containing strings that contain the search term
	public static List<String> takeOneReturnTwo(List<String> q2, String searchTerm) {
		List<String> returnSearch = new ArrayList<>();
		for (String s : q2) {
			if (s.contains(searchTerm)) {
				returnSearch.add(s);
			}
		}
		return returnSearch;
	}

	// 7. Groups integers by divisibility rules
	public static List<List<Integer>> mathThings(List<Integer> batch) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> modulo2 = new ArrayList<>();
		List<Integer> modulo3 = new ArrayList<>();
		List<Integer> modulo5 = new ArrayList<>();
		List<Integer> moduloElse = new ArrayList<>();

		for (int i : batch) {
			if (i % 2 == 0) {
				modulo2.add(i);
			}
			if (i % 3 == 0) {
				modulo3.add(i);
			}
			if (i % 5 == 0) {
				modulo5.add(i);
			}
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
				moduloElse.add(i);
			}
		}

		result.add(modulo2);
		result.add(modulo3);
		result.add(modulo5);
		result.add(moduloElse);

		return result;
	}

	// 8. Returns a list of string lengths
	public static List<Integer> charCounter(List<String> phrases) {
		List<Integer> counter = new ArrayList<>();
		for (String s : phrases) {
			counter.add(s.length());
		}
		return counter;
	}

	// 10. Returns strings from the set that start with the given character
	public static Set<String> inCharParam(Set<String> randomStr, char randomch) {
		Set<String> returnSet = new HashSet<>();
		for (String s : randomStr) {
			if (!s.isEmpty() && s.charAt(0) == randomch) {
				returnSet.add(s);
			}
		}
		return returnSet;
	}

	// 11. Converts a set of strings into a list
	public static List<String> convertSetToList(Set<String> toConvert) {
		return new ArrayList<>(toConvert);
	}

	// 12. Returns only even numbers from a set
	public static Set<Integer> onlyEvens(Set<Integer> randomNums) {
		Set<Integer> onlyEvens = new HashSet<>();
		for (int num : randomNums) {
			if (num % 2 == 0) {
				onlyEvens.add(num);
			}
		}
		return onlyEvens;
	}

	// 14. Returns the value for a matching key in the map
	public static String searchbar(Map<String, String> dictionary2, String query) {
		if (dictionary2.containsKey(query)) {
			return dictionary2.get(query);
		}
		return "Word not found";
	}

	// 15. Returns a map counting how many strings start with each character
	public static Map<Character, Integer> method15(List<String> finalList) {
		Map<Character, Integer> finalMap = new HashMap<>();
		for (String s : finalList) {
			if (s.isEmpty()) {
				continue;
			}
			char firstChar = s.charAt(0);
			if (finalMap.containsKey(firstChar)) {
				finalMap.put(firstChar, finalMap.get(firstChar) + 1);
			} else {
				finalMap.put(firstChar, 1);
			}
		}
		return finalMap;
	}
}