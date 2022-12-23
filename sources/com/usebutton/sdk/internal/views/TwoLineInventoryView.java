package com.usebutton.sdk.internal.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.util.Receiver;
import com.usebutton.sdk.internal.util.ViewUtils;
import com.usebutton.sdk.models.Inventory;
import com.usebutton.sdk.models.Link;

public class TwoLineInventoryView extends OneLineInventoryView {
    private AssetImageView mIconFull;
    private TextView mIconText;
    private TextView mSecondary;
    private View mSecondaryPlaceholder;

    public TwoLineInventoryView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void hidePlaceholders() {
        super.hidePlaceholders();
        ViewUtils.hide(this.mSecondaryPlaceholder);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mSecondary = (TextView) findViewById(C12238R.C12240id.inventory_secondary);
        this.mSecondaryPlaceholder = findViewById(C12238R.C12240id.inventory_secondary_placeholder);
        this.mIconText = (TextView) findViewById(C12238R.C12240id.inventory_icon_text);
        this.mIconFull = (AssetImageView) findViewById(C12238R.C12240id.inventory_icon_full);
    }

    public void setIcon(Asset asset, ImageLoader imageLoader) {
        if (this.mIconText.getVisibility() == 0) {
            setOrLoadAsset(this.mIcon, imageLoader, asset);
            this.mIconFull.setVisibility(8);
            return;
        }
        setOrLoadAsset(this.mIconFull, imageLoader, asset);
        this.mIcon.setVisibility(8);
    }

    public void setInventory(Inventory inventory, Receiver<Link> receiver, ImageLoader imageLoader) {
        super.setInventory(inventory, receiver, imageLoader);
        hidePlaceholders();
        setTextAndVisibility(this.mSecondary, inventory.getSecondary());
        setTextAndVisibility(this.mIconText, inventory.getIconText());
    }

    public void showPlaceHolders() {
        super.showPlaceHolders();
        this.mSecondary.setVisibility(8);
        this.mIconFull.setVisibility(8);
        this.mIconText.setVisibility(8);
        ViewUtils.show(this.mSecondaryPlaceholder);
    }

    public TwoLineInventoryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoLineInventoryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public TwoLineInventoryView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
