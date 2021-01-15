public class reverse {
      public static void main(String args[]){
          int num=0;
          num=num+Integer.parseInt(args[0]);
          int reverse=0;
          while(num!=0){
              reverse = reverse*10 +num%10;
              num= num/10;
          }
          System.out.println("Reverse of digit: " +reverse);
      }
}
