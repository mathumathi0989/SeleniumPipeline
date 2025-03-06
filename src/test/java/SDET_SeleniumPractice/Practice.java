package SDET_SeleniumPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class Practice {

	public static void reverseUsingStringBuilder(String s) {
	
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		
	}
	
	public static void reverseUsingCharacter(String s) {
		
		for (int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	public static void swapTwoStrings(String s1, String s2) {
		
		s1 = s1 + s2;
		System.out.println(s1);
		s2 = s1.substring(0,s1.length()-s2.length());
		System.out.println(s2);
		s1 = s1.substring(s2.length());
		System.out.println(s1);
	
	}
	
	public static void printFibonacci(int n) {
		//0,1,1,2,3,5,8
		int n1 = 0; 
		int n2 = 1;
		System.out.print(n1);
		System.out.print(" ");
		System.out.print(n2);
		System.out.print(" ");
		
		for (int i=0; i <=n; i++) {
			int n3 = n1+n2;   // 0,1,1
			System.out.print(n3);
			System.out.print(" ");
				n1 = n2;
			n2 = n3;
		}
		
		
	}
	
	public static void printFibonacciUsingArray(int n) {
		
		int[] num = new int[n];
		num[0] = 0;
		num[1] = 1;
		
		for(int i=2; i<n;i++) {
			num[i] = num[i-1] +num[i-2];
			
		}
		
		for (int i=0; i<n; i++) {
		System.out.println(num[i]+"");
		}
	}
	
	public static void isArmstrongOrNot(int num) {
		int actualNum =  num;
		double result = 0;
		
		while(actualNum!=0) {
			int n = actualNum%10;
			
			result = result + Math.pow(n, 3);
			actualNum = actualNum / 10;
		}
		
		if(result==num) {
			System.out.println(num + " is an armstrong");
		}
		else {
			System.out.println(num + " is not an armstrong");
		}
		
		
	}
	
	public static void sumOfIntegers(int num) {
		
		int sum = 0;
		while(num!=0) {
			int n = num %10; 
			sum = sum + n;
			num = num / 10;
		}
		System.out.println(sum);
		
		
	}
	
	public static boolean isPrime(int num) {
		if(num<1) {
		return false;
		}
		else {
			for (int i=2; i<num; i++) {
				if(num%i ==0) {
					return false;
				}
			}
			return true;
		}
		
	}
	
	public static void characterCount(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}
	
	
	public static void findDuplicates(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			
		map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		
		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		
		
		
	}
	
	public static void swappingTwoNumbers(int num1, int num2) {
		
		num1 = num1+ num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println(num1 + "second number");
		System.out.println(num2 + "first number");
	}
	
	
	public static void reverseAnArray(char[] a) {
		List<Character> l = new ArrayList<>();
		for (int i=0; i<a.length; i++) {
		l.add(a[i]);
		}
		
		Collections.reverse(l);
		System.out.println(l);
		
	}
	
	
	public static int capitalizedCount(String s) {
		int count = 0;
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				count ++;
			}
		}
		return count;
	}
	
	
	public static void generateOutput(String s) {
		
		for (int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}
			else {
				int a = Character.getNumericValue(s.charAt(i));
				for (int j=1; j<a; j++) {
					System.out.println(s.charAt(i-1));
				}
			}
		}
	
		
	}
	
	//Java 8 streams --
	
	public static void secondLargest(int[] num) {
		
		Optional<Integer> secondLargest = Arrays.stream(num)
				.distinct()
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		
				
		secondLargest.ifPresentOrElse(number -> System.out.println("Second largest number is "+ number), ()->System.out.println("no second largest number"));
		
		
	}
	
	
	public static void reverseStreams(int[] num) {
		int[] reverseOrd = Arrays.stream(num)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.mapToInt(Integer::intValue)
				.toArray();
		
	System.out.println(Arrays.toString(reverseOrd));
	}
	
	
	
	public static void nonRepeatingCharacter(String s) {
		
		//mathumathi
		//LinkedHashMap maintains insertion order
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i=0; i<s.length(); i ++) {
			char ch = s.charAt(i);
		map.put(ch, map.getOrDefault(ch,0)+1);
		
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				return;
			}
		}
		
	}
	
	
	public static void removeDuplicates(int[] num) {
		if(num.length==0 || num==null) {
			System.out.println("Array is empty");
			return;
		}
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int n: num) {
			set.add(n);
		}
		
		System.out.println(set);
		
	}
	
	
	public static void iterateHashMap() {
		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("First", "Dheena");
		map.put("Second", "Mathu");
		map.put("Third", "Thanya");
		map.put("Fourth", "Gurdev");
		
		map.forEach((key, value) -> System.out.println(key + ":" + value));
	
//			for(Map.Entry<String, String> entry : map.entrySet()) {
//				System.out.println(entry.getKey() +":" +entry.getValue());	
//		}
			
			
		
	}
	
	public static void convertMaptoArray() {
Map<String, String> map = new LinkedHashMap<>();
		
		map.put("First", "Dheena");
		map.put("Second", "Mathu");
		map.put("Third", "Thanya");
		map.put("Fourth", "Gurdev");
		
		List<String> li = new ArrayList<>(map.keySet());
		
		for(String s : li) {
			System.out.println(s);
		}
		List<String> liValue = new ArrayList<>(map.values());
		
		for(String s: liValue) {
			System.out.println(s);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Question 1: Write a Java Program to reverse a String
	//	reverseUsingStringBuilder("Mathumathi");
		
	//	reverseUsingCharacter("Mathumathi");
		
		//Question 2:  Write a Java Program to swap two given Strings
		
	//	swapTwoStrings("mathu", "mathi");
		
		//Question 3: Write a Java Program to print the Fibonacci Series.
		
	//	printFibonacci(4);
	//	printFibonacciUsingArray(6);
		
		
		//Question 4: Write a Java Program to check if a number is Armstrong number or not.
	//	isArmstrongOrNot(371);
	//	isArmstrongOrNot(111);
		
	//	Question 5: Write a Java Program to print the sum of digits of a given integer.
	
		//sumOfIntegers(549);
		
	//	Question 6: Write a Java Program to check if a number is Prime or not.
	//	System.out.println(isPrime(8));
	//	System.out.println(isPrime(5));
		
		//Question 7:  Write a Java Program to count the number of characters in a given String.
		
		//characterCount("mathumathi");
		
		//Question 8: Write a Java Program to find the duplicates of a given String.
		
		//findDuplicates("rahulshettyacademy");
		
		//Question 9: Write a Java Program for swapping of 2 numbers.
		
	//	swappingTwoNumbers(1,2);
		
		//Question 10: Write a Java Program to reverse an array?
	//	char[] a = {'a','c','z'};
	//	reverseAnArray(a);
		
		//Question 11: Write a Java Program to get the count of Capitalized words in a String.
		
		//System.out.println(capitalizedCount("MathumathiBalakrishnan"));
		
		
		//Question 12: Write a Java Program to find the longest consecutive occurrence of integers in a given array.
		
		
		//Question 13: Write a Java Program to generate Output "aabbbcccc" with the input "a2b3c4"
		
		//generateOutput("m2a2t3");
		
		
		//Question 16:  Write a Java Program to print the second largest number in a given array.
		
	//	int[] num = {2,1,4,12,1,10};
	//	secondLargest(num);
	//	reverseStreams(num);
		
		
		
		//Question 17: Write a Java Program to print the first non repeating character in a given String.
		
		
	//	nonRepeatingCharacter("GeeksForGeeks");
	
		
		//Question 22: Write a Java Program to remove the duplicates from an array.
	//	int[] num = {3,4,3,1,45,3,1};
	//	removeDuplicates(num);
	
		
		//Question 23: Write a Java Program to iterate through the HashMap.
	//	iterateHashMap();
		
		
	//	Question 24: Write a Java Program to convert HashMap to ArrayList.
		convertMaptoArray();
	}

}
