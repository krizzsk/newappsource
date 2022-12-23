package com.moovit.app.editing.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class EditableEntityInfo implements Parcelable {
    public static final Parcelable.Creator<EditableEntityInfo> CREATOR = new C14864a();

    /* renamed from: g */
    public static C14865b f37987g = new C14865b(EditableEntityInfo.class);

    /* renamed from: b */
    public ServerId f37988b;

    /* renamed from: c */
    public String f37989c;

    /* renamed from: d */
    public LatLonE6 f37990d;

    /* renamed from: e */
    public boolean f37991e;

    /* renamed from: f */
    public String f37992f;

    /* renamed from: com.moovit.app.editing.entity.EditableEntityInfo$a */
    public class C14864a implements Parcelable.Creator<EditableEntityInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (EditableEntityInfo) C19612n.m46981v(parcel, EditableEntityInfo.f37987g);
        }

        public final Object[] newArray(int i) {
            return new EditableEntityInfo[i];
        }
    }

    /* renamed from: com.moovit.app.editing.entity.EditableEntityInfo$b */
    public class C14865b extends C19619s<EditableEntityInfo> {
        public C14865b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new EditableEntityInfo(serverId, pVar.mo51948t(), (LatLonE6) pVar.mo51962q(LatLonE6.f40979g), pVar.mo51948t(), pVar.mo51919b());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            EditableEntityInfo editableEntityInfo = (EditableEntityInfo) obj;
            ServerId serverId = editableEntityInfo.f37988b;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51955t(editableEntityInfo.f37989c);
            qVar.mo51967q(editableEntityInfo.f37990d, LatLonE6.f40978f);
            qVar.mo51934b(editableEntityInfo.f37991e);
            qVar.mo51955t(editableEntityInfo.f37992f);
        }
    }

    public EditableEntityInfo(ServerId serverId, String str, LatLonE6 latLonE6, String str2, boolean z) {
        this.f37988b = serverId;
        this.f37989c = str;
        this.f37990d = latLonE6;
        this.f37991e = z;
        this.f37992f = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditableEntityInfo)) {
            return false;
        }
        EditableEntityInfo editableEntityInfo = (EditableEntityInfo) obj;
        if (!C20975x0.m49118e(this.f37989c, editableEntityInfo.f37989c) || !C20975x0.m49118e(this.f37990d, editableEntityInfo.f37990d) || this.f37991e != editableEntityInfo.f37991e || !C20975x0.m49118e(this.f37992f, editableEntityInfo.f37992f)) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f37987g);
    }
}
