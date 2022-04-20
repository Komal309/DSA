public class Count_Num_Spaces_dig_others {
    public static void main(String[] args) {
      String line = " My name is 12345 Komal   !? " ;
      char[] ch = line.toCharArray();
      int letter = 0 ;
      int space = 0;
      int num = 0;
      int other = 0;
      for(int i=0;i<line.length();i++){
          if(Character.isLetter(ch[i])){
              letter++;
          }
          else if (Character.isDigit(ch[i])){
              num++;
          }
          else if (Character.isSpaceChar(ch[i])){
              space++;
          }
          else{
              other++;
          }
          System.out.println("The string is: My name is 12345 Komal   !? ");
          System.out.println("Letters are: "+ letter);
          System.out.println("Digits are: "+ num);
          System.out.println("Spaces are: "+ space);
          System.out.println("Others are: "+ other);
      }
    }
}
