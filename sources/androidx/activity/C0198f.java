package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

/* renamed from: androidx.activity.f */
public final class C0198f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f519b;

    /* renamed from: c */
    public final /* synthetic */ IntentSender.SendIntentException f520c;

    /* renamed from: d */
    public final /* synthetic */ ComponentActivity.C0190b f521d;

    public C0198f(ComponentActivity.C0190b bVar, int i, IntentSender.SendIntentException sendIntentException) {
        this.f521d = bVar;
        this.f519b = i;
        this.f520c = sendIntentException;
    }

    public final void run() {
        this.f521d.mo774a(this.f519b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f520c));
    }
}
