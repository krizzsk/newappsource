package com.moovit.util;

import android.text.TextPaint;
import android.text.style.URLSpan;

public class NonStyleModifyingUrlSpan extends URLSpan {
    public NonStyleModifyingUrlSpan(String str) {
        super(str);
    }

    public final void updateDrawState(TextPaint textPaint) {
    }
}
