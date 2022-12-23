package p066e0;

import androidx.camera.core.C0627p;
import java.util.Collections;
import java.util.List;
import p054d0.C4282g0;
import p102h0.C5023g;
import p102h0.C5028j;
import p695od.C18728c;

/* renamed from: e0.m0 */
public final class C4444m0 implements C4461y {

    /* renamed from: a */
    public final /* synthetic */ int f15502a;

    /* renamed from: b */
    public int f15503b;

    /* renamed from: c */
    public Object f15504c;

    public C4444m0() {
        this.f15502a = 1;
        this.f15503b = -1;
        this.f15504c = new short[15];
    }

    /* renamed from: a */
    public final void mo19981a(short s) {
        Object obj = this.f15504c;
        if (((short[]) obj).length == this.f15503b + 1) {
            short[] sArr = (short[]) obj;
            short[] sArr2 = new short[(sArr.length * 2)];
            System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
            this.f15504c = sArr2;
        }
        int i = this.f15503b + 1;
        this.f15503b = i;
        ((short[]) this.f15504c)[i] = s;
    }

    public final List getCaptureIds() {
        return Collections.singletonList(Integer.valueOf(this.f15503b));
    }

    public final C18728c getImageProxy(int i) {
        if (i != this.f15503b) {
            return new C5028j.C5029a(new IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return C5023g.m12857e((C0627p) this.f15504c);
    }

    public final String toString() {
        switch (this.f15502a) {
            case 1:
                StringBuilder k = C13555b.m33972k("<ShortStack vector:[");
                for (int i = 0; i < ((short[]) this.f15504c).length; i++) {
                    if (i != 0) {
                        k.append(" ");
                    }
                    if (i == this.f15503b) {
                        k.append(">>");
                    }
                    k.append(((short[]) this.f15504c)[i]);
                    if (i == this.f15503b) {
                        k.append("<<");
                    }
                }
                k.append("]>");
                return k.toString();
            default:
                return super.toString();
        }
    }

    public C4444m0(C0627p pVar, String str) {
        this.f15502a = 0;
        C4282g0 imageInfo = pVar.getImageInfo();
        if (imageInfo != null) {
            Integer num = (Integer) imageInfo.getTagBundle().mo19986a(str);
            if (num != null) {
                this.f15503b = num.intValue();
                this.f15504c = pVar;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }
}
