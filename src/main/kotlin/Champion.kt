open class Champion(var name: String, var level: Int, var hp: Double) { //Konstruktor
    //Eigenschaften
    var isKo: Boolean = false
    var maxHp: Double = hp

    //Methoden
    fun loseHp(schaden: Double) {
        this.hp -= schaden
        println("Verbleibende Lebenspunkte von $name: $hp / $maxHp")

        if (this.hp <= 0) {
            isKo = true
            println("🚩Der Champion 🔸$name hat keine Lebenspunkte mehr und ist k.o!")
        }
    }
    //Offene Fähigkeitensliste
    open var faehigkeitenListe: MutableList<String> = mutableListOf()

    //Offene Methode Angriff
    open fun angriff(gegner: MutableList<Gegner>) {}
}
