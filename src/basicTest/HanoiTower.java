package basicTest;


// this is a commit for Git
public class HanoiTower {

	public static void main(String[] args) {

		processTower( "a", "b", "c", 7, 0 );
	}

	public static int processTower( String source, String intermediate, String target, int count, int stepNo ) {

		if ( count != 0 ) {
		
			stepNo = processTower( source, target, intermediate, count - 1, stepNo );
			System.out.println( ++stepNo + ": " + source + " -> " + target + " ( " + count + " )" );
			stepNo = processTower( intermediate, source, target, count - 1, stepNo );
		}
		return stepNo;
	}
}
