class Kaempfer(name: String, level: Int, hp: Int, mana: Int, amor: Int) : Champion(name, level, hp, mana, amor) {

    // Kämpfer ist Jinx
    // normale Standardfähigkeit ist Peng-Peng Minigun
    // 4 weitere Fähigkeiten

    override var faehigkeitenListe: MutableList<String> = mutableListOf(
        "Waffenwechsel (q)",
        "Brzl! (w)",
        "Flammenfresser (e)",
        "Super-Mega-Todesrakete (r)"
    )

    // Fähigkeit wählen mit Q,W,E,R
    override fun angriff(gegner: List<Gegner>) {
        println("Welche Fähigkeit willst du für $name wählen? \n$faehigkeitenListe")
        var faehigkeit = readln()
        var schaden = 0

        // mit Level berechnen

        if (faehigkeit == "q") {
            schaden += 650
            // println("Der Gegner hat ein Schaden von $schaden abbekommen.")
        }
        if (faehigkeit == "w") {
            schaden += 770
        }
        if (faehigkeit == "e") {
            schaden += 865
        }
        if (faehigkeit == "r") {
            schaden += 980
        }

        // wenn nur 1 gegnger ist dann direkt angreifen
        // wenn gegner k.o ist aus der liste entfernen ( mutablelist)
        // Flächenangriff
        if (gegner.size > 1){
            for (i in gegner)
                println("Der ${gegner.indexOf(i)+1}. Gegner ist ${i.name}.")
            println("Welchen Gegner möchetst du angreifen?")
            var gegnerAuswahl = readln().toInt()-1
            gegner[gegnerAuswahl].loseHp(schaden)
        }
    }
}