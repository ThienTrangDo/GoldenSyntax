class Schuetze(name: String, hp: Int, mana: Int, amor: Int): Champion(name, hp, mana, amor) {

    // Schütze heißt Caitlyn
    // Die normale Standarffähigkeit ist der Kopfschuss, alle paar Schüsse verdoppelter Schaden
    // 4 fähigkeiten

    override var faehigkeiten: MutableList<String> = mutableListOf(
        "Piltover-Friedensstifter (q)",
        "Schlagfalle (w)",
        "Kaliber-90-Netz (e)",
        "Ass im Ärmel (r)"
    )

    // Fähigkeit wählen mit Q,W,E,R
    override fun angriff() {
        println("Welche Fähigkeit willst du für $name wählen? \n$faehigkeiten")
        var faehigkeit = readln()
    }
}