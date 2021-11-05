object Practice {

  def removeCharString(input: String, position: Int): String = {
    val new_str = input.slice(0, position) + input.slice(position + 1, input.length)
    return new_str
  }

  def checkSubString(original: String, subString: String): Boolean = {
    original.contains(subString)
  }

  def removeDuplicates(input: String): String = {
    var output = ""
    for (ch <- input) {
      if (!output.contains(ch)) {
        output += ch
      }
    }

    return output
  }

  def maxOccurance(input: String): Char = {
    var maxCount: Map[Char, Int] = Map()

    var maxChar = input(0)

    for (ch <- input) {
      if (maxCount.contains(ch)) {
        val cur = maxCount(ch)
        maxCount += (ch -> (cur + 1))
        if (maxCount(ch) > maxCount(maxChar)) {
          maxChar = ch
        }
      } else {
        maxCount += (ch -> 1)
      }
    }

    return maxChar
  }

  def main(arg: Array[String]): Unit ={
    println(removeCharString("Hello", 0))
    println(checkSubString("Hello World!", "ell"))
    println("abdul".endsWith("ul"))
    println("Abdul".toUpperCase())
    println(removeDuplicates("2q34u923u4928402"))
    println(maxOccurance(("abdull ll ")))


  }

}
