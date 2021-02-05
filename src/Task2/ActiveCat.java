package Task2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

// код можно менять только в особо отмеченных местах этого файла.
// то есть там, где написаны три знака вопроса "???"
// так же возможно вам понадобится добавить что-то в
// блок import и поменять имя пакета
// в остальных местах этого файла код менять не разрешается.

public class ActiveCat {
    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach", "Ginger", "Toby", "Seth", "Tibbles", "Tabby", "Poppy", "Millie", "Daisy", "Jasper", "Misty", "Minka");
    private final String name;

    private String  action;

    public ActiveCat(String action) {
        name = names.get(r.nextInt(names.size()));
        this.action = action;
    }

    public final String getName() {
        return name;
    }

    public void doAction() {
        System.out.printf("Я %s. %s%n", name, action);
    }

    /*****/
    // Действия доступные для котов

    public static String jump() {
        return "Я прыгаю!";
    }

    public static String sleep() {
        return "Я сплю!";
    }

    public static String eat() {
        return "Я кушаю!";
    }
    public static String playing() {
        return "Я играю!";
    }
    public static String hunting() {
        return "Я охочусь!";
    }
    /*****/
}
