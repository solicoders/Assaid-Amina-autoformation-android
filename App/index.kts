fun main() {
    var nom = "amina"
    var bonjour_nom = Bonjour(nom)
    println(bonjour_nom)
    println(nom)
}

fun Bonjour(nom: String): String {
    var msg = "Bonjour " + nom
    return msg
}
