public class isCenter {

public static String checkCenter(int width, int height, int tile){


int row, column;
row = (tile - 1)/width;
column = (tile - 1) % width;
int centerRow=height/2;
int centerColumn=width/2;

//center in middle --> odd
if ((height%2 == 1) &&(width%2 == 1 ))
{
if ((row == centerRow) && (column == centerColumn))
{
return "center";
}
}

//center is 4 tiles --> even
if ((height%2 == 0) &&(width%2 == 0 ))
{
if ((row == centerRow -1 || row == centerRow) && (column == centerColumn|| column == centerColumn-1))
{
return "center";
}

}

//center is 2 tiles odd x even
if ((height%2 == 1) &&(width%2 == 0))
{
if ((row == centerRow) && ((column==centerColumn) || (column==centerColumn-1)))
{
return "center";
}
}

//center is 2 tiles even x odd
if ((height%2 == 0) &&(width%2 == 1 ))
{

if ((column==centerColumn) && ((row == centerRow) || (row==centerRow-1)))
{
return "center";
}
}

return "not center";
}

public static void main(String[] args){
    System.out.println("test1: " + checkCenter(1,1,1).equals("center"));
    System.out.println("test2: " + checkCenter(1,2,1).equals("center"));
    System.out.println("test3: " + checkCenter(1,2,2).equals("center"));
    System.out.println("test4: " + checkCenter(2,1,1).equals("center"));
    System.out.println("test5: " + checkCenter(2,1,2).equals("center"));
    System.out.println("test6: " + checkCenter(2,2,1).equals("center"));
    System.out.println("test7: " + checkCenter(2,2,2).equals("center"));
    System.out.println("test8: " + checkCenter(2,2,3).equals("center"));
    System.out.println("test9: " + checkCenter(2,2,4).equals("center"));
    System.out.println("test10: " + checkCenter(2,3,1).equals("not center"));
    System.out.println("test11: " + checkCenter(2,3,2).equals("not center"));
    System.out.println("test12: " + checkCenter(2,3,3).equals("center"));
    System.out.println("test13: " + checkCenter(2,3,4).equals("center"));
    System.out.println("test14: " + checkCenter(2,3,5).equals("not center"));
    System.out.println("test15: " + checkCenter(2,3,6).equals("not center"));
    System.out.println("test16: " + checkCenter(3,2,1).equals("not center"));
    System.out.println("test17: " + checkCenter(3,2,2).equals("center"));
    System.out.println("test18: " + checkCenter(3,2,3).equals("not center"));
    System.out.println("test19: " + checkCenter(3,2,4).equals("not center"));
    System.out.println("test20: " + checkCenter(3,2,5).equals("center"));
    System.out.println("test21: " + checkCenter(3,2,6).equals("not center"));
    System.out.println("test22: " + checkCenter(3,3,1).equals("not center"));
    System.out.println("test23: " + checkCenter(3,3,2).equals("not center"));
    System.out.println("test24: " + checkCenter(3,3,3).equals("not center"));
    System.out.println("test25: " + checkCenter(3,3,4).equals("not center"));
    System.out.println("test26: " + checkCenter(3,3,5).equals("center"));
    System.out.println("test27: " + checkCenter(3,3,6).equals("not center"));
    System.out.println("test28: " + checkCenter(3,3,7).equals("not center"));
    System.out.println("test29: " + checkCenter(3,3,8).equals("not center"));
    System.out.println("test30: " + checkCenter(3,3,9).equals("not center"));
    System.out.println("test31: " + checkCenter(3,4,1).equals("not center"));
    System.out.println("test32: " + checkCenter(3,4,2).equals("not center"));
    System.out.println("test33: " + checkCenter(3,4,3).equals("not center"));
    System.out.println("test34: " + checkCenter(3,4,4).equals("not center"));
    System.out.println("test35: " + checkCenter(3,4,5).equals("center"));
    System.out.println("test36: " + checkCenter(3,4,6).equals("not center"));
    System.out.println("test37: " + checkCenter(3,4,7).equals("not center"));
    System.out.println("test38: " + checkCenter(3,4,8).equals("center"));
    System.out.println("test39: " + checkCenter(3,4,9).equals("not center"));
    System.out.println("test40: " + checkCenter(3,4,10).equals("not center"));
    System.out.println("test41: " + checkCenter(3,4,11).equals("not center"));
    System.out.println("test42: " + checkCenter(3,4,12).equals("not center"));
    System.out.println("test43: " + checkCenter(4,3,1).equals("not center"));
    System.out.println("test44: " + checkCenter(4,3,2).equals("not center"));
    System.out.println("test45: " + checkCenter(4,3,3).equals("not center"));
    System.out.println("test46: " + checkCenter(4,3,4).equals("not center"));
    System.out.println("test47: " + checkCenter(4,3,5).equals("not center"));
    System.out.println("test48: " + checkCenter(4,3,6).equals("center"));
    System.out.println("test49: " + checkCenter(4,3,7).equals("center"));
    System.out.println("test50: " + checkCenter(4,3,8).equals("not center"));
    System.out.println("test51: " + checkCenter(4,3,9).equals("not center"));
    System.out.println("test52: " + checkCenter(4,3,10).equals("not center"));
    System.out.println("test53: " + checkCenter(4,3,11).equals("not center"));
    System.out.println("test54: " + checkCenter(4,3,12).equals("not center"));

  }

}