fun main() {
    var tovar1 = Tovar("Газировка", "руб.", "Напиток")
    tovar1.Input(tovar1)
    tovar1.Output()
    var st=tovar1.Stoimost(tovar1)
    if(tovar1.bonus=="Нет")
        tovar1.Pokupka(tovar1)
    else
        tovar1.BonusPokupka(tovar1)

}