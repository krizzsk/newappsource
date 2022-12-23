package v20;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.SparseArray;
import c00.C13733n;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.Color;
import com.moovit.map.C16273d;
import com.moovit.map.C16286k;
import com.moovit.map.LineStyle;
import com.moovit.map.MarkerZoomStyle;
import com.nutiteq.components.MapPos;
import java.util.WeakHashMap;
import o20.C18699e;
import oa0.C12964d;
import p241s0.C6306f;
import p435de.C16596f;
import p583jk.C17884p;
import p977zz.C20975x0;
import ua0.C13146c;
import ua0.C13148d;
import ua0.C13151f;
import ua0.C13153g;
import ua0.C13155h;
import v10.C20065a;

/* renamed from: v20.a */
public final class C20082a {

    /* renamed from: e */
    public static final PointF f50942e = new PointF(0.5f, 1.0f);

    /* renamed from: f */
    public static C20083a f50943f = new C20083a();

    /* renamed from: g */
    public static C20084b f50944g = new C20084b();

    /* renamed from: a */
    public final C20092c f50945a;

    /* renamed from: b */
    public final C20085c f50946b = new C20085c();

    /* renamed from: c */
    public final C20086d f50947c = new C20086d();

    /* renamed from: d */
    public final C20089g f50948d;

    /* renamed from: v20.a$a */
    public class C20083a implements C16273d.C16274a<Boolean, Void> {
        /* renamed from: a */
        public final Object mo48758a(C16286k kVar, Boolean bool) {
            Void voidR = (Void) bool;
            return Boolean.FALSE;
        }

        /* renamed from: b */
        public final Object mo48759b(LineStyle lineStyle, Boolean bool) {
            Void voidR = (Void) bool;
            return Boolean.FALSE;
        }

        /* renamed from: c */
        public final Object mo48760c(Boolean bool) {
            Void voidR = (Void) bool;
            throw new UnsupportedOperationException("Nutiteq doesn't implement ground overlays");
        }

        /* renamed from: d */
        public final Object mo48761d(MarkerZoomStyle markerZoomStyle, Boolean bool) {
            Void voidR = (Void) bool;
            return Boolean.TRUE;
        }
    }

