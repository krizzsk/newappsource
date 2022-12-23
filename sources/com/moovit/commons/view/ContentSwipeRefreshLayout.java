package com.moovit.commons.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class ContentSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: M */
    public long f41056M = -1;

    /* renamed from: N */
    public boolean f41057N = false;

    /* renamed from: O */
    public boolean f41058O = false;

    /* renamed from: P */
    public boolean f41059P = false;

    /* renamed from: Q */
    public final C15787a f41060Q = new C15787a();

    /* renamed from: R */
    public final C15788b f41061R = new C15788b();

    /* renamed from: com.moovit.commons.view.ContentSwipeRefreshLayout$a */
    public class C15787a implements Runnable {
        public C15787a() {
        }

        public final void run() {
            ContentSwipeRefreshLayout contentSwipeRefreshLayout = ContentSwipeRefreshLayout.this;
            contentSwipeRefreshLayout.f41057N = false;
            contentSwipeRefreshLayout.f41056M = -1;
            ContentSwipeRefreshLayout.super.setRefreshing(false);
        }
    }

    /* renamed from: com.moovit.commons.view.ContentSwipeRefreshLayout$b */
    public class C15788b implements Runnable {
        public C15788b() {
        }

        public final void run() {
            ContentSwipeRefreshLayout contentSwipeRefreshLayout = ContentSwipeRefreshLayout.this;
            contentSwipeRefreshLayout.f41058O = false;
            if (!contentSwipeRefreshLayout.f41059P) {
                contentSwipeRefreshLayout.f41056M = System.currentTimeMillis();
                ContentSwipeRefreshLayout.super.setRefreshing(true);
            }
        }
    }

    public ContentSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f41060Q);
        removeCallbacks(this.f41061R);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f41060Q);
        removeCallbacks(this.f41061R);
    }

    public void setRefreshing(boolean z) {
        if (z) {
            this.f41056M = -1;
            this.f41059P = false;
            removeCallbacks(this.f41060Q);
            if (!this.f41058O) {
                postDelayed(this.f41061R, 500);
                this.f41058O = true;
                return;
            }
            return;
        }
        this.f41059P = true;
        removeCallbacks(this.f41061R);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f41056M;
        long j2 = currentTimeMillis - j;
        if (j2 >= 1000 || j == -1) {
            super.setRefreshing(false);
        } else if (!this.f41057N) {
            postDelayed(this.f41060Q, 1000 - j2);
            this.f41057N = true;
        }
    }
}
