package com.usebutton.sdk.purchasepath;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.usebutton.sdk.C12238R;

public class TextCard extends Card {
    private int backgroundColor;
    private String body;
    private int bodyColor;
    private float bodySize;
    private Typeface bodyTypeface;
    private String title;
    private int titleColor;
    private float titleSize;
    private Typeface titleTypeface;

    public static class Builder {
        /* access modifiers changed from: private */
        public int backgroundColor;
        /* access modifiers changed from: private */
        public String body;
        /* access modifiers changed from: private */
        public int bodyColor;
        /* access modifiers changed from: private */
        public float bodySize;
        /* access modifiers changed from: private */
        public Typeface bodyTypeface;
        /* access modifiers changed from: private */
        public CallToAction callToAction;
        /* access modifiers changed from: private */
        public String title;
        /* access modifiers changed from: private */
        public int titleColor = -1;
        /* access modifiers changed from: private */
        public float titleSize;
        /* access modifiers changed from: private */
        public Typeface titleTypeface;

        public Builder(CallToAction callToAction2, String str, String str2) {
            Typeface typeface = Typeface.DEFAULT;
            this.titleTypeface = typeface;
            this.titleSize = 16.0f;
            this.bodyColor = -1;
            this.bodyTypeface = typeface;
            this.bodySize = 13.0f;
            this.backgroundColor = Color.parseColor("#0CAC56");
            this.callToAction = callToAction2;
            this.title = str;
            this.body = str2;
        }

        public TextCard build() {
            return new TextCard(this);
        }

        public Builder setBackgroundColor(int i) {
            this.backgroundColor = i;
            return this;
        }

        public Builder setBodyColor(int i) {
            this.bodyColor = i;
            return this;
        }

        public Builder setBodySize(float f) {
            this.bodySize = f;
            return this;
        }

        public Builder setBodyTypeface(Typeface typeface) {
            this.bodyTypeface = typeface;
            return this;
        }

        public Builder setTitleColor(int i) {
            this.titleColor = i;
            return this;
        }

        public Builder setTitleSize(float f) {
            this.titleSize = f;
            return this;
        }

        public Builder setTitleTypeface(Typeface typeface) {
            this.titleTypeface = typeface;
            return this;
        }
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getBody() {
        return this.body;
    }

    public int getBodyColor() {
        return this.bodyColor;
    }

    public float getBodySize() {
        return this.bodySize;
    }

    public Typeface getBodyTypeface() {
        return this.bodyTypeface;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTitleColor() {
        return this.titleColor;
    }

    public float getTitleSize() {
        return this.titleSize;
    }

    public Typeface getTitleTypeface() {
        return this.titleTypeface;
    }

    public final void onBindView(View view) {
        TextView textView = (TextView) view.findViewById(C12238R.C12240id.textcard_title);
        TextView textView2 = (TextView) view.findViewById(C12238R.C12240id.textcard_body);
        ((LinearLayout) view.findViewById(C12238R.C12240id.textcard_layout)).setBackgroundColor(getBackgroundColor());
        textView.setText(getTitle());
        textView.setTextColor(getTitleColor());
        textView.setTextSize(getTitleSize());
        textView.setTypeface(getTitleTypeface());
        textView2.setText(getBody());
        textView2.setTextColor(getBodyColor());
        textView2.setTextSize(getBodySize());
        textView2.setTypeface(getBodyTypeface());
    }

    public final View onCreateView(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(C12238R.layout.btn_checkout_textcard, viewGroup, false);
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setBodyColor(int i) {
        this.bodyColor = i;
    }

    public void setBodySize(float f) {
        this.bodySize = f;
    }

    public void setBodyTypeface(Typeface typeface) {
        this.bodyTypeface = typeface;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitleColor(int i) {
        this.titleColor = i;
    }

    public void setTitleSize(float f) {
        this.titleSize = f;
    }

    public void setTitleTypeface(Typeface typeface) {
        this.titleTypeface = typeface;
    }

    private TextCard(Builder builder) {
        super(builder.callToAction);
        this.title = builder.title;
        this.titleColor = builder.titleColor;
        this.titleTypeface = builder.titleTypeface;
        this.titleSize = builder.titleSize;
        this.body = builder.body;
        this.bodyColor = builder.bodyColor;
        this.bodyTypeface = builder.bodyTypeface;
        this.bodySize = builder.bodySize;
        this.backgroundColor = builder.backgroundColor;
    }
}
