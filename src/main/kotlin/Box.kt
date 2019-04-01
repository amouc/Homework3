import java.util.*

open class Box(var length: Double, var width: Double, var height: Double) {
    fun validate(length: Double, width: Double, height: Double): Boolean =
        (length <= this.length && width <= this.width && height <= this.height)

}

class Box3 : Box(23.0, 14.0, 13.0)

class Box5 : Box(39.5, 27.5, 23.0)

fun main() {
    val scanner = Scanner(System.`in`)
    val box3 = Box3()
    val box5 = Box5()
    println("請輸入便利箱長度:")
    var length = scanner.nextDouble()
    println("請輸入便利箱寬度:")
    var width = scanner.nextDouble()
    println("請輸入便利箱高度:")
    var height = scanner.nextDouble()

    if (box3.validate(length, width, height)) {
        println("請用Box3")
    } else if (box5.validate(length, width, height)) {
        println("請用Box5")
    } else {
        println("請用更大的箱子")
    }


}