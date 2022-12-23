package com.usebutton.sdk.purchasepath;

public class CallToAction {
    private int icon;
    private String text;
    private int textColor;

    public CallToAction(int i, String str, int i2) {
        this.icon = i;
        this.text = str;
        this.textColor = i2;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getText() {
        return this.text;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public void setIcon(int i) {
        this.icon = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextColor(int i) {
        this.textColor = i;
    }
}
