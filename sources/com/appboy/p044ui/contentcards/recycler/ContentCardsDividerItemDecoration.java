package com.appboy.p044ui.contentcards.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.p044ui.R$dimen;
import com.appboy.p044ui.contentcards.AppboyCardAdapter;

/* renamed from: com.appboy.ui.contentcards.recycler.ContentCardsDividerItemDecoration */
public class ContentCardsDividerItemDecoration extends RecyclerView.C1133l {
    private final Context mContext;
    private final int mItemDividerHeight = getItemDividerHeight();
    private final int mItemDividerMaxWidth = getContentCardsItemMaxWidth();

    public ContentCardsDividerItemDecoration(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private int getContentCardsItemMaxWidth() {
        return this.mContext.getResources().getDimensionPixelSize(R$dimen.com_appboy_content_cards_max_width);
    }

    private int getItemDividerHeight() {
        return this.mContext.getResources().getDimensionPixelSize(R$dimen.com_appboy_content_cards_divider_height);
    }

    private int getSidePaddingValue(int i) {
        return Math.max((i - this.mItemDividerMaxWidth) / 2, 0);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        boolean z;
        int i;
        super.getItemOffsets(rect, view, recyclerView, xVar);
        recyclerView.getClass();
        int I = RecyclerView.m3000I(view);
        int i2 = 0;
        if (recyclerView.getAdapter() instanceof AppboyCardAdapter) {
            z = ((AppboyCardAdapter) recyclerView.getAdapter()).isControlCardAtPosition(I);
        } else {
            z = false;
        }
        if (I == 0) {
            i = this.mItemDividerHeight;
        } else {
            i = 0;
        }
        rect.top = i;
        if (!z) {
            i2 = this.mItemDividerHeight;
        }
        rect.bottom = i2;
        rect.left = getSidePaddingValue(recyclerView.getWidth());
        rect.right = getSidePaddingValue(recyclerView.getWidth());
    }
}
