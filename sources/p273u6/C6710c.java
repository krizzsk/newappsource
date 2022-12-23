package p273u6;

import android.graphics.drawable.Drawable;
import p260t6.C6598d;
import p311x6.C7176l;

/* renamed from: u6.c */
public abstract class C6710c<T> implements C6720j<T> {

    /* renamed from: b */
    public final int f20796b;

    /* renamed from: c */
    public final int f20797c;

    /* renamed from: d */
    public C6598d f20798d;

    public C6710c() {
        if (C7176l.m16789i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f20796b = Integer.MIN_VALUE;
            this.f20797c = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    /* renamed from: a */
    public final void mo22742a(C6719i iVar) {
        iVar.mo11025b(this.f20796b, this.f20797c);
    }

    /* renamed from: b */
    public final void mo22743b(Drawable drawable) {
    }

    /* renamed from: c */
    public final C6598d mo22744c() {
        return this.f20798d;
    }

    /* renamed from: e */
    public final void mo22746e(C6598d dVar) {
        this.f20798d = dVar;
    }

    /* renamed from: i */
    public final void mo10888i(Drawable drawable) {
    }

    /* renamed from: j */
    public final void mo22753j(C6719i iVar) {
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }
}
