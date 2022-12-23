package com.usebutton.sdk.internal.views.interactive;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.viewpager.widget.ViewPager;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.InteractiveButton;
import com.usebutton.sdk.internal.util.CompatHelpers;
import com.usebutton.sdk.internal.views.AssetImageView;
import com.usebutton.sdk.internal.views.HumbleViewPager;
import com.usebutton.sdk.internal.views.LoadingDots;
import com.usebutton.sdk.internal.views.PreviewView;

public abstract class BaseBinder implements ViewBinder {
    public final Space mLeftSpace;
    public final LoadingDots mLoadingDots;
    public final HumbleViewPager mPager;
    public final PreviewView mPreviewView;
    public final Space mRightSpace;
    public final InteractiveButton mRoot;

    public BaseBinder(InteractiveButton interactiveButton) {
        this.mRoot = interactiveButton;
        this.mLeftSpace = (Space) interactiveButton.findViewById(C12238R.C12240id.btn_preview_left_space);
        this.mRightSpace = (Space) interactiveButton.findViewById(C12238R.C12240id.btn_preview_right_space);
        this.mPreviewView = (PreviewView) interactiveButton.findViewById(C12238R.C12240id.btn_preview);
        HumbleViewPager humbleViewPager = (HumbleViewPager) interactiveButton.findViewById(C12238R.C12240id.btn_inventory_pager);
        this.mPager = humbleViewPager;
        this.mLoadingDots = (LoadingDots) interactiveButton.findViewById(C12238R.C12240id.btn_preview_loading);
        stylePager(humbleViewPager);
    }

    private void stylePager(ViewPager viewPager) {
        viewPager.setPageMargin(viewPager.getResources().getDimensionPixelSize(C12238R.dimen.btn_inventory_margin));
        viewPager.setOffscreenPageLimit(2);
    }

    public void applyStyling(InteractiveButton.InteractiveStyle interactiveStyle) {
        if (interactiveStyle.textSize != null) {
            this.mPreviewView.getLabel().setTextSize(0, (float) interactiveStyle.textSize.intValue());
            this.mPreviewView.getTitle().setTextSize(0, ((float) interactiveStyle.textSize.intValue()) * 0.78f);
        }
        Integer num = interactiveStyle.backgroundColor;
        if (num != null) {
            this.mRoot.setBackgroundColor(num.intValue());
        } else {
            Integer num2 = interactiveStyle.backgroundDrawableResource;
            if (num2 != null) {
                this.mRoot.setBackgroundResource(num2.intValue());
            } else {
                CompatHelpers.setBackground(this.mRoot, interactiveStyle.backgroundDrawable);
            }
        }
        setPaddingLeft(this.mPager, interactiveStyle.inventoryLeftPadding);
        AssetImageView icon = this.mPreviewView.getIcon();
        Integer num3 = interactiveStyle.iconSize;
        if (num3 != null) {
            if (num3.intValue() == 0) {
                icon.setVisibility(4);
            } else {
                icon.setVisibility(0);
            }
            ViewGroup.LayoutParams layoutParams = icon.getLayoutParams();
            layoutParams.height = interactiveStyle.iconSize.intValue();
            layoutParams.width = interactiveStyle.iconSize.intValue();
            icon.setLayoutParams(layoutParams);
        }
        setWidth(this.mLeftSpace, interactiveStyle.drawablePaddingLeft);
        setWidth(this.mRightSpace, interactiveStyle.drawablePaddingRight);
    }

    public ViewPager getPager() {
        return this.mPager;
    }

    public void setMarginLeft(View view, Integer num) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(num.intValue(), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public void setPaddingLeft(View view, Integer num) {
        view.setPadding(num != null ? num.intValue() : 0, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public void setWidth(View view, Integer num) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        layoutParams.width = i;
    }
}
