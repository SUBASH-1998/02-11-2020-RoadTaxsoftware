class  switchcase{
	public static void main(String args[]){
	String stateKeyword ="TN";
	int vehiclePrice = 500000;
	switch(stateKeyword){
	case "KA":
		   float gst =0.18f;	
		   float roadTax = vehiclePrice*gst;
		  System.out.println("cost of roadtax is"+ roadTax);
		  break;
	case "AP":
		   gst = 0.20f;
		  roadTax = vehiclePrice * gst;
		  System.out.println("cost of roadtax is"+ roadTax);
		  break;
	case "TS":
		   gst = 0.16f;
		  roadTax = vehiclePrice * gst;
		  System.out.println("cost of roadtax is"+ roadTax);
		  break;
	case "TN":
		   gst = 0.24f;
		   roadTax = vehiclePrice * gst;
		  System.out.println("cost of roadtax is"+ roadTax);
		  break;
	case "KL":
		   gst = 0.14f;
		   roadTax = vehiclePrice * gst;
		  System.out.println("cost of roadtax is"+ roadTax);
		  break;
	default:
		 System.out.println("Statekeyword not found");
		}
	}
}