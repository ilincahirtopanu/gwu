package quiz2;

public class find {

public static int findQuadrant(int width, int height, int tile){

int row = (tile - 1) / width;
int column = (tile - 1) % width;
int quadrant=0;

if (width %2 == 1)
{
width+=1;
}

if (height %2 == 1)
{
height+=1;
}

if (row < height/2 && column < width/2)
{
quadrant = 1 ;
}

else if (row < height/2 && column >= width/2)
{
quadrant = 2 ;

}

else if (row >= height/2 && column < width/2)
{
quadrant = 3 ;

}

else if (row >= height/2 && column >= width/2)
{
quadrant = 4 ;

}
return quadrant;
}
public static void main(String[] args){
    System.out.println("test1: " + (findQuadrant(1,1,1) == 1));
    System.out.println("test2: " + (findQuadrant(1,2,1) == 1));
    System.out.println("test3: " + (findQuadrant(1,2,2) == 3));
    System.out.println("test4: " + (findQuadrant(2,1,1) == 1));
    System.out.println("test5: " + (findQuadrant(2,1,2) == 2));
    System.out.println("test6: " + (findQuadrant(2,2,1) == 1));
    System.out.println("test7: " + (findQuadrant(2,2,2) == 2));
    System.out.println("test8: " + (findQuadrant(2,2,3) == 3));
    System.out.println("test9: " + (findQuadrant(2,2,4) == 4));
    System.out.println("test10: " + (findQuadrant(2,3,1) == 1));
    System.out.println("test11: " + (findQuadrant(2,3,2) == 2));
    System.out.println("test12: " + (findQuadrant(2,3,3) == 1));
    System.out.println("test13: " + (findQuadrant(2,3,4) == 2));
    System.out.println("test14: " + (findQuadrant(2,3,5) == 3));
    System.out.println("test15: " + (findQuadrant(2,3,6) == 4));
    System.out.println("test16: " + (findQuadrant(3,2,1) == 1));
    System.out.println("test17: " + (findQuadrant(3,2,2) == 1));
    System.out.println("test18: " + (findQuadrant(3,2,3) == 2));
    System.out.println("test19: " + (findQuadrant(3,2,4) == 3));
    System.out.println("test20: " + (findQuadrant(3,2,5) == 3));
    System.out.println("test21: " + (findQuadrant(3,2,6) == 4));
    System.out.println("test22: " + (findQuadrant(3,3,1) == 1));
    System.out.println("test23: " + (findQuadrant(3,3,2) == 1));
    System.out.println("test24: " + (findQuadrant(3,3,3) == 2));
    System.out.println("test25: " + (findQuadrant(3,3,4) == 1));
    System.out.println("test26: " + (findQuadrant(3,3,5) == 1));
    System.out.println("test27: " + (findQuadrant(3,3,6) == 2));
    System.out.println("test28: " + (findQuadrant(3,3,7) == 3));
    System.out.println("test29: " + (findQuadrant(3,3,8) == 3));
    System.out.println("test30: " + (findQuadrant(3,3,9) == 4));
    System.out.println("test31: " + (findQuadrant(3,4,1) == 1));
    System.out.println("test32: " + (findQuadrant(3,4,2) == 1));
    System.out.println("test33: " + (findQuadrant(3,4,3) == 2));
    System.out.println("test34: " + (findQuadrant(3,4,4) == 1));
    System.out.println("test35: " + (findQuadrant(3,4,5) == 1));
    System.out.println("test36: " + (findQuadrant(3,4,6) == 2));
    System.out.println("test37: " + (findQuadrant(3,4,7) == 3));
    System.out.println("test38: " + (findQuadrant(3,4,8) == 3));
    System.out.println("test39: " + (findQuadrant(3,4,9) == 4));
    System.out.println("test40: " + (findQuadrant(3,4,10) == 3));
    System.out.println("test41: " + (findQuadrant(3,4,11) == 3));
    System.out.println("test42: " + (findQuadrant(3,4,12) == 4));
    System.out.println("test43: " + (findQuadrant(4,3,1) == 1));
    System.out.println("test44: " + (findQuadrant(4,3,2) == 1));
    System.out.println("test45: " + (findQuadrant(4,3,3) == 2));
    System.out.println("test46: " + (findQuadrant(4,3,4) == 2));
    System.out.println("test47: " + (findQuadrant(4,3,5) == 1));
    System.out.println("test48: " + (findQuadrant(4,3,6) == 1));
    System.out.println("test49: " + (findQuadrant(4,3,7) == 2));
    System.out.println("test50: " + (findQuadrant(4,3,8) == 2));
    System.out.println("test51: " + (findQuadrant(4,3,9) == 3));
    System.out.println("test52: " + (findQuadrant(4,3,10) == 3));
    System.out.println("test53: " + (findQuadrant(4,3,11) == 4));
    System.out.println("test54: " + (findQuadrant(4,3,12) == 4));

}

}