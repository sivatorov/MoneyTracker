package ru.sivatorov.moneytracker

class Record {
    private final var title: String = ""
    private final var price: Int = 0
    private var comment: String = ""

    constructor(title: String, price: Int) {
        this.title = title
        this.price = price
    }

    public fun getTitle() : String {
        return title
    }

    public fun getPrice() : Int {
        return price
    }

    public fun getComment() : String {
        return comment
    }
}