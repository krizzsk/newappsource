package com.veriff.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import kotlin.Metadata;
import mobi.lab.veriff.util.C24465j;
import p090g1.C4732a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo59060d2 = {"TECH_ISO_DEP", "", "log", "Lmobi/lab/veriff/util/Log;", "kotlin.jvm.PlatformType", "createNfcAdapter", "Landroid/nfc/NfcAdapter;", "activity", "Landroid/app/Activity;", "hasPermission", "", "Landroid/content/Context;", "permission", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ro */
public final class C22403ro {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C24465j f56559a = C24465j.m61536a(C22394rn.class);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final NfcAdapter m54661b(Activity activity) {
        NfcManager nfcManager;
        if (!m54662b(activity, "android.permission.NFC") || (nfcManager = (NfcManager) activity.getSystemService("nfc")) == null) {
            return null;
        }
        return nfcManager.getDefaultAdapter();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m54662b(Context context, String str) {
        return C4732a.checkSelfPermission(context, str) == 0;
    }
}
