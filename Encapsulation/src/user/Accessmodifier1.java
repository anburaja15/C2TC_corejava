package user;

public class Accessmodifier1 {
     int a=5;
     char b='R';
     float c=90.7f;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public char getB() {
		return b;
	}
	public void setB(char b) {
		this.b = b;
	}
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Accessmodifier1 [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
     
}
