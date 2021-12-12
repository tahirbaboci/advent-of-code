import org.junit.Test
import org.junit.Assert.*
import DayOneSonarSweep.*
import scala.io.Source

class DayOneSonarSweepTest:
  @Test def t1(): Unit = 
    val testData: List[Int] = Source.fromFile("src/test/scala/DayOneSonarSweepTestData.txt").getLines.map(_.toInt).toList
    val result = checkIncreaseOfDepth(testData, 0, testData.head)
    println(result)
    assertEquals(result, 1557)
