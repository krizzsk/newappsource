package com.masabi.justride.sdk.platform.storage;

import android.os.Build;
import android.security.keystore.KeyProtection;
import android.security.keystore.KeyProtection$Builder;
import androidx.recyclerview.widget.RecyclerView;
import bf0.C21049c;
import ce0.C21100e;
import cf0.C21132f;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.google.android.gms.stats.CodePackage;
import com.masabi.justride.sdk.crypto.CryptoException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kf0.C23775c;
import kotlin.C23812a;
import kotlin.collections.C23825c;
import mf0.C24362h;
import p001a0.C0017h;
import p358af.C13437d;
import p389bl.C13641g;
import p413co.C13862i;
import p413co.C13874t;
import p584jl.C17885a;
import p677nj.C18558c;
import p677nj.C18570m;
import p846un.C19963e;
import p868vl.C20157d;
import p916xl.C20536b;
import uh0.C25072a;

public final class MigrateToGcmEncryptionJob {

    /* renamed from: a */
    public final String f37172a;

    /* renamed from: b */
    public final String f37173b;

    /* renamed from: c */
    public final String f37174c;

    /* renamed from: d */
    public final String f37175d;

    /* renamed from: e */
    public SecretKeySpec f37176e;

    /* renamed from: f */
    public SecretKey f37177f;

    /* renamed from: g */
    public final C21049c f37178g = C23812a.m58432b(MigrateToGcmEncryptionJob$keyStore$2.f37189f);

    /* renamed from: h */
    public final C21049c f37179h = C23812a.m58432b(new MigrateToGcmEncryptionJob$secretKeyGenerator$2(this));

    /* renamed from: i */
    public final C21049c f37180i = C23812a.m58432b(new MigrateToGcmEncryptionJob$ivGenerator$2(this));

    /* renamed from: j */
    public final int f37181j = 3;

    /* renamed from: k */
    public final C20157d f37182k;

    /* renamed from: l */
    public final C18570m f37183l;

    /* renamed from: m */
    public final String f37184m;

    /* renamed from: n */
    public final C13874t f37185n;

    /* renamed from: o */
    public final C13862i.C13863a f37186o;

    /* renamed from: p */
    public final C18558c.C18559a f37187p;

    /* renamed from: q */
    public final C20536b f37188q;

    public MigrateToGcmEncryptionJob(C20157d dVar, C18570m mVar, String str, C13874t tVar, C13862i.C13863a aVar, C18558c.C18559a aVar2, C20536b bVar) {
        C24362h.m61211f(dVar, "prependBrandFunction");
        C24362h.m61211f(mVar, "stringObfuscator");
        C24362h.m61211f(str, "pathToJustrideDirectory");
        C24362h.m61211f(aVar2, "aesKeyGeneratorFactory");
        C24362h.m61211f(bVar, "errorLogger");
        this.f37182k = dVar;
        this.f37183l = mVar;
        this.f37184m = str;
        this.f37185n = tVar;
        this.f37186o = aVar;
        this.f37187p = aVar2;
        this.f37188q = bVar;
        Charset charset = C25072a.f63272a;
        this.f37172a = new String("com.masabi.justride.sdk.mk".getBytes(), charset);
        this.f37173b = new String("com.masabi.justride.sdk.mk2".getBytes(), charset);
        this.f37174c = new String("secureTextFieldCvvKeyName".getBytes(), charset);
        this.f37175d = new String("secureTextFieldPanKeyName".getBytes(), charset);
    }

    /* renamed from: d */
    public static String[] m36803d() {
        return new String[]{C21100e.m49333b0(), C21100e.m49326U(), C21100e.m49327V(), C21100e.m49328W(), C21100e.m49331Z(), C21100e.m49332a0(), C21100e.m49334c0(), C21100e.m49347j0()};
    }

