fun main(){
    var a : Int = 10
    var b = 20

    var c = a + b
    println("The result is $c")

    a += 10
    var d = 30

    println("The result is ${a + d}")

    var var1 : Float = 20F
    var var2 = 8F

    println("var1 / var2 = ${var1/var2}")

    var var3 : Double = 21.22222212121
    println("result of var3 / var2 is ${var3/var2}")

    var str : String = "Hello "
    var str1 = "World"

    println(str + str1 )
    println(str.length)
    println(str.lowercase())
    println(str.uppercase())
    println(str.reversed())
    println(str.uppercase().lowercase())

}
