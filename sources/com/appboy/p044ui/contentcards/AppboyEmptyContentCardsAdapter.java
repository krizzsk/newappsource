package com.appboy.p044ui.contentcards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.p044ui.R$layout;

/* renamed from: com.appboy.ui.contentcards.AppboyEmptyContentCardsAdapter */
public class AppboyEmptyContentCardsAdapter extends RecyclerView.Adapter<RecyclerView.C1119a0> {

    /* renamed from: com.appboy.ui.contentcards.AppboyEmptyContentCardsAdapter$NetworkUnavailableViewHolder */
    public static class NetworkUnavailableViewHolder extends RecyclerView.C1119a0 {
        public NetworkUnavailableViewHolder(View view) {
            super(view);
        }
    }

    public int getItemCount() {
        return 1;
    }

    public void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
    }

    public RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new NetworkUnavailableViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_content_cards_empty, viewGroup, false));
    }
}
