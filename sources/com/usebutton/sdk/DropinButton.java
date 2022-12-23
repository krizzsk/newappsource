package com.usebutton.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.usebutton.sdk.action.ButtonAction;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.CompatHelpers;
import com.usebutton.sdk.internal.views.AllLowercaseTransformationMethod;
import com.usebutton.sdk.internal.views.AssetImageView;
import com.usebutton.sdk.internal.views.BaseButton;
import com.usebutton.sdk.internal.views.DropinPresenter;
import com.usebutton.sdk.internal.views.PreviewView;

public class DropinButton extends BaseButton {
    public static final float FACTOR_TITLE_TO_LABEL = 0.78f;
    private static final String TAG = "DropinButton";
    public static final int TEXT_STYLE_LOWER = 1;
    public static final int TEXT_STYLE_NORMAL = 0;
    public static final int TEXT_STYLE_UPPER = 16;
    private ButtonAction mAction;
    private DropinPresenter mPresenter;
    private DropinStyle mStyle;

    public static class DropinStyle extends BaseButton.Style {
        /* access modifiers changed from: private */
        public Integer gravity;
        /* access modifiers changed from: private */
        public boolean interactionDisabled;
        /* access modifiers changed from: private */
        public Integer padding;
        /* access modifiers changed from: private */
        public Integer paddingBottom;
        /* access modifiers changed from: private */
        public Integer paddingLeft;
        /* access modifiers changed from: private */
        public Integer paddingRight;
        /* access modifiers changed from: private */
        public Integer paddingTop;
        /* access modifiers changed from: private */
        public ColorStateList textColorStates;
        /* access modifiers changed from: private */
        public int textStyling;

        private DropinStyle() {
        }
    }

    public DropinButton(Context context) {
        this(context, (AttributeSet) null);
    }

    @SuppressLint({"SetTextI18n"})
    private void addEditButtonPreview() {
        PreviewView previewView = (PreviewView) View.inflate(getContext(), C12238R.layout.btn_preview_two_line, (ViewGroup) null);
        previewView.getIcon().setImageDrawable(CompatHelpers.getDrawable(previewView.getContext(), C12238R.C12239drawable.btn_ic_app_button));
        previewView.getTitle().setText("PREVIEW");
        previewView.getLabel().setText("Lorem ipsum doler sit amet.");
        addContentView(previewView);
    }

    private DropinPresenter getPresenter() {
        if (this.mPresenter == null) {
            this.mPresenter = new DropinPresenter(getContext(), this);
        }
        return this.mPresenter;
    }

    public synchronized void applyStylingAttributes(ViewGroup viewGroup) {
        boolean z;
        int i;
        int i2;
        PreviewView previewView = (PreviewView) viewGroup;
        AssetImageView icon = previewView.getIcon();
        TextView title = previewView.getTitle();
        TextView label = previewView.getLabel();
        View loadingView = previewView.getLoadingView();
        previewView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        previewView.setMinimumWidth(CompatHelpers.getMinimumWidth(this));
        previewView.setMinimumHeight(CompatHelpers.getMinimumHeight(this));
        previewView.setPadding(BaseButton.overrideOrDefault(this.mStyle.padding, this.mStyle.paddingLeft), BaseButton.overrideOrDefault(this.mStyle.padding, this.mStyle.paddingTop), BaseButton.overrideOrDefault(this.mStyle.padding, this.mStyle.paddingRight), BaseButton.overrideOrDefault(this.mStyle.padding, this.mStyle.paddingBottom));
        Integer num = this.mStyle.backgroundColor;
        if (num != null) {
            previewView.setBackgroundColor(num.intValue());
        }
        DropinStyle dropinStyle = this.mStyle;
        Integer num2 = dropinStyle.backgroundDrawableResource;
        if (num2 != null) {
            previewView.setBackgroundResource(num2.intValue());
        } else {
            CompatHelpers.setBackground(previewView, dropinStyle.backgroundDrawable);
        }
        boolean z2 = false;
        label.setTextSize(0, (float) this.mStyle.textSize.intValue());
        if ((this.mStyle.textStyling & 1) != 0) {
            label.setTransformationMethod(new AllLowercaseTransformationMethod());
        }
        if ((this.mStyle.textStyling & 16) != 0) {
            label.setAllCaps(true);
        }
        if (TextUtils.isEmpty(title.getText())) {
            title.setVisibility(8);
        } else {
            title.setVisibility(0);
            title.setTextSize(0, ((float) this.mStyle.textSize.intValue()) * 0.78f);
        }
        if (loadingView != null) {
            loadingView.getLayoutParams().height = this.mStyle.textSize.intValue();
        }
        if (this.mStyle.gravity != null) {
            previewView.setGravity(this.mStyle.gravity.intValue());
        }
        if (this.mStyle.textColorStates != null) {
            label.setTextColor(this.mStyle.textColorStates);
            title.setTextColor(this.mStyle.textColorStates);
        }
        if (!TextUtils.isEmpty(this.mStyle.font)) {
            try {
                Typeface createFromAsset = Typeface.createFromAsset(getContext().getAssets(), this.mStyle.font);
                label.setTypeface(createFromAsset);
                title.setTypeface(createFromAsset);
            } catch (RuntimeException e) {
                ButtonLog.warn(TAG, "Instructed to load custom font from assets, but could not find asset with name: " + this.mStyle.font, e);
            }
        }
        Integer num3 = this.mStyle.iconSize;
        if (num3 != null) {
            if (num3.intValue() == 0) {
                icon.setVisibility(4);
            } else {
                icon.setVisibility(0);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) icon.getLayoutParams();
            Integer num4 = this.mStyle.iconSize;
            if (num4 != null) {
                i = num4.intValue();
            } else {
                i = 0;
            }
            layoutParams.height = i + icon.getPaddingBottom() + icon.getPaddingTop();
            Integer num5 = this.mStyle.iconSize;
            if (num5 != null) {
                i2 = num5.intValue();
            } else {
                i2 = 0;
            }
            layoutParams.width = i2 + icon.getPaddingLeft() + icon.getPaddingRight();
            DropinStyle dropinStyle2 = this.mStyle;
            int overrideOrDefault = BaseButton.overrideOrDefault(dropinStyle2.drawablePadding, dropinStyle2.drawablePaddingLeft);
            DropinStyle dropinStyle3 = this.mStyle;
            int overrideOrDefault2 = BaseButton.overrideOrDefault(dropinStyle3.drawablePadding, dropinStyle3.drawablePaddingTop);
            DropinStyle dropinStyle4 = this.mStyle;
            int overrideOrDefault3 = BaseButton.overrideOrDefault(dropinStyle4.drawablePadding, dropinStyle4.drawablePaddingRight);
            DropinStyle dropinStyle5 = this.mStyle;
            layoutParams.setMargins(overrideOrDefault, overrideOrDefault2, overrideOrDefault3, BaseButton.overrideOrDefault(dropinStyle5.drawablePadding, dropinStyle5.drawablePaddingBottom));
            icon.setLayoutParams(layoutParams);
        }
        if (!this.mStyle.interactionDisabled) {
            z = true;
        } else {
            z = false;
        }
        previewView.setEnabled(z);
        if (!this.mStyle.interactionDisabled) {
            z2 = true;
        }
        previewView.setClickable(z2);
    }

