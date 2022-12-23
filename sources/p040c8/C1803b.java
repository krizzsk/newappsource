package p040c8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.C24179b;
import mf0.C24362h;
import p085f8.C4714d;
import p262t8.C6606a;

/* renamed from: c8.b */
public final class C1803b {

    /* renamed from: a */
    public static final C1803b f6293a = new C1803b();

    /* renamed from: a */
    public static final ArrayList m5111a(View view) {
        Class<C1803b> cls = C1803b.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup h = C4714d.m12018h(view);
            if (h != null) {
                Iterator it = C4714d.m12012a(h).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view != view2) {
                        arrayList.addAll(f6293a.mo6617c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|(1:6)|7|(1:9)|10|11|12|(2:14|(2:16|(1:18))(2:19|20))|21|22|(5:25|(1:27)(1:28)|(2:32|41)|37|23)|38|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0071 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[Catch:{ all -> 0x00a7 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList m5112b(android.view.View r8) {
        /*
            java.lang.Class<c8.b> r0 = p040c8.C1803b.class
            boolean r1 = p262t8.C6606a.m15601b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00a7 }
            r1.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = p085f8.C4714d.m12017g(r8)     // Catch:{ all -> 0x00a7 }
            r1.add(r3)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r3 = r8.getTag()     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0023
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a7 }
            r1.add(r3)     // Catch:{ all -> 0x00a7 }
        L_0x0023:
            java.lang.CharSequence r3 = r8.getContentDescription()     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0030
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a7 }
            r1.add(r3)     // Catch:{ all -> 0x00a7 }
        L_0x0030:
            r3 = 0
            r4 = 1
            int r5 = r8.getId()     // Catch:{ NotFoundException -> 0x0071 }
            r6 = -1
            if (r5 == r6) goto L_0x0071
            android.content.res.Resources r5 = r8.getResources()     // Catch:{ NotFoundException -> 0x0071 }
            int r8 = r8.getId()     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.String r8 = r5.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.String r5 = "resourceName"
            mf0.C24362h.m61210e(r8, r5)     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.String r5 = "/"
            kotlin.text.Regex r6 = new kotlin.text.Regex     // Catch:{ NotFoundException -> 0x0071 }
            r6.<init>((java.lang.String) r5)     // Catch:{ NotFoundException -> 0x0071 }
            java.util.List r8 = r6.mo60285d(r8)     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.Object[] r8 = r8.toArray(r5)     // Catch:{ NotFoundException -> 0x0071 }
            if (r8 == 0) goto L_0x0069
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ NotFoundException -> 0x0071 }
            int r5 = r8.length     // Catch:{ NotFoundException -> 0x0071 }
            r6 = 2
            if (r5 != r6) goto L_0x0071
            r8 = r8[r4]     // Catch:{ NotFoundException -> 0x0071 }
            r1.add(r8)     // Catch:{ NotFoundException -> 0x0071 }
            goto L_0x0071
        L_0x0069:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r8.<init>(r5)     // Catch:{ NotFoundException -> 0x0071 }
            throw r8     // Catch:{ NotFoundException -> 0x0071 }
        L_0x0071:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00a7 }
            r8.<init>()     // Catch:{ all -> 0x00a7 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a7 }
        L_0x007a:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x00a7 }
            if (r5 == 0) goto L_0x00a6
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00a7 }
            int r6 = r5.length()     // Catch:{ all -> 0x00a7 }
            if (r6 <= 0) goto L_0x008e
            r6 = 1
            goto L_0x008f
        L_0x008e:
            r6 = 0
        L_0x008f:
            if (r6 == 0) goto L_0x007a
            int r6 = r5.length()     // Catch:{ all -> 0x00a7 }
            r7 = 100
            if (r6 > r7) goto L_0x007a
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ all -> 0x00a7 }
            java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
            mf0.C24362h.m61210e(r5, r6)     // Catch:{ all -> 0x00a7 }
            r8.add(r5)     // Catch:{ all -> 0x00a7 }
            goto L_0x007a
        L_0x00a6:
            return r8
        L_0x00a7:
            r8 = move-exception
            p262t8.C6606a.m15600a(r0, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c8.C1803b.m5112b(android.view.View):java.util.ArrayList");
    }

    /* renamed from: d */
    public static final boolean m5113d(ArrayList arrayList, ArrayList arrayList2) {
        C1803b bVar;
        boolean z;
        Class<C1803b> cls = C1803b.class;
        if (C6606a.m15601b(cls)) {
            return false;
        }
        try {
            C24362h.m61211f(arrayList, "indicators");
            C24362h.m61211f(arrayList2, "keys");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                bVar = f6293a;
                bVar.getClass();
                if (!C6606a.m15601b(bVar)) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (C24179b.m60559G(str, (String) it2.next(), false)) {
                                z = true;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                continue;
                if (z) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return false;
        }
    }

    /* renamed from: c */
    public final ArrayList mo6617c(View view) {
        boolean z;
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && obj.length() < 100) {
                    String lowerCase = obj.toLowerCase();
                    C24362h.m61210e(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                }
                return arrayList;
            }
            Iterator it = C4714d.m12012a(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(mo6617c((View) it.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }
}
