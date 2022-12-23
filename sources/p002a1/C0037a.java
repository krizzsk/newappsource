package p002a1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* renamed from: a1.a */
public final class C0037a {

    /* renamed from: a */
    public final ConstraintLayout f21a;

    /* renamed from: b */
    public int f22b = -1;

    /* renamed from: c */
    public int f23c = -1;

    /* renamed from: d */
    public SparseArray<C0038a> f24d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<C0738a> f25e = new SparseArray<>();

    /* renamed from: a1.a$a */
    public static class C0038a {

        /* renamed from: a */
        public int f26a;

        /* renamed from: b */
        public ArrayList<C0039b> f27b = new ArrayList<>();

        /* renamed from: c */
        public int f28c = -1;

        /* renamed from: d */
        public C0738a f29d;

        public C0038a(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0042d.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.State_android_id) {
                    this.f26a = obtainStyledAttributes.getResourceId(index, this.f26a);
                } else if (index == C0042d.State_constraints) {
                    this.f28c = obtainStyledAttributes.getResourceId(index, this.f28c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f28c);
                    context.getResources().getResourceName(this.f28c);
                    if ("layout".equals(resourceTypeName)) {
                        C0738a aVar = new C0738a();
                        this.f29d = aVar;
                        aVar.mo3238e((ConstraintLayout) LayoutInflater.from(context).inflate(this.f28c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final int mo19a(float f, float f2) {
            for (int i = 0; i < this.f27b.size(); i++) {
                if (this.f27b.get(i).mo20a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a1.a$b */
    public static class C0039b {

        /* renamed from: a */
        public float f30a = Float.NaN;

        /* renamed from: b */
        public float f31b = Float.NaN;

        /* renamed from: c */
        public float f32c = Float.NaN;

        /* renamed from: d */
        public float f33d = Float.NaN;

        /* renamed from: e */
        public int f34e = -1;

        /* renamed from: f */
        public C0738a f35f;

        public C0039b(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0042d.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.Variant_constraints) {
                    this.f34e = obtainStyledAttributes.getResourceId(index, this.f34e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f34e);
                    context.getResources().getResourceName(this.f34e);
                    if ("layout".equals(resourceTypeName)) {
                        C0738a aVar = new C0738a();
                        this.f35f = aVar;
                        aVar.mo3238e((ConstraintLayout) LayoutInflater.from(context).inflate(this.f34e, (ViewGroup) null));
                    }
                } else if (index == C0042d.Variant_region_heightLessThan) {
                    this.f33d = obtainStyledAttributes.getDimension(index, this.f33d);
                } else if (index == C0042d.Variant_region_heightMoreThan) {
                    this.f31b = obtainStyledAttributes.getDimension(index, this.f31b);
                } else if (index == C0042d.Variant_region_widthLessThan) {
                    this.f32c = obtainStyledAttributes.getDimension(index, this.f32c);
                } else if (index == C0042d.Variant_region_widthMoreThan) {
                    this.f30a = obtainStyledAttributes.getDimension(index, this.f30a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final boolean mo20a(float f, float f2) {
            if (!Float.isNaN(this.f30a) && f < this.f30a) {
                return false;
            }
            if (!Float.isNaN(this.f31b) && f2 < this.f31b) {
                return false;
            }
            if (!Float.isNaN(this.f32c) && f > this.f32c) {
                return false;
            }
            if (Float.isNaN(this.f33d) || f2 <= this.f33d) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0037a(android.content.Context r8, androidx.constraintlayout.widget.ConstraintLayout r9, int r10) {
        /*
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f22b = r0
            r7.f23c = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f24d = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f25e = r1
            r7.f21a = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r9.getXml(r10)
            int r10 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1 = 0
        L_0x0025:
            r2 = 1
            if (r10 == r2) goto L_0x00a6
            if (r10 == 0) goto L_0x0095
            r3 = 2
            if (r10 == r3) goto L_0x002f
            goto L_0x0098
        L_0x002f:
            java.lang.String r10 = r9.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r4 = r10.hashCode()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x0064;
                case 80204913: goto L_0x005a;
                case 1382829617: goto L_0x0051;
                case 1657696882: goto L_0x0047;
                case 1901439077: goto L_0x003d;
                default: goto L_0x003c;
            }     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x003c:
            goto L_0x006e
        L_0x003d:
            java.lang.String r2 = "Variant"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = 3
            goto L_0x006f
        L_0x0047:
            java.lang.String r2 = "layoutDescription"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = 0
            goto L_0x006f
        L_0x0051:
            java.lang.String r4 = "StateSet"
            boolean r10 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            goto L_0x006f
        L_0x005a:
            java.lang.String r2 = "State"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = 2
            goto L_0x006f
        L_0x0064:
            java.lang.String r2 = "ConstraintSet"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = 4
            goto L_0x006f
        L_0x006e:
            r2 = -1
        L_0x006f:
            if (r2 == r3) goto L_0x0087
            if (r2 == r6) goto L_0x007a
            if (r2 == r5) goto L_0x0076
            goto L_0x0098
        L_0x0076:
            r7.mo18a(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x007a:
            a1.a$b r10 = new a1.a$b     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r1 == 0) goto L_0x0098
            java.util.ArrayList<a1.a$b> r2 = r1.f27b     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r2.add(r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x0087:
            a1.a$a r10 = new a1.a$a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            android.util.SparseArray<a1.a$a> r1 = r7.f24d     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r2 = r10.f26a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1.put(r2, r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1 = r10
            goto L_0x0098
        L_0x0095:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x0098:
            int r10 = r9.next()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0025
        L_0x009d:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x00a6
        L_0x00a2:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a1.C0037a.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }

    /* renamed from: a */
    public final void mo18a(Context context, XmlResourceParser xmlResourceParser) {
        int i;
        C0738a aVar = new C0738a();
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeName = xmlResourceParser.getAttributeName(i2);
            String attributeValue = xmlResourceParser.getAttributeValue(i2);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i2++;
            } else {
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1 && attributeValue.length() > 1) {
                    i = Integer.parseInt(attributeValue.substring(1));
                }
                aVar.mo3243l(context, xmlResourceParser);
                this.f25e.put(i, aVar);
                return;
            }
        }
    }
}
