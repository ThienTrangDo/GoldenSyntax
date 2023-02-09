// Funktion Kampf erstellen
fun fight(
    jinx: Jinx,
    caitlyn: Caitlyn,
    amumu: Amumu,
    baronNashor: BaronNashor,
    vasallen: Vasallen,
    gegnerListe: MutableList<Gegner>,
    championListe: MutableList<Champion>
) {
    //While Schleife Bedingung: Jinx,Caitlyn,Amumu nicht k.o oder Baron nicht k.o
    while ((!jinx.isKo || !caitlyn.isKo || !amumu.isKo) && !baronNashor.isKo) {

        if (jinx.isKo) {
            championListe.remove(jinx)
        } else {
            jinx.angriff(gegnerListe)
        }
        if (caitlyn.isKo) {
            championListe.remove(caitlyn)
        } else {
            caitlyn.angriff(gegnerListe)
        }
        if (amumu.isKo) {
            championListe.remove(amumu)
        } else {
            amumu.angriff(gegnerListe)
        }
        if (baronNashor.isKo) {
            gegnerListe.remove(baronNashor)
            break
        } else {
            baronNashor.angriff(championListe)
        }
        if (vasallen.isKo) {
            gegnerListe.remove(vasallen)
        } else {
            vasallen.angriff(championListe)
        }
    }

    if (jinx.isKo && caitlyn.isKo && amumu.isKo) {
        println()
        println("❌ Das Spiel ist vorbei ❌\nBaron Nashor hat euch besiegt. \n🔥Ihr habt leider verloren!🔥")
    }
    if (baronNashor.isKo) {
        println()
        println("❌ Das Spiel ist vorbei ❌\nDeine Champions haben Baron Nashor besiegt.\n🏳️Ihr habt gewonnen!!🏳️")
    }
}

// TODO Begrüßung ausarbeiten
fun greeting() {
    println("🏴⚔️Willkommen bei Golden Syntax⚔️🏴")
    println()
    Thread.sleep(1000)
}