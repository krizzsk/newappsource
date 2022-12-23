package com.usebutton.sdk.internal.autofill;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.ButtonPrivate;

public class AutofillAccessoryView extends FrameLayout implements AutofillAccessoryViewController {
    private ImageView accessoryIconImage;
    private AutofillAccessoryPresenter presenter;
    private TextView primaryText;
    private TextView secondaryText;

    public interface Listener {
        void onSetParamFailure();

        void onSetParamSuccess(String str);
    }

    public AutofillAccessoryView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.presenter = new AutofillAccessoryPresenter(ButtonPrivate.getButton().getButtonRepository());
        LayoutInflater.from(getContext()).inflate(C12238R.layout.btn_view_autofill_accessory, this, true);
        this.primaryText = (TextView) findViewById(C12238R.C12240id.autofill_accessory_primary_text);
        this.secondaryText = (TextView) findViewById(C12238R.C12240id.autofill_accessory_secondary_text);
        this.accessoryIconImage = (ImageView) findViewById(C12238R.C12240id.autofill_accessory_icon_image);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.attachView(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.detachView();
    }

    public void setDisplayedParam(String str, Listener listener) {
        this.presenter.setDisplayedParam(str, listener);
    }

    public void setDrawable(int i) {
        this.accessoryIconImage.setImageResource(i);
    }

    public void setText(String str, String str2) {
        this.primaryText.setText(str);
        this.secondaryText.setText(str2);
    }

    public AutofillAccessoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public AutofillAccessoryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @TargetApi(21)
    public AutofillAccessoryView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }
}
