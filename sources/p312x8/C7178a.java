package p312x8;

import android.content.Context;
import bf0.C21050d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$ObjectRef;
import mf0.C24362h;
import org.json.JSONObject;
import p389bl.C13637c;
import p950yw.C20778e;
import p950yw.C20779f;
import uh0.C25072a;

/* renamed from: x8.a */
public final /* synthetic */ class C7178a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22269b;

    /* renamed from: c */
    public final /* synthetic */ Object f22270c;

    /* renamed from: d */
    public final /* synthetic */ Object f22271d;

    /* renamed from: e */
    public final /* synthetic */ Object f22272e;

    /* renamed from: f */
    public final /* synthetic */ Object f22273f;

    /* renamed from: g */
    public final /* synthetic */ Object f22274g;

    public /* synthetic */ C7178a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f22269b = i;
        this.f22270c = obj;
        this.f22271d = obj2;
        this.f22272e = obj3;
        this.f22273f = obj4;
        this.f22274g = obj5;
    }

    public final void run() {
        BufferedReader bufferedReader;
        switch (this.f22269b) {
            case 0:
                URL url = (URL) this.f22270c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f22271d;
                String str = (String) this.f22272e;
                ReentrantLock reentrantLock = (ReentrantLock) this.f22273f;
                Condition condition = (Condition) this.f22274g;
                C24362h.m61211f(url, "$openIdKeyUrl");
                C24362h.m61211f(ref$ObjectRef, "$result");
                C24362h.m61211f(str, "$kid");
                C24362h.m61211f(reentrantLock, "$lock");
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                if (uRLConnection != null) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        C24362h.m61210e(inputStream, "connection.inputStream");
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C25072a.f63272a);
                        if (inputStreamReader instanceof BufferedReader) {
                            bufferedReader = (BufferedReader) inputStreamReader;
                        } else {
                            bufferedReader = new BufferedReader(inputStreamReader, 8192);
                        }
                        String C = C13637c.m34048C(bufferedReader);
                        httpURLConnection.getInputStream().close();
                        ref$ObjectRef.element = new JSONObject(C).optString(str);
                        httpURLConnection.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                            C21050d dVar = C21050d.f52856a;
                            reentrantLock.unlock();
                            return;
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    } catch (Exception e) {
                        try {
                            e.getMessage();
                            httpURLConnection.disconnect();
                            reentrantLock.lock();
                            condition.signal();
                            C21050d dVar2 = C21050d.f52856a;
                        } catch (Throwable th2) {
                            httpURLConnection.disconnect();
                            reentrantLock.lock();
                            condition.signal();
                            C21050d dVar3 = C21050d.f52856a;
                            throw th2;
                        } finally {
                            reentrantLock.unlock();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
            default:
                MapFragment mapFragment = ((C20779f) this.f22270c).f52430b;
                BoxE6 c = BoxE6.m40164c((LatLonE6) this.f22271d, (LatLonE6) this.f22272e);
                List asList = Arrays.asList(new MarkerZoomStyle[]{(MarkerZoomStyle) this.f22273f, (MarkerZoomStyle) this.f22274g});
                Context requireContext = mapFragment.requireContext();
                new C20778e(requireContext, asList, requireContext, mapFragment, c).mo48196g();
                return;
        }
    }
}
