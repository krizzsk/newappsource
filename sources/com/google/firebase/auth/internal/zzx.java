package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p986firebaseauthapi.zzza;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p092g3.C4752a;
import p357ae.C13418e;
import p382be.C13598f0;
import p382be.C13604l;
import p743qd.C19107d;

@SafeParcelable.Class(creator = "DefaultFirebaseUserCreator")
public final class zzx extends FirebaseUser {
    public static final Parcelable.Creator<zzx> CREATOR = new C13598f0();
    @SafeParcelable.Field(getter = "getCachedTokenState", mo65739id = 1)

    /* renamed from: b */
    public zzza f36450b;
    @SafeParcelable.Field(getter = "getDefaultAuthUserInfo", mo65739id = 2)

    /* renamed from: c */
    public zzt f36451c;
    @SafeParcelable.Field(getter = "getFirebaseAppName", mo65739id = 3)

    /* renamed from: d */
    public final String f36452d;
    @SafeParcelable.Field(getter = "getUserType", mo65739id = 4)

    /* renamed from: e */
    public String f36453e;
    @SafeParcelable.Field(getter = "getUserInfos", mo65739id = 5)

    /* renamed from: f */
    public List f36454f;
    @SafeParcelable.Field(getter = "getProviders", mo65739id = 6)

    /* renamed from: g */
    public List f36455g;
    @SafeParcelable.Field(getter = "getCurrentVersion", mo65739id = 7)

    /* renamed from: h */
    public String f36456h;
    @SafeParcelable.Field(getter = "isAnonymous", mo65739id = 8)

    /* renamed from: i */
    public Boolean f36457i;
    @SafeParcelable.Field(getter = "getMetadata", mo65739id = 9)

    /* renamed from: j */
    public zzz f36458j;
    @SafeParcelable.Field(getter = "isNewUser", mo65739id = 10)

    /* renamed from: k */
    public boolean f36459k;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", mo65739id = 11)

    /* renamed from: l */
    public zze f36460l;
    @SafeParcelable.Field(getter = "getMultiFactorInfoList", mo65739id = 12)

    /* renamed from: m */
    public zzbb f36461m;

    public zzx(C19107d dVar, ArrayList arrayList) {
        Preconditions.checkNotNull(dVar);
        dVar.mo51535a();
        this.f36452d = dVar.f48569b;
        this.f36453e = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f36456h = "2";
        mo43286p2(arrayList);
    }

    /* renamed from: i2 */
    public final /* synthetic */ C4752a mo43279i2() {
        return new C4752a(this);
    }

    /* renamed from: j2 */
    public final List<? extends C13418e> mo43280j2() {
        return this.f36454f;
    }

    /* renamed from: k2 */
    public final String mo43281k2() {
        Map map;
        zzza zzza = this.f36450b;
        if (zzza == null || zzza.zze() == null || (map = (Map) C13604l.m34017a(zzza.zze()).f33285b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    /* renamed from: l2 */
    public final String mo43282l2() {
        return this.f36451c.f36442b;
    }

    /* renamed from: m2 */
    public final boolean mo43283m2() {
        String str;
        Boolean bool = this.f36457i;
        if (bool == null || bool.booleanValue()) {
            zzza zzza = this.f36450b;
            if (zzza != null) {
                Map map = (Map) C13604l.m34017a(zzza.zze()).f33285b.get("firebase");
                if (map != null) {
                    str = (String) map.get("sign_in_provider");
                } else {
                    str = null;
                }
            } else {
                str = "";
            }
            boolean z = false;
            if (this.f36454f.size() <= 1 && (str == null || !str.equals("custom"))) {
                z = true;
            }
            this.f36457i = Boolean.valueOf(z);
        }
        return this.f36457i.booleanValue();
    }

    /* renamed from: n2 */
    public final C19107d mo43284n2() {
        return C19107d.m46266e(this.f36452d);
    }

    /* renamed from: o2 */
    public final zzx mo43285o2() {
        this.f36457i = Boolean.FALSE;
        return this;
    }

    /* renamed from: p2 */
    public final synchronized zzx mo43286p2(List list) {
        Preconditions.checkNotNull(list);
        this.f36454f = new ArrayList(list.size());
        this.f36455g = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C13418e eVar = (C13418e) list.get(i);
            if (eVar.mo40281z1().equals("firebase")) {
                this.f36451c = (zzt) eVar;
            } else {
                this.f36455g.add(eVar.mo40281z1());
            }
            this.f36454f.add((zzt) eVar);
        }
        if (this.f36451c == null) {
            this.f36451c = (zzt) this.f36454f.get(0);
        }
        return this;
    }

    /* renamed from: q2 */
    public final zzza mo43287q2() {
        return this.f36450b;
    }

    /* renamed from: r2 */
    public final void mo43288r2(zzza zzza) {
        this.f36450b = (zzza) Preconditions.checkNotNull(zzza);
    }

    /* renamed from: s2 */
    public final void mo43289s2(ArrayList arrayList) {
        zzbb zzbb;
        if (arrayList.isEmpty()) {
            zzbb = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList2.add((PhoneMultiFactorInfo) multiFactorInfo);
                }
            }
            zzbb = new zzbb(arrayList2);
        }
        this.f36461m = zzbb;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f36450b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f36451c, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f36452d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f36453e, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f36454f, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.f36455g, false);
        SafeParcelWriter.writeString(parcel, 7, this.f36456h, false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, Boolean.valueOf(mo43283m2()), false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f36458j, i, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f36459k);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f36460l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f36461m, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: z1 */
    public final String mo40281z1() {
        return this.f36451c.f36443c;
    }

    public final String zze() {
        return this.f36450b.zze();
    }

    public final String zzf() {
        return this.f36450b.zzh();
    }

    public final List zzg() {
        return this.f36455g;
    }

    @SafeParcelable.Constructor
    public zzx(@SafeParcelable.Param(mo65742id = 1) zzza zzza, @SafeParcelable.Param(mo65742id = 2) zzt zzt, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 4) String str2, @SafeParcelable.Param(mo65742id = 5) ArrayList arrayList, @SafeParcelable.Param(mo65742id = 6) ArrayList arrayList2, @SafeParcelable.Param(mo65742id = 7) String str3, @SafeParcelable.Param(mo65742id = 8) Boolean bool, @SafeParcelable.Param(mo65742id = 9) zzz zzz, @SafeParcelable.Param(mo65742id = 10) boolean z, @SafeParcelable.Param(mo65742id = 11) zze zze, @SafeParcelable.Param(mo65742id = 12) zzbb zzbb) {
        this.f36450b = zzza;
        this.f36451c = zzt;
        this.f36452d = str;
        this.f36453e = str2;
        this.f36454f = arrayList;
        this.f36455g = arrayList2;
        this.f36456h = str3;
        this.f36457i = bool;
        this.f36458j = zzz;
        this.f36459k = z;
        this.f36460l = zze;
        this.f36461m = zzbb;
    }
}
