import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Привет, как тебя зовут?");
        String name = input.nextLine();
        System.out.println("Приятно познакомиться, " + name);
        System.out.println(name + ", сколько тебе лет?");
        int age = input.nextInt();
        input.nextLine();
        System.out.println(age + ", какой ты молодой!");
        System.out.println(name + ", а чем ты увлекаешься?");
        String hobby = input.nextLine();
        System.out.println(hobby + ", мне это тоже нравится!");
        System.out.println("А чем ты хочешь заняться в будущем?");
        input.nextLine();
        System.out.println("Занятно..");
        System.out.println("А почему именно этим?");
        input.nextLine();
        System.out.println("А занимаешься ли ты каким-нибудь спортом?");
        input.nextLine();
        System.out.println("А что вас привлекает в нем?");
        input.nextLine();
        System.out.println("Какое твое любимое блюдо?");
        input.nextLine();
        System.out.println("Сколько раз в день вы кушаете?");
        input.nextLine();
        System.out.println("Какой ваш любимый напиток?");
        input.nextLine();
        System.out.println("А какой жанр музыки ты любишь?");
        input.nextLine();
        System.out.println(name + "а какое твое любимое время года?");
        input.nextLine();
        System.out.println("Ты любишь петь?");
        input.nextLine();
        System.out.println("Какой твой любимый фильм?");
        input.nextLine();
        System.out.println("А актер");
        input.nextLine();
        System.out.println("Какой ваш любимый сериал");
        input.nextLine();
        System.out.println("Какая твоя любимая книга?");
        input.nextLine();
        System.out.println("Что по-вашему мнению в этой книге главное?");
        input.nextLine();
        System.out.println("Вы участвуете в гонке. Обогнав второго, каким вы становитесь?");
        input.nextLine();
        System.out.println("Превосходно!");
        System.out.println("Было приятно с вами поговорить");
    }
}
