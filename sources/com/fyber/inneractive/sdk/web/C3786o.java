package com.fyber.inneractive.sdk.web;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.fyber.inneractive.sdk.web.o */
public final class C3786o implements View.OnTouchListener {

    /* renamed from: a */
    public final C3787a f13057a;

    /* renamed from: b */
    public float f13058b;

    /* renamed from: c */
    public float f13059c;

    /* renamed from: d */
    public float f13060d;

    /* renamed from: com.fyber.inneractive.sdk.web.o$a */
    public interface C3787a {
    }

    public C3786o(C3787a aVar, Context context) {
        this.f13057a = aVar;
        this.f13060d = (float) ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f13057a != null) {
            if (motionEvent.getActionMasked() == 0) {
                ((C3753a) this.f13057a).mo15414d();
                this.f13058b = motionEvent.getX();
                this.f13059c = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 3) {
                ((C3753a) this.f13057a).mo15414d();
                this.f13059c = -1.0f;
                this.f13058b = -1.0f;
            } else if (motionEvent.getActionMasked() == 1) {
                float f = this.f13058b;
                if (f >= BitmapDescriptorFactory.HUE_RED && this.f13059c >= BitmapDescriptorFactory.HUE_RED) {
                    float round = (float) Math.round(Math.abs(this.f13059c - motionEvent.getY()));
                    float f2 = this.f13060d;
                    if (((float) Math.round(Math.abs(f - motionEvent.getX()))) < f2 && round < f2) {
                        C3753a aVar = (C3753a) this.f13057a;
                        aVar.getClass();
                        IAlog.m9902a("IAWebViewController onClicked()", new Object[0]);
                        if (aVar.f12967l != null) {
                            IAlog.m9905d("Native click detected in time. Processing pending click", new Object[0]);
                            aVar.f12967l.mo15427d();
                            Runnable runnable = aVar.f12968m;
                            if (runnable != null) {
                                C3714n.f12902b.removeCallbacks(runnable);
                            }
                            aVar.f12967l = null;
                            aVar.mo15414d();
                        } else {
                            if (aVar.f12969n != null) {
                                C3714n.f12902b.postDelayed(aVar.f12969n, (long) IAConfigManager.f9202J.f9234v.f9337b.mo13271a("click_timeout", 1000, 1000));
                            }
                            aVar.f12965j = true;
                        }
                    }
                    this.f13058b = -1.0f;
                    this.f13059c = -1.0f;
                }
            }
        }
        return false;
    }
}
