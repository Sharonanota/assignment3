fun main(){
    var s=arrayOf("Sharon","Anota","Lubembe","Matakwa")
    println(s.contentToString())
    //println(s[3])
    var d=arrayOf("harare","mumbai","dodoma","jakarta")
    cities(d)


    sum()



    details(arrayOf("Sharon","Wanda","Dallas"))


}
fun array(Name:Array<String>){
    var x=(Name)
    println(x)

    //details(arrayOf("Sharon","Wanda","Dallas"))

}
fun cities(name:Array<String>){
    name.forEach { names->
        println(names.capitalize())

    }

}
fun sum(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var numeric=numbers[2]+numbers[5]
    println(numeric)
    var Index=numbers.indexOf(158)
    println(Index)
    var order=numbers.sortedArray()
    println(order.contentToString())
}
fun details(name:Array<String>):Array<String>{
    var names=(name)
    println(name.contentToString())
    return names
}