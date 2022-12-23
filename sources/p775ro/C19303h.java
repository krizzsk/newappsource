package p775ro;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p364al.C13487h;
import p364al.C13488i;

/* renamed from: ro.h */
public final /* synthetic */ class C19303h implements C13488i {

    /* renamed from: a */
    public final /* synthetic */ C19305j f49101a;

    public /* synthetic */ C19303h(C19305j jVar) {
        this.f49101a = jVar;
    }

    /* renamed from: a */
    public final void mo40393a(C13487h hVar) {
        C19305j jVar = this.f49101a;
        jVar.getClass();
        if (hVar.mo40399a()) {
            C19297d dVar = (C19297d) jVar.f45943a;
            dVar.getClass();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(dVar.getResources(), (Bitmap) null);
            bitmapDrawable.setAntiAlias(false);
            bitmapDrawable.setDither(false);
            dVar.f49086r.setImageDrawable(bitmapDrawable);
            return;
        }
        C19297d dVar2 = (C19297d) jVar.f45943a;
        dVar2.getClass();
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(dVar2.getResources(), (Bitmap) hVar.f33365a);
        bitmapDrawable2.setAntiAlias(false);
        bitmapDrawable2.setDither(false);
        dVar2.f49086r.setImageDrawable(bitmapDrawable2);
    }
}
