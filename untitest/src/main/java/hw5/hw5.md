**Задание 1: Разработка приложения для записной книжки**

*Описание:* Вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты. Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

1. **Юнит-тест: Проверка добавления контакта**
    - *Описание:* Этот тест проверяет, что функция добавления контакта корректно добавляет новый контакт в список контактов.

2. **Юнит-тест: Проверка редактирования контакта**
    - *Описание:* Этот тест проверяет, что функция редактирования контакта корректно изменяет данные контакта в записной книжке.

3. **Юнит-тест: Проверка удаления контакта**
    - *Описание:* Этот тест проверяет, что функция удаления контакта удаляет указанный контакт из записной книжки.

4. **Интеграционный тест: Проверка отображения контакта через интерфейс**
    - *Описание:* Этот тест проверяет, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов.

5. **Интеграционный тест: Проверка редактирования контакта через интерфейс**
    - *Описание:* Этот тест проверяет, что при редактировании контакта через интерфейс, изменения правильно отображаются и сохраняются.

6. **Интеграционный тест: Проверка удаления контакта через интерфейс**
    - *Описание:* Этот тест проверяет, что при удалении контакта через интерфейс, контакт успешно удаляется из записной книжки.

7. **Сквозной тест: Проверка полного цикла работы с контактом**
    - *Описание:* Этот тест охватывает полный жизненный цикл контакта: создание контакта, его редактирование и последующее удаление. Он проверяет, что каждый этап работает корректно и взаимодействует друг с другом.

**Задание 2: Определение типа тестовых сценариев**

1. *Проверка того, что функция addContact корректно добавляет новый контакт в список контактов.*
    - *Тип теста:* Юнит-тест
    - *Объяснение:* Этот тест проверяет отдельный компонент (функцию добавления контакта) и не взаимодействует с другими частями системы.

2. *Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов.*
    - *Тип теста:* Интеграционный тест
    - *Объяснение:* Этот тест проверяет взаимодействие между пользовательским интерфейсом и логикой приложения, а также корректность отображения данных.

3. *Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление.*
    - *Тип теста:* Сквозной тест
    - *Объяснение:* Этот тест охватывает полный цикл использования системы, начиная с создания контакта, затем редактирования данных и, наконец, удаления контакта. Он проверяет, как различные части системы взаимодействуют друг с другом.