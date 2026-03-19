public class Week4Labs {

}

//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
        StringBuilder Q1 = new StringBuilder();
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
        for (int i = 0; i < 10; i++) {
            Q1.append(i);
            if(i != 9) {
                Q1.append("-");
            }
        };

        System.out.println("This is the string and string builder from Q1:" + Q1);
        
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
                List<String> Q2 = new ArrayList<>();
                Q2.add("Hello");
                Q2.add("Java Sucks");
                Q2.add("Buns");
                Q2.add("About time I did some work");
                Q2.add("I wish I was married");

		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
        public static String lengthCheck(List<String> Q2){
            String initial = Q2.get(0);
            for (int i = 1; i < Q2.size(); i++) {
                if (initial.length() > Q2.get(i).length()) {
                initial = Q2.get(i);
            }
        } return initial;
    }
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
        public static List<String> switchFL(List<String> Q2) {
            String TempFirst = Q2.get(0);
            Q2.set(0, Q2.get(Q2.size()-1));
            Q2.set(Q2.get(Q2.size()-1), Q2.size()-1);
            return Q2;
        }
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
        public static String concat(List<String> Q2) {
            String initial = "";
            for (String s : Q2) {
                initial += s;
                if (i != Q2.size() - 1) {
                    initial += ",";
            }
            return initial;
        }
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
            public static List<String> takeOneReturnTwo(List<String> Q2, String searchTerm) {
                List<String> returnSearch = new ArrayList<>();
                for (String s : Q2) {
                    if (s.contains(searchTerm)) {
                        returnSearch.add(s);
                }
            }
            return returnSearch;
        }
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5

                    public static List<List<Integer>> mathThings(List<Integer> Batch) {
                    List<List<Integer>> Result = new ArrayList<>();
                    List<Integer> Modulo2 = new ArrayList<>();
                    List<Integer> Modulo3 = new ArrayList<>();
                    List<Integer> Modulo5 = new ArrayList<>();
                    List<Integer> ModuloElse = new ArrayList<>();
                    for (int i : Batch) {
                        if (i % 2 == 0) {
                            Modulo2.add(i);
                        }
                    }
                    for (int i : Batch) {
                        if (i % 3 == 0) {
                            Modulo3.add(i);
                        }
                    }
                    for (int i : Batch) {
                        if (i % 5 == 0) {
                            Modulo5.add(i);
                        }
                    }
                    for (int i : Batch) {
                        if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                            ModuloElse.add(i);
                        }
                    }
                    Result.add(Modulo2);
                    Result.add(Modulo3);
                    Result.add(Modulo5);
                    Result.add(ModuloElse);
                    return Result;
                }
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
            public static List<Integer> charCounter(List<String> phrases) {
                List<Integer> Counter = new ArrayList<>();
                for (String s : phrases) {
                    int count = 0;
                    count += s.length();
                    Counter.add(count);
                }
                return Counter;
            }

		
		// 9. Create a set of strings and add 5 values
            Set<String> secondString = new HashSet<>();
            secondString.add("What is a set?");
            secondString.add("What is the meaning of life?");
            secondString.add("My first love broke my heart for the first time...");
            secondString.add("Glad I found a good church!");
            secondString.add("Some cheese would be fantastic right about now!");
		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
            public static Set<String> inCharParam(Set<String> randomStr, char randomch) {
                Set<String> returnSet = new HashSet<>();
                for (String s : randomStr) {
                    if (!s.isEmpty() && s.charAt(0) == randomch) {
                        returnSet.add(s);
                    }
                }
                return returnSet;
            }

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings

            Set<String> toConvert = new HashSet<>();
            public static List<String> convertSetToList(Set<String> toConvert) {
                List<String> convertedSet = new ArrayList<>(toConvert);
                return convertedSet;
            }
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
            public static Set<Integer> onlyEvens(Set<Integer> randomNums) {
                Set<Integer> onlyEvens = new HashSet<>();
                for (int num : randomNums) {
                    if (num % 2 == 0) {
                        onlyEvens.add(num);
                    }
                }
                return onlyEvens;
            }

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			s a word and the value is the definition of the word
                Map<String, String> dictionary = new HashMap<>();
                dictionary.put("Hansel and Gretel", "A german book");
                dictionary.put("Coffee is gross", "So are bananas");
                dictionary.put("Gonna keep studying to become a pilot", "Or cry trying");
	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
            Map<String, String> dictionary2 = new HashMap<>();
            dictionary2.put("Antidisestablishmentarianism", "The separation of the church and the state");
            public static String Searchbar(Map<String, String> dictionary2, String query) {
                if (dictionary2.containsKey(query)) {
                    return dictionary2.get(query);
                }
                return "Word not found";
            }
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
            List<String> finalList = new ArrayList<>();
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
	
	
	// Method 15:
	
	
	
	// Method 14:
	

	
	// Method 12:
	

	
	// Method 11:
	


	// Method 10:
	

	
	// Method 8:
	

	
	// Method 7:
	

	
	// Method 6:
	

	
	// Method 5:
	
	
	
	// Method 4:
	
	
	
	// Method 3:
	
	

}