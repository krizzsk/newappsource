package p395bs;

import com.moovit.app.editing.entity.AbstractEditEntityActivity;

/* renamed from: bs.a */
public final class C13675a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33707b;

    /* renamed from: c */
    public final /* synthetic */ AbstractEditEntityActivity f33708c;

    public C13675a(AbstractEditEntityActivity abstractEditEntityActivity, int i) {
        this.f33708c = abstractEditEntityActivity;
        this.f33707b = i;
    }

    public final void run() {
        AbstractEditEntityActivity abstractEditEntityActivity = this.f33708c;
        if (abstractEditEntityActivity.f37311x) {
            abstractEditEntityActivity.f37966r0.setText(this.f33707b);
            this.f33708c.f37966r0.setVisibility(0);
        }
    }
}
