package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void saveMovie0() {      //вывод пустого списка
        PosterManager post = new PosterManager();

        String[] expected = {};
        String[] actual = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void saveMovie1() {          //добавление 1 фильма и вывод списка
        PosterManager post = new PosterManager();

        post.saveMovie("Movie 1");
        String[] expected = {"Movie 1"};
        String[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void saveMovie3() {      //добавление 3 фильма и вывод
        PosterManager post = new PosterManager();

        post.saveMovie("Movie 1");
        post.saveMovie("Movie 2");
        post.saveMovie("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {      //вывод 5 фильмов в обратном порядке без ввода лимита
        PosterManager post = new PosterManager();

        post.saveMovie("Movie 1");
        post.saveMovie("Movie 2");
        post.saveMovie("Movie 3");
        post.saveMovie("Movie 4");
        post.saveMovie("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast4() {      //вывод 4 фильмов в обратном порядке без ввода лимита
        PosterManager post = new PosterManager();

        post.saveMovie("Movie 1");
        post.saveMovie("Movie 2");
        post.saveMovie("Movie 3");
        post.saveMovie("Movie 4");

        String[] expected = {"Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast6() {      //вывод 5 фильмов в обратном порядке без ввода лимита
        PosterManager post = new PosterManager();

        post.saveMovie("Movie 1");
        post.saveMovie("Movie 2");
        post.saveMovie("Movie 3");
        post.saveMovie("Movie 4");
        post.saveMovie("Movie 5");
        post.saveMovie("Movie 6");

        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit5() {      //вывод 5 фильмов в обратном порядке c вводом лимита
        PosterManager post = new PosterManager(5);

        post.saveMovie("Movie 1");
        post.saveMovie("Movie 2");
        post.saveMovie("Movie 3");
        post.saveMovie("Movie 4");
        post.saveMovie("Movie 5");
        post.saveMovie("Movie 6");


        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit0() {      //вывод 0 фильмов в обратном порядке c вводом лимита
        PosterManager post = new PosterManager(0);

        post.saveMovie("Movie 1");
        post.saveMovie("Movie 2");
        post.saveMovie("Movie 3");
        post.saveMovie("Movie 4");
        post.saveMovie("Movie 5");

        String[] expected = {};
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit3() {      //вывод 3 фильмов в обратном порядке c вводом лимита
        PosterManager post = new PosterManager(3);

        post.saveMovie("Movie 1");
        post.saveMovie("Movie 2");
        post.saveMovie("Movie 3");
        post.saveMovie("Movie 4");
        post.saveMovie("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3"};
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}

