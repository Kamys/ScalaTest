/**
  * Created by HNKNTOC on 23.07.2017.
  */
object MyUselessClass {
  def staticMethod(x: Int) = x + 5

  def apply(immutableField: Int): MyUselessClass =
    new MyUselessClass(immutableField, 2)

  def apply(immutableField: Int, mutableField: Int): MyUselessClass =
    new MyUselessClass(immutableField, mutableField)

  def apply(immutableField: Int, mutableField: Int, privateField: Int): MyUselessClass =
    new MyUselessClass(immutableField, mutableField, privateField)
}

class MyUselessClass(val immutableField: Int, var mutableField: Int, privateField: Int = 8 /*значние по умолчанию*/) {
  def instanceMethod() = {
    val sumOfFields = immutableField + mutableField + privateField
    MyUselessClass.staticMethod(sumOfFields)
  }
}
