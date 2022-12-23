package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.app.C0262r;
import com.appsflyer.ServerParameters;
import com.google.android.play.core.common.LocalTestingException;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import mf0.C24361g;
import p389bl.C13641g;
import p434dd.C16546c0;
import p554id.C17573l;
import p554id.C17576o;

/* renamed from: com.google.android.play.core.assetpacks.p1 */
public final class C14304p1 implements C14341y2 {

    /* renamed from: g */
    public static final C0262r f35986g = new C0262r("FakeAssetPackService");

    /* renamed from: a */
    public final String f35987a;

    /* renamed from: b */
    public final C14334x f35988b;

    /* renamed from: c */
    public final Context f35989c;

    /* renamed from: d */
    public final C14253c2 f35990d;

    /* renamed from: e */
    public final C16546c0 f35991e;

    /* renamed from: f */
    public final Handler f35992f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    public C14304p1(File file, C14334x xVar, Context context, C14253c2 c2Var, C16546c0 c0Var) {
        this.f35987a = file.getAbsolutePath();
        this.f35988b = xVar;
        this.f35989c = context;
        this.f35990d = c2Var;
        this.f35991e = c0Var;
    }

    /* renamed from: a */
    public final void mo42872a(int i, String str) {
        f35986g.mo977d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f35991e.zza()).execute(new C14296n1(this, i, str));
    }

    /* renamed from: b */
    public final void mo42873b(List list) {
        f35986g.mo977d("cancelDownload(%s)", list);
    }

    /* renamed from: c */
    public final C17576o mo42874c(HashMap hashMap) {
        f35986g.mo977d("syncPacks()", new Object[0]);
        ArrayList arrayList = new ArrayList();
        C17576o oVar = new C17576o();
        synchronized (oVar.f45198a) {
            if (!oVar.f45200c) {
                oVar.f45200c = true;
                oVar.f45201d = arrayList;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        oVar.f45199b.mo50023b(oVar);
        return oVar;
    }

    /* renamed from: d */
    public final C17576o mo42875d(int i, int i2, String str, String str2) {
        f35986g.mo977d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C17573l lVar = new C17573l();
        try {
            for (File file : mo42878g(str)) {
                if (C13641g.m34112D(file).equals(str2)) {
                    ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                    C17576o oVar = lVar.f45196a;
                    synchronized (oVar.f45198a) {
                        if (!oVar.f45200c) {
                            oVar.f45200c = true;
                            oVar.f45201d = open;
                        } else {
                            throw new IllegalStateException("Task is already complete");
                        }
                    }
                    oVar.f45199b.mo50023b(oVar);
                    return lVar.f45196a;
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f35986g.mo978e("getChunkFileDescriptor failed", e);
            LocalTestingException localTestingException = new LocalTestingException("Asset Slice file not found.", e);
            C17576o oVar2 = lVar.f45196a;
            synchronized (oVar2.f45198a) {
                if (!oVar2.f45200c) {
                    oVar2.f45200c = true;
                    oVar2.f45202e = localTestingException;
                    oVar2.f45199b.mo50023b(oVar2);
                } else {
                    throw new IllegalStateException("Task is already complete");
                }
            }
        } catch (LocalTestingException e2) {
            f35986g.mo978e("getChunkFileDescriptor failed", e2);
            C17576o oVar3 = lVar.f45196a;
            synchronized (oVar3.f45198a) {
                if (!oVar3.f45200c) {
                    oVar3.f45200c = true;
                    oVar3.f45202e = e2;
                    oVar3.f45199b.mo50023b(oVar3);
                } else {
                    throw new IllegalStateException("Task is already complete");
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo42876e(int i, int i2, String str, String str2) {
        f35986g.mo977d("notifyChunkTransferred", new Object[0]);
    }

    /* renamed from: f */
    public final void mo42877f(int i, String str) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt(ServerParameters.APP_VERSION_CODE, this.f35990d.mo42806a());
        bundle.putInt(GetBrowserSessionContextCommand.KEY_SESSION_ID, i);
        File[] g = mo42878g(str);
        ArrayList arrayList = new ArrayList();
        int length = g.length;
        long j = 0;
        int i2 = 0;
        while (i2 < length) {
            File file = g[i2];
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add((Object) null);
            String D = C13641g.m34112D(file);
            bundle.putParcelableArrayList(C24361g.m61194w0("chunk_intents", str, D), arrayList2);
            try {
                bundle.putString(C24361g.m61194w0("uncompressed_hash_sha256", str, D), C14256d1.m35492j(Arrays.asList(new File[]{file})));
                bundle.putLong(C24361g.m61194w0("uncompressed_size", str, D), file.length());
                arrayList.add(D);
                i2++;
            } catch (NoSuchAlgorithmException e) {
                throw new LocalTestingException("SHA256 algorithm not supported.", e);
            } catch (IOException e2) {
                throw new LocalTestingException(String.format("Could not digest file: %s.", new Object[]{file}), e2);
            }
        }
        bundle.putStringArrayList(C24361g.m61192v0("slice_ids", str), arrayList);
        bundle.putLong(C24361g.m61192v0("pack_version", str), (long) this.f35990d.mo42806a());
        bundle.putInt(C24361g.m61192v0(ServerParameters.STATUS, str), 4);
        bundle.putInt(C24361g.m61192v0("error_code", str), 0);
        bundle.putLong(C24361g.m61192v0("bytes_downloaded", str), j);
        bundle.putLong(C24361g.m61192v0("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", j);
        bundle.putLong("total_bytes_to_download", j);
        this.f35992f.post(new C14300o1(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    /* renamed from: g */
    public final File[] mo42878g(String str) throws LocalTestingException {
        File file = new File(this.f35987a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new C14292m1(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File D : listFiles) {
                        if (C13641g.m34112D(D).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No main slice available for pack '%s'.", new Object[]{str}));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    public final void zzf() {
        f35986g.mo977d("keepAlive", new Object[0]);
    }

    public final void zzi(int i) {
        f35986g.mo977d("notifySessionFailed", new Object[0]);
    }
}
