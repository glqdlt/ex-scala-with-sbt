/**
  *
  * Created By iw.jhun
  * On 2018-05-24
  *
  */

import scala.io.StdIn.readLine
import java.io.{File, PrintWriter}

object Ex_9_5 {

  def main(args: Array[String]): Unit = {

    val fileName = "Ex_9_4_result.txt"
    var input = readLine("파일에 쓸 내용을 입력 : ")

    val writer = new PrintWriter(new File(fileName))

    writer.write(input)
    writer.close()

  }

}
