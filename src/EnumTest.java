public class EnumTest
{

	/**
	 * @param args some comments. I just made some changes to this file.
	 */
	public static void main( String[] args ) {
		ActivityType at1 = ActivityType.getTypeByCode( "type1" );
		ActivityType at2 = ActivityType.getTypeByCode( "type2" );
		ActivityType at3 = ActivityType.getTypeByCode( "type3" );

		System.out.println( at1.toString() );
		System.out.println( at2.toString() );
		System.out.println( at3.toString() );

		// some comment. playing around again.
		ActivityType at4 = ActivityType.getTypeByCode( "type4" );
		System.out.println( at4.toString() );
	}

}
