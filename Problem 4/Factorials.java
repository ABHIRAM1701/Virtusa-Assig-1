/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LEGION
 */
public class Factorials {
    
int fact (int n)
{
if (n <= 1) 
    return 1;
else 
    return (n*fact(n-1));
}
public static void main (String arg [ ])
{
int facta, factb, factc;
int a = 6, b = 7, c = 8;
Factorials f;
f = new Factorials ( );
facta = f.fact(a);
factb =f.fact (b);
factc = f.fact (c);
System.out.println("Factorial of" + a + "is" + facta);
System.out.println ("Factorial of "+ b + "is" + factb);
System.out.println("Factorial of "+ c + "is" + factc);
}
}


