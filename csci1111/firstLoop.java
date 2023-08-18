public class firstLoop {

    public static String isFirstLoop(int width, int height, int tile1){
    
    int row = (tile1 - 1) / width;
    int column = (tile1 - 1) % width;
    
    
    if (row==0 || row== height - 1 || column == 0 || column == width-1)
    {
    return "no";
    }
    
    else if (row==1|| row == height-2 || column==1|| column == width-2)
    {
    return "yes";
    }
    
    return "no";
    
    }
    public static void main(String[] args){
        System.out.println("test1: " + isFirstLoop(1,1,1).equals("no"));
        System.out.println("test2: " + isFirstLoop(1,2,1).equals("no"));
        System.out.println("test3: " + isFirstLoop(1,2,2).equals("no"));
        System.out.println("test4: " + isFirstLoop(2,1,1).equals("no"));
        System.out.println("test5: " + isFirstLoop(2,1,2).equals("no"));
        System.out.println("test6: " + isFirstLoop(2,2,1).equals("no"));
        System.out.println("test7: " + isFirstLoop(2,2,2).equals("no"));
        System.out.println("test8: " + isFirstLoop(2,2,3).equals("no"));
        System.out.println("test9: " + isFirstLoop(2,2,4).equals("no"));
        System.out.println("test10: " + isFirstLoop(2,3,1).equals("no"));
        System.out.println("test11: " + isFirstLoop(2,3,2).equals("no"));
        System.out.println("test12: " + isFirstLoop(2,3,3).equals("no"));
        System.out.println("test13: " + isFirstLoop(2,3,4).equals("no"));
        System.out.println("test14: " + isFirstLoop(2,3,5).equals("no"));
        System.out.println("test15: " + isFirstLoop(2,3,6).equals("no"));
        System.out.println("test16: " + isFirstLoop(3,2,1).equals("no"));
        System.out.println("test17: " + isFirstLoop(3,2,2).equals("no"));
        System.out.println("test18: " + isFirstLoop(3,2,3).equals("no"));
        System.out.println("test19: " + isFirstLoop(3,2,4).equals("no"));
        System.out.println("test20: " + isFirstLoop(3,2,5).equals("no"));
        System.out.println("test21: " + isFirstLoop(3,2,6).equals("no"));
        System.out.println("test22: " + isFirstLoop(3,3,1).equals("no"));
        System.out.println("test23: " + isFirstLoop(3,3,2).equals("no"));
        System.out.println("test24: " + isFirstLoop(3,3,3).equals("no"));
        System.out.println("test25: " + isFirstLoop(3,3,4).equals("no"));
        System.out.println("test26: " + isFirstLoop(3,3,5).equals("yes"));
        System.out.println("test27: " + isFirstLoop(3,3,6).equals("no"));
        System.out.println("test28: " + isFirstLoop(3,3,7).equals("no"));
        System.out.println("test29: " + isFirstLoop(3,3,8).equals("no"));
        System.out.println("test30: " + isFirstLoop(3,3,9).equals("no"));
        System.out.println("test31: " + isFirstLoop(3,4,1).equals("no"));
        System.out.println("test32: " + isFirstLoop(3,4,2).equals("no"));
        System.out.println("test33: " + isFirstLoop(3,4,3).equals("no"));
        System.out.println("test34: " + isFirstLoop(3,4,4).equals("no"));
        System.out.println("test35: " + isFirstLoop(3,4,5).equals("yes"));
        System.out.println("test36: " + isFirstLoop(3,4,6).equals("no"));
        System.out.println("test37: " + isFirstLoop(3,4,7).equals("no"));
        System.out.println("test38: " + isFirstLoop(3,4,8).equals("yes"));
        System.out.println("test39: " + isFirstLoop(3,4,9).equals("no"));
        System.out.println("test40: " + isFirstLoop(3,4,10).equals("no"));
        System.out.println("test41: " + isFirstLoop(3,4,11).equals("no"));
        System.out.println("test42: " + isFirstLoop(3,4,12).equals("no"));
        System.out.println("test43: " + isFirstLoop(4,3,1).equals("no"));
        System.out.println("test44: " + isFirstLoop(4,3,2).equals("no"));
        System.out.println("test45: " + isFirstLoop(4,3,3).equals("no"));
        System.out.println("test46: " + isFirstLoop(4,3,4).equals("no"));
        System.out.println("test47: " + isFirstLoop(4,3,5).equals("no"));
        System.out.println("test48: " + isFirstLoop(4,3,6).equals("yes"));
        System.out.println("test49: " + isFirstLoop(4,3,7).equals("yes"));
        System.out.println("test50: " + isFirstLoop(4,3,8).equals("no"));
        System.out.println("test51: " + isFirstLoop(4,3,9).equals("no"));
        System.out.println("test52: " + isFirstLoop(4,3,10).equals("no"));
        System.out.println("test53: " + isFirstLoop(4,3,11).equals("no"));
        System.out.println("test54: " + isFirstLoop(4,3,12).equals("no"));
        System.out.println("test55: " + isFirstLoop(5,5,1).equals("no"));
        System.out.println("test56: " + isFirstLoop(5,5,2).equals("no"));
        System.out.println("test57: " + isFirstLoop(5,5,3).equals("no"));
        System.out.println("test58: " + isFirstLoop(5,5,4).equals("no"));
        System.out.println("test59: " + isFirstLoop(5,5,5).equals("no"));
        System.out.println("test60: " + isFirstLoop(5,5,6).equals("no"));
        System.out.println("test61: " + isFirstLoop(5,5,7).equals("yes"));
        System.out.println("test62: " + isFirstLoop(5,5,8).equals("yes"));
        System.out.println("test63: " + isFirstLoop(5,5,9).equals("yes"));
        System.out.println("test64: " + isFirstLoop(5,5,10).equals("no"));
        System.out.println("test65: " + isFirstLoop(5,5,11).equals("no"));
        System.out.println("test66: " + isFirstLoop(5,5,12).equals("yes"));
        System.out.println("test67: " + isFirstLoop(5,5,13).equals("no"));
        System.out.println("test68: " + isFirstLoop(5,5,14).equals("yes"));
        System.out.println("test69: " + isFirstLoop(5,5,15).equals("no"));
        System.out.println("test70: " + isFirstLoop(5,5,16).equals("no"));
        System.out.println("test71: " + isFirstLoop(5,5,17).equals("yes"));
        System.out.println("test72: " + isFirstLoop(5,5,18).equals("yes"));
        System.out.println("test73: " + isFirstLoop(5,5,19).equals("yes"));
        System.out.println("test74: " + isFirstLoop(5,5,20).equals("no"));
        System.out.println("test75: " + isFirstLoop(5,5,21).equals("no"));
        System.out.println("test76: " + isFirstLoop(5,5,22).equals("no"));
        System.out.println("test77: " + isFirstLoop(5,5,23).equals("no"));
        System.out.println("test78: " + isFirstLoop(5,5,24).equals("no"));
        System.out.println("test79: " + isFirstLoop(5,5,25).equals("no"));
    
      }
    
    }