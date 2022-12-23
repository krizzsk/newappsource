package com.usebutton.sdk.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.Navigable;

public class WebControls extends RelativeLayout {
    /* access modifiers changed from: private */
    public ImageButton mBack;
    /* access modifiers changed from: private */
    public Navigable mController;
    /* access modifiers changed from: private */
    public ImageButton mForward;
    private Navigable.NavigationListener mOnNavigation;

    public WebControls(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void goBack() {
        this.mController.back();
    }

    /* access modifiers changed from: private */
    public void goForward() {
        this.mController.forward();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mBack = (ImageButton) findViewById(C12238R.C12240id.web_back);
        this.mForward = (ImageButton) findViewById(C12238R.C12240id.web_forward);
        this.mBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WebControls.this.goBack();
            }
        });
        this.mForward.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WebControls.this.goForward();
            }
        });
    }

    public void setController(Navigable navigable) {
        this.mController = navigable;
        navigable.getObservable().subscribeWeak(this.mOnNavigation);
    }

    public WebControls(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WebControls(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOnNavigation = new Navigable.NavigationListener() {
            public void onNavigation(Navigable navigable) {
                float f;
                WebControls.this.mBack.setEnabled(WebControls.this.mController.canNavigateBack());
                ImageButton access$300 = WebControls.this.mBack;
                float f2 = 1.0f;
                if (WebControls.this.mController.canNavigateBack()) {
                    f = 1.0f;
                } else {
                    f = 0.15f;
                }
                access$300.setAlpha(f);
                WebControls.this.mForward.setEnabled(WebControls.this.mController.canNavigateForward());
                ImageButton access$400 = WebControls.this.mForward;
                if (!WebControls.this.mController.canNavigateForward()) {
                    f2 = 0.15f;
                }
                access$400.setAlpha(f2);
            }
        };
    }
}
