/*
            SAMPLE ASSESSMENT2_2  
    } */
    public class sharePoint{

      public static String checkPoint(int width, int height, int tile1, int tile2){
        int row1 = (tile1 - 1) / width;
        int row2 = (tile2 - 1) / width;
        int col1 = (tile1 - 1) % width;
        int col2 = (tile2 - 1) % width;
        if (((row2-row1==1)||(row2-row1==-1))&&(col2-col1==0)){//tiles share an edge
          return "not point";
        }
        else if ((col2-col1==1||(col2-col1==-1))&&(row2-row1==0)){
          return "not point";
        }
        else if (tile1 == tile2){
          return "not point";
        }
        else if((row1-row2==-1||row2-row1==-1)&&(col1-col2==-1||col2-col1==-1))//the tiles share just a point 
        {
            return "point";
        }
        else{
          return "not point";
        }
      }
    
      public static void main(String[] args){
        System.out.println("test1: " + checkPoint(1,1,1,1).equals("not point"));
        System.out.println("test2: " + checkPoint(1,2,1,1).equals("not point"));
        System.out.println("test3: " + checkPoint(1,2,1,2).equals("not point"));
        System.out.println("test4: " + checkPoint(1,2,2,1).equals("not point"));
        System.out.println("test5: " + checkPoint(1,2,2,2).equals("not point"));
        System.out.println("test6: " + checkPoint(2,1,1,1).equals("not point"));
        System.out.println("test7: " + checkPoint(2,1,1,2).equals("not point"));
        System.out.println("test8: " + checkPoint(2,1,2,1).equals("not point"));
        System.out.println("test9: " + checkPoint(2,1,2,2).equals("not point"));
        System.out.println("test10: " + checkPoint(2,2,1,2).equals("not point"));
        System.out.println("test11: " + checkPoint(2,2,1,3).equals("not point"));
        System.out.println("test12: " + checkPoint(2,2,1,4).equals("point"));
        System.out.println("test13: " + checkPoint(2,2,2,1).equals("not point"));
        System.out.println("test14: " + checkPoint(2,2,2,3).equals("point"));
        System.out.println("test15: " + checkPoint(2,2,2,4).equals("not point"));
        System.out.println("test16: " + checkPoint(2,2,3,1).equals("not point"));
        System.out.println("test17: " + checkPoint(2,2,3,2).equals("point"));
        System.out.println("test18: " + checkPoint(2,2,3,4).equals("not point"));
        System.out.println("test19: " + checkPoint(2,2,4,1).equals("point"));
        System.out.println("test20: " + checkPoint(2,2,4,2).equals("not point"));
        System.out.println("test21: " + checkPoint(2,2,4,3).equals("not point"));
        System.out.println("test22: " + checkPoint(2,3,1,2).equals("not point"));
        System.out.println("test23: " + checkPoint(2,3,1,3).equals("not point"));
        System.out.println("test24: " + checkPoint(2,3,1,4).equals("point"));
        System.out.println("test25: " + checkPoint(2,3,1,5).equals("not point"));
        System.out.println("test26: " + checkPoint(2,3,1,6).equals("not point"));
        System.out.println("test27: " + checkPoint(2,3,2,1).equals("not point"));
        System.out.println("test28: " + checkPoint(2,3,2,3).equals("point"));
        System.out.println("test29: " + checkPoint(2,3,2,4).equals("not point"));
        System.out.println("test30: " + checkPoint(2,3,2,5).equals("not point"));
        System.out.println("test31: " + checkPoint(2,3,2,6).equals("not point"));
        System.out.println("test32: " + checkPoint(2,3,3,4).equals("not point"));
        System.out.println("test33: " + checkPoint(2,3,3,5).equals("not point"));
        System.out.println("test34: " + checkPoint(2,3,3,6).equals("point"));
        System.out.println("test35: " + checkPoint(2,3,4,5).equals("point"));
        System.out.println("test36: " + checkPoint(2,3,4,6).equals("not point"));
        System.out.println("test37: " + checkPoint(2,3,5,6).equals("not point"));
        System.out.println("test38: " + checkPoint(3,2,1,2).equals("not point"));
        System.out.println("test39: " + checkPoint(3,2,1,3).equals("not point"));
        System.out.println("test40: " + checkPoint(3,2,1,4).equals("not point"));
        System.out.println("test41: " + checkPoint(3,2,1,5).equals("point"));
        System.out.println("test42: " + checkPoint(3,2,1,6).equals("not point"));
        System.out.println("test43: " + checkPoint(3,2,2,1).equals("not point"));
        System.out.println("test44: " + checkPoint(3,2,2,3).equals("not point"));
        System.out.println("test45: " + checkPoint(3,2,2,4).equals("point"));
        System.out.println("test46: " + checkPoint(3,2,2,5).equals("not point"));
        System.out.println("test47: " + checkPoint(3,2,2,6).equals("point"));
        System.out.println("test48: " + checkPoint(3,2,3,4).equals("not point"));
        System.out.println("test49: " + checkPoint(3,2,3,5).equals("point"));
        System.out.println("test50: " + checkPoint(3,2,3,6).equals("not point"));
        System.out.println("test51: " + checkPoint(3,2,4,5).equals("not point"));
        System.out.println("test52: " + checkPoint(3,2,4,6).equals("not point"));
        System.out.println("test53: " + checkPoint(2,3,5,6).equals("not point"));
    
      }
    
    }