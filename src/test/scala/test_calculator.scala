import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.propspec.AnyPropSpec
import org.scalatest.wordspec.AnyWordSpec

class test_calculator extends AnyFunSuite{

  test("calculator test"){
    assert(calculator.addition(5,5)===10)
    assert(calculator.division(5,5)===1)
    assert(calculator.division(10,5)===2)
    assert(calculator.multiplication(5,5)===25)
  }
}

//Behavior based testing
class calculator_Spec extends AnyFunSpec{

  describe("multiplication"){
    it("should be zero if multiply by zero"){
      assert(calculator.multiplication(5646464,0)===0)
    }
  }

  describe("divition"){
    it("should be half if divide by 2 "){
      assert(calculator.division(10,2)===5)

    }
  }
}

//Testing using keyword

class Calculator_word extends  AnyWordSpec{
  "A calculator" should {
    "give back zero if multiply by 0" in {
      assert(calculator.multiplication(45645,0)===0)
    }
  }

  "A calculator" should {
    "give half if divide by 2" in {
      assert(calculator.division(10,2)===5)
    }
  }
}

// property spec
class calculatorPropSpec extends  AnyPropSpec{
  val cases = List((56456,0),(894864,0),(58464,0),(897897,0))

  property("calculator should give 0 if multiply by 0") {
    assert(cases.forall {
      case (a, b) => (calculator.multiplication(a, b) == 0)
    })
  }
}