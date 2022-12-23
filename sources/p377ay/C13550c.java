package p377ay;

import android.content.Context;
import android.os.AsyncTask;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.AppActionRequest;
import p389bl.C13641g;

/* renamed from: ay.c */
public final class C13550c {

    /* renamed from: c */
    public static C13550c f33492c;

    /* renamed from: a */
    public final Context f33493a;

    /* renamed from: b */
    public C13547a f33494b = new C13547a();

    /* renamed from: ay.c$a */
    public static class C13551a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public final Context f33495a;

        /* renamed from: b */
        public final C13547a f33496b;

        public C13551a(Context context, C13547a aVar) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f33495a = context.getApplicationContext();
            this.f33496b = aVar;
        }

        public final Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            C13547a aVar = this.f33496b;
            if (aVar == null) {
                return Boolean.valueOf(this.f33495a.deleteFile("user_account.dat"));
            }
            return Boolean.valueOf(C13641g.m34136y(this.f33495a, "user_account.dat", aVar, C13547a.f33489c));
        }

        public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            Boolean bool = (Boolean) obj;
        }
    }

    public C13550c(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f33493a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final synchronized void mo40441a(C13549b bVar) {
        C21100e.m49373x(bVar, "userAccount");
        this.f33494b = (C13547a) bVar;
        new C13551a(this.f33493a, this.f33494b).execute(new Void[0]);
    }
}
