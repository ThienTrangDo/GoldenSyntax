open class Gegner(var name: String, var hp: Double, var level: Int) {

    var maxHp = hp
    var isKo = false

    fun loseHp(schaden: Double) {
        this.hp -= schaden

        println("$name hat einen Schaden von $schaden abbekommen.")
        println("Verbleibende Lebenspunkte: $hp / $maxHp")

        if (this.hp <= 0) {
            isKo = true
            println("Der Gegner $name hat keine Lebenspunkte mehr und ist k.o!")
        }
    }

    open var attackenListe: MutableList<String> = mutableListOf()
    open fun angriff(champion: MutableList<Champion>) {}
}

