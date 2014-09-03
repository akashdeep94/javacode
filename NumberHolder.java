public class NumberHolder {
    public int anInt;
    public float aFloat;
	
	public static void main(String[] args){
	
	NumberHolder ob = new NumberHolder();
	ob.anInt= 7;
	ob.aFloat = 8;
	
	System.out.println("value is" + ob.anInt);
	System.out.println("value is" + ob.aFloat);
	
	}
}