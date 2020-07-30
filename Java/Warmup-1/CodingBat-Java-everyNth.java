/*
Project: Solution of CodingBat Warmup-1 everyNth by using Java.
Date: 30.07.2020
Author: OzlemKorpe
*/
/*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
*/

public String everyNth(String str, int n) {
  String toBeAdded ="";
  for(int i=1; i<str.length(); i++){
    if(i%n==0){
      toBeAdded = toBeAdded + str.charAt(i);
    }
  }
  return str.substring(0,1) + toBeAdded ;
}
