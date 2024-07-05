package practise;

public class PrefixFinder {

	public static void main(String[] args) {
		String[] listofWords = {"fpower","fbow","flight"};
		String prefix = findPrefix(listofWords);
		System.out.println("the prefix is: "+prefix);

	}

	private static String findPrefix(String[] listofWords) {
		if(listofWords==null||listofWords.length==0) {
			return "";
		}
		String prefix = listofWords[0];
		
		for(int i=1;i<listofWords.length;i++) {
			while (listofWords[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty()) {
					return "";
					}				
			}
		}
		return prefix;
	}

}
