package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import p649mf.C18367b;
import p697of.C18741c;
import p697of.C18742d;
import p697of.C18746h;
import p766rf.C19260d;

public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        C19260d dVar = C19260d.f48934t;
        Timer timer = new Timer();
        timer.mo43523f();
        long j = timer.f36654b;
        C18367b bVar = new C18367b(dVar);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new C18742d((HttpsURLConnection) openConnection, timer, bVar).getContent();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new C18741c((HttpURLConnection) openConnection, timer, bVar).getContent();
            }
            return openConnection.getContent();
        } catch (IOException e) {
            bVar.mo50835k(j);
            bVar.mo50838n(timer.mo43519b());
            bVar.mo50839o(url.toString());
            C18746h.m45753c(bVar);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new C18742d((HttpsURLConnection) obj, new Timer(), new C18367b(C19260d.f48934t));
        }
        if (obj instanceof HttpURLConnection) {
            return new C18741c((HttpURLConnection) obj, new Timer(), new C18367b(C19260d.f48934t));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        C19260d dVar = C19260d.f48934t;
        Timer timer = new Timer();
        timer.mo43523f();
        long j = timer.f36654b;
        C18367b bVar = new C18367b(dVar);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new C18742d((HttpsURLConnection) openConnection, timer, bVar).getInputStream();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new C18741c((HttpURLConnection) openConnection, timer, bVar).getInputStream();
            }
            return openConnection.getInputStream();
        } catch (IOException e) {
            bVar.mo50835k(j);
            bVar.mo50838n(timer.mo43519b());
            bVar.mo50839o(url.toString());
            C18746h.m45753c(bVar);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        C19260d dVar = C19260d.f48934t;
        Timer timer = new Timer();
        timer.mo43523f();
        long j = timer.f36654b;
        C18367b bVar = new C18367b(dVar);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new C18742d((HttpsURLConnection) openConnection, timer, bVar).getContent(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new C18741c((HttpURLConnection) openConnection, timer, bVar).getContent(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e) {
            bVar.mo50835k(j);
            bVar.mo50838n(timer.mo43519b());
            bVar.mo50839o(url.toString());
            C18746h.m45753c(bVar);
            throw e;
        }
    }
}
