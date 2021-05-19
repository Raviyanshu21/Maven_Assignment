class StringFunctions {
  def reverseString(count: String): String = {
    var temp = ""
    val n = count.length()
    for(i <- 0 until n){
      temp = temp.concat(count.charAt(n-i-1).toString)
    }
    temp
  }

  def length(newString : String): Int = {
    val len = newString.length()
    var count = 0
    for(i <- 0 until len)
    {
      count = count + 1
    }
    count
  }

}
