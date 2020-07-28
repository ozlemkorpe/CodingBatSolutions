/*
Project: Solution of CodingBat Map-1 mapAB4 by using Java.
Date: 28.07.2020
Author: OzlemKorpe
*/
/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.


mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
*/

public Map<String, String> mapAB4(Map<String, String> map) {
  if(!map.containsKey("a") || !map.containsKey("b")){
    return map;
  }else if(map.get("a").length() == map.get("b").length()){
    map.put("a","");
    map.put("b","");
  }else if(map.get("a").length()>map.get("b").length() ){
    map.put("c",map.get("a"));
  }else if(map.get("b").length() >map.get("a").length()){
    map.put("c",map.get("b"));
  } return map;
}