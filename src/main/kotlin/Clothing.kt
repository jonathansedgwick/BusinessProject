class Clothing constructor(type: String, name: String, price: Double, onSale: Boolean): Item(name, price, onSale){

    var type: String = ""
        get() = field
        set(value) {
            field = value
        }

    init {
        this.type = type
    }

    fun display() {
        println("$name| $type, " +
                "Price: $price, On sale: $onSale")
    }



}