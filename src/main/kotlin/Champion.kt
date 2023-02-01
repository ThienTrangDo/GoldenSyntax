open class Champion (var name: String, var level: Int, var hp: Int, var mana: Int, var amor: Int) {

    fun loseHp(schaden: Int){
        this.hp -= schaden

        println("${this.name} hat ein Schaden von $schaden bekommen.")
        println("Verbleibende Lebenspunkte: ${this.hp}/$hp")

        if (this.hp <= 0){
            println("Der Champion $name hat keine Lebenspunkte mehr und ist k.o!")
        }
    }

    open var faehigkeitenListe: MutableList <String> = mutableListOf()
    open fun angriff(gegner: List<Gegner>){}

}
