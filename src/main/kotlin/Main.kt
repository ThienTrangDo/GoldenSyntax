fun main (){

    println("🏴⚔️Willkommen bei Golden Syntax⚔️🏴")

    var jinx = Kaempfer("Jinx", 2072, 1010, 100)
    var amumu = Tank ("Amumu",  2500, 967, 150)
    var caitlyn = Schuetze ("Caitlyn",2091, 908, 100)

    var baron = Gegner("Baron Nashor", 9000)
    var vasalle1 = Gegner ("Vasalle 1", 750)
    var vasalle2 = Gegner("Vasalle 2", 750)
    var vasalle3 = Gegner("Vasalle 3", 750)

    println("Die 3 Champions stehen fest:")
    println()
    println("🔸Die schiesswütige '${jinx.name}' = Hp:${jinx.hp}, Schutzschild:${jinx.amor}, Mana:${jinx.mana}.")
    println("🔸Die traurige Mumie '${amumu.name}' = Hp:${amumu.hp}, Schutzschild:${amumu.amor}, Mana:${amumu.mana}.")
    println("🔸Die Sheriffin '${caitlyn.name}' = Hp:${caitlyn.hp}, Schutzschild:${caitlyn.amor}, Mana:${caitlyn.mana}.")
    println()
    println("Der Gegner ist ${baron.name}")

    jinx.angriff()
    amumu.angriff()
    caitlyn.angriff()

}