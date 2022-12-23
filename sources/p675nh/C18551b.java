package p675nh;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import p389bl.C13637c;
import p746qh.C19120a;
import p746qh.C19126f;

/* renamed from: nh.b */
public final class C18551b extends ContentObserver {

    /* renamed from: a */
    public final Context f47232a;

    /* renamed from: b */
    public final AudioManager f47233b;

    /* renamed from: c */
    public final C13637c f47234c;

    /* renamed from: d */
    public final C18550a f47235d;

    /* renamed from: e */
    public float f47236e;

    public C18551b(Handler handler, Context context, C13637c cVar, C19126f fVar) {
        super(handler);
        this.f47232a = context;
        this.f47233b = (AudioManager) context.getSystemService("audio");
        this.f47234c = cVar;
        this.f47235d = fVar;
    }

    /* renamed from: a */
    public final float mo50956a() {
        int streamVolume = this.f47233b.getStreamVolume(3);
        int streamMaxVolume = this.f47233b.getStreamMaxVolume(3);
        this.f47234c.getClass();
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
    public final void mo50957b() {
        C18550a aVar = this.f47235d;
        float f = this.f47236e;
        C19126f fVar = (C19126f) aVar;
        fVar.f48623a = f;
        if (fVar.f48627e == null) {
            fVar.f48627e = C19120a.f48607c;
        }
        for (T t : Collections.unmodifiableCollection(fVar.f48627e.f48609b)) {
            C13637c.m34066c(t.f47714e.mo44193h(), "setDeviceVolume", Float.valueOf(f));
        }
    }

    public final void onChange(boolean z) {
        boolean z2;
        super.onChange(z);
        float a = mo50956a();
        if (a != this.f47236e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f47236e = a;
            mo50957b();
        }
    }
}
