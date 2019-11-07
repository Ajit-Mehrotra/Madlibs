
//
////substitutes the word given in the parameter for the word/words in the first set of brackets
//import java.util.Scanner;
//
//public class Madlib {
//	public static String substituteWord(String storyLine, String word) {
//		int indFirstBracket =   storyLine.indexOf("<");
//		int indSecondBracket =   storyLine.indexOf(">");
//		String mainStory =  (storyLine.substring(0,indFirstBracket)) + word + (storyLine.substring((indSecondBracket + 1))) ;
//		return mainStory;
//	}
//	public static void driverForSubstituteWord() {// I decided not to make a method for each test, and call upon those methods in the main methods because...just because..Is it better to do that?
//		//Test1
//		String storyLine1 = "<Noun> was walking down the street";
//		String word1 = "John";
//		System.out.println("Test #1 Parameters:");
//		System.out.println("StoryLine1: " + storyLine1);
//		System.out.println("Word1: " + word1 + "\n");
//		System.out.println("Method Test1 OUTPUT:");
//		System.out.println(substituteWord(storyLine1, word1)+ "\n\n");;//Test that tests substituteWord with the brackets at the very beginning
//		//Test2
//		String storyLine2 = "was walking down the street <Noun>";
//		String word2 = "John";
//		System.out.println("Test #2 Parameters:");
//		System.out.println("StoryLine2: " + storyLine2);
//		System.out.println("Word2: " + word2 + "\n");
//		System.out.println("Method Test2 OUTPUT:");
//		System.out.println(substituteWord(storyLine2, word2)+ "\n\n");;//Test that tests substituteWord with the brackets at the very end.
//		//Test3
//		String storyLine3 = "was walking <Noun> down the street ";
//		String word3 = "John";
//		System.out.println("Test #3 Parameters:");
//		System.out.println("StoryLine3: " + storyLine3);
//		System.out.println("Word3: " + word3 + "\n");
//		System.out.println("Method Test3 OUTPUT:");
//		System.out.println(substituteWord(storyLine3, word3)+ "\n\n");;//Test that tests substituteWord with the brackets embedded within the storyline's words
//		//Test4
//		String storyLine4 = "was walking down the <Noun> street ";
//		String word4 = "John";
//		System.out.println("Test #4 Parameters:");
//		System.out.println("StoryLine4: " + storyLine4);
//		System.out.println("Word4: " + word4 + "\n");
//		System.out.println("Method Test4 OUTPUT:");
//		System.out.println(substituteWord(storyLine4, word4)+ "\n\n");;//Test that tests substituteWord with the brackets consisting of one word
//		//Test5
//		String storyLine5 = "was walking down the <Noun YOLO BLEACH> street ";
//		String word5 = "John";
//		System.out.println("Test #5 Parameters:");
//		System.out.println("StoryLine5: " + storyLine5);
//		System.out.println("Word5: " + word5 + "\n");
//		System.out.println("Method Test5 OUTPUT:");
//		System.out.println(substituteWord(storyLine5, word5)+ "\n\n");//Test that tests substituteWord with the brackets consisting of multiple words
//		//Test6
//		String storyLine6 = "<Noun> was <Verb> down the <BLEACH> street ";
//		String word6 = "John";
//		System.out.println("Test #6 Parameters:");
//		System.out.println("StoryLine6: " + storyLine6);
//		System.out.println("Word6: " + word6 + "\n");
//		System.out.println("Method Test6 OUTPUT:");
//		System.out.println(substituteWord(storyLine6, word6)+ "\n\n");//Test that tests substituteWord with multiple sets of brackets each with the different phrases
//		//Test7
//		String storyLine7 = "<Noun> was <Noun> down the <Noun> street ";
//		String word7 = "John";
//		System.out.println("Test #7 Parameters:");
//		System.out.println("StoryLine7: " + storyLine7);
//		System.out.println("Word7: " + word7 + "\n");
//		System.out.println("Method Test7 OUTPUT:");
//		System.out.println(substituteWord(storyLine7, word7)+ "\n\n");//Test that tests substituteWord with multiple sets of brackets each with the same phrase
//		//Test8
//		String storyLine8 = "<Amount of $> was walking down the street ";
//		String word8 = "John";
//		System.out.println("Test #8 Parameters:");
//		System.out.println("StoryLine8: " + storyLine8);
//		System.out.println("Word8: " + word8 + "\n");
//		System.out.println("Method Test8 OUTPUT:");
//		System.out.println(substituteWord(storyLine8, word8)+ "\n\n");//Test that tests substituteWord with different characters such as "$"
//		//Test9 
//		String storyLine9 = "<> was walking down the street ";
//		String word9 = "John";
//		System.out.println("Test #9 Parameters:");
//		System.out.println("StoryLine9: " + storyLine9);
//		System.out.println("Word9: " + word9 + "\n");
//		System.out.println("Method Test9 OUTPUT:");
//		System.out.println(substituteWord(storyLine9, word9)+ "\n\n");/*My own Test that tests substituteWord with empty
//		brackets*/
//	}
//	public static String wordInsideBrackets (String storyLine){
//		int indFirstBracket =   storyLine.indexOf("<");
//		int indSecondBracket =   storyLine.indexOf(">");
//		if ((indFirstBracket == -1) || (indSecondBracket == -1))
//			return "";
//
//		String partsOfSpeech =  (storyLine.substring((indFirstBracket+1),indSecondBracket));
//		return partsOfSpeech;
//	}
//	public static void driverForWordInsideBrackets (){
//		//Test1
//		String storyLine1 = "<Noun> was walking down the street";
//		System.out.println("Test #1 Part of Speech Inside Brackets:");
//		System.out.println("StoryLine1: " + storyLine1);
//		System.out.println("Method Test1 OUTPUT:");
//		System.out.println(wordInsideBrackets(storyLine1)+ "\n\n");
//		/*Test that tests wordInsideBrackets with the bracket
//		s at the very beginning*/
//		//Test2
//		String storyLine2 = "was walking down the street <Noun>";
//		System.out.println("Test #2 Parameters:");
//		System.out.println("StoryLine2: " + storyLine2);
//		System.out.println("Method Test2 OUTPUT:");
//		System.out.println(wordInsideBrackets(storyLine2)+ "\n\n");/*Test that tests wordInsideBrackets with the brackets at the very end.*/
//		//Test3
//		String storyLine3 = "was walking <Noun> down the street ";
//		System.out.println("Test #3 Parameters:");
//		System.out.println("StoryLine3: " + storyLine3);
//		System.out.println("Method Test3 OUTPUT:");
//		System.out.println(wordInsideBrackets(storyLine3)+ "\n\n");/*Test that tests wordInsideBrackets with the bracket
//		s embedded within the storyline's words*/
//		//Test4
//		String storyLine4 = "was walking down the <Noun> street ";
//		System.out.println("Test #4 Parameters:");
//		System.out.println("StoryLine4: " + storyLine4);
//		System.out.println("Method Test4 OUTPUT:");
//		System.out.println(wordInsideBrackets(storyLine4)+ "\n\n");;/*Test that tests wordInsideBrackets with the brackets consisting of one word*/
//		//Test5
//		String storyLine5 = "was walking down the <Noun> street ";
//		System.out.println("Test #5 Parameters:");
//		System.out.println("StoryLine5: " + storyLine5);
//		System.out.println("Method Test5 OUTPUT:");
//		System.out.println(wordInsideBrackets(storyLine5)+ "\n\n");/*Test that tests wordInsideBrackets with the brackets consisting of multiple words*/
//		//Test6
//		String storyLine6 = "<Noun> was <Verb> down the <BLEACH> street ";
//		System.out.println("Test #6 Parameters:");
//		System.out.println("StoryLine6: " + storyLine6);
//		System.out.println("Method Test6 OUTPUT:");
//		System.out.println(wordInsideBrackets(storyLine6)+ "\n\n");/*Test that tests wordInsideBrackets with multiple sets of brackets each with the different phrases*/
//		//Test7
//		String storyLine7 = "<Noun> was <Verb> down the <Noun> street ";
//		System.out.println("Test #7 Parameters:");
//		System.out.println("StoryLine7: " + storyLine7);
//		System.out.println("Method Test7 OUTPUT:");
//		System.out.println(wordInsideBrackets(storyLine7)+ "\n\n");/*Test that tests wordInsideBrackets with multiple sets of brackets each with the same phrase*/
//		//Test8
//		String storyLine8 = "<Noun> was walking down the street ";
//		System.out.println("Test #8 Parameters:");
//		System.out.println("StoryLine8: " + storyLine8);
//		System.out.println("Method Test8 OUTPUT:");
//		System.out.println(wordInsideBrackets(storyLine8)+ "\n\n");/*Test that tests wordInsideBrackets with different characters such as "$"*/
//		//Test9 
//		String storyLine9 = "<> was walking down the street ";
//		System.out.println("Test #9 Parameters:");
//		System.out.println("StoryLine9: " + storyLine9);
//		System.out.println("Method Test9 OUTPUT:");
//		System.out.println(wordInsideBrackets(storyLine9)+ "\n\n");/*My own Test that tests wordInsideBrackets with empty brackets*/
//		//Test10
//		String storyLine10 = "Bob was walking down the street ";
//		System.out.println("Test #10 Parameters:");
//		System.out.println("StoryLine10: " + storyLine10);
//		System.out.println("Method Test10 OUTPUT:");
//		System.out.println(wordInsideBrackets(storyLine10)+ "\n\n");/*My own Test that tests wordInsideBrackets with empty brackets*/
//		//Test11
//		String storyLine11 = "";
//		System.out.println("Test #11 Parameters:");
//		System.out.println("StoryLine11: " + storyLine10);
//		System.out.println("Method Test11 OUTPUT:");
//		System.out.println(wordInsideBrackets(storyLine11)+ "\n\n");/*My own Test that tests wordInsideBrackets with empty brackets*/
//	}
//	public static String  queryReplace(String storyLine) {
//		//use the code above to be able to find each pair of angle brackets and replace them with the user's input.
//
//		while ((storyLine.indexOf(">") != -1) && (storyLine.indexOf("<") != -1)) {
//			Scanner ReplacememtPrompt = new Scanner (System.in);
//
//			if ( (wordInsideBrackets(storyLine).toLowerCase().indexOf("a") == 0 ) || 
//					((wordInsideBrackets(storyLine).toLowerCase().indexOf("e") == 0 )) ||
//					(wordInsideBrackets(storyLine).toLowerCase().indexOf("i") == 0 ) ||
//					(wordInsideBrackets(storyLine).toLowerCase().indexOf("o") == 0 ) ||
//					(wordInsideBrackets(storyLine).toLowerCase().indexOf("u") == 0 ))  {
//				System.out.println("Enter an " +  wordInsideBrackets(storyLine));
//			}else {
//				System.out.println("Enter a " +  wordInsideBrackets(storyLine));
//			}
//			String userInput = ReplacememtPrompt.nextLine();
//			String newStoryLine = substituteWord(storyLine, userInput);
//			storyLine = newStoryLine;
//		}
//		return storyLine;
//	}
//	public static void driverForQueryReplace() {
//		//Test #1 - Runs queryReplace with no brackets in the storyLine
//		String storyLine1 = "John was jogging on the street";
//		System.out.println("Original storyLine1: " + storyLine1);
//		queryReplace(storyLine1);
//		System.out.println("New storyLine1 after queryReplace Runs: " + queryReplace(storyLine1) +"\n\n");
//
//		//Test #2 - Runs queryReplace with a phrase in angle brackets at the very start in the storyLine
//		String storyLine2 = "<Noun> was jogging on the street";
//		System.out.println("Original storyLine2: " + storyLine2);
//		System.out.println("New storyLine2 after queryReplace Runs: " + queryReplace(storyLine2) +"\n\n");
//
//		//Test #3 - Runs queryReplace with a phrase in angle brackets at the very end in the storyLine
//		String storyLine3 = "John was jogging on the street <Noun and Verb>";
//		System.out.println("Original storyLine3: " + storyLine3);
//		System.out.println("New storyLine3 after queryReplace Runs: " + queryReplace(storyLine3) +"\n\n");
//
//		//Test #4 - Runs queryReplace with two different phrases in separate angle brackets in the storyLine
//		String storyLine4 = "John was <Verb> on the street <Noun and Verb>";
//		System.out.println("Original storyLine4: " + storyLine4);
//		System.out.println("New storyLine4 after queryReplace Runs: " + queryReplace(storyLine4) +"\n\n");
//
//		//Test #5 - Runs queryReplace with three different phrases in  angle brackets (in the storyLine)
//		String storyLine5 = "John was jogging on the street <Noun, Helping verb, and action verb>";
//		System.out.println("Original storyLine5: " + storyLine5);
//		System.out.println("New storyLine5 after queryReplace Runs: " + queryReplace(storyLine5) +"\n\n");
//
//		/*Test #6 - Runs queryReplace with two phrases in the andle brackets where the close bracket for the first is ne
//		xt to the open bracket for the second in the storyline*/
//		String storyLine6 = "John was jogging on the street <Noun><Verb>";
//		System.out.println("Original storyLine6: " + storyLine6);
//		System.out.println("New storyLine6 after queryReplace Runs: " + queryReplace(storyLine6) +"\n\n");
//
//		//Test #7 - Runs queryReplace with an empty phrase in angle brackets 
//		String storyLine7 = "John was jogging on the street <>";
//		System.out.println("Original storyLine7: " + storyLine7);
//		System.out.println("New storyLine7 after queryReplace Runs: " + queryReplace(storyLine7) +"\n\n");
//
//		//Test #8 - Runs queryReplace with an empty phrase for storyLine
//		String storyLine8 = "";
//		System.out.println("Original storyLine8: " + storyLine8);
//		System.out.println("New storyLine8 after queryReplace Runs: " + queryReplace(storyLine8) +"\n\n");
//
//		//Test #9 - Runs queryReplace with a "a" as a vowel
//		String storyLine9 = "John was jogging on the street <Adverb>";
//		System.out.println("Original storyLine9: " + storyLine9);
//		System.out.println("New storyLine9 after queryReplace Runs: " + queryReplace(storyLine9) +"\n\n");
//
//		//Test #10 - Runs queryReplace with a "e" as a vowel
//		String storyLine10 = "John was jogging on the street <edverb>";
//		System.out.println("Original storyLine10: " + storyLine10);
//		System.out.println("New storyLine10 after queryReplace Runs: " + queryReplace(storyLine10) +"\n\n");
//
//		//Test #11 - Runs queryReplace with a "i" as a vowel
//		String storyLine11 = "John was jogging on the street <idverb>";
//		System.out.println("Original storyLine11: " + storyLine11);
//		System.out.println("New storyLine11 after queryReplace Runs: " + queryReplace(storyLine11) +"\n\n");
//
//		//Test #12 - Runs queryReplace with a "o" as a vowel
//		String storyLine12 = "John was jogging on the street <odverb>";
//		System.out.println("Original storyLine12: " + storyLine12);
//		System.out.println("New storyLine12 after queryReplace Runs: " + queryReplace(storyLine12) +"\n\n");
//
//		//Test #13 - Runs queryReplace with a "u" as a vowel
//		String storyLine13 = "John was jogging on the street <udverb>";
//		System.out.println("Original storyLine13: " + storyLine13);
//		System.out.println("New storyLine13 after queryReplace Runs: " + queryReplace(storyLine13) +"\n\n");
//
//		//Test #14 - Runs queryReplace with a "N" as a vowel
//		String storyLine14 = "John was jogging on the street <Noun>";
//		System.out.println("Original storyLine14: " + storyLine14);
//		System.out.println("New storyLine14 after queryReplace Runs: " + queryReplace(storyLine14) +"\n\n");
//
//		//Test #15 - Runs queryReplace with a "p" as a vowel
//		String storyLine15 = "John was jogging on the street <pronoun>";
//		System.out.println("Original storyLine15: " + storyLine15);
//		System.out.println("New storyLine15 after queryReplace Runs: " + queryReplace(storyLine15) +"\n\n");
//
//		//Test #16 - Runs queryReplace with a "c" as a vowel
//		String storyLine16 = "John was jogging on the street <conjuction>";
//		System.out.println("Original storyLine16: " + storyLine16);
//		System.out.println("New storyLine16 after queryReplace Runs: " + queryReplace(storyLine16) +"\n\n");
//
//
//	}
//	public static void playMadlibs(String[] story){
//		System.out.println("Welcome to Madlibs. Game created by Ajit Mehrotra.");
//		String[] newStory = new String[story.length];
//		for (int i = 0; i<story.length; i++) {
//			newStory[i] = queryReplace(story[i]);
//		}
//		for (int i = 0; i<story.length; i++) {
//			System.out.println(newStory[i]);}
//	}
//	public static void main(String args []) {
//		/*driverForSubstituteWord();
//		driverForWordInsideBrackets();
//		driverForQueryReplace();*/
//		String[] story = {"I am a <adjective>.","I am going to <verb>.","This car has fallen on my baby.",
//		"Put Donald Trump on the line and tell him that we are going to need another <noun>"};
//
//		playMadlibs(story);
//
//	}
//}
