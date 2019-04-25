package ru.datum_group.marvelheroes.presenter;

import android.view.View;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import java.util.List;

import ru.datum_group.marvelheroes.entity.Heroes;
import ru.datum_group.marvelheroes.interfaces.MainView;

/**
 * Created by Andrienko Maxim on 25.04.19.
 */
@InjectViewState
public class MainPresenter
        extends MvpPresenter<MainView> {




    public  void MainPresenter(String listHeroes){
        getViewState().showCards(listHeroes);
    }



}
