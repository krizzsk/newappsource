package com.usebutton.sdk.internal.views;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.models.Asset;
import java.util.List;

public class ImageLoadingAdapter extends PagerAdapter {
    private final List<Asset> mImages;
    private final ImageLoader mLoader;
    private final boolean mShouldPadImages;

    public ImageLoadingAdapter(ImageLoader imageLoader, List<Asset> list, boolean z) {
        this.mImages = list;
        this.mShouldPadImages = z;
        this.mLoader = imageLoader;
    }

    private ImageView.ScaleType scaleType(Asset asset) {
        if ("fill".equals(asset.getFillMode())) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        return ImageView.ScaleType.CENTER_INSIDE;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.mImages.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        int i2;
        AssetImageView assetImageView = new AssetImageView(viewGroup.getContext());
        Asset asset = this.mImages.get(i);
        assetImageView.setScaleType(scaleType(asset));
        ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        assetImageView.setLayoutParams(layoutParams);
        if (this.mShouldPadImages) {
            i2 = viewGroup.getContext().getResources().getDimensionPixelSize(C12238R.dimen.btn_promo_product_image_padding);
        } else {
            i2 = 0;
        }
        assetImageView.setPadding(i2, i2, i2, i2);
        viewGroup.addView(assetImageView);
        assetImageView.loadAsset(this.mLoader, asset);
        return assetImageView;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return obj == view;
    }
}
