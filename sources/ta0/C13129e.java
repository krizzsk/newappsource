package ta0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.nutiteq.components.MapPos;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;
import ma0.C12902c;
import na0.C12923b;
import na0.C12924c;
import na0.C12925d;
import na0.C12932j;
import ra0.C13054a;

/* renamed from: ta0.e */
public final class C13129e implements C13125b {

    /* renamed from: a */
    public final float[] f32612a;

    /* renamed from: b */
    public final FloatBuffer f32613b;

    /* renamed from: c */
    public final C13054a f32614c;

    /* renamed from: d */
    public final C12932j f32615d;

    /* renamed from: e */
    public final C12902c f32616e;

    /* renamed from: f */
    public float f32617f;

    /* renamed from: g */
    public List<C13054a.C13055a> f32618g;

    /* renamed from: h */
    public List<C13054a.C13055a> f32619h;

    public C13129e(C13054a aVar, C12902c cVar, C12932j jVar) {
        float[] fArr = new float[12];
        this.f32612a = fArr;
        this.f32614c = aVar;
        this.f32616e = cVar;
        this.f32615d = jVar;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((fArr.length * 32) / 8);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f32613b = allocateDirect.asFloatBuffer();
    }

    /* renamed from: a */
    public final boolean mo40029a() {
        return this.f32617f >= 1.0f;
    }

    /* renamed from: b */
    public final boolean mo40030b() {
        return false;
    }

    /* renamed from: c */
    public final void mo40031c(GL10 gl10) {
        List<C13054a.C13055a> list;
        float f;
        C13054a aVar = this.f32614c;
        synchronized (aVar) {
            list = aVar.f32294k;
        }
        List<C13054a.C13055a> list2 = this.f32618g;
        if (list2 != list) {
            if (list2 != null) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            this.f32617f = f;
            this.f32619h = list2;
            this.f32618g = list;
        }
        float f2 = this.f32617f;
        if (f2 < 1.0f) {
            this.f32617f = f2 + 0.1f;
        }
        if (this.f32617f > 1.0f) {
            this.f32617f = 1.0f;
        }
        if (!this.f32615d.f32038e || !this.f32614c.f32292i) {
            this.f32617f = 1.0f;
        }
        C13054a aVar2 = this.f32614c;
        if (aVar2.f32291h.f32001d < 1.0f) {
            this.f32617f = 1.0f;
        }
        C12925d dVar = aVar2.f32172c;
        if (dVar != null) {
            dVar.f32009g.getClass();
            if (this.f32614c != null) {
                this.f32617f = 1.0f;
            }
        }
    }

    /* renamed from: d */
    public final void mo40032d(GL10 gl10, C12923b bVar) {
        gl10.glEnableClientState(32884);
        gl10.glEnableClientState(32888);
        gl10.glEnable(3553);
        C12924c cVar = this.f32614c.f32291h;
        if (this.f32617f < 1.0f && this.f32619h != null) {
            float f = cVar.f32001d;
            gl10.glColor4f(cVar.f31998a * f, cVar.f31999b * f, cVar.f32000c * f, f);
            for (C13054a.C13055a h : this.f32619h) {
                mo40042h(gl10, h, bVar);
            }
        }
        if (this.f32618g != null) {
            float f2 = cVar.f32001d * this.f32617f;
            gl10.glColor4f(cVar.f31998a * f2, cVar.f31999b * f2, cVar.f32000c * f2, f2);
            for (C13054a.C13055a h2 : this.f32618g) {
                mo40042h(gl10, h2, bVar);
            }
        }
        gl10.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        gl10.glDisableClientState(32888);
    }

    /* renamed from: e */
    public final void mo40033e(GL10 gl10) {
    }

    /* renamed from: h */
    public final void mo40042h(GL10 gl10, C13054a.C13055a aVar, C12923b bVar) {
        GL10 gl102 = gl10;
        C13054a.C13055a aVar2 = aVar;
        int c = this.f32616e.mo39769c(aVar2.f32299e);
        if (c != 0) {
            MapPos mapPos = bVar.f31988a;
            float[] fArr = this.f32612a;
            float f = aVar2.f32295a;
            double d = mapPos.f24175b;
            fArr[0] = (float) (((double) f) - d);
            float f2 = aVar2.f32296b;
            double d2 = mapPos.f24176c;
            fArr[1] = (float) (((double) f2) - d2);
            double d3 = mapPos.f24177d;
            double d4 = d;
            fArr[2] = (float) (-d3);
            float f3 = aVar2.f32297c;
            fArr[3] = (float) (((double) f3) - d4);
            fArr[4] = (float) (((double) f2) - d2);
            fArr[5] = (float) (-d3);
            fArr[6] = (float) (((double) f) - d4);
            float f4 = aVar2.f32298d;
            fArr[7] = (float) (((double) f4) - d2);
            fArr[8] = (float) (-d3);
            fArr[9] = (float) (((double) f3) - d4);
            fArr[10] = (float) (((double) f4) - d2);
            fArr[11] = (float) (-d3);
            this.f32613b.put(fArr);
            this.f32613b.position(0);
            gl102.glVertexPointer(3, 5126, 0, this.f32613b);
            gl102.glTexCoordPointer(2, 5126, 0, aVar2.f32300f);
            gl102.glBindTexture(3553, c);
            gl102.glDrawArrays(5, 0, this.f32612a.length / 3);
        }
    }
}
