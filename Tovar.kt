class Tovar(var _name:String, var _edizm:String, var _vid:String){
    var price=0.0
    var vid="Молочка"
    var kol=320
    var money=0.0
    var st=0.0
    var bonus="Да"
    var name="Название"
    var edizm="Валюта"
    init{
        name=_name
        edizm=_edizm
        vid=_vid
    }

    fun Input(tovar1:Tovar){
        try {
            println("Введите стоимость товара")
            tovar1.price= readLine()!!.toDouble()
            println("Введите количество товара")
            tovar1.kol= readLine()!!.toInt()
            println("Введите количество денег на счету")
            tovar1.money= readLine()!!.toDouble()
            println("У вас есть бонусная карта? (Да или Нет)")
            tovar1.bonus= readLine()!!.toString()
        }catch(e:Exception){
            println("Ошибка")}
    }

    fun Stoimost(tovar1:Tovar){
     tovar1.st=kol*price
    }

    fun Pokupka(tovar1: Tovar)
    {
        if (st>money)
            println("\nДенег недостаточно")
        else
            println("\nПокупка совершена. Текущее состояние счета: ${money-st}\n")
    }

    fun BonusPokupka(tovar1: Tovar)
    {
        st-=st*0.25
        if (st>money)
            println("\nДенег недостаточно")
        else
            println("\nПокупка совершена со скидкой 25%. Текущее состояние счета: ${money-st}\n")
    }

    fun Output()
    {
        println("\nТовар:$name\nЦена товара:$price$edizm\nВид товара:$vid\nКоличество:$kol")
    }



}