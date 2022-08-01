object q4 {
  def matchInt(y:Int): String = {
    y match {
        case y if y <= 0 => "Negative/Zero"
        case y if y % 2 == 0 => "Even"
        case y if y % 2 != 0 => "odd"
    }        
  }
  def main(args: Array[String]) = {
    print("Enter the Integer: ")
    val input = scala.io.StdIn.readInt() 

    println(s"The Integer $input is ${matchInt(input)} Number")
  }
}