class ListCompare:
    """
    Этот класс сравнивает средние значения двух списков.
    """

    def __init__(self, list1, list2):
        """
        Конструктор класса.

        :param list1: Первый список чисел.
        :param list2: Второй список чисел.
        """
        self.list1 = list1
        self.list2 = list2

    def calculate_average(self, input_list):
        """
        Рассчитать среднее значение списка.

        :param input_list: Список чисел.
        :return: Среднее значение.
        """
        if len(input_list) == 0:
            return 0
        return sum(input_list) / len(input_list)

    def compare_lists(self):
        """
        Сравнить средние значения двух списков и вернуть сообщение.

        :return: Сообщение, указывающее, какой список имеет большее среднее значение.
        """
        average_one = self.calculate_average(self.list1)
        average_two = self.calculate_average(self.list2)

        if average_one > average_two:
            return "Первый список имеет большее среднее значение"
        if average_one > average_two:
            return "Второй список имеет большее среднее значение"
        return "Средние значения равны"
