open class Gegner (var name: String, var hp: Int) {

    fun loseHp(schaden: Int){
        this.hp -= schaden
        if (this.hp <= 0){
            println("Der Gegner $name hat keine Lebenspunkte mehr und ist k.o!")
        } else {
            println("Der Gegner $name hat noch $hp Lebenspunkte übrig.")
            println()
        }
    }
}
