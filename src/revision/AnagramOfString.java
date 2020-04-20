package revision;

public class AnagramOfString {

	public static void main(String[] args) {
		
		String a = "silent)(#$%";
		String b = "listen)(#$%@";
		
		boolean isAnagram = true;
		
		// ################################## SLIGHT MORE OPTIMIZED ######################################//
		
		if(a.length() == b.length()) {
			
			int al[] = new int[256];
			
			for(char c: a.toCharArray()) {
				int index = (int)c;
				al[index]++;
			}
			
			for(char c: b.toCharArray()) {
				int index = (int)c;
				al[index]--;
			}
		
			for(int i=0; i<256; i++) {
				if(al[i] != 0) {
					isAnagram = false;
					break;
				}
			}

		
			if(isAnagram) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}

	  }
		else {
			System.out.println("not anagram");
		}
		
		// ################################## MORE OPTIMIZED ######################################//
		
//		if(a.length() == b.length()) {
//			
//			int al[] = new int[256];
//			int bl[] = new int[256];
//			
//			for(char c: a.toCharArray()) {
//				int index = (int)c;
//				al[index]++;
//			}
//			
//			for(char c: b.toCharArray()) {
//				int index = (int)c;
//				bl[index]++;
//			}
//		
//			for(int i=0; i<256; i++) {
//				if(al[i] != bl[i]) {
//					isAnagram = false;
//					break;
//				}
//			}
//	}
//		
//		if(isAnagram) {
//			System.out.println("anagram");
//		}
//		else {
//			System.out.println("not anagram");
//		}
		
		
		
// ################################## LESS OPTIMIZED ######################################//
		
//		boolean isAnagram = false;
//		boolean visited[] = new boolean[b.length()];
//		
//		if(a.length() == b.length()) {
//			for(int i=0; i<a.length(); i++) {
//				
//				int c = a.charAt(i);
//				isAnagram = false;
//				
//				for(int j=0; j<b.length(); j++) {
//					
//					if(b.charAt(j) == c && !visited[j]) {
//						visited[j] = true;
//						isAnagram = true;
//						break;
//					}
//				}
//				
//				if(!isAnagram) break;
//			}
//	
//		
//		if(isAnagram ) {
//			System.out.println("anagram");
//		}
//		else {
//			System.out.println("not anagram");
//		}
//	}
//		else {
//			System.out.println("not anagram");
//		}
		
	}

}
