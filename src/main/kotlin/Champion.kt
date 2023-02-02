import java.util.function.DoublePredicate

open class Champion (var name: String, var level: Int, var hp: Double, var mana: Int, var amor: Int) {

    var isKo: Boolean = false
    var maxHp: Double = hp

    fun loseHp(schaden: Double){
        this.hp -= schaden
        println("Verbleibende Lebenspunkte von $name: $hp/$maxHp")

        if (this.hp <= 0){
            isKo = true
            println("Der Champion $name hat keine Lebenspunkte mehr und ist k.o!")
        }
    }

    open var faehigkeitenListe: MutableList <String> = mutableListOf()
    open fun angriff(gegner: MutableList<Gegner>){}

}
