package com.vungle.warren.p979ui.state;

import ae0.C20979a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.vungle.warren.ui.state.BundleOptionsState */
public class BundleOptionsState implements C20979a, Parcelable {
    public static final Parcelable.Creator<BundleOptionsState> CREATOR = new C23234a();

    /* renamed from: b */
    public HashMap f58967b = new HashMap();

    /* renamed from: c */
    public HashMap f58968c = new HashMap();

    /* renamed from: d */
    public HashMap f58969d = new HashMap();

    /* renamed from: com.vungle.warren.ui.state.BundleOptionsState$a */
    public class C23234a implements Parcelable.Creator<BundleOptionsState> {
        public final Object createFromParcel(Parcel parcel) {
            return new BundleOptionsState(parcel);
        }

        public final Object[] newArray(int i) {
            return new BundleOptionsState[i];
        }
    }

    public BundleOptionsState() {
    }

    /* renamed from: b */
    public final String mo53049b() {
        return (String) this.f58967b.get("saved_report");
    }

    /* renamed from: c */
    public final void mo58332c(int i) {
        this.f58969d.put("videoPosition", Integer.valueOf(i));
    }

    /* renamed from: d */
    public final void mo58333d(String str) {
        this.f58967b.put("saved_report", str);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo58335f(String str, boolean z) {
        this.f58968c.put(str, Boolean.valueOf(z));
    }

    public final boolean getBoolean(String str, boolean z) {
        Boolean bool = (Boolean) this.f58968c.get(str);
        if (bool == null) {
            return z;
        }
        return bool.booleanValue();
    }

    public final Integer getInt(int i) {
        Integer num = (Integer) this.f58969d.get("videoPosition");
        if (num != null) {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f58969d.size());
        for (Map.Entry entry : this.f58969d.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeValue(entry.getValue());
        }
        parcel.writeInt(this.f58967b.size());
        for (Map.Entry entry2 : this.f58967b.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeValue(entry2.getValue());
        }
        parcel.writeInt(this.f58968c.size());
        for (Map.Entry entry3 : this.f58968c.entrySet()) {
            parcel.writeString((String) entry3.getKey());
            parcel.writeValue(entry3.getValue());
        }
    }

    public BundleOptionsState(Parcel parcel) {
        Class<String> cls = String.class;
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f58969d.put(parcel.readString(), (Integer) parcel.readValue(cls.getClassLoader()));
        }
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.f58967b.put(parcel.readString(), (String) parcel.readValue(cls.getClassLoader()));
        }
        int readInt3 = parcel.readInt();
        for (int i3 = 0; i3 < readInt3; i3++) {
            this.f58968c.put(parcel.readString(), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
        }
    }
}
