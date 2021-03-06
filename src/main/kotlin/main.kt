fun main() {
    println(agoToText(1))
    println(agoToText(60))
    println(agoToText(61))
    println(agoToText(119))
    println(agoToText(120))
    println(agoToText(2000))
    println(agoToText(3600))
    println(agoToText(40000))
    println(agoToText(70000))
    println(agoToText(86400))
    println(agoToText(100000))
    println(agoToText(172800))
    println(agoToText(200000))
    println(agoToText(345601))

}
fun agoToText(second: Int): String{
    return when (second){
        in 0..59 -> "был(а) в сети только что"
        in 60..3599 -> "был(а) в сети ${minutesToText(second)}"
        in 3600..86399 -> "был(а) в сети ${hoursToText(second)}"
        in 86400..172799 -> "был(а) в сети сегодня"
        in 172800..345600 -> "был(а) в сети вчера"
        else -> "был(а) в сети давно"
    }
}
fun minutesToText(seconds: Int): String{
    val minutes = seconds / 60
    return when {
        (minutes > 4) && (minutes < 21) -> "$minutes минут"
        ((minutes % 10) > 5) && ((minutes % 10) < 10) -> "$minutes минут"
        (minutes % 10) == 0 -> "$minutes минут"
        (minutes % 10) == 1 -> "$minutes минуту"
        else -> "$minutes минуты"
    }
}
fun hoursToText(seconds: Int): String{
    val hours = seconds / 3600
    return when {
        (hours > 4) && (hours < 21) -> "$hours часов"
        ((hours % 10) > 5) && ((hours % 10) < 10) -> "$hours часов"
        (hours % 10) == 1 -> "$hours час"
        (hours % 10) == 0 -> "$hours часов"
        else -> "$hours часа"
    }
}