---
layout: default
chapitre: Présentation de Kotlin
order: 2
---

# Bienvenue dans le cours Principes de base d'Android avec Compose

# 1.1 Présentation de la programmation en Kotlin

### Inférence de type :

Bien que Kotlin soit un langage à typage statique (Un langage dans lequel le type de la variable est déterminé au moment de la compilation), vous n’êtes pas obligé de spécifier explicitement le type de chaque variable que vous déclarez.

```kotlin
    val name = "Amina"
```

```kotlin
val name: String // Correct
val nombre: Int // Correct
val age // Erreur:The variable must either have a Type annotation or be initialized
age= 20 // Assignation différée
```

Expliquer le message d'erreur de ce code :

```kotlin
fun main() {
    var nom = "Fouad"
    var bonjour_nom = Bonjour(nom)
    println (bonjour_nom)
    println (nom)
}

fun Bonjour(nom:String):String{
    nom =  "Bonjour" + nom
    return nom
}


```
Val cannot be reassigned


Correct 


```kotlin
fun main() {
    val nom = "Fouad"
    val bonjour_nom = Bonjour(nom)
    println (bonjour_nom)
    println (nom)
}

fun Bonjour(nom:String):String{
    msg =  "Bonjour" + nom
    return msg
}


```

## Références
- https://developer.android.com/training/kotlinplayground