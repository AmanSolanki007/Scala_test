object problem_1 extends App {

  def testing1(str:String):String = {
   if (str.length < 2) str
   else (str.substring(0,2))*4
  }
println(testing1("India"))
}
