package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3331a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3381b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3397o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i */
public final class C3343i {

    /* renamed from: a */
    public final HashMap<String, C3342h> f11969a;

    /* renamed from: b */
    public final SparseArray<String> f11970b;

    /* renamed from: c */
    public final C3381b f11971c;

    /* renamed from: d */
    public final Cipher f11972d;

    /* renamed from: e */
    public final SecretKeySpec f11973e;

    /* renamed from: f */
    public boolean f11974f;

    /* renamed from: g */
    public C3397o f11975g;

    public C3343i(File file, byte[] bArr) {
        boolean z;
        if (bArr != null) {
            if (bArr.length == 16) {
                z = true;
            } else {
                z = false;
            }
            C3380a.m8505a(z);
            try {
                this.f11972d = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                this.f11973e = new SecretKeySpec(bArr, KeyProvider18.KEY_ALGORITHM_AES);
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            this.f11972d = null;
            this.f11973e = null;
        }
        this.f11969a = new HashMap<>();
        this.f11970b = new SparseArray<>();
        this.f11971c = new C3381b(new File(file, "cached_content_index.exi"));
    }

    /* renamed from: a */
    public C3342h mo14484a(String str) {
        return this.f11969a.get(str);
    }

    /* renamed from: b */
    public void mo14489b(String str) {
        C3342h remove = this.f11969a.remove(str);
        if (remove != null) {
            C3380a.m8507b(remove.f11967c.isEmpty());
            this.f11970b.remove(remove.f11965a);
            this.f11974f = true;
        }
    }

    /* renamed from: c */
    public void mo14490c() throws C3331a.C3332a {
        DataOutputStream dataOutputStream;
        Throwable th;
        Throwable th2;
        IOException e;
        int i;
        if (this.f11974f) {
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream b = this.f11971c.mo14524b();
                C3397o oVar = this.f11975g;
                if (oVar == null) {
                    this.f11975g = new C3397o(b);
                } else {
                    oVar.mo14576a(b);
                }
                dataOutputStream = new DataOutputStream(this.f11975g);
                try {
                    dataOutputStream.writeInt(1);
                    if (this.f11972d != null) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    dataOutputStream.writeInt(i);
                    if (this.f11972d != null) {
                        byte[] bArr = new byte[16];
                        new Random().nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            this.f11972d.init(1, this.f11973e, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f11975g, this.f11972d));
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidAlgorithmParameterException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    } else {
                        dataOutputStream2 = dataOutputStream;
                    }
                    dataOutputStream2.writeInt(this.f11969a.size());
                    int i2 = 0;
                    for (C3342h next : this.f11969a.values()) {
                        dataOutputStream2.writeInt(next.f11965a);
                        dataOutputStream2.writeUTF(next.f11966b);
                        dataOutputStream2.writeLong(next.f11968d);
                        i2 += next.mo14483a();
                    }
                    dataOutputStream2.writeInt(i2);
                    C3381b bVar = this.f11971c;
                    bVar.getClass();
                    dataOutputStream2.close();
                    bVar.f12087b.delete();
                    int i3 = C3406u.f12148a;
                    this.f11974f = false;
                } catch (IOException e4) {
                    e = e4;
                    try {
                        throw new C3331a.C3332a(e);
                    } catch (Throwable th3) {
                        DataOutputStream dataOutputStream3 = dataOutputStream;
                        th2 = th3;
                        dataOutputStream2 = dataOutputStream3;
                        Throwable th4 = th2;
                        dataOutputStream = dataOutputStream2;
                        th = th4;
                        C3406u.m8594a((Closeable) dataOutputStream);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    C3406u.m8594a((Closeable) dataOutputStream);
                    throw th;
                }
            } catch (IOException e5) {
                IOException iOException = e5;
                dataOutputStream = dataOutputStream2;
                e = iOException;
                throw new C3331a.C3332a(e);
            } catch (Throwable th6) {
                th2 = th6;
                Throwable th42 = th2;
                dataOutputStream = dataOutputStream2;
                th = th42;
                C3406u.m8594a((Closeable) dataOutputStream);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14487a() {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.b r3 = r11.f11971c     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            java.io.InputStream r3 = r3.mo14523a()     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            int r1 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            r4 = 1
            if (r1 == r4) goto L_0x001d
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8594a((java.io.Closeable) r3)
            return r0
        L_0x001d:
            int r1 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0056
            javax.crypto.Cipher r1 = r11.f11972d     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            if (r1 != 0) goto L_0x002c
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8594a((java.io.Closeable) r3)
            return r0
        L_0x002c:
            r1 = 16
            byte[] r1 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            r3.readFully(r1)     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            r5.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            javax.crypto.Cipher r1 = r11.f11972d     // Catch:{ InvalidKeyException -> 0x004f, InvalidAlgorithmParameterException -> 0x004d }
            r6 = 2
            javax.crypto.spec.SecretKeySpec r7 = r11.f11973e     // Catch:{ InvalidKeyException -> 0x004f, InvalidAlgorithmParameterException -> 0x004d }
            r1.init(r6, r7, r5)     // Catch:{ InvalidKeyException -> 0x004f, InvalidAlgorithmParameterException -> 0x004d }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            javax.crypto.CipherInputStream r5 = new javax.crypto.CipherInputStream     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            javax.crypto.Cipher r6 = r11.f11972d     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            r5.<init>(r2, r6)     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            goto L_0x005d
        L_0x004d:
            r1 = move-exception
            goto L_0x0050
        L_0x004f:
            r1 = move-exception
        L_0x0050:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            throw r2     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
        L_0x0056:
            javax.crypto.Cipher r1 = r11.f11972d     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
            if (r1 == 0) goto L_0x005c
            r11.f11974f = r4     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x009e, all -> 0x0091 }
        L_0x005c:
            r1 = r3
        L_0x005d:
            int r2 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            r3 = 0
            r5 = 0
        L_0x0063:
            if (r3 >= r2) goto L_0x0081
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h r6 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            int r7 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            java.lang.String r8 = r1.readUTF()     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            long r9 = r1.readLong()     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            r6.<init>(r7, r8, r9)     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            r11.mo14486a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3342h) r6)     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            int r6 = r6.mo14483a()     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L_0x0063
        L_0x0081:
            int r2 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x009d, all -> 0x0095 }
            if (r2 == r5) goto L_0x008b
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8594a((java.io.Closeable) r1)
            return r0
        L_0x008b:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8594a((java.io.Closeable) r1)
            return r4
        L_0x008f:
            goto L_0x00a4
        L_0x0091:
            r0 = move-exception
            goto L_0x0097
        L_0x0093:
            goto L_0x00a5
        L_0x0095:
            r0 = move-exception
            r3 = r1
        L_0x0097:
            if (r3 == 0) goto L_0x009c
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8594a((java.io.Closeable) r3)
        L_0x009c:
            throw r0
        L_0x009d:
            r3 = r1
        L_0x009e:
            if (r3 == 0) goto L_0x00a3
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8594a((java.io.Closeable) r3)
        L_0x00a3:
            return r0
        L_0x00a4:
            r3 = r1
        L_0x00a5:
            if (r3 == 0) goto L_0x00aa
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8594a((java.io.Closeable) r3)
        L_0x00aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3343i.mo14487a():boolean");
    }

    /* renamed from: b */
    public void mo14488b() {
        LinkedList linkedList = new LinkedList();
        for (C3342h next : this.f11969a.values()) {
            if (next.f11967c.isEmpty()) {
                linkedList.add(next.f11966b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            mo14489b((String) it.next());
        }
    }

    /* renamed from: a */
    public final void mo14486a(C3342h hVar) {
        this.f11969a.put(hVar.f11966b, hVar);
        this.f11970b.put(hVar.f11965a, hVar.f11966b);
    }

    /* renamed from: a */
    public final C3342h mo14485a(String str, long j) {
        int i;
        SparseArray<String> sparseArray = this.f11970b;
        int size = sparseArray.size();
        int i2 = 0;
        if (size == 0) {
            i = 0;
        } else {
            i = sparseArray.keyAt(size - 1) + 1;
        }
        if (i < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            i = i2;
        }
        C3342h hVar = new C3342h(i, str, j);
        this.f11969a.put(str, hVar);
        this.f11970b.put(i, str);
        this.f11974f = true;
        return hVar;
    }
}
