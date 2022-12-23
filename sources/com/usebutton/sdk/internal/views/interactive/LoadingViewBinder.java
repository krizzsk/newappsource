package com.usebutton.sdk.internal.views.interactive;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.InteractiveButton;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.models.Text;
import com.usebutton.sdk.internal.util.CompatHelpers;
import com.usebutton.sdk.internal.util.Receiver;
import com.usebutton.sdk.internal.util.ViewUtils;
import com.usebutton.sdk.internal.views.TwoLineInventoryView;
import com.usebutton.sdk.models.Link;

public class LoadingViewBinder extends BaseBinder {

    public static class LoadingAdapter extends BaseInventoryAdapter {
        public LoadingAdapter(Context context, InteractiveButton interactiveButton) {
            super(context, interactiveButton);
        }

        public int getCount() {
            return 5;
        }

        @SuppressLint({"InflateParams"})
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            TwoLineInventoryView twoLineInventoryView = (TwoLineInventoryView) getInflater().inflate(C12238R.layout.btn_inventory_two_line_preview, (ViewGroup) null);
            twoLineInventoryView.showPlaceHolders();
            twoLineInventoryView.setLayoutParams(getItemLayoutParams());
            viewGroup.addView(twoLineInventoryView);
            twoLineInventoryView.setTag(Integer.valueOf(i));
            return Integer.valueOf(i);
        }
    }

    public LoadingViewBinder(InteractiveButton interactiveButton) {
        super(interactiveButton);
    }

    private Context getContext() {
        return this.mPager.getContext();
    }

    public void applyStyling(InteractiveButton.InteractiveStyle interactiveStyle) {
        super.applyStyling(interactiveStyle);
    }

    public void bind(AppAction appAction, Receiver<Link> receiver, Configuration configuration) {
        if (this.mRoot.isInEditMode()) {
            this.mPreviewView.bind((Text) null, Text.white("Lorem ipsum doler sit amet"), CompatHelpers.getDrawable(getContext(), C12238R.C12239drawable.btn_ic_app_button));
        }
        this.mPager.setAdapter(new LoadingAdapter(getContext(), this.mRoot));
        this.mPager.setCanScroll(false);
        this.mPreviewView.setIsLoading(true);
        ViewUtils.show(this.mLoadingDots);
    }
}
