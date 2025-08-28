package stringPrograms;

public class StringProgramsByCharManipulation {
	
	
	public static void main(String[] args) {
		
		String name="simply";
		printEachCharacterOfString(name);
		System.out.println("*********");
		printEachCharacterOfStringAscii(name);
		System.out.println("*********");
		printUpperCaseOfString(name);
		System.out.println("*********");
		countUpperCaseCharacters(name);
		System.out.println("*********");
		countParticularCharacterInString(name);
		System.out.println("*********");
		printvowels(name);
		System.out.println("*********");
		printNewString(name);
		System.out.println("*********");
		printReverseString(name);
		System.out.println("*********");
		printNewStringWithDigitsFirstAndThenCharacter(name);
		System.out.println("*********");
		pigatin(name);
		System.out.println("*********");
		removeWhiteSpace(name);
		System.out.println("*********");
		moveCharBy2(name);
	}
	
	//print Each Character Of String
	public static void printEachCharacterOfString(String name) {
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			System.out.println(c);
		}
		
	}

//print Each asci Character Of String
public static void printEachCharacterOfStringAscii(String name) {
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		System.out.println(c+" "+(int)c);
	}
	
}


//Print upper case characters
public static void printUpperCaseOfString(String name) {
	
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		if(Character.isUpperCase(c)) {
			System.out.println(c);
		}

	}
	
}

//count upper case characters

//Print upper case characters
public static void countUpperCaseCharacters(String name) {
	int count=0;
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		if(Character.isUpperCase(c)) {
			count++;	
		}

	}
	System.out.println("The count is "+count);
	
}


//Print upper case characters
public static void countParticularCharacterInString(String name) {
	int count=0;
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		if(c=='o') {
			count++;	
		}

	}
	System.out.println("The char count is "+count);
	
}

//Print vowles
public static void printvowels(String name) {
	int count=0;
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		char u= Character.toUpperCase(c);
		if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U') {
			count++;	
		}

	}
	System.out.println("The vowel count is "+count);
	
}

//print newString

public static void printNewString(String name) {
	String sn="";
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		if(Character.isUpperCase(c)) {
			sn=sn+c;	
		}

	}
	System.out.println("The new String is "+sn);
	
}

//printReverseString
public static void printReverseString(String name) {
	String rev="";
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		rev=c+rev;
	}
	System.out.println("Reverse String is "+rev);
}

public static void printNewStringWithDigitsFirstAndThenCharacter(String name) {
	String number="";
	String digit="";
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		if(Character.isDigit(c)) {
			digit=digit+c;
		}
		else {
			number=number+c;
		}
	}
	System.out.println("The new formed string is "+digit+number);
	
}


public static void removeWhiteSpace(String name) {
	String r="";
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		if(!Character.isWhitespace(c)) {
			r=r+c;
		}
		
	}
	System.out.println("The new formed string without space is "+r);
	
}

public static void pigatin(String name) {
	String pgtn="";
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		char u =Character.toUpperCase(c);
		if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U') {
			if(i==0) {
				pgtn=name+"WAY";
			}
			else {
				pgtn=name.substring(i)+name.substring(0,i)+"AY";
				break;
			}
		}	
	}
	System.out.println("The piglatin word is "+pgtn);
	
}

//increment char by 2 ex a to c and b to d

public static void moveCharBy2(String name) {
	String enc="";
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		if(c=='Y'||c=='Z'||c=='y'||c=='z') {
			c-=26;
			c+=2;
			enc=enc+c;
			
		}
		
	}
	System.out.println("Encoded String is "+enc);
	
}
}
