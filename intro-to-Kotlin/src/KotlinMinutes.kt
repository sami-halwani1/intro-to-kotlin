fun main(){
    printHelloWorld()
    myVariables()
    stringDetails()
    ifStatements()
    collections()
    functionW_Input("Your Name")

    val person  = Person()
    person.updateHeight()
    person.updateWeight()
    person.getHeight()
    person.getWeight()

}

fun printHelloWorld(){
    println("Hello, World")
}

fun myVariables(){
    val firstName: String = "Sami"
    val LastName = "Halwani"
    val fullName = firstName + " " +  LastName
    println("This is a variable " + fullName )
    println("This is a passed in variable $fullName")

    var weight =  160
    println( "Your Current weight is "+ weight)
    weight = 210
    println( "Your weight was  "+ weight)
}

fun stringDetails(){
    val myString = "KOTLIN"
    println(myString[0])
    println(myString[1])

    println(myString.isEmpty())
    println(myString.length)

    println(myString.substring(2,5))
}

fun ifStatements(){
    val code = 88
    if (code > 70){
        println("passed")
    }else {
        println("failed")
    }
}

fun collections(){
    val names = listOf("Name1", "Name2", "Name3") //Immutable
    println(names[2])

    val updatedNames = mutableListOf("Name1", "Name2", "Name3")
    updatedNames.add("Name4")

    for (name in updatedNames){
        println(name)
    }

    for (i in 1 until 5) {
        println(i)
    }
}

fun functionW_Input( name: String){
    println("This is your Name: $name")
}


class Person(){
    private var height: Double? = null
    private var weight: Double? = null

    fun updateWeight(){
        println()
        print("Weight: ")
        this.weight = readln().toDoubleOrNull()
    }
    fun updateHeight(){
        println()
        print("Height: ")
        this.height = readln().toDoubleOrNull()
    }
    fun getWeight(){
        println("height is ${this.weight}")
    }
    fun getHeight(){
        println("height is ${this.height}")
    }
}