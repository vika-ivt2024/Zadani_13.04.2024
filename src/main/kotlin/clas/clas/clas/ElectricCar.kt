package clas.clas.clas

class ElectricCar : Car(), FuelEfficient {
    val batteryCapacity = ""

    open class ElectricCar : Car(), FuelEfficient {
        open val batteryCapacity = "100 кВтч"
        override val speed = "280 км/ч"
        override val color = "Белый"
        override val numOfWheels = "4"
        override val nomer = "143621"
        override val firma = "Volga"
        override fun fuelEfficiency() {
            println("Характеристики: /n")
            println("Скорость: $speed n/ Цвет: $color n/ Количество колёс: $countOfWheels")
            println("Фирма: $firma,Номер: $nomer, Скорость: $speed, Цвет: $color")
        }
    }
}