package com.usebutton.sdk.internal.purchasepath;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

public class CardListGridLayoutManager extends GridLayoutManager {
    private static final int SPAN_COUNT = 1;

    public CardListGridLayoutManager(Context context) {
        super(context, 1);
    }

    public boolean supportsPredictiveItemAnimations() {
        return true;
    }
}
