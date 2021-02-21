import scala.util.Random.nextInt

object SetOperations extends App {

  println("Set operations")
  val r = new scala.util.Random(100) //  100 is a seed for pseudo random generator
  val mySet = Set(1,2,3,3,3,5,2,3,6,2)
  println(mySet)
  // sets have only unique values
  val randomNums = (1 to 30).map (_ => nextInt(20)) // it could be added toSet.toSeq.sorted here
  println(randomNums)
  val uniqueNums = randomNums.toSet
  println(uniqueNums)
  val sortedUniqueNumSeq = uniqueNums.toSeq.sorted
  println(sortedUniqueNumSeq)

  val someNum = scala.util.Random.nextInt(50) // without original Random(100) we will get truly random nums
}
