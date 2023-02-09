class Vasallen(name: String, hp: Double, level: Int): Gegner(name, hp, level) {

    override var attackenListe: MutableList<String> = mutableListOf(
        "Schnellfeuer",
        "Blendpfeil",
        "Giftschuss",
        "Sprengladung"
    )

    override fun angriff(champion: MutableList<Champion>) {
        var schaden = 0.0
        var attacke = attackenListe.random()
        var zufallsChampion = champion.indices.random()

        //When
        when (attacke){
            "Schnellfeuer" -> {schaden = 0.3 * level}
            "Blendpfeil" -> {schaden = 0.5 * level}
            "Giftschuss" -> {schaden = 0.6 * level}
            "Sprengladung" -> {schaden = 0.7 * level}
        }
        println()
        println("🔹$name greift mit der Attack '$attacke' deinen Champion ${champion[zufallsChampion].name} an. Der Schaden beträgt $schaden!!!")
        champion[zufallsChampion].loseHp(schaden)
    }
}