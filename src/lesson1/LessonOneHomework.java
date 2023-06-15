package lesson1;

public class LessonOneHomework {

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

    }
}
