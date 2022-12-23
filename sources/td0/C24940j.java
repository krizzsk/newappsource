package td0;

import android.database.Cursor;
import android.text.TextUtils;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.persistence.C23192a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: td0.j */
public final class C24940j implements Callable<List<String>> {

    /* renamed from: b */
    public final /* synthetic */ String f63033b;

    /* renamed from: c */
    public final /* synthetic */ int f63034c;

    /* renamed from: d */
    public final /* synthetic */ int f63035d;

    /* renamed from: e */
    public final /* synthetic */ C23192a f63036e;

    public C24940j(C23192a aVar, String str, int i, int i2) {
        this.f63036e = aVar;
        this.f63033b = str;
        this.f63034c = i;
        this.f63035d = i2;
    }

    public final Object call() throws Exception {
        ArrayList arrayList;
        synchronized (this.f63036e) {
            String str = "bid_token != '' AND ( state = ? OR state = ? ) AND expire_time > ?";
            if (!TextUtils.isEmpty(this.f63033b)) {
                str = "bid_token != '' AND ( state = ? OR state = ? ) AND expire_time > ? AND placement_id = ?";
            }
            String str2 = str;
            String[] strArr = {"bid_token"};
            int i = 0;
            String[] strArr2 = {String.valueOf(0), String.valueOf(1), String.valueOf(System.currentTimeMillis() / 1000)};
            if (!TextUtils.isEmpty(this.f63033b)) {
                strArr2 = new String[]{String.valueOf(0), String.valueOf(1), String.valueOf(System.currentTimeMillis() / 1000), this.f63033b};
            }
            Cursor query = this.f63036e.f58874a.mo58264e().query("advertisement", strArr, str2, strArr2, (String) null, (String) null, (String) null, (String) null);
            arrayList = new ArrayList();
            if (query != null) {
                while (query.moveToNext() && i < this.f63034c) {
                    try {
                        String string = query.getString(query.getColumnIndex("bid_token"));
                        if (string.getBytes().length + i <= this.f63034c) {
                            i += string.getBytes().length + this.f63035d;
                            arrayList.add(string);
                        }
                    } catch (Exception e) {
                        try {
                            VungleLogger.m57029b("getAvailableBidTokens", e.toString());
                            arrayList = new ArrayList();
                        } finally {
                            query.close();
                        }
                    }
                }
                query.close();
            }
        }
        return arrayList;
    }
}
