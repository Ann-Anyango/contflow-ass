fun main() {
    num()
     var u =character(arrayOf("joy","Anyango","Mwangombe","faith","Nicholas","sheilah"))
    println(u)
    treats(14)
    instance()

}
fun num(){
    for ( n in 1..100){
        if (n %2!=0){
            println(n)
        }
    }
}
//function that prints out all the odd numbers between 1 and 100
fun character(name:Array<String>):Int{
    var add=0
    for (y in name){
        if (y .length>5){
            add ++
        }
    }
    return add

}
fun treats(ages:Int){
    if (ages<6){
        println("milk")
    }
    else if(ages in  6..14){
       println("fanta orange")
    }
    else {
        println("coca cola")
    }


}
//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
 fun instance(){
     for (t in 1..100){
         when  {
             t %3 ==0 ->
                 println("Fizz")

             t % 5==0 ->
                 println("Buzz")
              t %3 ==0 && t %5== 0 ->
             println("FizzBuzz")

         }






     }
 }