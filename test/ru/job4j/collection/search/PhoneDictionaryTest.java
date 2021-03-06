package ru.job4j.collection.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByAdress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Aleksey", "Kornetov", "+79167485031", "Moscow")
        );
        phones.add(
                new Person("Dmitriy", "Dmitriev", "+79167479556", "Moscow")
        );
        ArrayList<Person> persons = phones.find("Moscow");
        assertThat(persons.get(1).getAddress(), is("Moscow"));
    }
}