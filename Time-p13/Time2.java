class Time2 {
	private int hour;
	private int minute;
	private int second;
	// Time2 no-argument constructor:
    // initializes each instance variable to zero

	public Time2(){
		this(0, 0, 0); // invoke Time2 constructor with three arguments
	}

	// Time2 constructor: hour supplied, minute and second defaulted to 0
	public Time2( int h ){
		this( h, 0, 0 ); // invoke Time2 constructor with three arguments
	} // end Time2 one-argument constructor

	// Time2 constructor: hour and minute supplied, second defaulted to 0
	public Time2( int h, int m ){
		this( h, m, 0 ); // invoke Time2 constructor with three arguments
	} // end Time2 two-argument constructor

	// Time2 constructor: hour, minute and second supplied
	public Time2( int h, int m, int s ){
		setTime( h, m, s ); // invoke setTime to validate time
	} // end Time2 three-argument constructor

	// Time2 constructor: another Time2 object supplied
	public Time2( Time2 time ){
		// invoke Time2 three-argument constructor
		this( time.getHour(), time.getMinute(), time.getSecond() );
	} // end Time2 constructor with a Time2 object argument


	public void setTime( int h, int m, int s ){
   		setHour( h ); // set the hour
   		setMinute( m ); // set the minute
   		setSecond( s ); // set the second
	} // end method 

	// validate and set hour
	public void setHour( int h) {
		if(h>=0&&h<24 ) 
			hour = h;
		else
      		throw new IllegalArgumentException( "hour must be 0-23" );
	} // end method
	
	// validate and set minute

	public void setMinute( int m ){
   		if ( m >= 0 && m < 60 )
      	minute = m;
   		else
      		throw new IllegalArgumentException( "minute must be 0-59" );
	} // end method setMinute

	public void setSecond( int s ){
   		if ( s >= 0 && s < 60 )
      		second = ( ( s >= 0 && s < 60 ) ? s : 0 );
      	else
      		throw new IllegalArgumentException( "second must be 0-59" );
	} // end method setSecond

	// Get Methods
	// get hour value
	public int getHour(){
   		return hour;
	} // end method getHour

	// get minute value
	public int getMinute(){
   		return minute;
	} // end method getMinute

	// get second value
	public int getSecond(){
   		return second;
	} // end method getSecond

	public String toUniversalString(){
   		return String.format(
      		"%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
	} // end method toUniversalString

	public String toString(){
		return String.format( "%d:%02d:%02d %s",
			( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ), getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
	// end method toString
	} 
} //