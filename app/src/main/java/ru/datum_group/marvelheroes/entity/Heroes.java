package ru.datum_group.marvelheroes.entity;

/**
 * Created by Andrienko Maxim on 25.04.19.
 */
public class Heroes {

    private String text;

    private String url;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * Возвращает саму строку
     * @return
     */
    @Override
    public String toString() {
        return text;
    }
}
