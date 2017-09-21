package lab1;

public class Foo {

	public void crazyArray(int[] vals){
		int[] newVals = { 1, 7, 6, 1, 3 };
		vals[0] -= vals[0] - newVals[3];
		vals[3] = vals[2] + vals[1] - newVals[4];
		vals[2] -= vals[0] *2;
		vals = newVals;
		vals[1] -= vals[2];
		newVals[2] *= 3 + vals[3];
		vals[1] -= 14 + vals[2];
	}
	
	public static void main(String[] args) {
		Foo foo = new Foo();
		int[] values = {0 ,1 ,3, 1};
		
		foo.crazyArray(values);
		
		for (int n:values){
			System.out.printf("%4d\n", values[0] - values[n]);
		}
	}
}

