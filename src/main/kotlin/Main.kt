//задание 2
//Создать приложение, которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную.
fun main() {
    print("Введите число в 10-тичной системе, для перевода в 2-ичную:")
    var a=readln().toInt()
    var s1=""
    var s2=""
    var b:Int
    while(a>0){
        b=a%2
        s1=b.toString()
        a/=2
        s2=s1+s2
    }

    println("Число в 2-ичной системе счисления: $s2")
}