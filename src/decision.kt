fun main() {
    isOdd()
    var names=nameArray("geradine","belyse","Chantal")
    println(names)
    robort(4)
    robort(13)
    robort(26)
    product(9)
    product(10)
    product(15)

}
fun isOdd(){
    for (x in 1..100){
        if (x%2!=0){
            println(x)
        }

    }
}
fun nameArray(name1:String,name2:String,name3:String):String {
    var names = arrayOf(name1, name2, name3)
    for (name in names) {
        if (name.length > 5) {
            return name
        }
    }
}
fun robort(age: Int) {
    if (age < 6) {
        println("Serve a glass of milk")
    } else if (age < 15 && age > 6) {
        println("Serve a bottle of fanta")
    } else {
        println("Serve a bottle of cococola")
    }
}
fun product(a:Int):Int {
    for (a in 1..100) {
        if (a * 3 == 0) {
            println("Fizz")
        }
    }
    for (a in 1..100) {
        if (a * 5 == 0) {
            println("Buzz")

        }
        if (a * 3 == 0 && a * 5 == 0) {
            println("FizzBuzz")
        }
    }
