def countLetterOccurrences(words: List[String]): Int = {
  words.map(_.length).reduce(_ + _)
}

val input = List("apple", "banana", "cherry", "date")
val result = countLetterOccurrences(input)
println(s"Total count of letter occurrences: $result") // Output: Total count of letter occurrences: 21
