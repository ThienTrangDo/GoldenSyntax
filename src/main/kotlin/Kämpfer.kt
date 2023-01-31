class Kaempfer (name: String, hp: Int, mana: Int, amor: Int): Champion(name, hp, mana, amor) {

    // Kämpfer ist Jinx
    // normale Standardfähigkeit ist Peng-Peng Minigun
    // 4 weitere Fähigkeiten

    override var faehigkeiten: MutableList<String> = mutableListOf(
        "Waffenwechsel (q)",
        "Brzl! (w)",
        "Flammenfresser (e)",
        "Super-Mega-Todesrakete (r)"
    )

    // Fähigkeit wählen mit Q,W,E,R
    override fun angriff() {
        println("Welche Fähigkeit willst du für $name wählen? \n$faehigkeiten")
        var faehigkeit = readln()
    }
}