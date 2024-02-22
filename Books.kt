import kotlin.reflect.jvm.internal.impl.protobuf.ByteString

class Books(_tirash:Int) {
    var name="Название"
    var avtor="Автор"
    var year=1000
    var volume=320
    var tirash:Int
    var period="Древнерусская"
    init{
        tirash=_tirash
    }
    var janr="Комедия"


    fun Input(book:Books){
        try {
        println("Введите название книги")
            book.name= readLine()!!.toString()
            println("Введите автора книги")
            book.avtor= readLine()!!.toString()
            println("Введите год написания книги")
            book.year= readLine()!!.toInt()
            println("Введите объем книги в листах")
            book.volume= readLine()!!.toInt()
            println("Введите жанр книги")
            book.janr= readLine()!!.toString()
        }catch(e:Exception){
            println("Ошибка")}
    }

    fun Vek(book: Books)
    {
        when
        {
            (year<1000)->book.period="Мифы"
            (year>=1000 && year<=1800)->book.period="Древнерусская литература"
            (year>1800 && year<=1850)->book.period="Литература первой половины 19 века"
            (year>1850 && year<=1900)->book.period="Литература второй половины 19 века"
            (year>1900 && year<1940)->book.period="Литература начала 20 века"
            (year>=1940 || year<=1990) -> book.period=("Русское литературное зарубежье 40-90х годов")
            else -> book.period=("Современная литература")
        }
    }

    fun Output()
    {
        println("Книга:$name\nАвтор:$avtor\nГод написания:$year\nОбъем в листах:$volume\nПериод:$period\nТираж:$tirash\n")
    }

    fun Sovet(book: Books)
    {
        when{
            (janr=="Детектив")-> println("Советуем вам книгу: Шерлок Холмс")
            (janr=="Комедия")-> println("Советуем вам книгу: Недоросль")
            (janr=="Приключения")-> println("Советуем вам книгу: Алиса в стране чудес")
            (janr=="Роман")-> println("Советуем вам книгу: До встречи с тобой")
            (janr=="Мистика")-> println("Советуем вам книгу: Хранительница болот")
            else-> println("Извините, рекомендации по данному жанру не найдены :(")
        }
    }


    fun Otziv()
    {
        println("\nНапишите отзыв о данной книге\n")
        readLine()
        println("\nСпасибо за ваш отзыв! Представляем рекомендации для вас:\n")
    }
}