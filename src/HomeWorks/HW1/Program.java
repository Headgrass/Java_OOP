package HomeWorks.HW1;

/**
 * У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы, в котором будет
 * происходить вывод всей информации о товаре, так же реализовать конструкторы, принемающие все поля.
 * Реализовать в классе Program, метод выводящий все данные о товаре. Создать в Main все объекты товаров и п
 * роверить работу метода, созданного в классе Program
 */
public class Program {
    private static void showAllProduct(BaseProduct[] all) {
        for (BaseProduct baseProduct: all) {
            baseProduct.toString();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BaseProduct diapers = new Diapers("Huggies", 1200, 1, "шт", 48,'M', 8, 12, "Ночные");
        BaseProduct drinks = new Drinks("Fanta", 50, 1, "бутылка", "17.02.2024",0.5);
        Groceries egg = new Egg("Яйцо", 80, 10, "шт", "17.02.2023");
        Groceries flour = new Flour("Мука", 60, 1, "пакет", "17.08.2023", "Ржаная");


        BaseProduct[] all = new BaseProduct[] {diapers, drinks, egg, flour};

        showAllProduct(all);
    }


}
