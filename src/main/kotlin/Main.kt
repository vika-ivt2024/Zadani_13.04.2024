//Вариант 1

//1. Базовое Наследование:
// - Создайте класс `Vehicle` с базовыми свойствами, такими как `speed` и `color`.
// - Реализуйте два подкласса `Car` и `Bike`, наследующие класс `Vehicle`. Добавьте в эти классы уникальные свойства и методы (например, `numOfWheels` для `Bike`).

//2. Методы и Переопределение:
// - Добавьте метод `displayInfo()` в класс `Vehicle`, который выводит информацию о транспортном средстве.
// - Переопределите метод `displayInfo()` в подклассах `Car` и `Bike`, чтобы они выводили дополнительную информацию, специфичную для каждого подкласса.

//3. Использование `super`:
//- В переопределенных методах `displayInfo()` классов `Car` и `Bike`, используйте `super.displayInfo()` для демонстрации, как можно вызвать метод родительского класса.

//4. Абстрактный Класс и Методы:
//- Сделайте класс `Vehicle` абстрактным и добавьте в него абстрактный метод `makeSound()`.
//- Реализуйте `makeSound()` в подклассах `Car` и `Bike` с различными реализациями (например, звук гудка для машины и звонок для велосипеда).

//5. Иерархия Наследования с Несколькими Уровнями:
//- Создайте подкласс `ElectricCar`, который наследует `Car`. Добавьте в него специфические свойства и методы, например, `batteryCapacity`.


//6. Интерфейсы и Реализация:
//   - Определите интерфейс `FuelEfficient` с методом `fuelEfficiency()`.
//   - Реализуйте этот интерфейс в одном или нескольких классах, например, в `ElectricCar`, демонстрируя разные способы эффективного использования топлива.

//7. Полиморфизм:
//   - Создайте массив или список объектов `Vehicle`, содержащий различные экземпляры `Car`, `Bike`, `ElectricCar` и так далее.
//   - Итерируйте по этому списку, вызывая `displayInfo()` для каждого объекта, чтобы увидеть полиморфное поведение в действии.