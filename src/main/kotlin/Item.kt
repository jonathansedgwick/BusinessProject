open class Item constructor(name: String, price: Double, onSale: Boolean) {

    var name: String = ""
        get() = field
        set(value) {
            field = value
        }
    var price: Double = 0.0
        get() = field
        set(value) {
            field = value
        }
    var onSale: Boolean = false
        get() = field
        set(value) {
            field = value
        }

    init {
        this.name = name
        this.price = price
        this.onSale = onSale
    }



}