class Jinx(name: String, level: Int, hp: Double) : Champion(name, level, hp) {

    //Überschreiben der Fähigkeitsliste von der allgemeinen Klasse Champion
    override var faehigkeitenListe: MutableList<String> = mutableListOf(
        "Waffenwechsel (q)",
        "Brzl! (w)",
        "Flammenfresser (e)",
        "Super-Mega-Todesrakete (r)"
    )

    //Überschreiben der Methode Angriff von der allgemeinen Klasse Champion
    override fun angriff(gegner: MutableList<Gegner>) {
        println()
        println("Welche Fähigkeit willst du für 🔸$name wählen? \n$faehigkeitenListe")
        var faehigkeit = readln().lowercase()
        var schaden = 0.0

        if (faehigkeit == "q") {
            schaden += 0.7 * level
        }
        if (faehigkeit == "w") {
            schaden += 0.8 * level
        }
        if (faehigkeit == "e") {
            schaden += 0.9 * level
        }
        if (faehigkeit == "r") {
            schaden += 1.1 * level
        }

    //AOE Flächendeckender Schaden mit If
        if (gegner.size > 1) {
            if (faehigkeit == "e" || faehigkeit == "r") {
                println("🔥Diese Fähigkeit richtet ein Schaden an alle Gegner.🔥")
                var ind = gegner.indices
                for (i in ind) {
                    gegner[i].loseHp(schaden)
                }
            }

            //gezielter Angriff
            if (faehigkeit == "q" || faehigkeit == "w") {
                println("Diese Fähigkeit greift einen Gegner deiner Wahl an.\nWelchen Gegner möchtest du angreifen?")
                for (i in gegner) //For-In Schleife Laufvariable i in der Liste von Gegner
                    println("Der ${gegner.indexOf(i) + 1}. Gegner ist ${i.name}.")
                var gegnerAuswahl = readln().toInt() - 1
                gegner[gegnerAuswahl].loseHp(schaden)
            }

            //Wenn keine Auswahl an Gegner gibt, wird der letzte angegriffen
        } else if (gegner.size == 1) {
            println("Der letzte Gegner wird angegriffen")
            gegner[0].loseHp(schaden)
        }
    }
}
