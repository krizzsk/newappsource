package com.google.firebase.installations.local;

import com.google.firebase.installations.local.C14462a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p743qd.C19107d;
import p988j$.util.Spliterator;

public final class PersistedInstallation {

    /* renamed from: a */
    public File f36547a;

    /* renamed from: b */
    public final C19107d f36548b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(C19107d dVar) {
        this.f36548b = dVar;
    }

    /* renamed from: a */
    public final File mo43373a() {
        if (this.f36547a == null) {
            synchronized (this) {
                if (this.f36547a == null) {
                    C19107d dVar = this.f36548b;
                    dVar.mo51535a();
                    File filesDir = dVar.f48568a.getFilesDir();
                    this.f36547a = new File(filesDir, "PersistedInstallation." + this.f36548b.mo51538f() + ".json");
                }
            }
        }
        return this.f36547a;
    }

    /* renamed from: b */
    public final void mo43374b(C14462a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f36549b);
            jSONObject.put("Status", aVar.f36550c.ordinal());
            jSONObject.put("AuthToken", aVar.f36551d);
            jSONObject.put("RefreshToken", aVar.f36552e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f36554g);
            jSONObject.put("ExpiresInSecs", aVar.f36553f);
            jSONObject.put("FisError", aVar.f36555h);
            C19107d dVar = this.f36548b;
            dVar.mo51535a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", dVar.f48568a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(mo43373a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: c */
    public final C14462a mo43375c() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Spliterator.SUBSIZED];
        try {
            fileInputStream = new FileInputStream(mo43373a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, Spliterator.SUBSIZED);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        RegistrationStatus registrationStatus = RegistrationStatus.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", registrationStatus.ordinal());
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int i = C14464b.f36563a;
        C14462a.C14463a aVar = new C14462a.C14463a();
        aVar.f36561f = 0L;
        aVar.mo43388b(registrationStatus);
        aVar.f36560e = 0L;
        aVar.f36556a = optString;
        aVar.mo43388b(RegistrationStatus.values()[optInt]);
        aVar.f36558c = optString2;
        aVar.f36559d = optString3;
        aVar.f36561f = Long.valueOf(optLong);
        aVar.f36560e = Long.valueOf(optLong2);
        aVar.f36562g = optString4;
        return aVar.mo43387a();
        throw th;
    }
}
