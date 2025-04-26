package com.mertbuyuknisan.homeworks.homework2

fun main(){
    //C den Fahrenheit dönüşümü return edildi
    val calculateFahrenheit=celsiusToFahrenheit(12.3)
    println("Fahrenheit: $calculateFahrenheit")
    //Değer döndermeden dikdörtgen çevre hesabı
    calculateEdgesOfRectangle(10.0,10.0)
    //Recursive method kullanarak faktoriyel hesaplama
    val factorial= calculateFactorial(5)
    println("Factorial of the entered number:$factorial")
    numberOfa("Adana")
    val sumOfInteriorAngle= calculateInteriorAngle(4)
    println("Sum of Interior Angle: $sumOfInteriorAngle")
    val calculateLimit= calculateLimit(60)
    println("Total price: $calculateLimit")
    val calculateSalarty= calculateSalary(25)
    println(calculateSalarty)
}
fun celsiusToFahrenheit(celsius:Double):Double{
    val fahrenheit=(celsius*1.8)+32
    return fahrenheit
}
fun calculateEdgesOfRectangle(width:Double,height:Double){
    val perimeterOfRectangle=(width+height)*2
    println(perimeterOfRectangle)
}
fun calculateFactorial(number:Int):Int {
    if (number == 0 || number == 1) {
        return 1
    }else{
        return number* calculateFactorial(number-1)
    }
}
fun numberOfa(word:String){
    var count=0
    for (i in 0..word.length-1){
        if(word[i]=='a'){
            count+=1
        }
    }
    println("There are $count number of letters 'a' in this word")
}
fun calculateInteriorAngle(numberOfEdges:Int):Int{
   val sumOfInteriorAngle=(numberOfEdges-2)*180
    return sumOfInteriorAngle
}
fun calculateSalary(dayCount:Int):Int{
    val totalHours=dayCount*8
    val normalSaatSiniri=160
    val normalSaatUcreti=10
    val mesaiSaatUcreti=20
    if(totalHours<normalSaatSiniri){
        return totalHours*normalSaatUcreti
    }
    else{
        val normalUcret = normalSaatSiniri * normalSaatUcreti
        val mesaiSaati = totalHours - normalSaatSiniri
        val mesaiUcret = mesaiSaati * mesaiSaatUcreti
         return normalUcret + mesaiUcret
    }

}
fun calculateLimit(gbUsed:Int):Int{
    val limit=50
    val basePrice=100
    val overageFee=4
    if(gbUsed<=limit){
        return basePrice
    }
    else{
        return basePrice+(gbUsed-limit)*4
    }
}





