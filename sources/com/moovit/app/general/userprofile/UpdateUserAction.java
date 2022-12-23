package com.moovit.app.general.userprofile;

import android.content.Context;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.kinesis.MVUserActionType;
import org.apache.thrift.TBase;
import p401bz.C13712f;

public final class UpdateUserAction extends C13712f {

    /* renamed from: c */
    public UserActionType f38091c;

    public enum UserActionType {
        TELL_A_FRIEND,
        RATE_ON_STORE,
        LINES_SEARCH
    }

    /* renamed from: com.moovit.app.general.userprofile.UpdateUserAction$a */
    public static /* synthetic */ class C14899a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38092a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.app.general.userprofile.UpdateUserAction$UserActionType[] r0 = com.moovit.app.general.userprofile.UpdateUserAction.UserActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38092a = r0
                com.moovit.app.general.userprofile.UpdateUserAction$UserActionType r1 = com.moovit.app.general.userprofile.UpdateUserAction.UserActionType.TELL_A_FRIEND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38092a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.general.userprofile.UpdateUserAction$UserActionType r1 = com.moovit.app.general.userprofile.UpdateUserAction.UserActionType.RATE_ON_STORE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38092a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.general.userprofile.UpdateUserAction$UserActionType r1 = com.moovit.app.general.userprofile.UpdateUserAction.UserActionType.LINES_SEARCH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.general.userprofile.UpdateUserAction.C14899a.<clinit>():void");
        }
    }

    public UpdateUserAction(Context context, UserActionType userActionType) {
        super(context);
        this.f38091c = userActionType;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        MVUserActionType mVUserActionType;
        int i = C14899a.f38092a[this.f38091c.ordinal()];
        if (i == 1) {
            mVUserActionType = MVUserActionType.TELL_A_FRIEND;
        } else if (i == 2) {
            mVUserActionType = MVUserActionType.RATE_ON_STORE;
        } else if (i == 3) {
            mVUserActionType = MVUserActionType.LINES_SEARCH;
        } else {
            StringBuilder k = C13555b.m33972k("unknown UserActionType: ");
            k.append(this.f38091c);
            throw new IllegalArgumentException(k.toString());
        }
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVUserActionType.getClass();
        mVServerMessage.setField_ = MVServerMessage._Fields.ACTION_TYPE;
        mVServerMessage.value_ = mVUserActionType;
        return mVServerMessage;
    }
}
