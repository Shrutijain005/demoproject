import java.util.*;
public class Measurement {

	private int value;
	public Measurement(int n) {
		value=n;
	}
	
	public int getValue() {
		return value;
	}
	public void add(Measurement m) {
		value+=m.getValue();
	}
	public void sub(Measurement m) {
		value-=m.getValue();
	}
	
}
