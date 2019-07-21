package lista;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListaTest {

    @Test
    public void testDodajElement() {

        // given
        int liczba1 = 2;
        int liczba2 = 1;
        int liczba3 = 5;

        // when
        Lista lista = new Lista(3);
        lista.dodajElement(liczba1);
        lista.dodajElement(liczba2);
        lista.dodajElement(liczba3);

        // then

        assertEquals(3,lista.getRozmiar());
    }

    @Test
    public void testPrzepelnienie() {

        // given
        int liczba1 = 2;
        int liczba2 = 1;
        int liczba3 = 5;
        int liczba4 = 3;

        // when
        Lista lista = new Lista(3);
        lista.dodajElement(liczba1);
        lista.dodajElement(liczba2);
        lista.dodajElement(liczba3);
        lista.dodajElement(liczba4);

        // then
        assertEquals(4,lista.getRozmiar());
    }

    @Test
    public void testZnajdz(){

        // given
        int liczba1 = 2;
        int liczba2 = 1;
        int liczba3 = 5;

        // when
        Lista lista = new Lista(3);
        lista.dodajElement(liczba1);
        lista.dodajElement(liczba2);
        lista.dodajElement(liczba3);

        int znaleziony = lista.znajdz(5);

        assertEquals(2,znaleziony);
    }
}