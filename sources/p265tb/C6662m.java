package p265tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appboy.support.AppboyFileUtils;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.ContentDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: tb.m */
public final class C6662m implements C6654g {

    /* renamed from: a */
    public final Context f20712a;

    /* renamed from: b */
    public final ArrayList f20713b = new ArrayList();

    /* renamed from: c */
    public final C6654g f20714c;

    /* renamed from: d */
    public FileDataSource f20715d;

    /* renamed from: e */
    public AssetDataSource f20716e;

    /* renamed from: f */
    public ContentDataSource f20717f;

    /* renamed from: g */
    public C6654g f20718g;

    /* renamed from: h */
    public UdpDataSource f20719h;

    /* renamed from: i */
    public C6653f f20720i;

    /* renamed from: j */
    public RawResourceDataSource f20721j;

    /* renamed from: k */
    public C6654g f20722k;

    public C6662m(Context context, C6654g gVar) {
        this.f20712a = context.getApplicationContext();
        gVar.getClass();
        this.f20714c = gVar;
    }

    /* renamed from: l */
    public static void m15731l(C6654g gVar, C6671u uVar) {
        if (gVar != null) {
            gVar.mo20680d(uVar);
        }
    }

    /* renamed from: b */
    public final Map<String, List<String>> mo20679b() {
        C6654g gVar = this.f20722k;
        return gVar == null ? Collections.emptyMap() : gVar.mo20679b();
    }

    public final void close() throws IOException {
        C6654g gVar = this.f20722k;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.f20722k = null;
            }
        }
    }

    /* renamed from: d */
    public final void mo20680d(C6671u uVar) {
        uVar.getClass();
        this.f20714c.mo20680d(uVar);
        this.f20713b.add(uVar);
        m15731l(this.f20715d, uVar);
        m15731l(this.f20716e, uVar);
        m15731l(this.f20717f, uVar);
        m15731l(this.f20718g, uVar);
        m15731l(this.f20719h, uVar);
        m15731l(this.f20720i, uVar);
        m15731l(this.f20721j, uVar);
    }

    /* renamed from: e */
    public final long mo16699e(C6657i iVar) throws IOException {
        boolean z;
        boolean z2 = true;
        if (this.f20722k == null) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        String scheme = iVar.f20668a.getScheme();
        Uri uri = iVar.f20668a;
        int i = C6774a0.f20959a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !AppboyFileUtils.FILE_SCHEME.equals(scheme2)) {
            z2 = false;
        }
        if (z2) {
            String path = iVar.f20668a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f20715d == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f20715d = fileDataSource;
                    mo22840k(fileDataSource);
                }
                this.f20722k = this.f20715d;
            } else {
                if (this.f20716e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(this.f20712a);
                    this.f20716e = assetDataSource;
                    mo22840k(assetDataSource);
                }
                this.f20722k = this.f20716e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f20716e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(this.f20712a);
                this.f20716e = assetDataSource2;
                mo22840k(assetDataSource2);
            }
            this.f20722k = this.f20716e;
        } else if ("content".equals(scheme)) {
            if (this.f20717f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(this.f20712a);
                this.f20717f = contentDataSource;
                mo22840k(contentDataSource);
            }
            this.f20722k = this.f20717f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f20718g == null) {
                try {
                    C6654g gVar = (C6654g) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f20718g = gVar;
                    mo22840k(gVar);
                } catch (ClassNotFoundException unused) {
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f20718g == null) {
                    this.f20718g = this.f20714c;
                }
            }
            this.f20722k = this.f20718g;
        } else if ("udp".equals(scheme)) {
            if (this.f20719h == null) {
                UdpDataSource udpDataSource = new UdpDataSource();
                this.f20719h = udpDataSource;
                mo22840k(udpDataSource);
            }
            this.f20722k = this.f20719h;
        } else if ("data".equals(scheme)) {
            if (this.f20720i == null) {
                C6653f fVar = new C6653f();
                this.f20720i = fVar;
                mo22840k(fVar);
            }
            this.f20722k = this.f20720i;
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            if (this.f20721j == null) {
                RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f20712a);
                this.f20721j = rawResourceDataSource;
                mo22840k(rawResourceDataSource);
            }
            this.f20722k = this.f20721j;
        } else {
            this.f20722k = this.f20714c;
        }
        return this.f20722k.mo16699e(iVar);
    }

    public final Uri getUri() {
        C6654g gVar = this.f20722k;
        if (gVar == null) {
            return null;
        }
        return gVar.getUri();
    }

    /* renamed from: k */
    public final void mo22840k(C6654g gVar) {
        for (int i = 0; i < this.f20713b.size(); i++) {
            gVar.mo20680d((C6671u) this.f20713b.get(i));
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C6654g gVar = this.f20722k;
        gVar.getClass();
        return gVar.read(bArr, i, i2);
    }
}
