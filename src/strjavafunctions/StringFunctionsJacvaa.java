package strjavafunctions;

public class StringFunctionsJacvaa {
	
	public static void main(String[] args) {
		 
		String name = "Ruchita is too good std";
		String lowercase_name= name.toLowerCase();
		System.out.println("The Name of Lowercase as "+lowercase_name);
		
		String uppercase_name= name.toUpperCase();
		System.out.println("The Name of Uppercase as "+uppercase_name);
		
		String repeated_name= name.repeat(10);
		System.out.println("The Name of repeated_name as\n"+repeated_name+"\n"); // when user want to repeat the same as per requirement user can integer as repeated count
		
		String replaced_name= name.replace('t', 'k');
		System.out.println("The Name of replaced_name as "+replaced_name);
		
		String removespace_name= name.strip();   // Remove White spaces from the beginning of the word and end of the word
		System.out.println("The Name of removespace_name as "+removespace_name);
		
		char particularletterfrom_name= name.charAt(2);
		System.out.println("The Name of particularletterfrom_name as "+particularletterfrom_name);
		
		String remove_trailingspace= name.trim();
		System.out.println("The Name of remove_trailingspace as "+remove_trailingspace);
		
		int str_count= name.length();
		System.out.println("The Name of str_count as "+str_count);
		
		String remove_two_char_from_name = name.substring(8);
		System.out.println("The Name of remove_two_char_from_name as "+remove_two_char_from_name);  // when user wants to remove characters based on their requirement then use sub string
		
		String remove__set_two_char_from_name = name.substring(1, 3);
		System.out.println("The Name of remove__set_two_char_from_name as "+remove__set_two_char_from_name);  // when user wants to remove characters based on their requirement then use sub string
		
		String copyvalue = name.valueOf("Test");
		System.out.println("The Name of copyvalue as "+copyvalue);  // when user wants to remove characters based on their requirement then use sub string
		
		
	}

}
