package ta0;

import com.nutiteq.components.MapPos;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;
import na0.C12923b;
import oa0.C12970g;
import oa0.C12974i;
import sa0.C13100i;
import ya0.C13274a;
import ya0.C13276c;
import ya0.C13277d;
import za0.C13358d;

/* renamed from: ta0.d */
public final class C13128d implements C13131g {

    /* renamed from: a */
    public final C13358d f32608a;

    /* renamed from: b */
    public C13276c f32609b = new C13276c();

    /* renamed from: c */
    public C13274a f32610c = new C13274a();

    /* renamed from: d */
    public C13274a f32611d = new C13274a();

    public C13128d(C13358d dVar) {
        this.f32608a = dVar;
    }

    /* renamed from: a */
    public final boolean mo40029a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo40030b() {
        return true;
    }

    /* renamed from: c */
    public final void mo40031c(GL10 gl10) {
    }

    /* renamed from: d */
    public final void mo40032d(GL10 gl10, C12923b bVar) {
        gl10.glDisable(3553);
        gl10.glDisableClientState(32888);
        mo40041h(bVar, (C13100i) null);
        FloatBuffer floatBuffer = C13277d.f32942a;
        int i = 0;
        while (true) {
            int i2 = this.f32609b.f32938a;
            if (i < i2 / 3) {
                int min = Math.min(65535, (i2 / 3) - i);
                gl10.glVertexPointer(3, 5126, 0, this.f32609b.mo40142c(i * 3, min * 3));
                gl10.glEnableClientState(32884);
                gl10.glColorPointer(4, 5121, 0, this.f32610c.mo40139b(i * 4, min * 4));
                gl10.glEnableClientState(32886);
                gl10.glDrawArrays(4, 0, min);
                i += 65535;
            } else {
                gl10.glDisableClientState(32886);
                return;
            }
        }
    }

    /* renamed from: e */
    public final void mo40033e(GL10 gl10) {
    }

    /* renamed from: f */
    public final void mo40034f(GL10 gl10, C12923b bVar, C13100i iVar) {
        gl10.glDisable(3553);
        gl10.glDisableClientState(32888);
        mo40041h(bVar, iVar);
        FloatBuffer floatBuffer = C13277d.f32942a;
        int i = 0;
        while (true) {
            int i2 = this.f32609b.f32938a;
            if (i < i2 / 3) {
                int min = Math.min(65535, (i2 / 3) - i);
                gl10.glVertexPointer(3, 5126, 0, this.f32609b.mo40142c(i * 3, min * 3));
                gl10.glEnableClientState(32884);
                gl10.glColorPointer(4, 5121, 0, this.f32611d.mo40139b(i * 4, min * 4));
                gl10.glEnableClientState(32886);
                gl10.glDrawArrays(4, 0, min);
                i += 65535;
            } else {
                gl10.glDisableClientState(32886);
                return;
            }
        }
    }

    /* renamed from: g */
    public final MapPos mo40035g(C12974i iVar, C12923b bVar, MapPos mapPos) {
        if (!(iVar instanceof C12970g)) {
            return mapPos;
        }
        ((C12970g.C12971a) ((C12970g) iVar).f32125e).getClass();
        return null;
    }

    /* renamed from: h */
    public final void mo40041h(C12923b bVar, C13100i iVar) {
        ArrayList<C12970g> arrayList = this.f32608a.f33149f;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        MapPos mapPos = bVar.f31988a;
        this.f32609b.f32938a = 0;
        this.f32610c.f32930a = 0;
        this.f32611d.f32930a = 0;
        for (C12970g gVar : arrayList) {
            if (((C12970g.C12971a) gVar.f32125e).f32128b != null) {
                ((C12970g.C12971a) gVar.f32125e).getClass();
                throw null;
            }
        }
    }
}
