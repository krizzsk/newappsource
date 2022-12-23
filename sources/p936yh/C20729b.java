package p936yh;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import p258t4.C6587a;
import p361ai.C13465a;
import p361ai.C13471f;
import p583jk.C17884p;

/* renamed from: yh.b */
public final class C20729b extends ContentObserver {

    /* renamed from: a */
    public final Context f52328a;

    /* renamed from: b */
    public final AudioManager f52329b;

    /* renamed from: c */
    public final C6587a f52330c;

    /* renamed from: d */
    public final C20728a f52331d;

    /* renamed from: e */
    public float f52332e;

    public C20729b(Handler handler, Context context, C6587a aVar, C13471f fVar) {
        super(handler);
        this.f52328a = context;
        this.f52329b = (AudioManager) context.getSystemService("audio");
        this.f52330c = aVar;
        this.f52331d = fVar;
    }

    /* renamed from: a */
    public final float mo52879a() {
        int streamVolume = this.f52329b.getStreamVolume(3);
        int streamMaxVolume = this.f52329b.getStreamMaxVolume(3);
        this.f52330c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: b */
    public final void mo52880b() {
        C20728a aVar = this.f52331d;
        float f = this.f52332e;
        C13471f fVar = (C13471f) aVar;
        fVar.f33344a = f;
        if (fVar.f33348e == null) {
            fVar.f33348e = C13465a.f33332c;
        }
        for (T t : Collections.unmodifiableCollection(fVar.f33348e.f33334b)) {
            C17884p.m44358b(t.f52594e.mo44205g(), "setDeviceVolume", Float.valueOf(f));
        }
    }

    public final void onChange(boolean z) {
        boolean z2;
        super.onChange(z);
        float a = mo52879a();
        if (a != this.f52332e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f52332e = a;
            mo52880b();
        }
    }
}
