package sa0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: sa0.l */
public final class C13103l {

    /* renamed from: a */
    public final float[] f32524a;

    /* renamed from: b */
    public final float f32525b;

    /* renamed from: c */
    public final float f32526c;

    /* renamed from: d */
    public final float f32527d;

    /* renamed from: e */
    public FloatBuffer f32528e;

    /* renamed from: f */
    public final C13103l f32529f;

    /* renamed from: g */
    public final C13103l f32530g;

    /* renamed from: h */
    public final C13103l f32531h;

    /* renamed from: i */
    public final C13103l f32532i;

    public C13103l(C13103l lVar, int i, int i2) {
        float f = lVar.f32527d / 2.0f;
        this.f32527d = f;
        if (i == 0) {
            this.f32525b = lVar.f32525b;
            this.f32526c = lVar.f32526c;
        } else if (i == 1) {
            this.f32525b = lVar.f32525b + f;
            this.f32526c = lVar.f32526c;
        } else if (i != 2) {
            this.f32525b = lVar.f32525b;
            this.f32526c = lVar.f32526c + f;
        } else {
            this.f32525b = lVar.f32525b + f;
            this.f32526c = lVar.f32526c + f;
        }
        float f2 = this.f32525b;
        float f3 = this.f32526c;
        this.f32524a = new float[]{f2, f3 + f, f2 + f, f3 + f, f2, f3, f2 + f, f3};
        if (i2 > 1) {
            int i3 = i2 - 1;
            this.f32529f = new C13103l(this, 0, i3);
            this.f32530g = new C13103l(this, 1, i3);
            this.f32531h = new C13103l(this, 2, i3);
            this.f32532i = new C13103l(this, 3, i3);
            return;
        }
        this.f32529f = null;
        this.f32530g = null;
        this.f32531h = null;
        this.f32532i = null;
    }

    /* renamed from: a */
    public final void mo40006a() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((this.f32524a.length * 32) / 8);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f32528e = asFloatBuffer;
        asFloatBuffer.put(this.f32524a);
        this.f32528e.position(0);
        C13103l lVar = this.f32529f;
        if (lVar != null) {
            lVar.mo40006a();
            this.f32530g.mo40006a();
            this.f32531h.mo40006a();
            this.f32532i.mo40006a();
        }
    }

    public C13103l() {
        this.f32524a = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED};
        this.f32525b = BitmapDescriptorFactory.HUE_RED;
        this.f32526c = BitmapDescriptorFactory.HUE_RED;
        this.f32527d = 1.0f;
        this.f32529f = new C13103l(this, 0, 4);
        this.f32530g = new C13103l(this, 1, 4);
        this.f32531h = new C13103l(this, 2, 4);
        this.f32532i = new C13103l(this, 3, 4);
    }
}
