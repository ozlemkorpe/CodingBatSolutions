/*
Project: Solution of CodingBat Logic I nearTen by using Java.
Date: 10.04.2020
Author: OzlemKorpe
*/
/*

Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. 
nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
*/
public boolean nearTen(int num) {
  if(num%10==2 || num%10==1 || num%10==0 || num%10==9 || num%10 ==8 ){
    return true;
  } return false;
}
