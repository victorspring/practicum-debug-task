# В задании предлагается найти ошибку в коде

Программа представляет собой сервис интернет-магазина, уведомляющий пользователей о поступлении товара и о том, что он закончился на складе. За основу взять паттерн проектирования Observer(Наблюдатель).

**Основные методы ProductService:**

_subscribe(String productName, Customer customer)_ - Подписка пользователя Customer на уведомления о товаре productName

_addProduct(String productName)_ - Добавление товара productName на склад в размере 1 единицы

_sellProduct(String productName)_ - Удаление(продажа) товара со склада в размере 1 единицы

**При запуске программы через метод main класса Demo образуется следующий вывод:**

`Sending to 'customer@yandex.ru': Product 'Сахар' arrived`  
`Sending to 'customer@yandex.ru': Product 'Гречка' arrived`  
`Sending to 'customer@yandex.ru': Product 'Гречка' is out`  

**В то время как, ожидается следующий вывод:**

`Sending to 'customer@yandex.ru': Product 'Сахар' arrived`   
`Sending to 'customer@yandex.ru': Product 'Сахар' is out`   
`Sending to 'customer@yandex.ru': Product 'Гречка' arrived`   
`Sending to 'customer@yandex.ru': Product 'Гречка' is out`  

Требуется найти и исправить одну строчку в программе.