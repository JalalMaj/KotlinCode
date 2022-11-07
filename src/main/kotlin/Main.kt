fun main(args: Array<String>) {
    /*  println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
  */
    //VARIABLES - var is a mutable variable while val is an immutable variable
    var age: Int =
        38 // You shouldn't specify the type as Kotlin will recognize it so you can write var age = 38 instead
    var favSport = "Swimming" // Kotlin will be recognizing that this variable is a string
    var name = "Jalal"
    // To combine string with input variables
    println("Hello there, My name is $name and I am $age years old. My favorite sport is $favSport")

    // Math & Comments
    /*
    Line comment is double / and many lines will be between /* ....... */
     */
    println("--------------------------------------------- \n -----------------------------------------------------\n")
    var radius: Double = 5.5
    var pi: Double = 3.14
    var c: Double = radius * pi * 2
    println(" The circumference of a circle with radius $radius cm will be $c cm")

    // To convert the double to int and take the round value -----
    println("To convert the double to int and take the round value then use convert function the variable.to")
    println("The circumference of the circle will be ${c.toInt()}")
    /*
    How to use += & -=
    var += 10 is var = var + 10
    var -=10 is var = var - 10
     */
    println("--------------------------------------------- \n -----------------------------------------------------\n")
    // Boolean & Condition Statements
    println("Boolean & Condition Statements ")
    var isDogAlive: Boolean = false
    var dogAge: Int = 10
    // To combine two Conditions will be && or ||
    println("To combine two Conditions will be && or ||")
    if (isDogAlive && dogAge != 10) {
        println("The dog is alive and its age is not 10 years")
    } else {
        println(" The dog is dead and its age is 10 years old")
    }

    if (isDogAlive || dogAge == 10) {
        println("The dog is alive = $isDogAlive & its age is $dogAge years")
    } else {
        println("None of the conditions are correct")
    }

    // Lists & Arrays
    println("--------------------------------------------- \n -----------------------------------------------------\n")
    println("How to use Arrays and Lists")
    var luckyNumbers = arrayOf<Int>(1, 2, 3, 4)
    var luckyNos = mutableListOf<Int>(6, 634, 63, 6)
    luckyNos.add(4, 66)
    for (no in luckyNos) {
        println(no)
    }
    if (luckyNos[4] == 66) {
        luckyNos[4] = 4
    } else {
        luckyNos[4] = luckyNos[1]
    }
    for (number in luckyNos) {
        println(number)
    }

    var favoriteName: List<String> = listOf("Jalal", "Shatha", "Ayla", "Jalal")

    // For loops
    println("--------------------------------------------- \n -----------------------------------------------------\n")
    println("For Loops")
    for (x in 1..10) {
        println("The item $x is $x")
    }

    // to print the list index and value of each item in the list or array
    println("--------------------------------------------- \n -----------------------------------------------------\n")
    println("to print the list index and value of each item in the list or array ")

    for ((index, value) in favoriteName.withIndex()) {
        println("The item $index is $value")
    }
    var x = 0
    for (favN in favoriteName) {
        x += 1
        println("The item $x is $favN")
    }

    println("--------------------------------------------- \n -----------------------------------------------------\n")
    println("Print out the odd number between 1 and 100 by using Module (%)")
    for (x in 1..100) {
        if (x % 2 == 1) {  // Module
            print("$x-")
        }
    }

    // Maps (Mutable & immutable)
    println("--------------------------------------------- \n -----------------------------------------------------\n")
    println("Maps of and different between mutable and immutable \n Mutable can edit and add to but immutable one can't")
    var employees = mutableMapOf("Moustafa" to 101, "Jalal" to 102, "Prince" to 103, "Osama" to 104)
    employees["Alpha"] = 105

    println(" How to loop through the map and printout the key and the value \n ------------------------------")
    employees.forEach { k, v ->
        println("$k = $v")
    }

    val filteredEmployee = employees.filterValues { it <= 105 }
    println("Employees with employee ID less than: $filteredEmployee")

    println("--------------------------------------------- \n -----------------------------------------------------\n")
    println("Hash Map")

    val items = HashMap<String, Int>()
    items["A"] = 10
    items["B"] = 20
    items["C"] = 30

    println("-- Example 1 -- \n $items");

    //for loop
    println("\n-- Example 1.1 -- ");
    for ((k, v) in items) {
        println("$k = $v")
    }

    //for loop + lambdas filter
    println("\n-- Example 1.2 --");
    for ((k, v) in items) {
        if (k == "C")
            println("Find by key 'C' : $k = $v")
    }

    //Actually, you can filter key like this
    println("\n-- Example 1.3 -- ");
    val filteredItems = items.filterKeys { it == "A" || it == "C" }
    println("Find by key == A or C : $filteredItems")

    //Or filter value like this
    println("\n-- Example 1.4 --");
    val filterItems2 = items.filterValues { it <= 20 }
    println("Find by value <=20 : $filterItems2")

    //Or just filters
    println("\n-- Example 1.5 --");
    val filterItems3 = items.filter { it.key == "B" && it.value == 20 }
    println("Find by key == 'B' and value == 20 : $filterItems3")

    val filterItem4 = items.filter { it.key == "C" && it.value == 30 }
    println("Find by key == 'C' and value == 30 : $filterItem4")

// Hash Map of
    println("Hash Map of and loop through")
    val items2 = hashMapOf("A" to 10, "B" to 20, "C" to 30)
    items2["D"] = 40

    println("\n -- Example 2.0 --")
    println(items2)
    // foreach example
    println("\n-- Example 2.1 --");
    items2.forEach { k, v ->
        println("$k = $v")
    }

    // foreach + filter
    println("\n-- Example 2.2 --");
    items2.forEach { k, v ->
        if (v == 10) {
            println("$k = $v")
        }
    }

    // using the special 'it' like this
    println("\n-- Example 2.3 --");
    items2.forEach { println("key : ${it.key}, value : ${it.value}") }

    val familyMember = hashMapOf("جلال" to "الأب" , "شذى" to "الأم", "آيلا" to "الإبنة" ,"حسان" to "الإبن")
    println(familyMember)

    val filteredMember = familyMember.filterValues { it=="الإبن" }
    println(filteredMember)

    //Functions and Classes
    println("Function & Classes")

    println("\n-- Example 3.0 --");
    fun addNumbers(num1:Int ,num2:Int) = num1 + num2
    println(addNumbers(1,2))

    println("\n-- Example 3.1--");
    fun addNumbers1(num1:Int ,num2:Int): Int {
        return num1 + num2
    }

    // Classes
    println("\n-- Example 4.0--");
    class Dog{
        var name = ""
        var  age = 0
    }
   var myDog = Dog()
    myDog.name ="Fido"
    myDog.age =10

    println(myDog.name + " " + myDog.age)

    println("\n-- Example 4.1--");
    class Dog1(var nameD:String , var ageD: Int){
        var name = nameD
        var age = ageD
    }
    var myDog1 = Dog1("Fido" , 10)

    println("My Dog name is ${myDog1.nameD} and its age is ${myDog1.age} ")

    println("\n-- Example 4.2--");

    class Dog2{
        var name2:String
        var age2:Int

        init {
            name2 = "Fido"
            age2 = 0
        }
    }
    var myDog2= Dog2()

    println("My Dog name is ${myDog2.name2} and its age is ${myDog2.age2} ")

    println("\n-- Example 4.3--");
    class Dog3{
        var name3:String
        var age3:Int

      constructor(name3:String , age3:Int){
          this.name3 = name3
          this.age3 =age3
      }
        fun dogInfo(){
            println("the name of the dag is $name3 , and it's age is $age3")
        }

    }
    var myDog3 =Dog3("Fido",5)
    myDog3.dogInfo()

    //Nullable

    println("Nullable")
    println("The nullable can be created by putting ? after the type and in this case will be the value can accept null")
    println("To remove the null then you should use a double ! mark after the variable !!")

    var nullPara:Int? = 1
    println(nullPara)

    var nullMap = mapOf("abc" to 1)
    println(nullMap["cde"])

    // Problem to be solved
//val trickArray = resultsArray(arrayOf("ab","ab","abc"), arrayOf("ab","abc","bc"))
//    println(trickArray)

}
//fun resultsArray(strings: Array<String> , queries: Array<String>):List<Int> {
//    var count: Int = 0
//    var temp: Int =0
//    var index = 0
//
//    var arrayRes = mutableListOf<Int>()
//
//    for (value in strings) {
//        for (x in queries) {
//            if (x == value) {
//                if (arrayRes.elementAt(index) !=0) {
//                    count = arrayRes.elementAt(index)
//                    count += 1
//                    arrayRes.removeAt(index)
//                    arrayRes.add(index, count)
//                } else {
//                    count += 1
//                    arrayRes.add(index, count)
//                }
//                temp = count
//                count = 0
//            }
//            index += 1
//
//        }
//    }
//    return arrayRes
//
//}


