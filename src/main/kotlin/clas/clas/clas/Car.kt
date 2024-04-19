package clas.clas.clas

class Car : Vehicle() {
    override val speed = "220 км/ч"
    override val color = "Белый"
    override val numOfWheels = "4"
    override val nomer = "123456"
    override val firma = "Lada"

    override fun displayinfo() {
        println("Характеристики: /n")
        println("Фирма: $firma,Номер: $nomer, Скорость: $speed, Цвет: $color")
        super.displayinfo()
    }

    override fun makeSound() {
        println("Машина издает <Врынг Врынг>")
    }
}
