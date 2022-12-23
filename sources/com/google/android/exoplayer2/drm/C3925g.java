package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.exoplayer2.drm.C3920f;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p099ga.C4883f;
import p161la.C5653b;
import p161la.C5654c;
import p161la.C5655d;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p583jk.C17875h;
import p624ld.C18187b;

/* renamed from: com.google.android.exoplayer2.drm.g */
public final class C3925g implements C3920f {

    /* renamed from: d */
    public static final C16759e f13737d = new C16759e();

    /* renamed from: a */
    public final UUID f13738a;

    /* renamed from: b */
    public final MediaDrm f13739b;

    /* renamed from: c */
    public int f13740c;

    public C3925g(UUID uuid) throws UnsupportedSchemeException {
        UUID uuid2;
        uuid.getClass();
        C17875h.m44302l(!C4883f.f16442b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f13738a = uuid;
        MediaDrm mediaDrm = new MediaDrm((C6774a0.f20959a >= 27 || !C4883f.f16443c.equals(uuid)) ? uuid : uuid2);
        this.f13739b = mediaDrm;
        this.f13740c = 1;
        if (C4883f.f16444d.equals(uuid) && "ASUS_Z00AD".equals(C6774a0.f20962d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    /* renamed from: a */
    public final Class<C5654c> mo16007a() {
        return C5654c.class;
    }

    /* renamed from: b */
    public final Map<String, String> mo16008b(byte[] bArr) {
        return this.f13739b.queryKeyStatus(bArr);
    }

    /* renamed from: c */
    public final C5653b mo16009c(byte[] bArr) throws MediaCryptoException {
        boolean z;
        int i = C6774a0.f20959a;
        if (i >= 21 || !C4883f.f16444d.equals(this.f13738a) || !"L3".equals(this.f13739b.getPropertyString("securityLevel"))) {
            z = false;
        } else {
            z = true;
        }
        UUID uuid = this.f13738a;
        if (i < 27 && C4883f.f16443c.equals(uuid)) {
            uuid = C4883f.f16442b;
        }
        return new C5654c(uuid, bArr, z);
    }

    /* renamed from: d */
    public final C3920f.C3924d mo16010d() {
        MediaDrm.ProvisionRequest provisionRequest = this.f13739b.getProvisionRequest();
        return new C3920f.C3924d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* renamed from: e */
    public final byte[] mo16011e() throws MediaDrmException {
        return this.f13739b.openSession();
    }

    /* renamed from: f */
    public final void mo16012f(byte[] bArr, byte[] bArr2) {
        this.f13739b.restoreKeys(bArr, bArr2);
    }

    /* renamed from: g */
    public final void mo16013g(byte[] bArr) throws DeniedByServerException {
        this.f13739b.provideProvisionResponse(bArr);
    }

    /* renamed from: h */
    public final void mo16014h(DefaultDrmSessionManager.C3904a aVar) {
        this.f13739b.setOnEventListener(new C5655d(this, aVar));
    }

    /* renamed from: i */
    public final void mo16015i(byte[] bArr) {
        this.f13739b.closeSession(bArr);
    }

    /* renamed from: j */
    public final byte[] mo16016j(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        String str;
        if (C4883f.f16443c.equals(this.f13738a) && C6774a0.f20959a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, C18187b.f46429c));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = C6774a0.m15961u(sb.toString());
            } catch (JSONException e) {
                String str2 = new String(bArr2, C18187b.f46429c);
                if (str2.length() != 0) {
                    str = "Failed to adjust response data: ".concat(str2);
                } else {
                    str = new String("Failed to adjust response data: ");
                }
                C6776b0.m15968a(str, e);
            }
        }
        return this.f13739b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c0, code lost:
        if ("AFTT".equals(r5) == false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c6, code lost:
        if (r1 != null) goto L_0x01ca;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.drm.C3920f.C3921a mo16017k(byte[] r16, java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r17, int r18, java.util.HashMap<java.lang.String, java.lang.String> r19) throws android.media.NotProvisionedException {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            r2 = 23
            r3 = 0
            if (r1 == 0) goto L_0x01f0
            java.util.UUID r3 = r0.f13738a
            java.util.UUID r4 = p099ga.C4883f.f16444d
            boolean r3 = r4.equals(r3)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x001c
            java.lang.Object r1 = r1.get(r5)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r1
            goto L_0x00c5
        L_0x001c:
            int r3 = p277ub.C6774a0.f20959a
            r6 = 28
            if (r3 < r6) goto L_0x0093
            int r3 = r17.size()
            if (r3 <= r4) goto L_0x0093
            java.lang.Object r3 = r1.get(r5)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r3
            r6 = 0
            r7 = 0
        L_0x0030:
            int r8 = r17.size()
            if (r6 >= r8) goto L_0x0067
            java.lang.Object r8 = r1.get(r6)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r8 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r8
            byte[] r9 = r8.f13723f
            r9.getClass()
            java.lang.String r10 = r8.f13722e
            java.lang.String r11 = r3.f13722e
            boolean r10 = p277ub.C6774a0.m15941a(r10, r11)
            if (r10 == 0) goto L_0x0065
            java.lang.String r8 = r8.f13721d
            java.lang.String r10 = r3.f13721d
            boolean r8 = p277ub.C6774a0.m15941a(r8, r10)
            if (r8 == 0) goto L_0x0065
            ta.i$a r8 = p264ta.C6636i.m15699a(r9)
            if (r8 == 0) goto L_0x005d
            r8 = 1
            goto L_0x005e
        L_0x005d:
            r8 = 0
        L_0x005e:
            if (r8 == 0) goto L_0x0065
            int r8 = r9.length
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0030
        L_0x0065:
            r6 = 0
            goto L_0x0068
        L_0x0067:
            r6 = 1
        L_0x0068:
            if (r6 == 0) goto L_0x0093
            byte[] r6 = new byte[r7]
            r7 = 0
            r8 = 0
        L_0x006e:
            int r9 = r17.size()
            if (r7 >= r9) goto L_0x0087
            java.lang.Object r9 = r1.get(r7)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r9 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r9
            byte[] r9 = r9.f13723f
            r9.getClass()
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r5, r6, r8, r10)
            int r8 = r8 + r10
            int r7 = r7 + 1
            goto L_0x006e
        L_0x0087:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.util.UUID r7 = r3.f13720c
            java.lang.String r8 = r3.f13721d
            java.lang.String r3 = r3.f13722e
            r1.<init>(r7, r8, r3, r6)
            goto L_0x00c5
        L_0x0093:
            r3 = 0
        L_0x0094:
            int r6 = r17.size()
            if (r3 >= r6) goto L_0x00bf
            java.lang.Object r6 = r1.get(r3)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r6 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r6
            byte[] r7 = r6.f13723f
            r7.getClass()
            ta.i$a r7 = p264ta.C6636i.m15699a(r7)
            if (r7 != 0) goto L_0x00ad
            r7 = -1
            goto L_0x00af
        L_0x00ad:
            int r7 = r7.f20593b
        L_0x00af:
            int r8 = p277ub.C6774a0.f20959a
            if (r8 >= r2) goto L_0x00b6
            if (r7 != 0) goto L_0x00b6
            goto L_0x00ba
        L_0x00b6:
            if (r8 < r2) goto L_0x00bc
            if (r7 != r4) goto L_0x00bc
        L_0x00ba:
            r3 = r6
            goto L_0x00c6
        L_0x00bc:
            int r3 = r3 + 1
            goto L_0x0094
        L_0x00bf:
            java.lang.Object r1 = r1.get(r5)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r1
        L_0x00c5:
            r3 = r1
        L_0x00c6:
            java.util.UUID r1 = r0.f13738a
            byte[] r6 = r3.f13723f
            r6.getClass()
            java.util.UUID r7 = p099ga.C4883f.f16445e
            boolean r8 = r7.equals(r1)
            r9 = 26
            if (r8 == 0) goto L_0x0184
            byte[] r8 = p264ta.C6636i.m15700b(r1, r6)
            if (r8 != 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r6 = r8
        L_0x00df:
            ub.r r8 = new ub.r
            r8.<init>((byte[]) r6)
            int r10 = r8.mo22986e()
            short r11 = r8.mo22987f()
            short r12 = r8.mo22987f()
            if (r11 != r4) goto L_0x014f
            if (r12 == r4) goto L_0x00f5
            goto L_0x014f
        L_0x00f5:
            short r4 = r8.mo22987f()
            java.nio.charset.Charset r13 = p624ld.C18187b.f46430d
            java.lang.String r4 = r8.mo22995n(r4, r13)
            java.lang.String r8 = "<LA_URL>"
            boolean r8 = r4.contains(r8)
            if (r8 == 0) goto L_0x0108
            goto L_0x014f
        L_0x0108:
            java.lang.String r6 = "</DATA>"
            int r6 = r4.indexOf(r6)
            java.lang.String r8 = r4.substring(r5, r6)
            java.lang.String r4 = r4.substring(r6)
            int r6 = p001a0.C0016g.m25h(r8, r9)
            int r6 = p001a0.C0016g.m25h(r4, r6)
            java.lang.String r14 = "<LA_URL>https://x</LA_URL>"
            java.lang.String r4 = p379.C25541a.m63875e(r6, r8, r14, r4)
            int r10 = r10 + 52
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r10)
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.order(r8)
            r6.putInt(r10)
            short r8 = (short) r11
            r6.putShort(r8)
            short r8 = (short) r12
            r6.putShort(r8)
            int r8 = r4.length()
            int r8 = r8 * 2
            short r8 = (short) r8
            r6.putShort(r8)
            byte[] r4 = r4.getBytes(r13)
            r6.put(r4)
            byte[] r6 = r6.array()
        L_0x014f:
            if (r6 == 0) goto L_0x0153
            int r4 = r6.length
            goto L_0x0154
        L_0x0153:
            r4 = 0
        L_0x0154:
            int r4 = r4 + 32
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r4)
            r8.putInt(r4)
            r4 = 1886614376(0x70737368, float:3.013775E29)
            r8.putInt(r4)
            r8.putInt(r5)
            long r4 = r7.getMostSignificantBits()
            r8.putLong(r4)
            long r4 = r7.getLeastSignificantBits()
            r8.putLong(r4)
            if (r6 == 0) goto L_0x0180
            int r4 = r6.length
            if (r4 == 0) goto L_0x0180
            int r4 = r6.length
            r8.putInt(r4)
            r8.put(r6)
        L_0x0180:
            byte[] r6 = r8.array()
        L_0x0184:
            int r4 = p277ub.C6774a0.f20959a
            if (r4 >= r2) goto L_0x0190
            java.util.UUID r5 = p099ga.C4883f.f16444d
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x01c2
        L_0x0190:
            boolean r5 = r7.equals(r1)
            if (r5 == 0) goto L_0x01c9
            java.lang.String r5 = p277ub.C6774a0.f20961c
            java.lang.String r7 = "Amazon"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x01c9
            java.lang.String r5 = p277ub.C6774a0.f20962d
            java.lang.String r7 = "AFTB"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x01c2
            java.lang.String r7 = "AFTS"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x01c2
            java.lang.String r7 = "AFTM"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x01c2
            java.lang.String r7 = "AFTT"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x01c9
        L_0x01c2:
            byte[] r1 = p264ta.C6636i.m15700b(r1, r6)
            if (r1 == 0) goto L_0x01c9
            goto L_0x01ca
        L_0x01c9:
            r1 = r6
        L_0x01ca:
            java.util.UUID r5 = r0.f13738a
            java.lang.String r6 = r3.f13722e
            if (r4 >= r9) goto L_0x01ec
            java.util.UUID r4 = p099ga.C4883f.f16443c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x01ec
            java.lang.String r4 = "video/mp4"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x01e9
            java.lang.String r4 = "audio/mp4"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x01ec
        L_0x01e9:
            java.lang.String r4 = "cenc"
            goto L_0x01ed
        L_0x01ec:
            r4 = r6
        L_0x01ed:
            r7 = r1
            r8 = r4
            goto L_0x01f2
        L_0x01f0:
            r7 = r3
            r8 = r7
        L_0x01f2:
            android.media.MediaDrm r5 = r0.f13739b
            r6 = r16
            r9 = r18
            r10 = r19
            android.media.MediaDrm$KeyRequest r1 = r5.getKeyRequest(r6, r7, r8, r9, r10)
            java.util.UUID r4 = r0.f13738a
            byte[] r5 = r1.getData()
            java.util.UUID r6 = p099ga.C4883f.f16443c
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x022e
            int r4 = p277ub.C6774a0.f20959a
            r6 = 27
            if (r4 < r6) goto L_0x0213
            goto L_0x022e
        L_0x0213:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r6 = p624ld.C18187b.f46429c
            r4.<init>(r5, r6)
            r5 = 43
            r6 = 45
            java.lang.String r4 = r4.replace(r5, r6)
            r5 = 47
            r6 = 95
            java.lang.String r4 = r4.replace(r5, r6)
            byte[] r5 = p277ub.C6774a0.m15961u(r4)
        L_0x022e:
            java.lang.String r4 = r1.getDefaultUrl()
            java.lang.String r6 = "https://x"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x023c
            java.lang.String r4 = ""
        L_0x023c:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x024e
            if (r3 == 0) goto L_0x024e
            java.lang.String r6 = r3.f13721d
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x024e
            java.lang.String r4 = r3.f13721d
        L_0x024e:
            int r3 = p277ub.C6774a0.f20959a
            if (r3 < r2) goto L_0x0255
            int unused = r1.getRequestType()
        L_0x0255:
            com.google.android.exoplayer2.drm.f$a r1 = new com.google.android.exoplayer2.drm.f$a
            r1.<init>(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.C3925g.mo16017k(byte[], java.util.List, int, java.util.HashMap):com.google.android.exoplayer2.drm.f$a");
    }

    public final synchronized void release() {
        int i = this.f13740c - 1;
        this.f13740c = i;
        if (i == 0) {
            this.f13739b.release();
        }
    }
}
