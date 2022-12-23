package com.usebutton.sdk.internal.views.interactive;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.InteractiveButton;

public abstract class BaseInventoryAdapter extends PagerAdapter {
    public static final String TAG = "InventoryAdapter";
    private final int mItemHeight;
    private final int mItemWidth;
    private final int mItemWidthMax;
    private final int mItemWidthMin;
    private final InteractiveButton mRoot;

    public BaseInventoryAdapter(Context context, InteractiveButton interactiveButton) {
        this.mRoot = interactiveButton;
        Resources resources = context.getResources();
        this.mItemWidthMin = resources.getDimensionPixelSize(C12238R.dimen.btn_inventory_width_min);
        this.mItemWidthMax = resources.getDimensionPixelSize(C12238R.dimen.btn_inventory_width_max);
        this.mItemWidth = resources.getDimensionPixelSize(C12238R.dimen.btn_inventory_width);
        this.mItemHeight = resources.getDimensionPixelSize(C12238R.dimen.btn_inventory_height);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(viewGroup.findViewWithTag(obj));
    }

    public LayoutInflater getInflater() {
        return LayoutInflater.from(this.mRoot.getContext());
    }

    public int getItemHeight() {
        return this.mItemHeight;
    }

    public ViewPager.LayoutParams getItemLayoutParams() {
        ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
        layoutParams.height = -2;
        layoutParams.width = getItemWidth();
        return layoutParams;
    }

    public int getItemWidth() {
        return this.mItemWidth;
    }

    public float getPageWidth(int i) {
        int width = (this.mRoot.getWidth() - this.mRoot.getPaddingLeft()) - this.mRoot.getPaddingRight();
        if (width == 0) {
            return 0.8f;
        }
        return (((float) this.mItemWidth) * 1.0f) / ((float) width);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag() == obj;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
