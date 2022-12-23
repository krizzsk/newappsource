package p190o1;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.appboy.support.AppboyFileUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p116i1.C5240d;

/* renamed from: o1.e */
public final class C5910e {

    /* renamed from: a */
    public static final C5909d f18985a = new C5909d(0);

    /* renamed from: o1.e$a */
    public static class C5911a {
        /* renamed from: a */
        public static Cursor m14391a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [o1.m[], android.database.Cursor] */
    /* renamed from: a */
    public static C5919l m14390a(Context context, C5912f fVar) throws PackageManager.NameNotFoundException {
        Cursor cursor;
        int i;
        int i2;
        Uri uri;
        int i3;
        boolean z;
        boolean z2;
        C5912f fVar2 = fVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = fVar2.f18986a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(C25541a.m63881k("No package found for authority: ", str));
        } else if (resolveContentProvider.packageName.equals(fVar2.f18987b)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            Collections.sort(arrayList, f18985a);
            List<List<byte[]>> list = fVar2.f18989d;
            if (list == null) {
                list = C5240d.m13259b(resources, 0);
            }
            int i4 = 0;
            while (true) {
                cursor = 0;
                if (i4 >= list.size()) {
                    resolveContentProvider = cursor;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(list.get(i4));
                Collections.sort(arrayList2, f18985a);
                if (arrayList.size() == arrayList2.size()) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList.size()) {
                            z2 = true;
                            break;
                        } else if (!Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    break;
                }
                i4++;
            }
            if (resolveContentProvider == null) {
                return new C5919l(1, cursor);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath(AppboyFileUtils.FILE_SCHEME).build();
            try {
                cursor = C5911a.m14391a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{fVar2.f18988c}, (String) null, (Object) null);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        if (columnIndex != -1) {
                            i = cursor.getInt(columnIndex);
                        } else {
                            i = 0;
                        }
                        if (columnIndex4 != -1) {
                            i2 = cursor.getInt(columnIndex4);
                        } else {
                            i2 = 0;
                        }
                        if (columnIndex3 == -1) {
                            uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                        } else {
                            uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                        }
                        Uri uri2 = uri;
                        if (columnIndex5 != -1) {
                            i3 = cursor.getInt(columnIndex5);
                        } else {
                            i3 = 400;
                        }
                        if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                            z = false;
                        } else {
                            z = true;
                        }
                        arrayList3.add(new C5920m(uri2, i2, i3, z, i));
                    }
                }
                return new C5919l(0, (C5920m[]) arrayList3.toArray(new C5920m[0]));
            } finally {
                if (cursor != 0) {
                    cursor.close();
                }
            }
        } else {
            StringBuilder l = C13555b.m33973l("Found content provider ", str, ", but package was not ");
            l.append(fVar2.f18987b);
            throw new PackageManager.NameNotFoundException(l.toString());
        }
    }
}
