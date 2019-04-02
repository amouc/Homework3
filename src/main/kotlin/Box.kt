import com.amou.Box3Box
import com.amou.Box5Box
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val box3 = Box3Box()
    val box5 = Box5Box()
    println("請輸入便利箱長度:")
    var length = scanner.nextFloat()
    println("請輸入便利箱寬度:")
    var width = scanner.nextFloat()
    println("請輸入便利箱高度:")
    var height = scanner.nextFloat()
    if(box3.validate(length,width,height)) {
        println("請用Box3箱子")
    }else if(box5.validate(length,width,height)){
        println("請用Box5箱子")
    }else{
        println("請用更大的箱子")
    }


}

open class Box(var length:Float,var width:Float,var height:Float){

    fun validate(length:Float,width:Float,height:Float):Boolean
            =((length < this.length && width < this.width && height < this.height))

}

class Bpx3Box : Box(23f,14f,13f)

class Box5Box : Box(39.5f,27.5f,23f)