import java.lang.NumberFormatException

fun main() {
    var apple = Food("10/25/2022",false, "Fruit", "Apple", 1.20, false)
    var pineapple = Food("10/22/2022",true, "Fruit", "Pineapple", 4.30, true)
    var mango = Food("10/24/2022",true, "Fruit", "Mango", 1.35, true)
    var banana = Food("10/31/2022",false, "Fruit", "Banana", 2.50, false)
    var potato = Food("11/5/2022",false, "Vegetable", "Potato", 1.50, true)
    var cucumber = Food("10/27/2022",true, "Vegetable", "Cucumber", 2.35, false)

    try {
        var choice = 0
        var cart = 0.0

        println("Welcome")
        do {

            print(
                "Please select a department:\n" +
                        "Foods: (1)\n" +
                        "Non-Foods: (2)\n" +
                        "Quit: (3)" +
                        "Enter a number: "
            )
            choice = readln()!!.toInt()
            if (choice == 1)
                print("")

        } while (choice != 3)
    } catch (e: NumberFormatException) {
        println("ERROR: INVALID INPUT")
    }
}