    public int getDefaultStyleResource() {
        return C12238R.style.BtnDropinButton;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            addEditButtonPreview();
        }
    }

    public void prepareWithAction(ButtonAction buttonAction) {
        this.mAction = buttonAction;
        getPresenter().prepareWithAction(this, buttonAction);
    }

    public void readAttributes(AttributeSet attributeSet) {
        super.readAttributes(attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C12238R.styleable.com_usebutton_sdk_DropinButton, 0, getDefaultStyleResource());
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C12238R.styleable.com_usebutton_sdk_DropinButton_btn_textColor) {
                ColorStateList unused = this.mStyle.textColorStates = obtainStyledAttributes.getColorStateList(index);
            } else if (index == C12238R.styleable.com_usebutton_sdk_DropinButton_btn_padding) {
                Integer unused2 = this.mStyle.padding = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == C12238R.styleable.com_usebutton_sdk_DropinButton_btn_paddingLeft) {
                Integer unused3 = this.mStyle.paddingLeft = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == C12238R.styleable.com_usebutton_sdk_DropinButton_btn_paddingTop) {
                Integer unused4 = this.mStyle.paddingTop = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == C12238R.styleable.com_usebutton_sdk_DropinButton_btn_paddingRight) {
                Integer unused5 = this.mStyle.paddingRight = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == C12238R.styleable.com_usebutton_sdk_DropinButton_btn_paddingBottom) {
                Integer unused6 = this.mStyle.paddingBottom = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == C12238R.styleable.com_usebutton_sdk_DropinButton_btn_gravity) {
                Integer unused7 = this.mStyle.gravity = Integer.valueOf(obtainStyledAttributes.getInt(index, 0));
            } else if (index == C12238R.styleable.com_usebutton_sdk_DropinButton_btn_textStyle) {
                int unused8 = this.mStyle.textStyling = obtainStyledAttributes.getInt(index, 0);
            } else if (index == C12238R.styleable.com_usebutton_sdk_DropinButton_btn_interactionDisabled) {
                boolean unused9 = this.mStyle.interactionDisabled = obtainStyledAttributes.getBoolean(index, false);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void reportViewed() {
        getPresenter().onReportViewed();
    }

    public void setGravity_Button(int i) {
        Integer unused = this.mStyle.gravity = Integer.valueOf(i);
        invalidateStyling();
    }

    public void setInteractionDisabled_Button(boolean z) {
        boolean unused = this.mStyle.interactionDisabled = z;
        invalidateStyling();
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
        invalidateStyling();
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
        invalidateStyling();
    }

    public void setPaddingBottom_Button(int i) {
        Integer unused = this.mStyle.paddingBottom = Integer.valueOf(i);
        invalidateStyling();
    }

    public void setPaddingLeft_Button(int i) {
        Integer unused = this.mStyle.paddingLeft = Integer.valueOf(i);
        invalidateStyling();
    }

    public void setPaddingRight_Button(int i) {
        Integer unused = this.mStyle.paddingRight = Integer.valueOf(i);
        invalidateStyling();
    }

    public void setPaddingTop_Button(int i) {
        Integer unused = this.mStyle.paddingTop = Integer.valueOf(i);
        invalidateStyling();
    }

    public void setPadding_Button(int i) {
        Integer unused = this.mStyle.padding = Integer.valueOf(i);
        invalidateStyling();
    }

    public void setStyle_Button(int i) {
        int unused = this.mStyle.textStyling = i;
        invalidateStyling();
    }

    public void setTextColorStates_Button(ColorStateList colorStateList) {
        ColorStateList unused = this.mStyle.textColorStates = colorStateList;
        invalidateStyling();
    }

    public void setTextSize_Button(int i) {
        this.mStyle.textSize = Integer.valueOf(i);
        invalidateStyling();
    }

    public void test_setPresenter(DropinPresenter dropinPresenter) {
        this.mPresenter = dropinPresenter;
    }

    public DropinButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DropinStyle getStyle() {
        if (this.mStyle == null) {
            this.mStyle = new DropinStyle();
        }
        return this.mStyle;
    }

    public DropinButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public DropinButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
