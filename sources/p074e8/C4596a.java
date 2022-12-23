package p074e8;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.ref.WeakReference;
import mf0.C24362h;
import p009a8.C0115o;
import p074e8.C4600c;
import p085f8.C4714d;
import p262t8.C6606a;
import p304x.C7078n;

/* renamed from: e8.a */
public final class C4596a {

    /* renamed from: a */
    public static final C4596a f15790a = new C4596a();

    /* renamed from: e8.a$a */
    public static final class C4597a implements View.OnClickListener {

        /* renamed from: b */
        public EventBinding f15791b;

        /* renamed from: c */
        public WeakReference<View> f15792c;

        /* renamed from: d */
        public WeakReference<View> f15793d;

        /* renamed from: e */
        public View.OnClickListener f15794e;

        /* renamed from: f */
        public boolean f15795f = true;

        public C4597a(EventBinding eventBinding, View view, View view2) {
            this.f15791b = eventBinding;
            this.f15792c = new WeakReference<>(view2);
            this.f15793d = new WeakReference<>(view);
            this.f15794e = C4714d.m12015e(view2);
        }

        public final void onClick(View view) {
            if (!C6606a.m15601b(this)) {
                try {
                    if (!C6606a.m15601b(this)) {
                        C24362h.m61211f(view, Promotion.ACTION_VIEW);
                        View.OnClickListener onClickListener = this.f15794e;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        View view2 = this.f15793d.get();
                        View view3 = this.f15792c.get();
                        if (view2 != null && view3 != null) {
                            C4596a aVar = C4596a.f15790a;
                            C4596a.m11909a(this.f15791b, view2, view3);
                        }
                    }
                } catch (Throwable th) {
                    C6606a.m15600a(this, th);
                }
            }
        }
    }

    /* renamed from: e8.a$b */
    public static final class C4598b implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public EventBinding f15796b;

        /* renamed from: c */
        public WeakReference<AdapterView<?>> f15797c;

        /* renamed from: d */
        public WeakReference<View> f15798d;

        /* renamed from: e */
        public AdapterView.OnItemClickListener f15799e;

        /* renamed from: f */
        public boolean f15800f = true;

        public C4598b(EventBinding eventBinding, View view, AdapterView<?> adapterView) {
            this.f15796b = eventBinding;
            this.f15797c = new WeakReference<>(adapterView);
            this.f15798d = new WeakReference<>(view);
            this.f15799e = adapterView.getOnItemClickListener();
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C24362h.m61211f(view, Promotion.ACTION_VIEW);
            AdapterView.OnItemClickListener onItemClickListener = this.f15799e;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            View view2 = this.f15798d.get();
            AdapterView adapterView2 = this.f15797c.get();
            if (view2 != null && adapterView2 != null) {
                C4596a aVar = C4596a.f15790a;
                C4596a.m11909a(this.f15796b, view2, adapterView2);
            }
        }
    }

    /* renamed from: a */
    public static final void m11909a(EventBinding eventBinding, View view, View view2) {
        Class<C4596a> cls = C4596a.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(eventBinding, "mapping");
                String str = eventBinding.f8509a;
                C4600c.C4601a aVar = C4600c.f15809f;
                Bundle b = C4600c.C4601a.m11915b(eventBinding, view, view2);
                f15790a.mo20117b(b);
                C0115o.m212c().execute(new C7078n(3, str, b));
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|9|(5:11|12|13|(2:17|18)|19)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0053 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20117b(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = "_valueToSum"
            boolean r1 = p262t8.C6606a.m15601b(r6)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = r7.getString(r0)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0056
            int r2 = p135j8.C5398d.f17731a     // Catch:{ all -> 0x005e }
            r2 = 0
            java.lang.String r4 = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?"
            r5 = 8
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r5)     // Catch:{ ParseException -> 0x0053 }
            java.util.regex.Matcher r1 = r4.matcher(r1)     // Catch:{ ParseException -> 0x0053 }
            boolean r4 = r1.find()     // Catch:{ ParseException -> 0x0053 }
            if (r4 == 0) goto L_0x0053
            r4 = 0
            java.lang.String r1 = r1.group(r4)     // Catch:{ ParseException -> 0x0053 }
            com.facebook.internal.f0 r4 = com.facebook.internal.C2397f0.f8630a     // Catch:{ ParseException -> 0x0053 }
            android.content.Context r4 = p009a8.C0115o.m210a()     // Catch:{ Exception -> 0x003b }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ Exception -> 0x003b }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ Exception -> 0x003b }
            java.util.Locale r4 = r4.locale     // Catch:{ Exception -> 0x003b }
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            if (r4 != 0) goto L_0x0047
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ ParseException -> 0x0053 }
            java.lang.String r5 = "getDefault()"
            mf0.C24362h.m61210e(r4, r5)     // Catch:{ ParseException -> 0x0053 }
        L_0x0047:
            java.text.NumberFormat r4 = java.text.NumberFormat.getNumberInstance(r4)     // Catch:{ ParseException -> 0x0053 }
            java.lang.Number r1 = r4.parse(r1)     // Catch:{ ParseException -> 0x0053 }
            double r2 = r1.doubleValue()     // Catch:{ ParseException -> 0x0053 }
        L_0x0053:
            r7.putDouble(r0, r2)     // Catch:{ all -> 0x005e }
        L_0x0056:
            java.lang.String r0 = "_is_fb_codeless"
            java.lang.String r1 = "1"
            r7.putString(r0, r1)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r7 = move-exception
            p262t8.C6606a.m15600a(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p074e8.C4596a.mo20117b(android.os.Bundle):void");
    }
}
