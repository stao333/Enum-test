public enum ActivityType
{
	TYPE1("type1"), TYPE2("type2"), TYPE3("type3");

	private String typeCode;

	private ActivityType( String typeCode ) {
		this.typeCode = typeCode;
	}

	//made a local change to the file. another change, third change
	// comment 4, now comment 5.1, 5.2
	// changes that need to be merged later.
    // change for merge from enum.
	public static ActivityType getTypeByCode( String code ) {
		switch( code ) {
			case "type1":
				return ActivityType.TYPE1;
			case "type2":
				return ActivityType.TYPE2;
			case "type3":
				return ActivityType.TYPE3;
			default:
				throw new RuntimeException();
		}

	}
}
