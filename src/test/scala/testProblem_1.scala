import org.scalatest.funsuite.AnyFunSuite

class testProblem_1 extends AnyFunSuite{

  test("string method test"){
    assert(problem_1.testing1("India")==="InInInIn")
    assert(problem_1.testing1("AMAN")==="AMAMAMAM")
  }
}
