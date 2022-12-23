package com.fyber.inneractive.sdk.web;

import android.widget.Toast;
import com.fyber.inneractive.sdk.util.C3707l;

/* renamed from: com.fyber.inneractive.sdk.web.i */
public class C3780i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f13048a;

    public C3780i(C3764d dVar, String str) {
        this.f13048a = str;
    }

    public void run() {
        Toast.makeText(C3707l.f12893a, this.f13048a, 0).show();
    }
}
