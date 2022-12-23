package p697of;

import android.os.Build;
import com.amazonaws.http.HttpHeader;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import p649mf.C18367b;

/* renamed from: of.c */
public final class C18741c extends HttpURLConnection {

    /* renamed from: a */
    public final C18743e f47669a;

    public C18741c(HttpURLConnection httpURLConnection, Timer timer, C18367b bVar) {
        super(httpURLConnection.getURL());
        this.f47669a = new C18743e(httpURLConnection, timer, bVar);
    }

    public final void addRequestProperty(String str, String str2) {
        this.f47669a.f47673a.addRequestProperty(str, str2);
    }

    public final void connect() throws IOException {
        this.f47669a.mo51230a();
    }

    public final void disconnect() {
        C18743e eVar = this.f47669a;
        eVar.f47674b.mo50838n(eVar.f47677e.mo43519b());
        eVar.f47674b.mo50831c();
        eVar.f47673a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f47669a.equals(obj);
    }

    public final boolean getAllowUserInteraction() {
        return this.f47669a.f47673a.getAllowUserInteraction();
    }

    public final int getConnectTimeout() {
        return this.f47669a.f47673a.getConnectTimeout();
    }

    public final Object getContent() throws IOException {
        return this.f47669a.mo51231b();
    }

    public final String getContentEncoding() {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getContentEncoding();
    }

    public final int getContentLength() {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getContentLength();
    }

    public final long getContentLengthLong() {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        if (Build.VERSION.SDK_INT >= 24) {
            return eVar.f47673a.getContentLengthLong();
        }
        return 0;
    }

    public final String getContentType() {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getContentType();
    }

    public final long getDate() {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getDate();
    }

    public final boolean getDefaultUseCaches() {
        return this.f47669a.f47673a.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.f47669a.f47673a.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.f47669a.f47673a.getDoOutput();
    }

    public final InputStream getErrorStream() {
        return this.f47669a.mo51233d();
    }

    public final long getExpiration() {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getExpiration();
    }

    public final String getHeaderField(int i) {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getHeaderField(i);
    }

    public final long getHeaderFieldDate(String str, long j) {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getHeaderFieldDate(str, j);
    }

    public final int getHeaderFieldInt(String str, int i) {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getHeaderFieldInt(str, i);
    }

    public final String getHeaderFieldKey(int i) {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getHeaderFieldKey(i);
    }

    public final long getHeaderFieldLong(String str, long j) {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        if (Build.VERSION.SDK_INT >= 24) {
            return eVar.f47673a.getHeaderFieldLong(str, j);
        }
        return 0;
    }

    public final Map<String, List<String>> getHeaderFields() {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getHeaderFields();
    }

    public final long getIfModifiedSince() {
        return this.f47669a.f47673a.getIfModifiedSince();
    }

    public final InputStream getInputStream() throws IOException {
        return this.f47669a.mo51234e();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.f47669a.f47673a.getInstanceFollowRedirects();
    }

    public final long getLastModified() {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getLastModified();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.f47669a.mo51236f();
    }

    public final Permission getPermission() throws IOException {
        C18743e eVar = this.f47669a;
        eVar.getClass();
        try {
            return eVar.f47673a.getPermission();
        } catch (IOException e) {
            eVar.f47674b.mo50838n(eVar.f47677e.mo43519b());
            C18746h.m45753c(eVar.f47674b);
            throw e;
        }
    }

    public final int getReadTimeout() {
        return this.f47669a.f47673a.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.f47669a.f47673a.getRequestMethod();
    }

    public final Map<String, List<String>> getRequestProperties() {
        return this.f47669a.f47673a.getRequestProperties();
    }

    public final String getRequestProperty(String str) {
        return this.f47669a.f47673a.getRequestProperty(str);
    }

    public final int getResponseCode() throws IOException {
        return this.f47669a.mo51237g();
    }

    public final String getResponseMessage() throws IOException {
        return this.f47669a.mo51238h();
    }

    public final URL getURL() {
        return this.f47669a.f47673a.getURL();
    }

    public final boolean getUseCaches() {
        return this.f47669a.f47673a.getUseCaches();
    }

    public final int hashCode() {
        return this.f47669a.hashCode();
    }

    public final void setAllowUserInteraction(boolean z) {
        this.f47669a.f47673a.setAllowUserInteraction(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.f47669a.f47673a.setChunkedStreamingMode(i);
    }

    public final void setConnectTimeout(int i) {
        this.f47669a.f47673a.setConnectTimeout(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.f47669a.f47673a.setDefaultUseCaches(z);
    }

    public final void setDoInput(boolean z) {
        this.f47669a.f47673a.setDoInput(z);
    }

    public final void setDoOutput(boolean z) {
        this.f47669a.f47673a.setDoOutput(z);
    }

    public final void setFixedLengthStreamingMode(int i) {
        this.f47669a.f47673a.setFixedLengthStreamingMode(i);
    }

    public final void setIfModifiedSince(long j) {
        this.f47669a.f47673a.setIfModifiedSince(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.f47669a.f47673a.setInstanceFollowRedirects(z);
    }

    public final void setReadTimeout(int i) {
        this.f47669a.f47673a.setReadTimeout(i);
    }

    public final void setRequestMethod(String str) throws ProtocolException {
        this.f47669a.f47673a.setRequestMethod(str);
    }

    public final void setRequestProperty(String str, String str2) {
        C18743e eVar = this.f47669a;
        eVar.getClass();
        if (HttpHeader.USER_AGENT.equalsIgnoreCase(str)) {
            eVar.f47674b.f46835g = str2;
        }
        eVar.f47673a.setRequestProperty(str, str2);
    }

    public final void setUseCaches(boolean z) {
        this.f47669a.f47673a.setUseCaches(z);
    }

    public final String toString() {
        return this.f47669a.toString();
    }

    public final boolean usingProxy() {
        return this.f47669a.f47673a.usingProxy();
    }

    public final Object getContent(Class[] clsArr) throws IOException {
        return this.f47669a.mo51232c(clsArr);
    }

    public final String getHeaderField(String str) {
        C18743e eVar = this.f47669a;
        eVar.mo51240i();
        return eVar.f47673a.getHeaderField(str);
    }

    public final void setFixedLengthStreamingMode(long j) {
        this.f47669a.f47673a.setFixedLengthStreamingMode(j);
    }
}
