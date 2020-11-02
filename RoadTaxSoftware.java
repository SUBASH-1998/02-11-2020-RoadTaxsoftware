class  RoadTaxSoftware{
	public static void main(String args[]){
	String stateKeyword ="TN";
	int vehicleTax = 5000;
	switch(stateKeyword){
	case "KA":
		   float gst = vehicleTax*0.18f;	
		   float roadTax = vehicleTax + gst;
		  System.out.println("cost of roadtax is"+ roadTax);
		  break;
	case "AP":
		   gst = vehicleTax*0.20f;
		  roadTax = vehicleTax + gst;
		  System.out.println("cost of roadtax is"+ roadTax);
		  break;
	case "TS":
		   gst = vehicleTax*0.16f;
		  roadTax = vehicleTax + gst;
		  System.out.println("cost of roadtax is"+ roadTax);
		  break;
	case "TN":
		   gst = vehicleTax*0.24f;
		   roadTax = vehicleTax + gst;
		  System.out.println("cost of roadtax is"+ roadTax);
		  break;
	case "KL":
		   gst = vehicleTax*0.14f;
		   roadTax = vehicleTax + gst;
		  System.out.println("cost of roadtax is"+ roadTax);
		  break;
	default:
		 System.out.println("Statekeyword not found");
		}
	}
}