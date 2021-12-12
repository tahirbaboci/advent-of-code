object DayOneSonarSweep extends App

  def checkIncreaseOfDepth(masurements: List[Int], acc: Int, prev: Int): Int = 
    masurements match 
      case Nil => acc
      case h::tail => 
        if(h>prev)
        checkIncreaseOfDepth(tail, acc = acc + 1, h)
        else
          checkIncreaseOfDepth(tail, acc, h) 

  
