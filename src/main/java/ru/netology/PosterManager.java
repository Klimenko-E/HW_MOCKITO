package ru.netology;

public class PosterManager {
    private String[] movies = new String[0];
    private int resultLength = 5;

    public PosterManager() {

    }

    ;

    public PosterManager(int resultLength) {
        this.resultLength = resultLength;
    }

    ;


    public void saveMovie(String movie) {      // добавление фильма
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    public String[] findAll() {      //вывод всех фильмов
        return movies;

    }

    public String[] findLast() {       //вывод последних фильмов в обратном порядке

        if (movies.length < resultLength) {
            resultLength = movies.length;
        } else {
            resultLength = this.resultLength;
        }

        String[] tmp = new String[resultLength];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
