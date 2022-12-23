package com.usebutton.sdk.internal.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewpager.widget.PagerAdapter;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.util.Receiver;
import com.usebutton.sdk.models.Inventory;
import com.usebutton.sdk.models.Link;
import java.util.List;

public abstract class InventoryPagerAdapter extends PagerAdapter {
    private final LayoutInflater mInflater;
    public final Receiver<Link> mOnInventorySelected;

    public InventoryPagerAdapter(Context context, Receiver<Link> receiver) {
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.mOnInventorySelected = receiver;
    }

    @SuppressLint({"InflateParams"})
    private View createInventoryView(Inventory inventory) {
        TwoLineInventoryView twoLineInventoryView = (TwoLineInventoryView) this.mInflater.inflate(C12238R.layout.btn_inventory_two_line, (ViewGroup) null, true);
        twoLineInventoryView.setInventory(inventory, this.mOnInventorySelected, (ImageLoader) null);
        return twoLineInventoryView;
    }

    public void destroyItem(View view, int i, Object obj) {
        destroyItem((ViewGroup) view, i, obj);
    }

    public abstract int getCount();

    @SuppressLint({"InflateParams"})
    public View inflateInventoryList(ViewGroup viewGroup, List<Inventory> list) {
        ScrollView scrollView = (ScrollView) this.mInflater.inflate(C12238R.layout.btn_inventory_group, (ViewGroup) null);
        ViewGroup viewGroup2 = (ViewGroup) scrollView.findViewById(C12238R.C12240id.group_items);
        for (Inventory createInventoryView : list) {
            viewGroup2.addView(createInventoryView(createInventoryView));
        }
        scrollView.setTag(scrollView);
        viewGroup.addView(scrollView);
        return scrollView;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag() == obj;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
