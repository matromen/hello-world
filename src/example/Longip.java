package example;

public class Longip {

	public static void main(String[] args) {
		String abc = "172.18.11.11";
		
	    String[] addrArray = abc.split("\\.");        
	    long num = 0;        
	    for (int i=0;i<addrArray.length;i++) {            
	        int power = 3-i;            
	        num += ((Integer.parseInt(addrArray[i]) % 256) * Math.pow(256,power));        
	    }        

	    System.out.println(num);
	    System.out.println(longToIp(num));
	}
	
	  public static String longToIp(long ip) {
			return ((ip >> 24) & 0xFF) + "." 
					+ ((ip >> 16) & 0xFF) + "." 
					+ ((ip >> 8) & 0xFF) + "." 
					+ (ip & 0xFF);
	  }

}
