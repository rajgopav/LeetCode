import java.util.*;

/**
 * @author Varun
 * LeetCode : Given two words (start and end), and a dictionary, find the length of shortest transformation sequence 
 * from start to end, such that only one letter can be changed at a time and each intermediate word must exist in the 
 * dictionary. For example, given:
 * 
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", the program should return its length 5.
 * 
 */
public class WordLadder {
	
	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		Set<String> dict = new HashSet<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		int result = ladderLength(start, end, dict);
		System.out.println(result);
	}
	
	public static int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
		if(beginWord == null 
				|| endWord == null 
				|| beginWord.length() == 0 
				|| endWord.length() == 0 
				|| beginWord.length() != endWord.length())
			return 0;
		
		LinkedList<WordNode> queue = new LinkedList<WordNode>();
		queue.add(new WordNode(beginWord, 1));
		
		wordDict.add(endWord);
		while(!queue.isEmpty()) {
			WordNode top = queue.remove();
			String word = top.word;
			
			if(word.equals(endWord))
				return top.steps;
			
			char[] arr = word.toCharArray();
			for(int i=0; i < arr.length; i++) {
				for(char ch ='a'; ch < 'z'; ch++) {
					char temp = arr[i];
					if(arr[i]!=ch) {
						arr[i] = ch;
					}
					
					String newWord = new String(arr);
					if(wordDict.contains(newWord)) {
						queue.add(new WordNode(newWord, top.steps+1));
						wordDict.remove(newWord);
					}
					arr[i] = temp;
				}
			}
		}
		return 0;
	}
}

class WordNode {
	String word;
	int steps;
	
	public WordNode(String str, int steps) {
		this.word = str;
		this.steps = steps;
	}
}
