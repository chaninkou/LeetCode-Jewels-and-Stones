package leetcode771;

public class Main {
	public static void main(String[] args) {
		String J = "aAB";
		
		System.out.println("Jewels: " + J);
		
		String S = "aAABBbbbbbbbccc";
		
		System.out.println("Stones: " + S);
		
		FindSameJewlsAndStones solution = new FindSameJewlsAndStones();
		
		System.out.println("Solution: " + solution.numJewelsInStones(J, S));
	}
}
