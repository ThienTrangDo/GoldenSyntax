open class Gegner(var name: String, var hp: Double, var level: Int) {

    var isKo = false
    var maxHp = hp

    fun loseHp(schaden: Double) {
        this.hp -= schaden
        println("Der $name hat einen Schaden von $schaden abbekommen.")
        println("Verbleibende Lebenspunkte von $name: $hp / $maxHp")
        if (this.hp <= 0) {
            isKo = true
            println("🚩Der Gegner 🔹$name hat keine Lebenspunkte mehr und ist k.o!")
        }
    }

    open var attackenListe: MutableList<String> = mutableListOf()
    open fun angriff(champion: MutableList<Champion>) {}
}