class Amumu(name: String, level: Int, hp: Double) : Champion(name, level, hp) {

    override var faehigkeitenListe: MutableList<String> = mutableListOf(
        "Bandagenwurf (q)",
        "Verweiflung (w)",
        "Wutanfall (e)",
        "Fluch der traurigen Mumie (r)"
    )

    override fun angriff(gegner: MutableList<Gegner>) {
        println()
        println("Welche Fähigkeit willst du für 🔸$name wählen? \n$faehigkeitenListe")
        var faehigkeit = readln().lowercase()
        var schaden = 0.0

        if (faehigkeit == "q") {
            schaden += 0.5 * level
        }
        if (faehigkeit == "w") {
            schaden += 0.6 * level
        }
        if (faehigkeit == "e") {
            schaden += 0.7 * level
        }
        if (faehigkeit == "r") {
            schaden += 0.8 * level
        }

        if (gegner.size > 1) {
            if (faehigkeit == "e" || faehigkeit == "r" || faehigkeit == "w") {
                println("🔥Diese Fähigkeit richtet ein Schaden an alle Gegner.🔥")
                var ind = gegner.indices
                for (i in ind) {
                    gegner[i].loseHp(schaden)
                }
            }
            if (faehigkeit == "q") {
                println("Diese Fähigkeit greift einen Gegner deiner Wahl an.\nWelchen Gegner möchtest du angreifen?")
                for (i in gegner)
                    println("Der ${gegner.indexOf(i) + 1}. Gegner ist ${i.name}.")
                var gegnerAuswahl = readln().toInt() - 1
                gegner[gegnerAuswahl].loseHp(schaden)
            }
        } else if (gegner.size == 1) {
            println("Der letzte Gegner wird angegriffen")
            gegner[0].loseHp(schaden)
        }
    }
}