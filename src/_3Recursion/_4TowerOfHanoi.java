package _3Recursion;

public class _4TowerOfHanoi {
    public static void main(String[] args) {
        int disk=3;
        tower(disk,"S","H","D");
    }
    static void tower(int disk,String src,String help,String dest){
          if(disk==1) {
            System.out.println("Transfer diskz "+disk + " from " + src + "to " + dest);
            return;
        }
        tower(disk-1,src,dest,help);
        System.out.println("Transfer disk "+disk + " from " +src+ "to "+ dest);
        tower(disk-1,help,src,dest);
    }
}
