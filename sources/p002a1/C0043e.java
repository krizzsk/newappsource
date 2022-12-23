package p002a1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;

/* renamed from: a1.e */
public final class C0043e {

    /* renamed from: a */
    public int f40a = -1;

    /* renamed from: b */
    public SparseArray<C0044a> f41b = new SparseArray<>();

    /* renamed from: a1.e$a */
    public static class C0044a {

        /* renamed from: a */
        public int f42a;

        /* renamed from: b */
        public ArrayList<C0045b> f43b = new ArrayList<>();

        /* renamed from: c */
        public int f44c = -1;

        public C0044a(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0042d.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.State_android_id) {
                    this.f42a = obtainStyledAttributes.getResourceId(index, this.f42a);
                } else if (index == C0042d.State_constraints) {
                    this.f44c = obtainStyledAttributes.getResourceId(index, this.f44c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44c);
                    context.getResources().getResourceName(this.f44c);
                    "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final int mo22a(float f, float f2) {
            for (int i = 0; i < this.f43b.size(); i++) {
                if (this.f43b.get(i).mo23a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a1.e$b */
    public static class C0045b {

        /* renamed from: a */
        public float f45a = Float.NaN;

        /* renamed from: b */
        public float f46b = Float.NaN;

        /* renamed from: c */
        public float f47c = Float.NaN;

        /* renamed from: d */
        public float f48d = Float.NaN;

        /* renamed from: e */
        public int f49e = -1;

        public C0045b(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0042d.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.Variant_constraints) {
                    this.f49e = obtainStyledAttributes.getResourceId(index, this.f49e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f49e);
                    context.getResources().getResourceName(this.f49e);
                    "layout".equals(resourceTypeName);
                } else if (index == C0042d.Variant_region_heightLessThan) {
                    this.f48d = obtainStyledAttributes.getDimension(index, this.f48d);
                } else if (index == C0042d.Variant_region_heightMoreThan) {
                    this.f46b = obtainStyledAttributes.getDimension(index, this.f46b);
                } else if (index == C0042d.Variant_region_widthLessThan) {
                    this.f47c = obtainStyledAttributes.getDimension(index, this.f47c);
                } else if (index == C0042d.Variant_region_widthMoreThan) {
                    this.f45a = obtainStyledAttributes.getDimension(index, this.f45a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final boolean mo23a(float f, float f2) {
            if (!Float.isNaN(this.f45a) && f < this.f45a) {
                return false;
            }
            if (!Float.isNaN(this.f46b) && f2 < this.f46b) {
                return false;
            }
            if (!Float.isNaN(this.f47c) && f > this.f47c) {
                return false;
            }
            if (Float.isNaN(this.f48d) || f2 <= this.f48d) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0043e(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f40a = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r9.f41b = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r11)
            int[] r2 = p002a1.C0042d.StateSet
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r2)
            int r2 = r1.getIndexCount()
            r3 = 0
            r4 = 0
        L_0x0022:
            if (r4 >= r2) goto L_0x0037
            int r5 = r1.getIndex(r4)
            int r6 = p002a1.C0042d.StateSet_defaultState
            if (r5 != r6) goto L_0x0034
            int r6 = r9.f40a
            int r5 = r1.getResourceId(r5, r6)
            r9.f40a = r5
        L_0x0034:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0037:
            r1.recycle()
            r1 = 0
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
        L_0x003f:
            r4 = 1
            if (r2 == r4) goto L_0x00bb
            if (r2 == 0) goto L_0x00aa
            java.lang.String r5 = "StateSet"
            r6 = 3
            r7 = 2
            if (r2 == r7) goto L_0x0059
            if (r2 == r6) goto L_0x004d
            goto L_0x00ad
        L_0x004d:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            boolean r2 = r5.equals(r2)     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            if (r2 == 0) goto L_0x00ad
            goto L_0x00bb
        L_0x0059:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            int r8 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            switch(r8) {
                case 80204913: goto L_0x0080;
                case 1301459538: goto L_0x0076;
                case 1382829617: goto L_0x006f;
                case 1901439077: goto L_0x0065;
                default: goto L_0x0064;
            }     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
        L_0x0064:
            goto L_0x008a
        L_0x0065:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            if (r2 == 0) goto L_0x008a
            r4 = 3
            goto L_0x008b
        L_0x006f:
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            if (r2 == 0) goto L_0x008a
            goto L_0x008b
        L_0x0076:
            java.lang.String r4 = "LayoutDescription"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            if (r2 == 0) goto L_0x008a
            r4 = 0
            goto L_0x008b
        L_0x0080:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            if (r2 == 0) goto L_0x008a
            r4 = 2
            goto L_0x008b
        L_0x008a:
            r4 = -1
        L_0x008b:
            if (r4 == r7) goto L_0x009d
            if (r4 == r6) goto L_0x0090
            goto L_0x00ad
        L_0x0090:
            a1.e$b r2 = new a1.e$b     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            if (r1 == 0) goto L_0x00ad
            java.util.ArrayList<a1.e$b> r4 = r1.f43b     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            r4.add(r2)     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            goto L_0x00ad
        L_0x009d:
            a1.e$a r1 = new a1.e$a     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            r1.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            android.util.SparseArray<a1.e$a> r2 = r9.f41b     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            int r4 = r1.f42a     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            r2.put(r4, r1)     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            goto L_0x00ad
        L_0x00aa:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
        L_0x00ad:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00b7, IOException -> 0x00b2 }
            goto L_0x003f
        L_0x00b2:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00bb
        L_0x00b7:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a1.C0043e.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* renamed from: a */
    public final int mo21a(int i) {
        int i2;
        C0044a aVar;
        int a;
        float f = (float) -1;
        if (-1 == i) {
            if (i == -1) {
                aVar = this.f41b.valueAt(0);
            } else {
                aVar = this.f41b.get(-1);
            }
            if (aVar == null || -1 == (a = aVar.mo22a(f, f))) {
                return -1;
            }
            if (a == -1) {
                i2 = aVar.f44c;
            } else {
                i2 = aVar.f43b.get(a).f49e;
            }
        } else {
            C0044a aVar2 = this.f41b.get(i);
            if (aVar2 == null) {
                return -1;
            }
            int a2 = aVar2.mo22a(f, f);
            if (a2 == -1) {
                i2 = aVar2.f44c;
            } else {
                i2 = aVar2.f43b.get(a2).f49e;
            }
        }
        return i2;
    }
}
