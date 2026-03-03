import kotlin.math.sign
import kotlin.math.absoluteValue

fun asteroidCollision(asteroids: IntArray): IntArray {
    val stack = ArrayDeque<Int>()

    for(asteroid in asteroids) {        
        var isAsteroidSmashed = false

        while (!stack.isEmpty() && stack.last().sign == 1 && asteroid.sign == -1 && !isAsteroidSmashed) {
            val prev = stack.last()
            
            if(asteroid.absoluteValue <= prev.absoluteValue) {
                isAsteroidSmashed = true
            } 
            
            if(asteroid.absoluteValue >= prev.absoluteValue) {
                stack.removeLast()
            }
        }
        
        if(!isAsteroidSmashed) {
            stack.add(asteroid)
        }
    }

    return stack.toIntArray()
}