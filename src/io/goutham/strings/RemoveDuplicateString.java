package io.goutham.strings;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		System.out.println("Enter The String : ");
        String str = "geeksforgeeks";
        StringBuffer sb = new StringBuffer();
        str.chars().distinct().forEach(c -> System.out.println((char)c));;
        str.chars().distinct().forEach(c -> sb.append((char) c));
        String DuplicateString = sb.toString();
        System.out.println("String after duplicates removed :"+DuplicateString);

	}

}
