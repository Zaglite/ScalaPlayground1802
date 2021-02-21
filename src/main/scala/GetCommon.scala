

object GetCommon extends App {

  def getCommonElements(s1: Seq[Int], s2: Seq[Int], s3: Seq[Int]): Seq[Int] = {
    val s1 = Seq(1,4,7)
    val s2 = Seq(2,5,8)
    val s3 = Seq(3,6,9)
    val mySeq = (s1, s2, s3)
    println(mySeq)
    //TODO return sorted Sequence of common elements in all 3 sequences
    Seq(0)

  }

  //d//ef isPangram(text: String, alphabet : String = "abcdefghijklmnopqrstuvwxyz"): Boolean= {
    //TODO determine if the sentence contains all English letters
    //https://en.wikipedia.org/wiki/Pangram
    // (case is not important here)
    //this function should work on other languages too, if we pass it different alphabet
    false
  //}

  //val mySentence = readLine("Enter the sentence: ")
  //println() = mySentence.exists()

  //System.out.println(containsAllLetters);
  //println(isPangram("The five boxing wizards jump quickly.")) //should be true


}
