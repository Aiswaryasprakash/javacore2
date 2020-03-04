import java.util.*;
class jcore1{
public static void main(String[] args){
int i = 2;
    while (i <= 150) {
      int j = 2;
      	while (j <= i) {
        if (i == j) {
          System.out.println(i);
        }
        if (i % j == 0) {

          break;
        }

        j++;
      }

         
      i++;
    }




}}







