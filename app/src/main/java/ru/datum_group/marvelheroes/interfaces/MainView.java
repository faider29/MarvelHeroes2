package ru.datum_group.marvelheroes.interfaces;

import com.arellomobile.mvp.MvpView;

import java.util.List;

import ru.datum_group.marvelheroes.entity.Heroes;

/**
 * Created by Andrienko Maxim on 25.04.19.
 */
public interface MainView extends MvpView {

    void showCards(List <Heroes> mHeroesList);
}
