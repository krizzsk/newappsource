package com.appboy.p044ui.contentcards.recycler;

import androidx.recyclerview.widget.C1227p;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.appboy.ui.contentcards.recycler.SimpleItemTouchHelperCallback */
public class SimpleItemTouchHelperCallback extends C1227p.C1231d {
    private final ItemTouchHelperAdapter mAdapter;

    public SimpleItemTouchHelperCallback(ItemTouchHelperAdapter itemTouchHelperAdapter) {
        this.mAdapter = itemTouchHelperAdapter;
    }

    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.C1119a0 a0Var) {
        int i;
        if (this.mAdapter.isItemDismissable(a0Var.getAdapterPosition())) {
            i = 16;
        } else {
            i = 0;
        }
        return C1227p.C1231d.makeMovementFlags(0, i);
    }

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public boolean isLongPressDragEnabled() {
        return false;
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView.C1119a0 a0Var, RecyclerView.C1119a0 a0Var2) {
        return false;
    }

    public void onSwiped(RecyclerView.C1119a0 a0Var, int i) {
        this.mAdapter.onItemDismiss(a0Var.getAdapterPosition());
    }
}
