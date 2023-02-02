class BaronNashor (name: String, hp: Double, level: Int): Gegner(name, hp, level){

    override var attackenListe: MutableList<String> = mutableListOf(
        "Blick des Barons",
        "Säurenpfütze",
        "Säurenschuss",
        "Tentakelhochwurf"
    )

    override fun angriff(champion: MutableList<Champion>) {
        var schaden = 0.0
        var attacke = attackenListe.random()
        var indexCh = champion.indices.random()

        when (attacke){
            "Blick des Barons" -> {schaden = 0.3 * level}
            "Säurenpfütze" -> {schaden = 0.5 * level}
            "Säurenschuss" -> {schaden = 0.6 * level}
            "Tentakelhochwurf" -> {schaden = 0.7 * level}
        }
        println()
        println("$name greift mit der Attack '$attacke' dein Champion ${champion[indexCh].name} an. Der Schaden beträgt $schaden!!!")
        champion[indexCh].loseHp(schaden)
    }

}



/*

        if (attacke == "Blick des Barons"){
            schaden += 0.3 * level
        }
        if (attacke == "Säurenpfütze"){
            schaden += 0.5 * level
        }
        if (attacke == "Säurenschuss"){
            schaden += 0.6 * level
        }
        if (attacke == "Tentakelhochwurf"){
            schaden += 0.7 * level
        }

          if (champion.size > 1){
            for (i in champion){
                var index = champion.indexOf(i)
                champion[index].loseHp(schaden)
            }
        }
 */
