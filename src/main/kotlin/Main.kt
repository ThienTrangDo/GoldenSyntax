fun main() {

    greeting()

    var jinx = Jinx("Jinx", 30, 30.0)
    var amumu = Amumu("Amumu", 30, 70.0)
    var caitlyn = Caitlyn("Caitlyn", 30, 80.0)

    var championListe = mutableListOf(jinx, amumu, caitlyn)

    var baron = BaronNashor("Baron Nashor", 100.0, 80)
    var vasalle = Vasallen("Vasalle", 100.0, 25)

    var gegnerListe = mutableListOf(baron, vasalle)

    println("Deine 3 Champions stehen fest:")
    Thread.sleep(1000)
    println("🔸Die schiesswütige '${jinx.name}' = Hp:${jinx.hp}, Level:${jinx.level}.")
    println("🔸Die traurige Mumie '${amumu.name}' = Hp:${amumu.hp}, Level:${amumu.level}.")
    println("🔸Die Sheriffin '${caitlyn.name}' = Hp:${caitlyn.hp}, Level:${caitlyn.level}.")
    Thread.sleep(1000)
    println()
    println("🔹Der Gegner ist ${baron.name} mit einem Level von ${baron.level} und einem HP-Wert von ${baron.hp}.")
    println("🔹Er hat einen Vasallen hinter sich mit einem HP-Wert von ${vasalle.hp}.")
    println()
    Thread.sleep(1000)

    println("Euer Kampf beginnt jetzt:")

    fight(jinx, caitlyn, amumu, baron, vasalle, gegnerListe, championListe)
}