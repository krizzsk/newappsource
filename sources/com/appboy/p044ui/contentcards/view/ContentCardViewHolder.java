package com.appboy.p044ui.contentcards.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.p044ui.R$drawable;
import com.appboy.p044ui.R$id;

/* renamed from: com.appboy.ui.contentcards.view.ContentCardViewHolder */
public class ContentCardViewHolder extends RecyclerView.C1119a0 {
    private final TextView mActionHint;
    private final ImageView mPinnedIcon;
    private final View mUnreadBar;

    public ContentCardViewHolder(View view, boolean z) {
        super(view);
        View findViewById = view.findViewById(R$id.com_appboy_content_cards_unread_bar);
        this.mUnreadBar = findViewById;
        if (findViewById != null) {
            if (z) {
                findViewById.setVisibility(0);
                findViewById.setBackground(view.getContext().getResources().getDrawable(R$drawable.com_appboy_content_cards_unread_bar_background));
            } else {
                findViewById.setVisibility(8);
            }
        }
        this.mPinnedIcon = (ImageView) view.findViewById(R$id.com_appboy_content_cards_pinned_icon);
        this.mActionHint = (TextView) view.findViewById(R$id.com_appboy_content_cards_action_hint);
    }

    public void setActionHintText(String str) {
        TextView textView = this.mActionHint;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setActionHintVisible(boolean z) {
        int i;
        TextView textView = this.mActionHint;
        if (textView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public void setPinnedIconVisible(boolean z) {
        int i;
        ImageView imageView = this.mPinnedIcon;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setUnreadBarVisible(boolean z) {
        int i;
        View view = this.mUnreadBar;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
