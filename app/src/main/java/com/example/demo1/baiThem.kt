package com.example.demo1

//Bài 1
fun main() {
    println("Bài 1")
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))

    println("Bài 2")
    Bai2()

    println("Bài 3")
    Bai3()

    println("Bài 4")
    Bai4()

    println("Bài 5")
    Bai5()

    println("Bài 6")
    Bai6()

    println("Bài 7")
    Bai7()

    println("Bài 8")
    Bai8()

    println("Bài 9")
    Bai9()

    println("Bài 10")
    Bai10()
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

// Bài 2
fun Bai2(){
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
}

// Bài 3
fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun Bai3() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten ++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}

// Bài 4
class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun Bai4() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

}

// Bài 5
fun Bai5() {
    for (i in 0..3) {
        print(i)
    }
    print(" ")

    for (i in 0 until 3) {
        print(i)
    }
    print(" ")

    for (i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {
        print(i)
    }
    println(" ")
}

// Bài 6
fun Bai6(){
    val x = 2
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {
        println("x is not in range from 6 to 10")
    }
}

// Bài 7
fun Bai7(){
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)
    println(authors === writers)
}

// Bài 8
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun Bai8() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")
}

// Bài 9
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun Bai9() {
    val func = operation()
    println(func(2))
}

// Bài 10
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun Bai10() {
    addSystemUser(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!
}