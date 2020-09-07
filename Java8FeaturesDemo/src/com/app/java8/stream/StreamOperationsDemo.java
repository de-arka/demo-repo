package com.app.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream in Java can be defined as a sequence of elements from a source that
 * supports aggregate operations on them. Here source refers to a Collections
 * like List, Set or Arrays who provide data to a stream.
 * 
 * Stream Operations - a. Intermediate Operations - Returns the stream itself.
 * b. Terminal Operation - Returns a result of some type depending upon the
 * operation
 * 
 * Stream keeps the ordering of the data as in in source
 * 
 * @author ArkaDe
 *
 */
public class StreamOperationsDemo {
	public static void main(String[] args) {

		System.out.println("**************Stream forEach***********");
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(i -> {
			System.out.println(i);
		});

		System.out.println("\n\n**************Stream mapToInt***********");
		stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream.mapToInt(i -> i * 2).forEach(i -> {
			System.out.println(i);
		});

		System.out.println("\n\n**************Stream New List***********");
		stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		List<Integer> nwLst = stream.filter(i -> i > 2 && i < 8).collect(Collectors.toList());
		nwLst.forEach(i -> {
			System.out.println(i);
		});

		System.out.println("\n\n**************Stream toArray***********");
		stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		Integer[] nwArr = stream.filter(i -> i < 2 || i > 8).toArray(Integer[]::new);
		for (Integer i : nwArr) {
			System.out.println(i);
		}

		System.out.println("\n\n**************Sum of some numbers***********");
		stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		int sum = stream.filter(i -> i > 5).mapToInt(num -> num).sum();
		System.out.println(sum);

		System.out.println("\n\n**************Stream anyMatch***********");
		stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		System.out.println("anyMatch: " + stream.filter(i -> i > 2 && i < 8).anyMatch(i -> i == 6));

		System.out.println("\n\n**************Stream allMatch***********");
		stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		System.out.println("allMatch: " + stream.filter(i -> i > 5 && i < 7).allMatch(i -> i == 6));

		System.out.println("\n\n**************Stream noMatch***********");
		stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		System.out.println("noneMatch: " + stream.filter(i -> i > 7 && i < 9).noneMatch(i -> i == 6));

		System.out.println("\n\n**************Stream findFirst & findAny***********");
		List<String> strLst = new ArrayList<>();
		System.out.println("Initial List findFirst state: "
				+ strLst.stream().filter(str -> str.equalsIgnoreCase("User1")).findFirst().orElse("Ups!"));
		System.out.println("Initial List findAny state: "
				+ strLst.stream().filter(str -> str.equalsIgnoreCase("User1")).findAny().orElse("Ups!"));
		strLst.add("User1");
		strLst.add("User2");
		strLst.add("User3");
		System.out.println("Post List Population findFirst state: "
				+ strLst.stream().filter(str -> str.equalsIgnoreCase("User1")).findFirst().orElse("Ups!"));
		System.out.println("Post List Population findAny state: "
				+ strLst.stream().filter(str -> str.equalsIgnoreCase("User3")).findAny().orElse("Ups!"));
		
	}
}
