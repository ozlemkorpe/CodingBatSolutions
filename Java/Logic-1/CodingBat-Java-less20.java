/*
Project: Solution of CodingBat Logic-1 less20 by using Java.
Date: 29.07.2020
Author: OzlemKorpe
*/
/*
Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod

less20(18) → true
less20(19) → true
less20(20) → false
*/

public boolean less20(int n) {
  if(n%20==19 || n%20==18){
    return true;
  } return false;
}
