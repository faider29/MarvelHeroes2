package ru.datum_group.marvelheroes.view;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import java.util.ArrayList;
import java.util.List;

import ru.datum_group.marvelheroes.R;
import ru.datum_group.marvelheroes.adapter.MainAdapter;
import ru.datum_group.marvelheroes.entity.Heroes;
import ru.datum_group.marvelheroes.interfaces.MainView;
import ru.datum_group.marvelheroes.presenter.MainPresenter;

public class MainActivity
        extends MvpAppCompatActivity implements MainView {

    private RecyclerView mRecyclerView;
    private MainAdapter mMainAdapter;
    private List<String[]> mHeroesList = new ArrayList<String[]>();

    @InjectPresenter
    MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(
                R.layout.ac_main);


//        Heroes hero1 = new Heroes();
//        mHeroesList.add(hero1);

        mMainAdapter = new MainAdapter();
        mRecyclerView.findViewById(R.id.rv_main);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(mMainAdapter);

        //mMainPresenter.start();

    }




    @Override
    public void showCards(List<Heroes> mHeroesList) {
        mMainAdapter.addList(mHeroesList);
        mMainAdapter.notifyDataSetChanged();
    }

//    public void addHeroes(){
//
//    }
}
