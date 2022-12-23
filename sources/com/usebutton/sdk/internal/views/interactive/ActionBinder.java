package com.usebutton.sdk.internal.views.interactive;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.InteractiveButton;
import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.models.Preview;
import com.usebutton.sdk.internal.util.Receiver;
import com.usebutton.sdk.internal.util.ViewUtils;
import com.usebutton.sdk.internal.views.LazyView;
import com.usebutton.sdk.internal.views.TwoLineInventoryView;
import com.usebutton.sdk.models.Inventory;
import com.usebutton.sdk.models.Link;
import java.util.List;

public class ActionBinder extends BaseBinder {
    private static final int MAX_ITEMS = 50;
    /* access modifiers changed from: private */
    public final ImageLoader mImageLoader;
    private List<Inventory> mInventory;
    /* access modifiers changed from: private */
    public int mItemLimit;

    public class PagerAdapter extends BaseInventoryAdapter {
        private final List<Inventory> mInventory;
        private final List<Inventory> mItems;
        /* access modifiers changed from: private */
        public final Receiver<Link> mOnInvoke;

        public PagerAdapter(List<Inventory> list, Receiver<Link> receiver) {
            super(ActionBinder.this.getContext(), ActionBinder.this.mRoot);
            this.mInventory = list;
            this.mOnInvoke = receiver;
            this.mItems = list.subList(0, Math.min(list.size(), ActionBinder.this.mItemLimit));
            ActionBinder.this.mPager.setCanScroll(true);
        }

        public int getCount() {
            return this.mItems.size();
        }

        @SuppressLint({"InflateParams"})
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LazyView lazyView = new LazyView(viewGroup.getContext());
            final Inventory inventory = this.mInventory.get(i);
            lazyView.load(C12238R.layout.btn_inventory_two_line_preview, new Receiver<TwoLineInventoryView>() {
                public void receive(TwoLineInventoryView twoLineInventoryView) {
                    twoLineInventoryView.setInventory(inventory, PagerAdapter.this.mOnInvoke, ActionBinder.this.mImageLoader);
                    ActionBinder.this.mPager.invalidate();
                }
            });
            lazyView.setLayoutParams(getItemLayoutParams());
            lazyView.setTag(inventory);
            viewGroup.addView(lazyView);
            return inventory;
        }

        public boolean isViewFromObject(View view, Object obj) {
            if (obj == null) {
                return false;
            }
            return obj.equals(view.getTag());
        }
    }

    public ActionBinder(InteractiveButton interactiveButton, ImageLoader imageLoader) {
        super(interactiveButton);
        this.mImageLoader = imageLoader;
    }

    /* access modifiers changed from: private */
    public Context getContext() {
        return this.mPager.getContext();
    }

    private int getInventoryLimit(Configuration configuration) {
        if (configuration == null || configuration.getParameters() == null) {
            return 50;
        }
        Configuration.Parameters parameters = configuration.getParameters();
        if (parameters.getInventoryButtonLimit() > 0) {
            return parameters.getInventoryButtonLimit();
        }
        return 50;
    }

    public void applyStyling(InteractiveButton.InteractiveStyle interactiveStyle) {
        super.applyStyling(interactiveStyle);
    }

    public void bind(AppAction appAction, Receiver<Link> receiver, Configuration configuration) {
        this.mPreviewView.setIsLoading(false);
        this.mInventory = appAction.getListBody().getGroups().get(0).getInventory();
        this.mItemLimit = getInventoryLimit(configuration);
        if (!(this.mPager.getAdapter() instanceof PagerAdapter)) {
            this.mPager.setAdapter(new PagerAdapter(this.mInventory, receiver));
        }
        Preview preview = appAction.getPreview();
        this.mPreviewView.bind(preview.getTitle(), preview.getText(), preview.getIcon());
        ViewUtils.hide(this.mLoadingDots);
        this.mLoadingDots.setVisibility(8);
    }
}
