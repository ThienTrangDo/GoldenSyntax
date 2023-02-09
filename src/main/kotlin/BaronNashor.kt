class BaronNashor(name: String, hp: Double, level: Int) : Gegner(name, hp, level) {

    override var attackenListe: MutableList<String> = mutableListOf(
        "Blick des Barons",
        "Säurenpfütze",
        "Säurenschuss",
        "Tentakelhochwurf"
    )

    override fun angriff(champion: MutableList<Champion>) {
        var schaden = 0.0
        var attacke = attackenListe.random()
        var zufallsChampion = champion.indices.random()

        //Gezielter Angriff mit If
        if (attacke == "Blick des Barons") {
            schaden = 0.3 * level
            println()
            Thread.sleep(2000)
            println("🔹$name greift mit der Attacke '$attacke' deinen Champion ${champion[zufallsChampion].name} an. Der Schaden beträgt für jeden Champion $schaden!!!")
            champion[zufallsChampion].loseHp(schaden)
        }

        //AOE mit If und For-In Schleife
        if (attacke == "Säurenpfütze") {
            schaden = 0.5 * level
            println()
            Thread.sleep(2000)
            println("🔹$name greift mit der Attacke '$attacke' alle Champion an. Der Schaden beträgt $schaden!!!")
            var ind = champion.indices
            for (i in ind) {
                champion[i].loseHp(schaden)
            }
        }

        //Gezielter Angriff
        if (attacke == "Säurenschuss") {
            schaden = 0.3 * level
            println()
            Thread.sleep(2000)
            println("🔹$name greift mit der Attacke '$attacke' deinen Champion ${champion[zufallsChampion].name} an. Der Schaden beträgt für jeden Champion $schaden!!!")
            champion[zufallsChampion].loseHp(schaden)
        }

        //AOE
        if (attacke == "Tentakelhochwurf") {
            schaden = 0.5 * level
            println()
            Thread.sleep(2000)
            println("🔹$name greift mit der Attacke '$attacke' alle Champion an. Der Schaden beträgt $schaden!!!")
            var ind = champion.indices
            for (i in ind) {
                champion[i].loseHp(schaden)
            }
        }
    }
}


