package com.example.demo1

fun main(){
    var a = 0.0
    var b= 0.0
    println("Nhap a: ")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tổng của ${a}+${b}: " + (a + b))
    println("Hiệu của ${a}+${b}: " + (a - b))
    println("Tích của ${a}+${b}: " + (a * b))
    println("Thương của ${a}+${b}: " + (a / b))
}