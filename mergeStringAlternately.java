class Solution {
  public String mergedAlternatively(String word1, String word2) {
    int length = Math.max(word1.length(), word2.length());
    StringBuilder mergedString = new StringBuilder();

    for (int i = 0; i  < length; i++) {
      if (i < word1.length()) {
        mergedString.append(word1.charAt(i));
      }

      if (i < word2.length()) {
        mergedString.append(word2.charAt(i));
      }
    }
    return mergedString.toString();
  }
}


// test cases

// word1 = "abc", word2 = "pqr"
// word1 = "ab", word2 = "pqrs"
// word1 = "abcd", word2 = "pq"