package lesson1;

public class LessonTwoHomework {

    public static void main(String[] args) {

        Author gogol = new Author("Николай", "Гоголь");
        Author chehov = new Author("Антон", "Чехов");

        Book deadSouls = new Book("Мёртвые души", gogol, 1849);
        Book ladyWithDog = new Book("Дама с собачкой", chehov, 1990);

        System.out.println("Книга " + deadSouls.getBookTitle()
                + ", год публикации " + deadSouls.getPublicationYear()
                + ", автор " + deadSouls.getAuthor().getAuthorName()
                + " " + deadSouls.getAuthor().getAuthorSurname());

        System.out.println("Книга " + ladyWithDog.getBookTitle()
                + ", год публикации " + ladyWithDog.getPublicationYear()
                + ", автор " + ladyWithDog.getAuthor().getAuthorName()
                + " " + ladyWithDog.getAuthor().getAuthorSurname());

        ladyWithDog.setPublicationYear(1898);

        System.out.println("Исправленный год публикации книги " + ladyWithDog.getBookTitle()
                + " -" + " " + ladyWithDog.getPublicationYear());

        System.out.println();

        System.out.println(gogol.toString());
        System.out.println(ladyWithDog.toString());

        System.out.println(gogol.equals(chehov));
        System.out.println(ladyWithDog.equals(deadSouls));

        System.out.println(gogol.hashCode());
        System.out.println(chehov.hashCode());
        System.out.println(ladyWithDog.hashCode());
        System.out.println(deadSouls.hashCode());
    }
}
