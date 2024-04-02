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


Correct solution


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


### Résumé

- Un programme Kotlin nécessite une fonction principale comme point d'entrée du programme.
- Pour définir une fonction en langage Kotlin, utilisez le mot clé fun, suivi du nom de la fonction, puis des entrées comprises entre parenthèses, et enfin du corps de la fonction, entre accolades.
- Le nom d'une fonction doit respecter la convention camel case, et commencer par une lettre minuscule.
- Utilisez l'appel de fonction println() pour que la sortie affiche du texte.
- Reportez-vous au guide de style Kotlin pour connaître les conventions de mise en forme et de programmation à suivre lors du codage en langage Kotlin.
- Le dépannage consiste à corriger les erreurs dans votre code.

## Références
- https://developer.android.com/training/kotlinplayground