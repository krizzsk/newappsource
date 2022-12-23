package g30;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.RemoveAndFinishTaskActivity;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p090g1.C4732a;
import p172m9.C5720b;
import p269u2.C6677a;
import p435de.C16596f;
import p543hq.C17474b;
import p646lz.C18299a;
import p824tp.C19722a0;
import p977zz.C20943i;
import s00.C19393f;

/* renamed from: g30.q */
public final class C4789q implements Callable<Boolean> {

    /* renamed from: f */
    public static final ThreadPoolExecutor f16168f = C5720b.m14033A(1, "MetroUpdater");

    /* renamed from: g */
    public static final Object f16169g = new Object();

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f16170b = MoovitApplication.f37317k;

    /* renamed from: c */
    public final String f16171c;

    /* renamed from: d */
    public final ServerId f16172d;

    /* renamed from: e */
    public final long f16173e;

    /* renamed from: g30.q$a */
    public static class C4790a implements Runnable {
        public final void run() {
            MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
            if (moovitApplication != null && !MoovitApplication.m36934n()) {
                if (C20943i.m49051d(21)) {
                    for (ActivityManager.AppTask finishAndRemoveTask : ((ActivityManager) moovitApplication.getSystemService("activity")).getAppTasks()) {
                        finishAndRemoveTask.finishAndRemoveTask();
                    }
                } else {
                    int i = RemoveAndFinishTaskActivity.f41032b;
                    Intent intent = new Intent(moovitApplication, RemoveAndFinishTaskActivity.class);
                    intent.addFlags(SQLiteDatabase.OPEN_FULLMUTEX);
                    intent.addFlags(1073741824);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(intent);
                    if (!arrayList.isEmpty()) {
                        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                        if (!C4732a.startActivities(moovitApplication, intentArr, (Bundle) null)) {
                            Intent intent2 = new Intent(intentArr[intentArr.length - 1]);
                            intent2.addFlags(268435456);
                            moovitApplication.startActivity(intent2);
                        }
                    } else {
                        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                    }
                }
                moovitApplication.mo44571s((Intent) null, (Activity) null, (C18299a) null);
            }
        }
    }

    public C4789q(String str, ServerId serverId, long j) {
        this.f16171c = str;
        this.f16172d = serverId;
        this.f16173e = j;
    }

    /* renamed from: c */
    public static Task<Boolean> m12121c(String str, ServerId serverId, long j) {
        Objects.toString(serverId);
        Objects.toString(serverId);
        return Tasks.call(f16168f, new C4789q(str, serverId, j));
    }

