package com.moovit.app.editing.transit;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum EditorChangeState implements Parcelable {
    NONE,
    PENDING,
    APPROVED,
    LOADED;
    
    public static final C19577c<EditorChangeState> CODER = null;
    public static final Parcelable.Creator<EditorChangeState> CREATOR = null;

    /* renamed from: com.moovit.app.editing.transit.EditorChangeState$a */
    public class C14866a implements Parcelable.Creator<EditorChangeState> {
        public final Object createFromParcel(Parcel parcel) {
            return (EditorChangeState) C19612n.m46981v(parcel, EditorChangeState.CODER);
        }

        public final Object[] newArray(int i) {
            return new EditorChangeState[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        EditorChangeState editorChangeState;
        EditorChangeState editorChangeState2;
        EditorChangeState editorChangeState3;
        EditorChangeState editorChangeState4;
        CODER = new C19577c<>(EditorChangeState.class, editorChangeState, editorChangeState2, editorChangeState3, editorChangeState4);
        CREATOR = new C14866a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
