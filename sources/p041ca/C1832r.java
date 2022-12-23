package p041ca;

import android.database.Cursor;
import android.net.Uri;
import android.util.JsonReader;
import android.view.View;
import c00.C13733n;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import o50.C18717b;
import p041ca.C1835u;
import p042cb.C1843a;
import p112ha.C5199n0;
import p173ma.C5735h;
import p173ma.C5739k;
import p237r9.C6271d;
import p277ub.C6780f;
import p277ub.C6786k;
import p289va.C6901e;
import p484ff.C16992u;
import p508gf.C17188a;
import p601ke.C18028a;
import p861ve.C20114e;

/* renamed from: ca.r */
public final /* synthetic */ class C1832r implements C1835u.C1836a, C6786k.C6788b, C1843a.C1844a, C5739k, C18028a.C18029a, C6271d, SuccessContinuation, C13733n {

    /* renamed from: b */
    public final /* synthetic */ int f6346b;

    public /* synthetic */ C1832r(int i) {
        this.f6346b = i;
    }

    /* renamed from: a */
    public void mo6655a(Object obj, C6780f fVar) {
        C5199n0 n0Var = (C5199n0) obj;
    }

    public Object apply(Object obj) {
        boolean z;
        switch (this.f6346b) {
            case 0:
                if (((Cursor) obj).getCount() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                C17188a aVar = (C17188a) obj;
                aVar.getClass();
                C20114e eVar = C16992u.f44107a;
                eVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    eVar.mo52353a(aVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    /* renamed from: b */
    public C5735h[] mo252b(Uri uri, Map map) {
        return mo6657d();
    }

    /* renamed from: c */
    public boolean mo6656c(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    public Object convert(Object obj) {
        int i;
        switch (this.f6346b) {
            case 0:
                LineDetailActivity lineDetailActivity = (LineDetailActivity) obj;
                if (lineDetailActivity.f38744x0 == null) {
                    i = 0;
                } else {
                    int height = ((View) lineDetailActivity.f38743w0.getParent()).getHeight();
                    i = (int) ((1.0f - lineDetailActivity.f38744x0.f34353D) * ((float) height));
                }
                return Integer.valueOf(i);
            default:
                return ((PurchaseSplitActivity) obj).f23286Z;
        }
    }

    /* renamed from: d */
    public C5735h[] mo6657d() {
        return new C5735h[]{new C6901e()};
    }

    /* renamed from: f */
    public Object mo245f(JsonReader jsonReader) {
        return C18028a.m44702b(jsonReader);
    }

    public Task then(Object obj) {
        String str = (String) obj;
        int i = C18717b.f47627u;
        return Tasks.forResult(null);
    }
}