    /* renamed from: d */
    public static Boolean m12122d(String str, ServerId serverId, long j) {
        C21100e.m49355o();
        try {
            return (Boolean) Tasks.await(m12121c(str, serverId, j), 1, TimeUnit.MINUTES);
        } catch (Exception e) {
            C16596f a = C16596f.m42113a();
            a.mo49363b("Initiator: " + str);
            a.mo49364c(new ApplicationBugException("Failed to perform metro update synchronously.", e));
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public static boolean m12123e(Context context, ServerId serverId, long j) {
        synchronized (f16169g) {
            C19393f fVar = C19393f.f49325q;
            SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
            fVar.getClass();
            if (j == C19393f.m46694d(writableDatabase, serverId)) {
                return false;
            }
            writableDatabase.beginTransactionNonExclusive();
            try {
                C19393f.m46697g(writableDatabase, serverId, j);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return true;
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final ServerId mo20306a() {
        ServerId serverId = this.f16172d;
        if (serverId != null || !UserContextLoader.m40004l(this.f16170b)) {
            return serverId;
        }
        return ((C19722a0) this.f16170b.f37321e.mo50695h("USER_CONTEXT", false)).f50160a.f32927c;
    }

    /* renamed from: b */
    public final long mo20307b(ServerId serverId) throws IOException, ServerException {
        long j = this.f16173e;
        if (j != -1 || !UserContextLoader.m40004l(this.f16170b)) {
            return j;
        }
        return ((C4788p) new C4787o(serverId, new C13752e(this.f16170b, (C19722a0) this.f16170b.f37321e.mo50695h("USER_CONTEXT", false), (AnalyticsFlowKey) null)).mo52626J()).f16167m;
    }

    public final Object call() throws Exception {
        boolean z;
        ServerId serverId;
        long j;
        String str;
        long j2;
        String str2;
        String str3 = 0;
        long j3 = -1;
        try {
            serverId = mo20306a();
            if (serverId != null) {
                try {
                    j3 = mo20307b(serverId);
                    if (j3 > 0) {
                        if (m12123e(this.f16170b, serverId, j3)) {
                            this.f16170b.getClass();
                            if (MoovitApplication.m36934n()) {
                                str3 = "added_in_foreground";
                            } else {
                                str3 = "added";
                            }
                            try {
                                z = this.f16170b.f37321e.mo50702n("METRO_CONTEXT");
                                if (z) {
                                    try {
                                        MoovitExecutors.MAIN_THREAD.execute(new C4790a());
                                    } catch (ApplicationBugException e) {
                                        e = e;
                                    } catch (Exception e2) {
                                        e = e2;
                                        long j4 = j3;
                                        str = str3;
                                        str3 = serverId;
                                        j = j4;
                                        C16596f.m42113a().mo49364c(new ApplicationBugException("Metro Update Failure", e));
                                        str3 = str3;
                                        serverId = str3;
                                        str3 = str;
                                        j3 = j;
                                        C6677a aVar = this.f16170b.mo44558j().f50173c;
                                        MoovitApplication<?, ?, ?> moovitApplication = this.f16170b;
                                        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.METRO_UPDATE_SERVICE;
                                        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.METRO_SYNC);
                                        aVar2.mo49939g(AnalyticsAttributeKey.REASON, this.f16171c);
                                        aVar2.mo49937e(AnalyticsAttributeKey.METRO_ID, serverId);
                                        aVar2.mo49936d(AnalyticsAttributeKey.METRO_REVISION, j3);
                                        aVar2.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
                                        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, str3);
                                        C17474b[] bVarArr = {aVar2.mo49933a()};
                                        aVar.getClass();
                                        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
                                        Objects.toString(serverId);
                                        return Boolean.valueOf(z);
                                    }
                                }
                            } catch (ApplicationBugException e3) {
                                e = e3;
                                z = false;
                                long j5 = j3;
                                str2 = str3;
                                str3 = serverId;
                                j2 = j5;
                                C16596f.m42113a().mo49364c(e);
                                serverId = str3;
                                str3 = str;
                                j3 = j;
                                C6677a aVar3 = this.f16170b.mo44558j().f50173c;
                                MoovitApplication<?, ?, ?> moovitApplication2 = this.f16170b;
                                AnalyticsFlowKey analyticsFlowKey2 = AnalyticsFlowKey.METRO_UPDATE_SERVICE;
                                C17474b.C17475a aVar22 = new C17474b.C17475a(AnalyticsEventKey.METRO_SYNC);
                                aVar22.mo49939g(AnalyticsAttributeKey.REASON, this.f16171c);
                                aVar22.mo49937e(AnalyticsAttributeKey.METRO_ID, serverId);
                                aVar22.mo49936d(AnalyticsAttributeKey.METRO_REVISION, j3);
                                aVar22.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
                                aVar22.mo49939g(AnalyticsAttributeKey.TYPE, str3);
                                C17474b[] bVarArr2 = {aVar22.mo49933a()};
                                aVar3.getClass();
                                C6677a.m15759j(moovitApplication2, analyticsFlowKey2, false, bVarArr2);
                                Objects.toString(serverId);
                                return Boolean.valueOf(z);
                            } catch (Exception e4) {
                                e = e4;
                                z = false;
                                long j42 = j3;
                                str = str3;
                                str3 = serverId;
                                j = j42;
                                C16596f.m42113a().mo49364c(new ApplicationBugException("Metro Update Failure", e));
                                str3 = str3;
                                serverId = str3;
                                str3 = str;
                                j3 = j;
                                C6677a aVar32 = this.f16170b.mo44558j().f50173c;
                                MoovitApplication<?, ?, ?> moovitApplication22 = this.f16170b;
                                AnalyticsFlowKey analyticsFlowKey22 = AnalyticsFlowKey.METRO_UPDATE_SERVICE;
                                C17474b.C17475a aVar222 = new C17474b.C17475a(AnalyticsEventKey.METRO_SYNC);
                                aVar222.mo49939g(AnalyticsAttributeKey.REASON, this.f16171c);
                                aVar222.mo49937e(AnalyticsAttributeKey.METRO_ID, serverId);
                                aVar222.mo49936d(AnalyticsAttributeKey.METRO_REVISION, j3);
                                aVar222.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
                                aVar222.mo49939g(AnalyticsAttributeKey.TYPE, str3);
                                C17474b[] bVarArr22 = {aVar222.mo49933a()};
                                aVar32.getClass();
                                C6677a.m15759j(moovitApplication22, analyticsFlowKey22, false, bVarArr22);
                                Objects.toString(serverId);
                                return Boolean.valueOf(z);
                            }
                        } else {
                            str3 = "already_known";
                            z = true;
                        }
                        C6677a aVar322 = this.f16170b.mo44558j().f50173c;
                        MoovitApplication<?, ?, ?> moovitApplication222 = this.f16170b;
                        AnalyticsFlowKey analyticsFlowKey222 = AnalyticsFlowKey.METRO_UPDATE_SERVICE;
                        C17474b.C17475a aVar2222 = new C17474b.C17475a(AnalyticsEventKey.METRO_SYNC);
                        aVar2222.mo49939g(AnalyticsAttributeKey.REASON, this.f16171c);
                        aVar2222.mo49937e(AnalyticsAttributeKey.METRO_ID, serverId);
                        aVar2222.mo49936d(AnalyticsAttributeKey.METRO_REVISION, j3);
                        aVar2222.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
                        aVar2222.mo49939g(AnalyticsAttributeKey.TYPE, str3);
                        C17474b[] bVarArr222 = {aVar2222.mo49933a()};
                        aVar322.getClass();
                        C6677a.m15759j(moovitApplication222, analyticsFlowKey222, false, bVarArr222);
                        Objects.toString(serverId);
                        return Boolean.valueOf(z);
                    }
                    C16596f.m42113a().mo49363b("Initiator: " + this.f16171c);
                    throw new ApplicationBugException("Metro Update Missing or Non-positive Metro Revision");
                } catch (ApplicationBugException e5) {
                    e = e5;
                    z = false;
                    long j52 = j3;
                    str2 = str3;
                    str3 = serverId;
                    j2 = j52;
                    C16596f.m42113a().mo49364c(e);
                    serverId = str3;
                    str3 = str;
                    j3 = j;
                    C6677a aVar3222 = this.f16170b.mo44558j().f50173c;
                    MoovitApplication<?, ?, ?> moovitApplication2222 = this.f16170b;
                    AnalyticsFlowKey analyticsFlowKey2222 = AnalyticsFlowKey.METRO_UPDATE_SERVICE;
                    C17474b.C17475a aVar22222 = new C17474b.C17475a(AnalyticsEventKey.METRO_SYNC);
                    aVar22222.mo49939g(AnalyticsAttributeKey.REASON, this.f16171c);
                    aVar22222.mo49937e(AnalyticsAttributeKey.METRO_ID, serverId);
                    aVar22222.mo49936d(AnalyticsAttributeKey.METRO_REVISION, j3);
                    aVar22222.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
                    aVar22222.mo49939g(AnalyticsAttributeKey.TYPE, str3);
                    C17474b[] bVarArr2222 = {aVar22222.mo49933a()};
                    aVar3222.getClass();
                    C6677a.m15759j(moovitApplication2222, analyticsFlowKey2222, false, bVarArr2222);
                    Objects.toString(serverId);
                    return Boolean.valueOf(z);
                } catch (Exception e6) {
                    e = e6;
                    z = false;
                    long j422 = j3;
                    str = str3;
                    str3 = serverId;
                    j = j422;
                    C16596f.m42113a().mo49364c(new ApplicationBugException("Metro Update Failure", e));
                    str3 = str3;
                    serverId = str3;
                    str3 = str;
                    j3 = j;
                    C6677a aVar32222 = this.f16170b.mo44558j().f50173c;
                    MoovitApplication<?, ?, ?> moovitApplication22222 = this.f16170b;
                    AnalyticsFlowKey analyticsFlowKey22222 = AnalyticsFlowKey.METRO_UPDATE_SERVICE;
                    C17474b.C17475a aVar222222 = new C17474b.C17475a(AnalyticsEventKey.METRO_SYNC);
                    aVar222222.mo49939g(AnalyticsAttributeKey.REASON, this.f16171c);
                    aVar222222.mo49937e(AnalyticsAttributeKey.METRO_ID, serverId);
                    aVar222222.mo49936d(AnalyticsAttributeKey.METRO_REVISION, j3);
                    aVar222222.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
                    aVar222222.mo49939g(AnalyticsAttributeKey.TYPE, str3);
                    C17474b[] bVarArr22222 = {aVar222222.mo49933a()};
                    aVar32222.getClass();
                    C6677a.m15759j(moovitApplication22222, analyticsFlowKey22222, false, bVarArr22222);
                    Objects.toString(serverId);
                    return Boolean.valueOf(z);
                }
            } else {
                C16596f.m42113a().mo49363b("Initiator: " + this.f16171c);
                throw new ApplicationBugException("Metro Update Missing Metro Id");
            }
        } catch (ApplicationBugException e7) {
            e = e7;
            j2 = -1;
            z = false;
            str2 = null;
            C16596f.m42113a().mo49364c(e);
            serverId = str3;
            str3 = str;
            j3 = j;
            C6677a aVar322222 = this.f16170b.mo44558j().f50173c;
            MoovitApplication<?, ?, ?> moovitApplication222222 = this.f16170b;
            AnalyticsFlowKey analyticsFlowKey222222 = AnalyticsFlowKey.METRO_UPDATE_SERVICE;
            C17474b.C17475a aVar2222222 = new C17474b.C17475a(AnalyticsEventKey.METRO_SYNC);
            aVar2222222.mo49939g(AnalyticsAttributeKey.REASON, this.f16171c);
            aVar2222222.mo49937e(AnalyticsAttributeKey.METRO_ID, serverId);
            aVar2222222.mo49936d(AnalyticsAttributeKey.METRO_REVISION, j3);
            aVar2222222.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
            aVar2222222.mo49939g(AnalyticsAttributeKey.TYPE, str3);
            C17474b[] bVarArr222222 = {aVar2222222.mo49933a()};
            aVar322222.getClass();
            C6677a.m15759j(moovitApplication222222, analyticsFlowKey222222, false, bVarArr222222);
            Objects.toString(serverId);
            return Boolean.valueOf(z);
        } catch (Exception e8) {
            e = e8;
            j = -1;
            z = false;
            str = null;
            C16596f.m42113a().mo49364c(new ApplicationBugException("Metro Update Failure", e));
            str3 = str3;
            serverId = str3;
            str3 = str;
            j3 = j;
            C6677a aVar3222222 = this.f16170b.mo44558j().f50173c;
            MoovitApplication<?, ?, ?> moovitApplication2222222 = this.f16170b;
            AnalyticsFlowKey analyticsFlowKey2222222 = AnalyticsFlowKey.METRO_UPDATE_SERVICE;
            C17474b.C17475a aVar22222222 = new C17474b.C17475a(AnalyticsEventKey.METRO_SYNC);
            aVar22222222.mo49939g(AnalyticsAttributeKey.REASON, this.f16171c);
            aVar22222222.mo49937e(AnalyticsAttributeKey.METRO_ID, serverId);
            aVar22222222.mo49936d(AnalyticsAttributeKey.METRO_REVISION, j3);
            aVar22222222.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
            aVar22222222.mo49939g(AnalyticsAttributeKey.TYPE, str3);
            C17474b[] bVarArr2222222 = {aVar22222222.mo49933a()};
            aVar3222222.getClass();
            C6677a.m15759j(moovitApplication2222222, analyticsFlowKey2222222, false, bVarArr2222222);
            Objects.toString(serverId);
            return Boolean.valueOf(z);
        }
    }
}
