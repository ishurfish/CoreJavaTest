package org.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		// TODO: create a list of students (may be five items)
		try (Scanner scanner = new Scanner(System.in)) {

			Student s1 = new Student("Deep", "Gill", new Address(13, "Hanover", "Rd", "Greenbelt", "MD", 11111),
					new Address(23, "Hanover", "Durham", "NC", 22222));
			Student s2 = new Student("Raman", "Gill", new Address(33, "Southway", "Rd", "Baltimore", "MD", 33333),
					new Address(43, "Southway", "Ashburn", "VA", 44444));
			Student s3 = new Student("Prajna", "Kodre", new Address(53, "West Ox", "Trail", "Fairfax", "VA", 55555),
					new Address(63, "West Ox", "Ashburn", "VA", 44444));
			Student s4 = new Student("Tom", "Adil", new Address(93, "Ivy", "LN", "Washington", "DC", 99999),
					new Address(93, "Ivy", "Ashburn", "VA", 44444));
			Student s5 = new Student("Tom", "Adil", new Address(93, "Ivy", "LN", "Washington", "DC", 96999),
					new Address(93, "Ivy", "Ashburn", "VA", 44444));

			Set<Student> studentSet = new HashSet<Student>(5);
			studentSet.add(s1);
			studentSet.add(s2);
			studentSet.add(s3);
			studentSet.add(s4);
			studentSet.add(s5);

			System.out.println("UnSorted List");
			studentSet.forEach(System.out::println);
			System.out.println("---------------------------------------------------------");

			// TODO: create a set of students (may be five items) where unique student
			// should be defined by their
			// 1)last name, 2)first name and 3)permanent address

			System.out.println("Checking for Consistent Behaviour: " +s4.equals(s5));
			System.out.println("---------------------------------------------------------");

			// TODO: sort the list using last name of the student
			List<Student> studentList = new ArrayList<Student>(studentSet);
			Collections.sort(studentList, new LastNameSorter());
			System.out.println("Sorted By Last Name");
			studentList.forEach(System.out::println);
			
			System.out.println("---------------------------------------------------------");

			// TODO: sort the list using the zip code of the mailing address
			Collections.sort(studentList, new ZipCodeSorter());
			System.out.println("Sorted By Zip Code");
			studentList.forEach(System.out::println);
			
			System.out.println("---------------------------------------------------------");

			// TODO: find a student(s) by the last name which contain a given string
			List<Student> searchedList = new ArrayList<Student>();
			System.out.println("Search Students By Last Name: ");

			String lastNameString = scanner.nextLine();

			for (Student str : studentSet) {
				if (str.getLastName().contains(lastNameString))
					searchedList.add(str);
			}

			searchedList.forEach(System.out::println);
			System.out.println("---------------------------------------------------------");

			// TODO: remove all of the addresses (may be set it to null) of all students and
			// return them in a list

			for (Student str : studentSet) {
				str.setMailingAddress(null);
				str.setPermanentAddress(null);
			}
			studentList.forEach(System.out::println);
		}
	}
}
