package com.emreozcan.kotlinmodernprogramming.general.lambdahigherorder

fun greet(name: String): String {
    return "Hello, $name from function"
}

fun main() {
    //Lambda Expression
    val greet: (String) -> String = { name ->
        "Hello, $name from lambda expression"
    }

    //println(greet("Emre"))

    // Higher-Order Functions

    /*doOperation {
        println("in progress...")
    }

     */


    val sum = operate(3, 5 ) { x, y ->
        x + y
    }

    //println(sum)

    val product = operate(3, 5) { x, y ->
        x * y
    }

    //println(product)


    //Compose
    /*
    Button(onClick = { println("Clicked!") }) {
        Text("Press Me")
    }
    */
}



fun doOperation(block: () -> Unit) {
    println("started")
    block()
    println("finished")
}

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}