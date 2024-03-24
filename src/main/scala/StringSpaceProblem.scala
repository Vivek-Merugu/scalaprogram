
object StringSpaceProblem {

  def separatingWordsWithSpace(b: List[String], input1: String):String = {
    var result = ""
    var temp = ""
    var best = ""
    var z = 0
    while (z<input1.length){
      for(i<- z until(input1.length)){
        temp = temp + input1.charAt(i)
        for(j<-b){
          if(temp.equals(j)){
            best = temp
            z = i+1
          }
        }
      }

      if(best.length == 0){
        z=input1.length
      }

      if(best.length != 0){
        result = result + best + " "
        temp = ""
        best = ""
      }

    }
    return result
  }

  def main(args:Array[String]): Unit ={
    val b = List("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango")
    for(i<-b){
      println(i)
    }

    val input1 = "ilike";
    val input2 = "likei";
    val input3 = "ilikeilike";
    val input4 = "ilikeicecream";

    val result1 = separatingWordsWithSpace(b, input1)
    val result2 = separatingWordsWithSpace(b, input2)
    val result3 = separatingWordsWithSpace(b, input3)
    val result4 = separatingWordsWithSpace(b, input4)

    System.out.println(input1 + ": " + result1.trim)
    System.out.println(input2 + ": " + result2.trim)
    System.out.println(input3 + ": " + result3.trim)
    System.out.println(input4 + ": " + result4.trim)


  }

}