    /* renamed from: v20.a$b */
    public class C20084b implements C16273d.C16274a<C13153g, Boolean> {
        /* renamed from: e */
        public static C13146c m47604e(LineStyle lineStyle) {
            int i;
            int i2 = lineStyle.f42326b.f41007b;
            float f = lineStyle.f42327c;
            LineStyle.LineJoin lineJoin = lineStyle.f42328d;
            int i3 = C20087e.f50951a[lineJoin.ordinal()];
            int i4 = 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new IllegalArgumentException("Unknown line-join constant: " + lineJoin);
                        }
                    }
                }
                i4 = 1;
            } else {
                i4 = 0;
            }
            C13146c.C13147a aVar = new C13146c.C13147a();
            aVar.f32694a = i2;
            aVar.f32695b = null;
            aVar.f32679d = -f;
            aVar.f32681f = i4;
            Bitmap bitmap = lineStyle.f42329e;
            int[] iArr = lineStyle.f42330f;
            Bitmap bitmap2 = lineStyle.f42331g;
            float f2 = lineStyle.f42332h;
            if (bitmap != null) {
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                aVar.f32678c = bitmap;
                aVar.f32679d = (float) (-width);
                aVar.f32680e = ((float) height) / ((float) width);
            } else if (iArr != null) {
                int i5 = 0;
                for (int i6 : iArr) {
                    i5 += i6;
                }
                float f3 = ((float) i5) / f;
                int i7 = 0;
                for (int i8 : iArr) {
                    i7 += i8;
                }
                Bitmap createBitmap = Bitmap.createBitmap(1, i7, Bitmap.Config.ARGB_8888);
                int i9 = 0;
                for (int i11 = 0; i11 < iArr.length; i11 += 2) {
                    int i12 = i9;
                    while (true) {
                        i = iArr[i11];
                        if (i12 >= i9 + i) {
                            break;
                        }
                        createBitmap.setPixel(0, i12, -1);
                        i12++;
                    }
                    i9 += i + iArr[i11 + 1];
                }
                aVar.f32678c = createBitmap;
                aVar.f32680e = f3;
            } else if (bitmap2 != null) {
                aVar.f32682g = bitmap2;
                aVar.f32679d = -1.0f;
                aVar.f32683h = f2;
            }
            return new C13146c(aVar);
        }

        /* renamed from: a */
        public final Object mo48758a(C16286k kVar, Boolean bool) {
            int i;
            C13146c cVar;
            Color color = kVar.f42558b;
            LineStyle lineStyle = kVar.f42559c;
            if (color == null) {
                i = 0;
            } else {
                i = color.f41007b;
            }
            if (lineStyle == null) {
                cVar = null;
            } else {
                cVar = m47604e(lineStyle);
            }
            C13151f.C13152a aVar = new C13151f.C13152a();
            aVar.f32694a = i;
            aVar.f32695b = null;
            aVar.f32692c = cVar;
            return new C13151f(aVar);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo48759b(LineStyle lineStyle, Boolean bool) {
            return m47604e(lineStyle);
        }

        /* renamed from: c */
        public final Object mo48760c(Boolean bool) {
            throw new UnsupportedOperationException("Nutiteq doesn't implement ground overlays");
        }

        /* renamed from: d */
        public final Object mo48761d(MarkerZoomStyle markerZoomStyle, Boolean bool) {
            int i;
            int i2;
            boolean booleanValue = bool.booleanValue();
            C20065a aVar = markerZoomStyle.f42450d;
            PointF pointF = aVar.f50910b;
            if (pointF == null) {
                StringBuilder k = C13555b.m33972k("The anchor for marker style icons must be non-null (image ");
                k.append(markerZoomStyle.f42448b);
                k.append(")");
                C16596f.m42113a().mo49364c(new IllegalArgumentException(k.toString()));
                pointF = C20082a.f50942e;
            }
            int i3 = markerZoomStyle.f42451e;
            float f = ((1.0f - pointF.x) * 2.0f) - 1.0f;
            float f2 = (pointF.y * 2.0f) - 1.0f;
            float f3 = markerZoomStyle.f42452f * -1.0f;
            int i4 = i3 << 24;
            if (booleanValue) {
                i = 11184810;
            } else {
                i = 16777215;
            }
            int i5 = i | i4;
            int i6 = markerZoomStyle.f42453g;
            if (i6 != 1) {
                i2 = 2;
                if (i6 != 2) {
                    throw new IllegalStateException(C16759e.m42349e("Unknown orientation=", i6));
                }
            } else {
                i2 = 0;
            }
            WeakHashMap<Point, Bitmap> weakHashMap = C13148d.f32684h;
            C13148d.C13149a aVar2 = new C13148d.C13149a();
            aVar2.f32688g = aVar.f50909a;
            aVar2.f32646c = f;
            aVar2.f32647d = f2;
            aVar2.f32689h = -1.0f;
            aVar2.f32695b = null;
            aVar2.f32690i = Float.valueOf(f3);
            aVar2.f32649f = i2;
            aVar2.f32694a = i5;
            aVar2.f32695b = null;
            aVar2.f32695b = new C13148d(aVar2);
            return aVar2.f32695b;
        }
    }

    /* renamed from: v20.a$c */
    public class C20085c implements C13733n<LatLonE6, MapPos> {
        public C20085c() {
        }

        public final Object convert(Object obj) throws Exception {
            return C20082a.this.f50945a.mo52342I((LatLonE6) obj);
        }
    }

    /* renamed from: v20.a$d */
    public class C20086d implements C13733n<MapPos, LatLonE6> {
        public C20086d() {
        }

        public final Object convert(Object obj) throws Exception {
            return C20082a.this.f50945a.mo52343J((MapPos) obj);
        }
    }

    /* renamed from: v20.a$e */
    public static /* synthetic */ class C20087e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50951a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.map.LineStyle$LineJoin[] r0 = com.moovit.map.LineStyle.LineJoin.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f50951a = r0
                com.moovit.map.LineStyle$LineJoin r1 = com.moovit.map.LineStyle.LineJoin.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50951a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.map.LineStyle$LineJoin r1 = com.moovit.map.LineStyle.LineJoin.BEVEL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f50951a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.map.LineStyle$LineJoin r1 = com.moovit.map.LineStyle.LineJoin.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f50951a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.map.LineStyle$LineJoin r1 = com.moovit.map.LineStyle.LineJoin.MITER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v20.C20082a.C20087e.<clinit>():void");
        }
    }

    /* renamed from: v20.a$f */
    public static class C20088f {

        /* renamed from: a */
        public final Object f50952a;

        /* renamed from: b */
        public final SparseArray<? extends C16273d> f50953b;

        public C20088f(Object obj, SparseArray<? extends C16273d> sparseArray) {
            this.f50952a = obj;
            this.f50953b = sparseArray;
        }
    }

    /* renamed from: v20.a$g */
    public static class C20089g extends C6306f<C20090h, C13155h<?>> {
        public C20089g(int i) {
            super(i);
        }

        public final int sizeOf(Object obj, Object obj2) {
            int i;
            C20090h hVar = (C20090h) obj;
            C13155h hVar2 = (C13155h) obj2;
            int size = (hVar2.f32696a.size() * 4) + 12;
            for (int i2 = 0; i2 < hVar2.f32696a.size(); i2++) {
                T t = ((C13155h.C13156a) hVar2.f32696a.get(i2)).f32698b;
                if (t == null) {
                    i = 0;
                } else {
                    i = t.mo40046a();
                }
                size += i + 8;
            }
            return size;
        }
    }

    /* renamed from: v20.a$h */
    public static class C20090h {

        /* renamed from: a */
        public final SparseArray<? extends C16273d> f50954a;

        /* renamed from: b */
        public final boolean f50955b;

        public C20090h(SparseArray<? extends C16273d> sparseArray, boolean z) {
            C21100e.m49373x(sparseArray, "styleKeySet");
            this.f50954a = sparseArray;
            this.f50955b = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C20090h)) {
                return false;
            }
            C20090h hVar = (C20090h) obj;
            if (hVar.f50954a.size() != this.f50954a.size() || hVar.f50955b != this.f50955b) {
                return false;
            }
            int size = this.f50954a.size();
            for (int i = 0; i < size; i++) {
                if (hVar.f50954a.keyAt(i) != this.f50954a.keyAt(i) || !C20975x0.m49118e(this.f50954a.valueAt(i), hVar.f50954a.valueAt(i))) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            int size = this.f50954a.size();
            int i = 17;
            for (int i2 = 0; i2 < size; i2++) {
                i = C17884p.m44360c((i * 37) + this.f50954a.keyAt(i2), this.f50954a.valueAt(i2));
            }
            return (i * 37) + (this.f50955b ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("pressed=");
            sb.append(this.f50955b);
            sb.append(' ');
            int size = this.f50954a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f50954a.keyAt(i));
                sb.append('=');
                sb.append(this.f50954a.valueAt(i));
                sb.append(", ");
            }
            return sb.toString();
        }
    }

    public C20082a(C20092c cVar, int i) {
        C21100e.m49373x(cVar, "owner");
        this.f50945a = cVar;
        this.f50948d = new C20089g(i);
    }

    /* renamed from: c */
    public static SparseArray m47597c(C18699e eVar) {
        SparseArray<MEZS> sparseArray = eVar.f47605d;
        if (sparseArray != null) {
            return sparseArray;
        }
        SparseArray sparseArray2 = new SparseArray();
        sparseArray2.put(eVar.f47603b, eVar.f47602a);
        sparseArray2.put(eVar.f47604c, (Object) null);
        return sparseArray2;
    }

    /* renamed from: a */
    public final <S extends C13153g, MES extends C16273d> C13155h<S> mo52332a(SparseArray<MES> sparseArray, boolean z) {
        C13153g gVar;
        C20090h hVar = new C20090h(sparseArray, z);
        C13155h<S> hVar2 = (C13155h) this.f50948d.get(hVar);
        if (hVar2 != null) {
            return hVar2;
        }
        int size = sparseArray.size();
        SparseArray sparseArray2 = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            C16273d dVar = (C16273d) sparseArray.valueAt(i);
            if (dVar == null) {
                gVar = null;
            } else {
                gVar = (C13153g) dVar.mo48602b(f50944g, Boolean.valueOf(z));
            }
            sparseArray2.append(keyAt, gVar);
        }
        C13155h<S> hVar3 = new C13155h<>(sparseArray2);
        this.f50948d.put(hVar, hVar3);
        return hVar3;
    }

    /* renamed from: b */
    public final void mo52333b(C12964d dVar, boolean z) {
        SparseArray<? extends C16273d> sparseArray = ((C20088f) dVar.f32126f).f50953b;
        int size = sparseArray.size();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C16273d dVar2 = (C16273d) sparseArray.valueAt(i);
                if (dVar2 != null && ((Boolean) dVar2.mo48602b(f50943f, (Boolean) null)).booleanValue()) {
                    z2 = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (z2) {
            C13155h<?> a = mo52332a(sparseArray, z);
            if (!a.equals(dVar.f32124d)) {
                dVar.f32124d = a;
                dVar.mo39856f();
            }
        }
    }
}
