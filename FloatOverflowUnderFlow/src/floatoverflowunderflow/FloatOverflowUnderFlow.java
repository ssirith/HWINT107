/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatoverflowunderflow;

/**
 *
 * @author SSirith
 */
public class FloatOverflowUnderFlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float myFloat;
        System.out.println("Floating Point Precision");
       myFloat =  1.23456789f;
        System.out.println(myFloat);
        myFloat = 12.23456789f;
        System.out.println(myFloat+"\n");
        
        System.out.println("Cancellation Error:");
        System.out.println(1 + 1.234e-5f - 1+"\n");
        
        System.out.println("Float Overflow");
        float highFloat = Float.MAX_VALUE;
        System.out.println("Max value : " + highFloat);
        System.out.println("High float multiply by 2 : " + highFloat*2+"\n");
        
        System.out.println("Float Underflow");
        float lowFloat = Float.MIN_VALUE;
        System.out.println("Min value : " + lowFloat);
        System.out.println("low float divide by 2 : " + lowFloat/2+"\n");
//        
        System.out.println("Infinity/Nan");
        float divFloat1  = (float)1/0;
        float divFloat2  = (float)0/0;
        float sqrtFloat  = (float) Math.sqrt(-1);
        System.out.println("divFloat 1 : "+divFloat1+"\t"+"dvFloat 2 : "+divFloat2+"\t"+"spqtFloat : "+sqrtFloat);
        if (Float.isNaN(divFloat1)){
            System.out.println("divFloat1 is NaN");
        }
        else{
            System.out.println("divFloat 2 is'n NaN");
        }
        if (Float.isNaN(divFloat2)){
            System.out.println("divFloat2 is Nan");
        }
        else{
            System.out.println("divFloat 2 is'n NaN");
        }
         if (Float.isNaN(sqrtFloat)){
            System.out.println("sqrtFloat is NaN");
        }
        else{
            System.out.println("sqrtFloat is'n NaN");
        }
    }
    
}
