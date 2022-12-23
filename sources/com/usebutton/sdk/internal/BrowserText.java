package com.usebutton.sdk.internal;

public class BrowserText {
    public static final int DEFAULT_COLOR = -1;
    public static final String DEFAULT_COPY = "";
    private int mColor = -1;
    private String mCopy = "";
    private final TextChangeListener mListener;

    public interface TextChangeListener {
        void onColorChange(int i);

        void onTextChange(String str);
    }

    public BrowserText(TextChangeListener textChangeListener) {
        this.mListener = textChangeListener;
    }

    public int getColor() {
        return this.mColor;
    }

    public String getText() {
        return this.mCopy;
    }

    public void setColor(int i) {
        this.mColor = i;
        this.mListener.onColorChange(i);
    }

    public void setText(String str) {
        this.mCopy = str;
        this.mListener.onTextChange(str);
    }
}
