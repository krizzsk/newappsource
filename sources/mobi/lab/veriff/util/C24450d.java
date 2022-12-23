package mobi.lab.veriff.util;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: mobi.lab.veriff.util.d */
public class C24450d implements Parcelable {
    public static final Parcelable.Creator<C24450d> CREATOR = new Parcelable.Creator<C24450d>() {
        /* renamed from: a */
        public C24450d createFromParcel(Parcel parcel) {
            return new C24450d(parcel.createByteArray(), parcel.createByteArray());
        }

        /* renamed from: a */
        public C24450d[] newArray(int i) {
            return new C24450d[i];
        }
    };

    /* renamed from: a */
    private final byte[] f61887a;

    /* renamed from: b */
    private final byte[] f61888b;

    /* renamed from: a */
    public static C24450d m61495a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[16];
        secureRandom.nextBytes(bArr);
        byte[] bArr2 = new byte[12];
        secureRandom.nextBytes(bArr2);
        return new C24450d(bArr, bArr2);
    }

    /* renamed from: b */
    public int mo60666b() {
        return 16;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C24450d dVar = (C24450d) obj;
        if (!Arrays.equals(this.f61887a, dVar.f61887a)) {
            return false;
        }
        return Arrays.equals(this.f61888b, dVar.f61888b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f61888b) + (Arrays.hashCode(this.f61887a) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f61887a);
        parcel.writeByteArray(this.f61888b);
    }

    private C24450d(byte[] bArr, byte[] bArr2) {
        this.f61887a = bArr;
        this.f61888b = bArr2;
    }

    /* renamed from: a */
    public InputStream mo60664a(InputStream inputStream) {
        return new CipherInputStream(inputStream, m61494a(2));
    }

    /* renamed from: a */
    public OutputStream mo60665a(OutputStream outputStream) {
        return new CipherOutputStream(outputStream, m61494a(1));
    }

    /* renamed from: a */
    private Cipher m61494a(int i) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f61887a, KeyProvider18.KEY_ALGORITHM_AES);
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(RecyclerView.C1119a0.FLAG_IGNORE, this.f61888b);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(i, secretKeySpec, gCMParameterSpec);
            return instance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