    /* renamed from: a */
    public final void mo44375a() throws KeyStoreException, MigrationException {
        File[] listFiles = new File(this.f37184m).listFiles();
        boolean z = true;
        if (listFiles != null) {
            boolean z2 = true;
            for (File file : listFiles) {
                C24362h.m61210e(file, "it");
                if ((C23775c.m58350Q0(file) || !file.exists()) && z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            z = z2;
        }
        if (z) {
            String a = this.f37182k.mo52405a(this.f37172a);
            C24362h.m61210e(a, "prependBrandFunction.apply(input)");
            ((KeyStore) this.f37178g.getValue()).deleteEntry(a);
            String a2 = this.f37182k.mo52405a(this.f37174c);
            C24362h.m61210e(a2, "prependBrandFunction.apply(input)");
            ((KeyStore) this.f37178g.getValue()).deleteEntry(a2);
            String a3 = this.f37182k.mo52405a(this.f37175d);
            C24362h.m61210e(a3, "prependBrandFunction.apply(input)");
            ((KeyStore) this.f37178g.getValue()).deleteEntry(a3);
            String a4 = this.f37182k.mo52405a(this.f37173b);
            C24362h.m61210e(a4, "prependBrandFunction.apply(input)");
            ((KeyStore) this.f37178g.getValue()).deleteEntry(a4);
            return;
        }
        throw new MigrationException("Failed clearing files");
    }

    /* renamed from: b */
    public final byte[] mo44376b(File file, SecretKeySpec secretKeySpec) throws GeneralSecurityException, IOException, MigrationException, SecurityException {
        byte[] bArr;
        C13862i.C13863a aVar = this.f37186o;
        File file2 = aVar.f34103a;
        C19963e eVar = aVar.f34104b;
        C24362h.m61211f(file2, "temporaryFileDirectory");
        C24362h.m61211f(eVar, "uuidGenerator");
        if (!file.isDirectory()) {
            if (file.exists()) {
                bArr = C17885a.m44451n0(file);
            } else {
                bArr = null;
            }
            if (bArr == null) {
                StringBuilder k = C13555b.m33972k("Null bytes when decrypting old file: ");
                k.append(file.getAbsolutePath());
                throw new MigrationException(k.toString());
            } else if (bArr.length >= 16) {
                byte[] O0 = C21132f.m49432O0(0, 16, bArr);
                byte[] O02 = C21132f.m49432O0(16, bArr.length, bArr);
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS7PADDING");
                instance.init(2, secretKeySpec, new IvParameterSpec(O0));
                byte[] doFinal = instance.doFinal(O02);
                C24362h.m61210e(doFinal, "c.doFinal(text)");
                return doFinal;
            } else {
                StringBuilder k2 = C13555b.m33972k("Old file has incorrect size: ");
                k2.append(bArr.length);
                throw new MigrationException(k2.toString());
            }
        } else {
            throw new IOException("Cannot read a directory.");
        }
    }

    /* renamed from: c */
    public final void mo44377c(File file, SecretKey secretKey, byte[] bArr) throws GeneralSecurityException, IOException, SecurityException {
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        SecretKey a = ((C18558c) this.f37180i.getValue()).mo50961a();
        C24362h.m61210e(a, "ivGenerator.generateSecretKey()");
        byte[] encoded = a.getEncoded();
        instance.init(1, secretKey, new GCMParameterSpec(RecyclerView.C1119a0.FLAG_IGNORE, encoded));
        byte[] doFinal = instance.doFinal(bArr);
        C13862i.C13863a aVar = this.f37186o;
        File file2 = aVar.f34103a;
        C19963e eVar = aVar.f34104b;
        C24362h.m61211f(file2, "temporaryFileDirectory");
        C24362h.m61211f(eVar, "uuidGenerator");
        C24362h.m61210e(encoded, "iv");
        C24362h.m61210e(doFinal, "encryptedBytes");
        byte[] Q0 = C21132f.m49434Q0(encoded, doFinal);
        if (!file.isDirectory()) {
            File file3 = new File(file2.getPath(), eVar.mo52262a().toString());
            C17885a.m44397E0(file3, Q0);
            file3.renameTo(file);
            return;
        }
        throw new IOException("Cannot write to a directory.");
    }

    /* renamed from: e */
    public final void mo44378e() throws CryptoException, MigrationException, IOException, SecurityException {
        byte[] bArr;
        String str = this.f37184m;
        if (new File(new File(str, mo44384k(C21100e.m49337e0()) + "-mig"), mo44383j(this.f37173b)).exists()) {
            String str2 = this.f37184m;
            File file = new File(new File(str2, mo44384k(C21100e.m49337e0()) + "-mig"), mo44383j(this.f37173b));
            C13862i.C13863a aVar = this.f37186o;
            File file2 = aVar.f34103a;
            C19963e eVar = aVar.f34104b;
            C24362h.m61211f(file2, "temporaryFileDirectory");
            C24362h.m61211f(eVar, "uuidGenerator");
            if (!file.isDirectory()) {
                if (file.exists()) {
                    bArr = C17885a.m44451n0(file);
                } else {
                    bArr = null;
                }
                if (bArr == null) {
                    throw new MigrationException("New master key file content is null.");
                } else if (bArr.length == 44) {
                    this.f37177f = new SecretKeySpec(C21132f.m49432O0(12, bArr.length, bArr), KeyProvider18.KEY_ALGORITHM_AES);
                } else {
                    StringBuilder k = C13555b.m33972k("New master key file has incorrect size: ");
                    k.append(bArr.length);
                    throw new MigrationException(k.toString());
                }
            } else {
                throw new IOException("Cannot read a directory.");
            }
        } else {
            String str3 = this.f37184m;
            File file3 = new File(str3, mo44384k(C21100e.m49337e0()) + "-mig");
            File file4 = new File(file3, mo44383j(this.f37173b));
            SecretKey a = ((C18558c) this.f37179h.getValue()).mo50961a();
            SecretKey a2 = ((C18558c) this.f37180i.getValue()).mo50961a();
            C24362h.m61210e(a2, "ivGenerator.generateSecretKey()");
            byte[] encoded = a2.getEncoded();
            file3.mkdir();
            C13862i.C13863a aVar2 = this.f37186o;
            File file5 = aVar2.f34103a;
            C19963e eVar2 = aVar2.f34104b;
            C24362h.m61211f(file5, "temporaryFileDirectory");
            C24362h.m61211f(eVar2, "uuidGenerator");
            C24362h.m61210e(encoded, "noise");
            C24362h.m61210e(a, "newMasterKey");
            byte[] encoded2 = a.getEncoded();
            C24362h.m61210e(encoded2, "newMasterKey.encoded");
            byte[] Q0 = C21132f.m49434Q0(encoded, encoded2);
            if (!file4.isDirectory()) {
                File file6 = new File(file5.getPath(), eVar2.mo52262a().toString());
                C17885a.m44397E0(file6, Q0);
                file6.renameTo(file4);
                if (Build.VERSION.SDK_INT >= 23) {
                    KeyStore.SecretKeyEntry secretKeyEntry = new KeyStore.SecretKeyEntry(a);
                    KeyProtection build = new KeyProtection$Builder(3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).setUserAuthenticationRequired(false).build();
                    C24362h.m61210e(build, "KeyProtection.Builder(Ke…\n                .build()");
                    String a3 = this.f37182k.mo52405a(this.f37173b);
                    C24362h.m61210e(a3, "prependBrandFunction.apply(input)");
                    ((KeyStore) this.f37178g.getValue()).setEntry(a3, secretKeyEntry, build);
                }
                this.f37177f = a;
                return;
            }
            throw new IOException("Cannot write to a directory.");
        }
    }

    /* renamed from: f */
    public final void mo44379f() throws CryptoException, MigrationException, SecurityException {
        byte[] bArr;
        File file = new File(new File(this.f37184m, mo44384k(C21100e.m49337e0())), mo44383j(this.f37172a));
        C13862i.C13863a aVar = this.f37186o;
        File file2 = aVar.f34103a;
        C19963e eVar = aVar.f34104b;
        C24362h.m61211f(file2, "temporaryFileDirectory");
        C24362h.m61211f(eVar, "uuidGenerator");
        if (!file.isDirectory()) {
            if (file.exists()) {
                bArr = C17885a.m44451n0(file);
            } else {
                bArr = null;
            }
            if (bArr == null) {
                throw new MigrationException("Old master key file does not exist.");
            } else if (bArr.length == 48) {
                this.f37176e = new SecretKeySpec(C21132f.m49432O0(16, bArr.length, bArr), KeyProvider18.KEY_ALGORITHM_AES);
            } else {
                StringBuilder k = C13555b.m33972k("Old master key file has incorrect size: ");
                k.append(bArr.length);
                throw new MigrationException(k.toString());
            }
        } else {
            throw new IOException("Cannot read a directory.");
        }
    }

    /* renamed from: g */
    public final void mo44380g() throws CryptoException, FileStorageException, GeneralSecurityException, IOException, MigrationException, SecurityException {
        boolean z;
        boolean z2;
        if (!this.f37185n.mo40822b(this.f37181j)) {
            if (!new File(new File(this.f37184m, mo44384k(C21100e.m49337e0())), mo44383j(this.f37172a)).exists()) {
                this.f37185n.mo40823c(this.f37181j);
                return;
            }
            try {
                mo44379f();
                try {
                    mo44378e();
                    String[] d = m36803d();
                    int i = 0;
                    while (i < 8) {
                        String str = d[i];
                        try {
                            mo44381h(str);
                            mo44382i(str);
                            i++;
                        } catch (Exception e) {
                            this.f37188q.mo52738b(e);
                            z = C24362h.m61206a(str, C21100e.m49333b0());
                            z2 = true;
                        }
                    }
                    z = false;
                    z2 = false;
                    if (z2) {
                        String[] d2 = m36803d();
                        for (int i2 = 0; i2 < 8; i2++) {
                            String str2 = d2[i2];
                            if (!C24362h.m61206a(str2, C21100e.m49333b0()) || z) {
                                File file = new File(this.f37184m, mo44384k(str2));
                                String str3 = this.f37184m;
                                File file2 = new File(str3, mo44384k(str2) + "-mig");
                                File file3 = new File(this.f37184m, mo44384k(C21100e.m49337e0()));
                                String str4 = this.f37184m;
                                File file4 = new File(str4, mo44384k(C21100e.m49337e0()) + "-mig");
                                File file5 = new File(file3, mo44383j(str2));
                                File file6 = new File(file4, mo44383j(str2));
                                if (file.exists() && !C23775c.m58350Q0(file)) {
                                    throw new MigrationException(C13437d.m33706k("Failed deleting '", str2, "' folder."));
                                } else if (file2.exists() && !C23775c.m58350Q0(file2)) {
                                    throw new MigrationException(C13437d.m33706k("Failed deleting '", str2, "-mig' folder."));
                                } else if (file5.exists() && !file5.delete()) {
                                    throw new MigrationException(C13437d.m33706k("Failed deleting '", str2, "' old folder key."));
                                } else if (file6.exists() && !file6.delete()) {
                                    throw new MigrationException(C13437d.m33706k("Failed deleting '", str2, "' new folder key."));
                                }
                            }
                        }
                    }
                    mo44382i(C21100e.m49337e0());
                    String a = this.f37182k.mo52405a(this.f37172a);
                    C24362h.m61210e(a, "prependBrandFunction.apply(input)");
                    ((KeyStore) this.f37178g.getValue()).deleteEntry(a);
                    String a2 = this.f37182k.mo52405a(this.f37174c);
                    C24362h.m61210e(a2, "prependBrandFunction.apply(input)");
                    ((KeyStore) this.f37178g.getValue()).deleteEntry(a2);
                    String a3 = this.f37182k.mo52405a(this.f37175d);
                    C24362h.m61210e(a3, "prependBrandFunction.apply(input)");
                    ((KeyStore) this.f37178g.getValue()).deleteEntry(a3);
                    this.f37185n.mo40823c(this.f37181j);
                } catch (MigrationException e2) {
                    this.f37188q.mo52738b(e2);
                    mo44375a();
                    this.f37185n.mo40823c(this.f37181j);
                }
            } catch (MigrationException e3) {
                this.f37188q.mo52738b(e3);
                mo44375a();
                this.f37185n.mo40823c(this.f37181j);
            }
        }
    }

    /* renamed from: h */
    public final void mo44381h(String str) throws CryptoException, IOException, MigrationException, SecurityException {
        SecretKey secretKey;
        File file = new File(this.f37184m, mo44384k(str));
        String str2 = this.f37184m;
        File file2 = new File(str2, mo44384k(str) + "-mig");
        if (file.exists()) {
            File file3 = new File(file, mo44383j(C13641g.m34128q()));
            File file4 = new File(file2, mo44383j(C13641g.m34128q()));
            if (!file3.exists() && !file4.exists()) {
                if (file.exists()) {
                    C13862i.C13863a aVar = this.f37186o;
                    Set<String> N0 = C23825c.m58502N0(new C13862i(file, aVar.f34103a, aVar.f34104b).mo40809a());
                    if (file2.exists()) {
                        C13862i.C13863a aVar2 = this.f37186o;
                        N0.removeAll(new C13862i(file2, aVar2.f34103a, aVar2.f34104b).mo40809a());
                    } else {
                        file2.mkdir();
                    }
                    File file5 = new File(new File(this.f37184m, mo44384k(C21100e.m49337e0())), mo44383j(str));
                    SecretKeySpec secretKeySpec = this.f37176e;
                    byte[] bArr = null;
                    if (secretKeySpec != null) {
                        SecretKeySpec secretKeySpec2 = new SecretKeySpec(mo44376b(file5, secretKeySpec), KeyProvider18.KEY_ALGORITHM_AES);
                        String str3 = this.f37184m;
                        File file6 = new File(new File(str3, mo44384k(C21100e.m49337e0()) + "-mig"), mo44383j(str));
                        if (!file6.exists()) {
                            secretKey = ((C18558c) this.f37179h.getValue()).mo50961a();
                            C24362h.m61210e(secretKey, "secretKeyGenerator.generateSecretKey()");
                            SecretKey secretKey2 = this.f37177f;
                            if (secretKey2 != null) {
                                byte[] encoded = secretKey.getEncoded();
                                C24362h.m61210e(encoded, "newKey.encoded");
                                mo44377c(file6, secretKey2, encoded);
                            } else {
                                C24362h.m61217l("newMasterKey");
                                throw null;
                            }
                        } else {
                            SecretKey secretKey3 = this.f37177f;
                            if (secretKey3 != null) {
                                C13862i.C13863a aVar3 = this.f37186o;
                                File file7 = aVar3.f34103a;
                                C19963e eVar = aVar3.f34104b;
                                C24362h.m61211f(file7, "temporaryFileDirectory");
                                C24362h.m61211f(eVar, "uuidGenerator");
                                if (!file6.isDirectory()) {
                                    if (file6.exists()) {
                                        bArr = C17885a.m44451n0(file6);
                                    }
                                    if (bArr == null) {
                                        StringBuilder k = C13555b.m33972k("Null bytes when decrypting new file: ");
                                        k.append(file6.getAbsolutePath());
                                        throw new MigrationException(k.toString());
                                    } else if (bArr.length >= 12) {
                                        byte[] O0 = C21132f.m49432O0(0, 12, bArr);
                                        byte[] O02 = C21132f.m49432O0(12, bArr.length, bArr);
                                        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                                        instance.init(2, secretKey3, new GCMParameterSpec(RecyclerView.C1119a0.FLAG_IGNORE, O0));
                                        byte[] doFinal = instance.doFinal(O02);
                                        C24362h.m61210e(doFinal, "c.doFinal(text)");
                                        secretKey = new SecretKeySpec(doFinal, KeyProvider18.KEY_ALGORITHM_AES);
                                    } else {
                                        StringBuilder k2 = C13555b.m33972k("New file has incorrect size: ");
                                        k2.append(bArr.length);
                                        throw new MigrationException(k2.toString());
                                    }
                                } else {
                                    throw new IOException("Cannot read a directory.");
                                }
                            } else {
                                C24362h.m61217l("newMasterKey");
                                throw null;
                            }
                        }
                        for (String str4 : N0) {
                            mo44377c(new File(file2, str4), secretKey, mo44376b(new File(file, str4), secretKeySpec2));
                        }
                    } else {
                        C24362h.m61217l("oldMasterKey");
                        throw null;
                    }
                }
                String valueOf = String.valueOf(this.f37181j);
                Charset charset = C25072a.f63272a;
                if (valueOf != null) {
                    byte[] bytes = valueOf.getBytes(charset);
                    C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
                    C13862i.C13863a aVar4 = this.f37186o;
                    File file8 = aVar4.f34103a;
                    C19963e eVar2 = aVar4.f34104b;
                    C24362h.m61211f(file8, "temporaryFileDirectory");
                    C24362h.m61211f(eVar2, "uuidGenerator");
                    if (!file4.isDirectory()) {
                        File file9 = new File(file8.getPath(), eVar2.mo52262a().toString());
                        C17885a.m44397E0(file9, bytes);
                        file9.renameTo(file4);
                        return;
                    }
                    throw new IOException("Cannot write to a directory.");
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }

    /* renamed from: i */
    public final void mo44382i(String str) throws CryptoException, MigrationException, SecurityException {
        File file = new File(this.f37184m, mo44384k(str));
        String str2 = this.f37184m;
        File file2 = new File(str2, mo44384k(str) + "-mig");
        if (!new File(file, mo44383j(C13641g.m34128q())).exists()) {
            String str3 = this.f37184m;
            File file3 = new File(str3, mo44384k(str) + "-mig2");
            if (file.exists() && !file.renameTo(file3)) {
                throw new MigrationException(C0017h.m56M("Failed renaming '", str, "' to '", str, "-mig2'."));
            } else if (file2.exists() && !file2.renameTo(file)) {
                throw new MigrationException(C0017h.m56M("Failed renaming '", str, "-mig' to '", str, "'."));
            } else if (file3.exists()) {
                C23775c.m58350Q0(file3);
            }
        }
    }

    /* renamed from: j */
    public final String mo44383j(String str) throws CryptoException {
        String a = this.f37183l.mo50969a(str);
        C24362h.m61210e(a, "stringObfuscator.obfuscate(input)");
        return a;
    }

    /* renamed from: k */
    public final String mo44384k(String str) throws CryptoException {
        String a = this.f37182k.mo52405a(str);
        C24362h.m61210e(a, "prependBrandFunction.apply(input)");
        return mo44383j(a);
    }
}
