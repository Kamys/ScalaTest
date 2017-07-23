/**
  * Created by HNKNTOC on 19.07.2017.
  */
object Main extends App {





  def JustDoIt(): String = {
    val a = "Just "
    val y = "do it"
    a+y
  }

  /**
    * Start main.
    *
    * @param args args
    */
  override def main(args: Array[String]) {
    //chapter1()
    //chapter2()
    //chapter3()

    println(JustDoIt())
  }

  /**
    * Переменные, значения и типы.
    */
  def chapter1(): Unit = {
    var hello = "Hello World!!"
    val finalHello = "HELLO!! =)"

    var foo: Int = 25
    var number: Int = 5

    //finalHello = "Hi!"

    println(foo + number);
    println(hello + "  " + finalHello);

    /* 1. точка с запятой не обязательна;
    2. указания типа переменной необязательно;
    3. ключевое слово public подразумевается по умолчанию.*/

    /* Также в Scala нет, как таковых, примитивных типов (int, float, boolean и т.д.).
    Их заменяют соответствующие классы Int, Float, Boolean и т.д.*/

    /*Любая переменная — экземпляр какого-либо класса. Иерархия классов начинается с Any*/
  }

  /**
    * Функции, анонимные функции, методы
    */
  def chapter2() {


    def addOne(a: Int) = a + 1

    var x = 5

    var y = addOne(x)

    println("x = " + x + ", " + "y = " + y)

    /*  Как видно на примере, необязательны не только точка с запятой и указание типа,
        но и фигурные скобки вокруг единственного выражения и слово return.
        Более того, его использование считается плохой практикой.
        Из функции возвращается значение последней выполненной команды.*/

    /*На самом деле, функция — это тоже объект.
      Каждая функция в Scala — это экземпляр класса Function, у которого есть метод apply.
      Поэтому мы вполне можем записать так (знак подчеркивания ставится на место аргумента функции)*/

    val myDef = addOne _

    println("myDef = " + myDef.apply(7))


    /*Конечно, присутствуют анонимные функции (лямбда-функции). Они объявляются так:*/

    val f = (x: Int) => x + 1


    println("f = " + f(1))

  }

  /**
    * Классы и объекты
    *
    * @return
    */
  def chapter3(){
    class Foo(x: Int) {
      def bar(y: Int): Int = x + y
    }

    val foo = new Foo(1)

    foo.bar(1)

    //Go in Example

    UseMyUselessClass();
  }

  def UseMyUselessClass(): Unit ={
    // Первый конструктор, обратите внимание на отсутствие 'new',
    // так как это на самом деле вызов метода 'apply'
    val myUselessObject = MyUselessClass(1)

    // аналогично предыдущему варианту
    val myAnotherUselessObject = MyUselessClass.apply(1)

    // Третий конструктор
    val myThirdUselessObject = MyUselessClass(1, 2, 3)

    // Вызов метода
    myUselessObject.instanceMethod()
    // res6: Int = 16

    // Поля доступны также, как методы
    myUselessObject.mutableField
    // res7: Int = 2
    myUselessObject.immutableField
    // res8: Int = 1
    myUselessObject.mutableField = 9
    myUselessObject.mutableField
    // res9: Int = 9

    // Вызов статического метода
    MyUselessClass.staticMethod(3)
    // res10: Int = 8
  }
}
