package com.usebutton.sdk.internal.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.models.Footer;
import com.usebutton.sdk.internal.models.Text;
import com.usebutton.sdk.internal.util.CompatHelpers;
import com.usebutton.sdk.internal.util.Receiver;
import com.usebutton.sdk.internal.util.ViewUtils;
import com.usebutton.sdk.models.Inventory;
import com.usebutton.sdk.models.Link;

public class OneLineInventoryView extends LinearLayout {
    public final StringBuilder mDescriptionBuilder;
    public AssetImageView mIcon;
    public int mPlaceholderBackground;
    private TextView mPrimary;
    private View mPrimaryPlaceholder;

    public OneLineInventoryView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setText(Text text) {
        setTextAndVisibility(this.mPrimary, text);
    }

    public CharSequence getContentDescription() {
        return this.mDescriptionBuilder.toString();
    }

    public void hidePlaceholders() {
        setClickable(true);
        ViewUtils.hide(this.mPrimaryPlaceholder);
    }

    public void init() {
        this.mPlaceholderBackground = CompatHelpers.getColor(getContext(), C12238R.color.btn_placeholder);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mPrimary = (TextView) findViewById(C12238R.C12240id.inventory_primary);
        this.mPrimaryPlaceholder = findViewById(C12238R.C12240id.inventory_primary_placeholder);
        this.mIcon = (AssetImageView) findViewById(C12238R.C12240id.inventory_icon);
    }

    public void setFooter(final Footer footer, final Receiver<Link> receiver) {
        if (footer == null) {
            setVisibility(8);
            return;
        }
        setClickable(true);
        setVisibility(0);
        setText(footer.getText());
        setIcon(footer.getIcon(), (ImageLoader) null);
        CompatHelpers.setBackground(this, CompatHelpers.RippleBackground.fromColor(footer.getBackgroundColor()));
        setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Receiver receiver = receiver;
                if (receiver != null) {
                    receiver.receive(footer.getAction());
                }
            }
        });
    }

    public void setIcon(Asset asset, ImageLoader imageLoader) {
        setOrLoadAsset(this.mIcon, imageLoader, asset);
    }

    public void setInventory(final Inventory inventory, final Receiver<Link> receiver, ImageLoader imageLoader) {
        hidePlaceholders();
        setClickable(true);
        setText(inventory.getPrimary());
        setIcon(inventory.getIcon(), imageLoader);
        setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                receiver.receive(inventory.getAction());
            }
        });
    }

    public void setOrLoadAsset(AssetImageView assetImageView, ImageLoader imageLoader, Asset asset) {
        if (asset == null || !asset.isEmpty() || imageLoader == null) {
            assetImageView.setAsset(asset);
        } else {
            assetImageView.loadAsset(imageLoader, asset);
        }
    }

    public void setTextAndVisibility(TextView textView, Text text) {
        if (text == null || TextUtils.isEmpty(text.getCopy())) {
            textView.setVisibility(8);
            return;
        }
        ViewUtils.show(textView);
        textView.setText(text.getCopy());
        textView.setTextColor(text.getColor());
        if (this.mDescriptionBuilder.length() > 0) {
            this.mDescriptionBuilder.append(' ');
        }
        this.mDescriptionBuilder.append(text.getCopy());
    }

    public void showPlaceHolders() {
        setClickable(false);
        ViewUtils.hide(this.mIcon);
        ViewUtils.hide(this.mPrimary);
        ViewUtils.show(this.mPrimaryPlaceholder);
    }

    public OneLineInventoryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OneLineInventoryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDescriptionBuilder = new StringBuilder();
        init();
    }

    @TargetApi(21)
    public OneLineInventoryView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mDescriptionBuilder = new StringBuilder();
        init();
    }
}
