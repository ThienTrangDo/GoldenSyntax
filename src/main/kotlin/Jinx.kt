class Jinx(name: String, level: Int, hp: Double, mana: Int, amor: Int) : Champion(name, level, hp, mana, amor) {

    // Kämpfer ist Jinx
    // 4 weitere Fähigkeiten

    override var faehigkeitenListe: MutableList<String> = mutableListOf(
        "Waffenwechsel (q)",
        "Brzl! (w)",
        "Flammenfresser (e)",
        "Super-Mega-Todesrakete (r)"
    )

    override fun angriff(gegner: MutableList<Gegner>) {
        println("Welche Fähigkeit willst du für $name wählen? \n$faehigkeitenListe")
        var faehigkeit = readln()
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

        if (gegner.size > 1){
            for (i in gegner)
                println("Der ${gegner.indexOf(i)+1}. Gegner ist ${i.name}.")
            println("Welchen Gegner möchetst du angreifen?")
            var gegnerAuswahl = readln().toInt()-1
            gegner[gegnerAuswahl].loseHp(schaden)
        }

      /*  if (gegner.size > 1) {
            if ((faehigkeit == "e") || (faehigkeit == "r")){                //Flächenangriff
                for (i in gegner){
                    loseHp(schaden)
                }
            } else if ((faehigkeit == "w") || (faehigkeit == "q")) {
                for (i in gegner)
                    println("Der ${gegner.indexOf(i) + 1}. Gegner ist ${i.name}.")
                    println("Welchen Gegner möchetst du angreifen? (Wähle eine Zahl.)")
                var gegnerAuswahl = readln().toInt() - 1
                gegner[gegnerAuswahl].loseHp(schaden)
            }
        }
        if (gegner.size == 1){
            gegner[0].loseHp(schaden)
        }*/
    }
}

/*
for (i in gegner)
                println("Der ${gegner.indexOf(i) + 1}. Gegner ist ${i.name}.")
            println("Welchen Gegner möchetst du angreifen? (Wähle eine Zahl.)")
            var gegnerAuswahl = readln().toInt() - 1
            gegner[gegnerAuswahl].loseHp(schaden)

            // wenn gegner k.o ist aus der liste entfernen ( mutablelist)
 */