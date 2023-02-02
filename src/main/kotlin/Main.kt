fun main (){

    println("🏴⚔️Willkommen bei Golden Syntax⚔️🏴")

    var jinx = Jinx("Jinx", 30, 2072.0, 1010, 100)
    var amumu = Amumu ("Amumu", 30,  2500.0, 967, 150)
    var caitlyn = Caitlyn ("Caitlyn", 30,2091.0, 908, 100)

    var championListe = mutableListOf(jinx, amumu, caitlyn)


    var baron = BaronNashor("Baron Nashor", 9000.0, 80)
    var vasalle1 = Gegner ("Vasalle 1", 750.0, 25)
    var vasalle2 = Gegner("Vasalle 2", 750.0, 25)
    var vasalle3 = Gegner("Vasalle 3", 750.0, 25)

    var gegnerListe = mutableListOf(baron, vasalle1, vasalle2, vasalle3)


    println("Die 3 Champions stehen fest:")
    println()
    println("🔸Die schiesswütige '${jinx.name}' = Hp:${jinx.hp}, Schutzschild:${jinx.amor}, Mana:${jinx.mana}.")
    println("🔸Die traurige Mumie '${amumu.name}' = Hp:${amumu.hp}, Schutzschild:${amumu.amor}, Mana:${amumu.mana}.")
    println("🔸Die Sheriffin '${caitlyn.name}' = Hp:${caitlyn.hp}, Schutzschild:${caitlyn.amor}, Mana:${caitlyn.mana}.")
    println()
    println("🔹Der Gegner ist ${baron.name} mit einem HP-Wert von ${baron.hp}.")
    println("🔹${baron.name} hat 3 Vasallen hinter sich mit jeweils einem HP-Wert von ${vasalle1.hp}.")
    println()

    //jinx.angriff(gegnerListe)

    baron.angriff(championListe)

}