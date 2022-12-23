package com.usebutton.sdk.internal.views;

import android.content.Context;
import android.view.ViewGroup;
import com.usebutton.sdk.internal.util.Receiver;
import com.usebutton.sdk.models.Inventory;
import com.usebutton.sdk.models.InventoryGroup;
import com.usebutton.sdk.models.Link;
import java.util.ArrayList;
import java.util.List;

public class SingleInventoryAdapter extends InventoryPagerAdapter {
    private final List<Inventory> mInventory;
    private final String mTitle;

    public SingleInventoryAdapter(Context context, Receiver<Link> receiver, InventoryGroup inventoryGroup) {
        super(context, receiver);
        ArrayList arrayList = new ArrayList();
        this.mInventory = arrayList;
        arrayList.addAll(inventoryGroup.getInventory());
        this.mTitle = inventoryGroup.getName();
    }

    public int getCount() {
        return 1;
    }

    public CharSequence getPageTitle(int i) {
        return this.mTitle;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return inflateInventoryList(viewGroup, this.mInventory);
    }
}
