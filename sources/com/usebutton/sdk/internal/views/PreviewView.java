package com.usebutton.sdk.internal.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.models.Text;
import com.usebutton.sdk.internal.util.CompatHelpers;

public class PreviewView extends LinearLayout {
    private AssetImageView mIcon;
    private TextView mLabel;
    private View mLoading;
    private ViewGroup mTextsContainer;
    private TextView mTitle;

    public PreviewView(Context context) {
        super(context);
    }

    private void bindTexts(Text text, Text text2) {
        Text.applyTo(this.mTitle, text);
        Text.applyTo(this.mLabel, text2);
    }

    public void bind(Text text, Text text2, Asset asset) {
        bindTexts(text, text2);
        if (asset != null) {
            this.mIcon.setAsset(asset);
        }
    }

    public AssetImageView getIcon() {
        return this.mIcon;
    }

    public TextView getLabel() {
        return this.mLabel;
    }

    public View getLoadingView() {
        return this.mLoading;
    }

    public ViewGroup getTextsContainer() {
        return this.mTextsContainer;
    }

    public TextView getTitle() {
        return this.mTitle;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mTitle = (TextView) findViewById(C12238R.C12240id.btn_preview_title);
        this.mLabel = (TextView) findViewById(C12238R.C12240id.btn_preview_label);
        this.mTextsContainer = (ViewGroup) findViewById(C12238R.C12240id.btn_texts);
        this.mIcon = (AssetImageView) findViewById(C12238R.C12240id.btn_preview_icon);
        this.mLoading = findViewById(C12238R.C12240id.btn_preview_loading);
    }

    public void setIsLoading(boolean z) {
        int i;
        int i2;
        int i3;
        AssetImageView assetImageView = this.mIcon;
        int i4 = 0;
        if (z) {
            i = CompatHelpers.getColor(getContext(), C12238R.color.btn_placeholder);
        } else {
            i = 0;
        }
        assetImageView.setBackgroundColor(i);
        View view = this.mLoading;
        if (view != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
        TextView textView = this.mTitle;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        TextView textView2 = this.mLabel;
        if (z) {
            i4 = 8;
        }
        textView2.setVisibility(i4);
        if (z) {
            this.mIcon.setImageDrawable((Drawable) null);
        }
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void bind(Text text, Text text2, Drawable drawable) {
        bindTexts(text, text2);
        if (drawable != null) {
            this.mIcon.setImageDrawable(drawable);
        }
    }

    @TargetApi(21)
    public PreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
