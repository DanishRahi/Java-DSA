package classes_and_objects;

public class ComplexNumber {

	private int real;
	private int imaginary;
	
	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public int getImaginary() {
		return imaginary;
		
	}

     public int getReal() {
    	 return real;
     }

     public void setReal(int real) {
    	 this.real = real;
     }

     public void setImaginary(int imaginary) {
    	 this.imaginary = imaginary;
     }

      public void print() {
    	  
          System.out.print(this.real+" + i"+this.imaginary);

      }
      
      public void add(ComplexNumber c2) {
    	  
    	  this.real+=c2.real;
          this.imaginary+=c2.imaginary;
      }
      
      public void multiply(ComplexNumber c2) {
    	  
    	  int newReal=((this.real)*(c2.real))-(this.imaginary*c2.imaginary);
          int newImag=(this.real*c2.imaginary)+(this.imaginary*c2.real);
          this.real=newReal;
          this.imaginary=newImag;
      }
      
      public ComplexNumber conjugate() {
    	  
      }
      
      public static ComplexNumber add(ComplexNumber c1, ComplexNumber c3) {
    	  
    	  ComplexNumber result = new ComplexNumber(0, 0);
    	  result.real = c1.real + c3.real;
    	  result.imaginary = c1.imaginary + c3.imaginary;
    	  
    	  return result;
      }
}
