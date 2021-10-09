package week1.day2;

public class Mymobile {

//variable and state
//instance variable
//can be accessed all in the class globally using the objects or instances

//Local variable that is restricted to that method alone

	String objectCateogry = "Mobile Phone";
	float size; // declaration; Initilaisation f value used for compiler to understand
	String Shape;
	String IMEI;
	char Brandname;
	String costmobile;
	int Resolution;
	byte weight;
	boolean istouchscreen;

	// Methods and Behavior
	// syntax and signatures
	// Access modifier/specifier return type methodname() -arguments {method body}
	// Access Modifier:
	// public : we can access/rights to the house when class can be accessed by
	// others
	// private : when class can be accessed by only own class but no others only
	// privately can be accessed
	// Protected : Inhertitance
	// Default/package : accessed by package level

	public void makecalls() {
		// local variable cannot be accessed through objects
		int value = 23;
		System.out.println("making calls");
	}

	public void viewgallery() {
			System.out.println("viewing Gallery");
	}

	private void paybills() {
		System.out.println("paying bills");
	}

	public void mesaagi() {
		System.out.println("Messaging System");
	}

	public static void main(String[] args) {

		Mymobile Samsung = new Mymobile();

		Samsung.Brandname = 's';
		Samsung.costmobile = "30000";
		Samsung.makecalls();
		Samsung.viewgallery();
        Samsung.paybills();
        
		System.out.println("SAMSUNG BRAND" + Samsung.Brandname);
		System.out.println("SAMSUNG BRAND" + Samsung.costmobile);

		Mymobile Apple = new Mymobile();

		Apple.Brandname = 's';
		Apple.costmobile = "34000";
		Apple.makecalls();
		Apple.viewgallery();
		System.out.println("Apple BRAND" + Apple.Brandname);
		System.out.println("Apple BRAND" + Apple.costmobile);

		Mymobile Redmi = new Mymobile();

		Redmi.Brandname = 'R';
		Redmi.costmobile = "14000";
		Redmi.makecalls();
		Redmi.viewgallery();
		System.out.println("Apple BRAND" + Redmi.Brandname);
		System.out.println("Apple BRAND" + Redmi.costmobile);

	}

}
