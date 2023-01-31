class Tank(name: String, hp: Int, mana: Int, amor: Int): Champion(name, hp, mana, amor) {

    // Tank ist Amumu
    // normale Standardfähigkeit ist die verfluchte Berührung, schadet den Gegner mit einem Fluch
    // 4 weitere Fähigkeiten

    override var faehigkeiten: MutableList<String> = mutableListOf(
        "Bandagenwurf (q)",
        "Verweiflung (w)",
        "Wutanfall (e)",
        "Fluch der traurigen Mumie (r)"
    )

    // Fähigkeit wählen mit Q,W,E,R
    override fun angriff() {
        println("Welche Fähigkeit willst du für $name wählen? \n$faehigkeiten")
        var faehigkeit = readln()
    }
}