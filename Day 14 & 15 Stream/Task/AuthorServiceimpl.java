package Task;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

interface AuthorService {
    Set<String> getUniqueSurnames(List<Author> authorList);
    List<Author> getAuthorsByCity(List<Author> authorList, String city);
    double femaleAverageAge(List<Author> authorList);
    Long getMobileByAdhar(List<Author> authorList, Long adharCard);
}

public class AuthorServiceimpl implements AuthorService {

    public Set<String> getUniqueSurnames(List<Author> authorList) {
        return authorList.stream()
                .map(c -> c.surname)
                .collect(Collectors.toSet());
    }

    public List<Author> getAuthorsByCity(List<Author> authorList, String city) {
        return authorList.stream()
                .filter(author -> author.city.equals(city))
                .collect(Collectors.toList());
    }

    public double femaleAverageAge(List<Author> authorList) {
        return authorList.stream()
                .filter(author -> author.gender.equalsIgnoreCase("Female"))
                .mapToInt(author -> author.birthdate.until(LocalDate.now()).getYears())
                .average()
                .orElse(0);
    }

    public Long getMobileByAdhar(List<Author> authorList, Long adharCard) {
        return authorList.stream()
                .filter(author -> author.adharCard.equals(adharCard))
                .map(author -> author.mobile)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        List<Author> authors = Arrays.asList(
                new Author(1234567890L, "Smith", "John", "Doe", LocalDate.of(1980, 5, 15), "Male", "New York", 9876543210L),
                new Author(1234567891L, "Johnson", "Jane", "Doe", LocalDate.of(1990, 3, 10), "Female", "Los Angeles", 9876543211L),
                new Author(1234567892L, "Brown", "Emily", "Clark", LocalDate.of(1985, 8, 20), "Female", "New York", 9876543212L),
                new Author(1234567893L, "Wilson", "Chris", "Smith", LocalDate.of(1975, 1, 5), "Male", "Chicago", 9876543213L)
        );

        AuthorService authorService = new AuthorServiceimpl();

        System.out.println("Unique Surnames: " + authorService.getUniqueSurnames(authors));
        System.out.println("Authors in New York: " + authorService.getAuthorsByCity(authors, "New York"));
        System.out.println("Female Average Age: " + authorService.femaleAverageAge(authors));
        System.out.println("Mobile by Adhar Card 1234567891: " + authorService.getMobileByAdhar(authors, 1234567891L));
    }
}