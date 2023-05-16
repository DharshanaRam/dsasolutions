public class FindOutlier{
    static int find(int[] integers){
      int result = 0;
      int even = 0;
      int odd = 0;
      if(integers[0]%2==0)even++;else odd++;
      if(integers[1]%2==0)even++;else odd++;
      if(integers[2]%2==0)even++;else odd++;
      boolean eve = false;
      if(even>odd){
        eve = true;
      }
      System.out.println(eve);
      for(int i : integers){
        System.out.println(i);
        if(eve && i%2!=0){
          result = i;
          break;
        }else if(!eve && i%2==0){
          result = i;
          break;
        }
      }
      return result;
    }

    public static void main(String[] args) {int[] exampleTest1 = {2,6,8,-10,3}; 
    int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 
    int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
    System.out.println("3 == " + FindOutlier.find(exampleTest1));//3
    System.out.println("206847684 == " +  FindOutlier.find(exampleTest2));
    System.out.println("0 == " +  FindOutlier.find(exampleTest3));
    }
  }
