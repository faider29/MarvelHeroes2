package ru.datum_group.marvelheroes.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import ru.datum_group.marvelheroes.Const.Constans;
import ru.datum_group.marvelheroes.R;
import ru.datum_group.marvelheroes.entity.Heroes;

/**
 * Created by Andrienko Maxim on 25.04.19.
 */
public class MainAdapter
        extends RecyclerView.Adapter<MainAdapter.HeroesHolder> {

    private List<Heroes> mHeroesList = new ArrayList<>();

    @NonNull
    @Override
    public HeroesHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,
                                           int i) {
        View view = LayoutInflater.from(
                viewGroup.getContext())
                .inflate(R.layout.item_main_heroes,
                        viewGroup,
                        false);
        return new HeroesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroesHolder heroesHolder,
                                 int i) {
        heroesHolder.setTextView(mHeroesList
                .get(i)
                .getText());
    }

    @Override
    public int getItemCount() {
        return mHeroesList.size();
    }

    public class HeroesHolder
            extends RecyclerView.ViewHolder {

        private ImageView mUrl;
        private TextView mTextView;

        public HeroesHolder(@NonNull View itemView) {
            super(itemView);

            Glide.with(itemView.getContext())
                    .load(Constans.IMAGE_URL)
                    .into(mUrl);
            mTextView = itemView.findViewById(
                    R.id.tv_heroes);
            mUrl = itemView.findViewById(
                    R.id.iv_heroes);
        }

        public ImageView getUrl() {
            return mUrl;
        }

        public void setTextView(String textView) {
            mTextView.setText(textView);
        }
    }

    public void addList(List<Heroes> heroes){
    mHeroesList.addAll(heroes);
    }


}
