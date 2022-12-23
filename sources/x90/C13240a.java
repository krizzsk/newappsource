package x90;

import android.content.Context;
import android.util.SparseArray;
import c70.C13752e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import f00.C16919g;
import f10.C16935f;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import p001a0.C0016g;
import p358af.C13437d;
import p435de.C16596f;
import p543hq.C17476c;
import p646lz.C18299a;
import p646lz.C18305c;
import p824tp.C19722a0;
import p824tp.C19731i;
import p856ux.C20005a;
import y90.C13271e;

/* renamed from: x90.a */
public abstract class C13240a extends C18305c<Boolean> {

    /* renamed from: c */
    public static final C13241a f32864c = new C13241a();

    /* renamed from: x90.a$a */
    public class C13241a implements C13242b {
        /* renamed from: a */
        public final void mo40113a(C13752e eVar) {
        }

        public final String toString() {
            return "NULL_UPGRADER";
        }
    }

    /* renamed from: j */
    public static SparseArray<C13242b> m33358j(int i, C13242b bVar) {
        SparseArray<C13242b> sparseArray = new SparseArray<>(1);
        sparseArray.append(i, bVar);
        return sparseArray;
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet hashSet = new HashSet();
        hashSet.add("ENVIRONMENT_VALIDATOR");
        return hashSet;
    }

    /* renamed from: f */
    public final Object mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        int[] iArr;
        Context context2 = context;
        Context applicationContext = context.getApplicationContext();
        C16919g.C16924e eVar = C13271e.f32922a;
        int i = 0;
        int intValue = eVar.mo19759a(applicationContext.getSharedPreferences("UserData", 0)).intValue();
        if (intValue == 564) {
            return Boolean.TRUE;
        }
        if (intValue == -1) {
            eVar.mo49545d(applicationContext.getSharedPreferences("UserData", 0), 564);
            return Boolean.TRUE;
        }
        SparseArray<SparseArray<C13242b>> i2 = mo40112i();
        int i3 = 564 - intValue;
        int i4 = i3 + 1;
        int[] iArr2 = new int[i4];
        iArr2[0] = 0;
        for (int i5 = 1; i5 < i4; i5++) {
            iArr2[i5] = 2147483646;
        }
        int[] iArr3 = new int[i4];
        int i6 = intValue;
        for (int i7 = 564; i6 < i7; i7 = 564) {
            SparseArray sparseArray = i2.get(i6);
            if (sparseArray != null) {
                int i8 = i6 - intValue;
                while (i < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i) - intValue;
                    int i9 = iArr2[keyAt];
                    int i11 = iArr2[i8] + 1;
                    if (i11 < i9) {
                        iArr2[keyAt] = i11;
                        iArr3[keyAt] = i6;
                    }
                    i++;
                }
            }
            i6++;
            i = 0;
        }
        int i12 = iArr2[i3];
        if (i12 == 2147483646) {
            iArr = null;
        } else {
            iArr = new int[i12];
            int i13 = 1;
            int i14 = i4 - 1;
            while (i14 > 0) {
                iArr[iArr2[i14] - i13] = intValue + i14;
                i14 = iArr3[i14] - intValue;
                i13 = 1;
            }
        }
        if (iArr != null) {
            StringBuilder s = C0016g.m35s("Upgraders path from version ", intValue, " to version ", 564, ": ");
            s.append(Arrays.toString(iArr));
            C16596f.m42113a().mo49363b(s.toString());
            C13752e eVar2 = new C13752e(context2, (C19722a0) null, ((C17476c) C19731i.m47197a(context).f50173c.f20758b).mo49947a(getClass()));
            int length = iArr.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = iArr[i15];
                C13242b bVar = (C13242b) i2.get(intValue).get(i16);
                if (bVar != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Executing upgrader: ");
                    sb.append(bVar);
                    sb.append(" (");
                    sb.append(intValue);
                    sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    C16596f.m42113a().mo49363b(C13437d.m33707l(sb, i16, ")"));
                    bVar.mo40113a(eVar2);
                    C13271e.f32922a.mo49545d(applicationContext.getSharedPreferences("UserData", 0), Integer.valueOf(i16));
                    i15++;
                    intValue = i16;
                } else {
                    throw new AppDataPartLoadFailedException((Object) null, C13715c.m34244j("No upgrader from version ", intValue, " to version ", i16), (Throwable) null);
                }
            }
            C16935f.m42763f(applicationContext, true);
            C19731i.m47197a(context).f50172b.mo42913b(new C20005a.C20006a(context2), true);
            return Boolean.TRUE;
        }
        throw new AppDataPartLoadFailedException((Object) null, C13715c.m34244j("No chain of upgraders from version ", intValue, " to version ", 564), (Throwable) null);
    }

    /* renamed from: i */
    public abstract SparseArray<SparseArray<C13242b>> mo40112i();
}
