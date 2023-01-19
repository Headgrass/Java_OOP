package HomeWorks.HW1;

import Seminars.Sem1.Transport;

/**
 * У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы,
 * в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, принемающие все поля.
 * Реализовать в классе Program, метод выводящий все данные о товаре. Создать в Main все объекты
 * товаров и проверить работу метода, созданного в классе Program
 */
public class Program {

    public static void main(String[] args) {
        BaseProduct diapers = new Diapers("Huggies", 800, 48, "шт", 3, true,
                'M', 8, 12, "Ночные");
        BaseProduct eggs = new Eggs("Яйца Кольцовские", 80, 10, "шт", "30.01.2023");
        BaseProduct flour = new Flour("Мука первый сорт", 60, 2, "кг", "25.06.2023",
                "Ржаная");
        BaseProduct lemonade = new Lemonade("Лимонад Буратино", 55, 1,"бут.", "08.01.2024");
        BaseProduct mask = new Masks("Маска медицинская", 50, 1, "упкаовка", 10);
        BaseProduct milk = new Milk("Молоко", 85, 1,"бут", 0.93,2.5, "2.02.2023");
        BaseProduct pacifier = new Pacifier("Соска-пустышка", 40, 1, "шт", 0, true);

        BaseProduct[] all = new BaseProduct[] {diapers, eggs, flour, lemonade, mask, milk, pacifier};
        showAllProduct(all);
    }

    private static void showAllProduct(BaseProduct[] all) {
        for (BaseProduct products: all) {
            System.out.println(products);
        }
    }
}
