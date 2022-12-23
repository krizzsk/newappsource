package com.usebutton.sdk.impression;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.impression.BaseImpressionPresenter;
import com.usebutton.sdk.internal.impression.BaseImpressionView;

public class ImpressionView extends BaseImpressionView<ImpressionPresenter> implements ImpressionViewController {
    public ImpressionView(Context context) {
        super(context);
        init((AttributeSet) null);
    }

    private void init(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C12238R.styleable.com_usebutton_sdk_impression_ImpressionView, 0, 0);
        try {
            setCreativeType(CreativeType.getCreativeType(obtainStyledAttributes.getInt(C12238R.styleable.com_usebutton_sdk_impression_ImpressionView_btn_creativeType, -1)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public CreativeType getCreativeType() {
        return ((ImpressionPresenter) this.presenter).getCreativeType();
    }

    public String getOfferId() {
        return ((ImpressionPresenter) this.presenter).getOfferId();
    }

    public String getUrl() {
        return ((ImpressionPresenter) this.presenter).getUrl();
    }

    public float getVisibleRate() {
        return ((ImpressionPresenter) this.presenter).getVisibleRate();
    }

    public VisibleRateType getVisibleRateType() {
        return ((ImpressionPresenter) this.presenter).getVisibleRateType();
    }

    public void setCreativeType(CreativeType creativeType) {
        ((ImpressionPresenter) this.presenter).setCreativeType(creativeType);
    }

    public void track(String str, VisibleRateType visibleRateType, float f) {
        track(str, visibleRateType, f, (String) null);
    }

    public ImpressionPresenter createPresenter() {
        return new ImpressionPresenter(BaseImpressionPresenter.TIME_PROVIDER, ButtonPrivate.getButton().getConfiguration(), ButtonPrivate.getButton().getEventTracker());
    }

    public void track(String str, VisibleRateType visibleRateType, float f, String str2) {
        ((ImpressionPresenter) this.presenter).track(str, visibleRateType, f, str2);
    }

    public ImpressionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public ImpressionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    @TargetApi(21)
    public ImpressionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet);
    }
}
