import java.lang.NumberFormatException

var cart = 0.0

fun main() {
    var apple = Food("10/25/2022",false, "Fruit", "Apple", 1.20, false)
    var pineapple = Food("10/22/2022",true, "Fruit", "Pineapple", 4.30, true)
    var mango = Food("10/24/2022",true, "Fruit", "Mango", 1.35, true)
    var banana = Food("10/31/2022",false, "Fruit", "Banana", 2.50, false)
    var potato = Food("11/5/2022",false, "Vegetable", "Potato", 1.50, true)
    var cucumber = Food("10/27/2022",true, "Vegetable", "Cucumber", 2.35, false)
    var shirt = Clothing("Clothing", "Shirt", 12.50, false)
    var pants = Clothing("Clothing", "Pants", 14.25, true)
    var socks = Clothing("Clothing", "Socks", 8.50, false)
    var shoes = Clothing("Clothing", "Shoes", 25.60, true)


    try {
        var choice = 0

        var foodInventory: Array<Food> = arrayOf(apple, pineapple, mango, banana, potato, cucumber)
        var clothingInventory: Array<Clothing> = arrayOf(shirt, pants, socks, shoes)


        println("Welcome")
        do {

            print(
                "Please select a department:\n" +
                        "Foods: (1)\n" +
                        "Clothing: (2)\n" +
                        "Quit/Checkout: (3)\n" +
                        "Enter a number: "
            )
            choice = readln().toInt()
            if (choice == 1) {
                var foodChoice = 0
                var foodChoice2 = ""
                do {
                    print("Inventory:\n" +
                            "1) apple\n" +
                            "2) pineapple\n" +
                            "3) mango\n" +
                            "4) banana\n" +
                            "5) potato\n" +
                            "6) cucumber\n" +
                            "7) back\n" +
                            "Enter a number: ")
                    foodChoice = readln().toInt()
                    if (foodChoice != 7) {
                       foodInventory[foodChoice - 1].display()
                        print("Buy (y|n): ")
                        foodChoice2 = readln().toString()
                        if (foodChoice2 == "y") {
                            print("Quantity: ")
                            var qty = readln().toInt()
                            calc(qty, foodInventory[foodChoice - 1].price, foodInventory[foodChoice - 1].onSale)
                            println("Cart: $cart")
                        }
                    }

                } while (foodChoice != 7)
            }
            else if (choice == 2) {
                var clothingChoice = 0
                var clothingChoice2 = ""
                do {
                    print("Inventory:\n" +
                            "1) shirt\n" +
                            "2) pants\n" +
                            "3) socks\n" +
                            "4) shoes\n" +
                            "5) back\n" +
                            "Enter a number: ")
                    clothingChoice = readln().toInt()
                    if (clothingChoice != 5) {
                        clothingInventory[clothingChoice - 1].display()
                        print("Buy (y|n): ")
                        clothingChoice2 = readln().toString()
                        if (clothingChoice2 == "y") {
                            print("Quantity: ")
                            var qty = readln().toInt()
                            calc(qty, clothingInventory[clothingChoice - 1].price, clothingInventory[clothingChoice - 1].onSale)
                            println("Cart: $cart")
                        }
                    }

                } while (clothingChoice != 5)
            }
            else if (choice != 1 && choice != 2 && choice != 3) {
                println("Enter a valid number")
            }
            else
                print("Your total cost is: $$cart\n" +
                        "Thank you for shopping with us")

        } while (choice != 3)
    } catch (e: NumberFormatException) {
        println("ERROR: INVALID INPUT")
    }





}

fun calc(qty: Int, price: Double, onSale: Boolean){
   var p = 0.0
    if (onSale)
        p += price - (price * .2)
    else
        p = price
    p *= qty
    cart += p
}
