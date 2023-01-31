open class Champion (var name: String, var hp: Int, var mana: Int, var amor: Int) {

    fun loseHp(schaden: Int){
        this.hp -= schaden
        if (this.hp <= 0){
            println("Der Champion $name hat keine Lebenspunkte mehr und ist k.o!")
        } else {
            println("Der Champion $name hat noch $hp Lebenspunkte übrig.")
            println()
        }
    }

    open var faehigkeiten: MutableList <String> = mutableListOf()
    open fun angriff(){}




}
