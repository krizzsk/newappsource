package com.usebutton.sdk.internal.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.usebutton.sdk.internal.util.Receiver;
import com.usebutton.thirdparty.android.support.p354v4.view.AsyncLayoutInflater;

public class LazyView extends FrameLayout {
    private final AsyncLayoutInflater mInflater;

    public LazyView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void load(int i, final Receiver receiver) {
        this.mInflater.inflate(i, (ViewGroup) null, new AsyncLayoutInflater.OnInflateFinishedListener() {
            public void onInflateFinished(View view, int i, ViewGroup viewGroup) {
                LazyView.this.addView(view);
                Receiver receiver = receiver;
                if (receiver != null) {
                    receiver.receive(view);
                }
            }
        });
    }

    public LazyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LazyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInflater = new AsyncLayoutInflater(context);
    }

    @TargetApi(21)
    public LazyView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mInflater = new AsyncLayoutInflater(context);
    }
}
