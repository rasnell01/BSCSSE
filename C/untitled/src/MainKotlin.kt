import java.util.*
import kotlin.math.max
import kotlin.math.min

fun whoIsBigger(a: Int, b: Int): Int {
    return max(a.toDouble(), b.toDouble()).toInt()
} //end method

fun whoIsSmaller(a: Int, b: Int): Int {
    return min(a.toDouble(), b.toDouble()).toInt()
} //end method

public fun sayHello(message: String) {
    println("Say hello to $message")
} //end method

fun publicHello(message: String) {
    println("SAY HELLO TO " + message.uppercase(Locale.getDefault()))
} //end method