/*
Project: Solution of CodingBat Logic I lastDigit by using Java.
Date: 10.04.2020
Author: OzlemKorpe
*/
/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
*/
public boolean lastDigit(int a, int b, int c) {
  if(a%10 == b%10 || a%10 == c%10 || c%10 == b%10 ){
    return true;
  } return false;
}
