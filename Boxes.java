/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LEGION
 */
public class Boxes {
    private int length;
private int breadth;
public Boxes ( )
{
length =0;
breadth =0;
}
public Boxes (int x, int y)
{
length = x;
breadth =y;
}
public void setval (int x, int y)
{
length = x;
breadth = y;
public int area ( )
{
return (length * breadth);
}
}
class Box3d extends Boxes
{
private int height;
public Box3d ( )
{
super ( );
height = 0;
}
public Box3d(int x, int y, int z)
{
super (x, y);
height = z;
}
public void setval (int x, int y, int z)
{
super.setval(x, y);
height = z;
}
public int volume ( )
{
return (super.area ( ) * height );
}
public static void main(String arga [ ])
{
Boxes b1 = new Boxes ( );
Box3d b2 = new Box3d(12,34,18);
b1.setval (25,30);

System.out.println ("The area of b1 is : " + b1.area( ) );
System.out.println ("The volume of b2 is : "+ b2.volume ( ));
}

}
