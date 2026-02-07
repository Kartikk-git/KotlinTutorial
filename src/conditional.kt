fun main()
{
    val x = 10
    val y = 10
    val z = if ( x + y == 20 ) 30 else 40

    if ( x > y)
    {
        println("x is greater than y")
    }
    else if ( x < y)
    {
        println("x is lesser than y")
    }
    else
    {
        println("x is equal to y")
    }
    println("The value of z is $z")
}
