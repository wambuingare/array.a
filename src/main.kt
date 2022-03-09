fun main() {
    names()
    location()
    num()
    numbers()
    println(girlsName().contentToString())

}
fun names(){
    var w =arrayOf("Tess","Milly","Avianna","Lisa")
    println(w.contentToString())
}

fun location(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    cities.sortedArray().forEach { x->
        println(x.capitalize())}
}

fun num(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum =(numbers[1]+ numbers[4])
    println(sum)
}
fun numbers(){
    var z=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(z.indexOf(158))
    var w=z.sortedArray()
    println(w.contentToString())
}
fun girlsName():Array<String>{
    var h = arrayOf("nancy","sakina","juliet")
    return h

}
