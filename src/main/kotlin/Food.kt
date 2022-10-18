class Food constructor(exDate: String, isRefrig: Boolean, type: String, name: String, price: Double, onSale: Boolean): Item(name, price, onSale) {

    var exDate: String = ""
        get() = field
        set(value) {
            field = value
        }
    var isRefrig: Boolean = false
        get() = field
        set(value) {
            field = value
        }
    var type: String = ""
        get() = field
        set(value) {
            field = value
        }

    init{
        this.exDate = exDate
        this.isRefrig = isRefrig
        this.type = type
    }

    fun display() {
        println("$name| $type, Is refrigerated: $isRefrig, Expiration Date: $exDate\n" +
                "Price: $price, On sale: $onSale")
    }

}