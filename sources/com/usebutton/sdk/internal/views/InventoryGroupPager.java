package com.usebutton.sdk.internal.views;

import android.content.Context;
import android.view.ViewGroup;
import com.usebutton.sdk.internal.util.Receiver;
import com.usebutton.sdk.models.InventoryGroup;
import com.usebutton.sdk.models.Link;
import java.util.ArrayList;
import java.util.List;

public class InventoryGroupPager extends InventoryPagerAdapter {
    private static final String TAG = "InventoryGroupPager";
    private final List<InventoryGroup> mGroups;

    public InventoryGroupPager(Context context, List<InventoryGroup> list, Receiver<Link> receiver) {
        super(context, receiver);
        ArrayList arrayList = new ArrayList();
        this.mGroups = arrayList;
        arrayList.addAll(list);
    }

    public int getCount() {
        return this.mGroups.size();
    }

    public CharSequence getPageTitle(int i) {
        return this.mGroups.get(i).getName();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return inflateInventoryList(viewGroup, this.mGroups.get(i).getInventory());
    }
}
