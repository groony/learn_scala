var a = 1
a += 50
a = a / 5
println(a)


var b = "test"
b += " world!"
println(b)

class Animal {
  def name : String = {
    "Dog"
  }
}
var animal = new Animal
println(animal.name)

def lowerCase(s: String) : String = {
  s.toLowerCase
}

println(lowerCase("DOG LOCK DOG"))


var plus = (x: Int) => x + 500
println(plus(300))

object MyObject {
  private var counter = 0

  def incr() : Int = {
    counter += 1
    counter
  }
}

println(MyObject.incr())
println(MyObject.incr())
println(MyObject.incr())
println(MyObject.incr())
println(MyObject.incr())



trait Greeter {
  def greet(name: String): Unit = {
    println("Hello, " + name + "!")
  }
}

class Vasya extends Greeter

var vasya = new Vasya
vasya.greet("Max")