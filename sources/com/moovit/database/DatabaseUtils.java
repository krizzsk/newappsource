package com.moovit.database;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p001a0.C0016g;
import p977zz.C20964s0;

public class DatabaseUtils {
    public static String createInClausePlaceHolders(int i) {
        return C20964s0.m49100r(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, Collections.nCopies(i, "?"));
    }

    public static String createSelection(String... strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            int length = strArr.length - 1;
            for (int i = 0; i < length; i++) {
                sb.append(strArr[i]);
                sb.append(" = ? AND ");
            }
            return C0016g.m31o(sb, strArr[length], " = ?");
        }
        throw new IllegalArgumentException("columns can not be zero length");
    }

    public static String[] createSelectionArgs(Collection<String> collection) {
        if (C13717b.m34258e(collection)) {
            return new String[0];
        }
        return (String[]) collection.toArray(new String[collection.size()]);
    }

    public static String[] createSelectionArgs(String... strArr) {
        return strArr;
    }

    public static String getConflictAlgorithm(int i) {
        if (i == 0) {
            return "";
        }
        if (i == 1) {
            return "OR ROLLBACK";
        }
        if (i == 2) {
            return "OR ABORT";
        }
        if (i == 3) {
            return "OR FAIL";
        }
        if (i == 4) {
            return "OR IGNORE";
        }
        if (i == 5) {
            return "OR REPLACE";
        }
        throw new IllegalStateException("Unknown conflict algorithm");
    }

    public static ArrayList<String> idsToString(Collection<? extends ServerId> collection) {
        return C13720d.m34273c(collection, (C13722f) null, ServerId.f15139d);
    }

    public static String[] createSelectionArgs(ServerId serverId, long j, List<String> list) {
        int size = list.size() + 2;
        String[] strArr = new String[size];
        strArr[0] = serverId.mo19751c();
        strArr[1] = Long.toString(j);
        for (int i = 2; i < size; i++) {
            strArr[i] = list.get(i - 2);
        }
        return strArr;
    }
}
