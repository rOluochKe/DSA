class Solution:
  def mergedAlternatively(self, word1: str, word2: str) -> str:
    length = max(len(word1), len(word2))
    merged_string = ""

    for i in range(length):
      if i < len(word1):
        merged_string += word1[i]
      if i < len(word2):
        merged_string += word2[i]

    return merged_string