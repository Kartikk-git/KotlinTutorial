fun main()
{
//    val x = readln()
//    println("The entered value is : $x")
//    println("we can also change it to integer")
//    println(x.toInt() + 20)

    val x = readlnOrNull()
    println("The entered value is : $x")

//  println(x.toInt())           //Error because there can be NULL value and we can't print that
//  println(x?.toInt())          //Also Error if there is NULL value
//  println(x?.toInt() + 20)     //Error because if its a NULL value then we cant add 20 to it
//  Therefore we have to check for NUll values

    if(x != null)
    {
       println(x.toInt() + 20)

    }


    print("Enter your age : ")
    val age = readln()
    if ( age.toInt() <= 18)
    {
        println("You are not an adult.")
    }
    else if (age.toInt() <= 50)
    {
        println("You are an adult.")
    }
    else
    {
        println("You are really old.")
    }

}