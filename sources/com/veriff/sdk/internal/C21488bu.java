package com.veriff.sdk.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C21529cn;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.veriff.sdk.internal.bu */
class C21488bu extends C21529cn {

    /* renamed from: a */
    private static final UriMatcher f54053a;

    /* renamed from: b */
    private final Context f54054b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f54053a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public C21488bu(Context context) {
        this.f54054b = context;
    }

    /* renamed from: b */
    private InputStream m51352b(C21525cl clVar) throws IOException {
        ContentResolver contentResolver = this.f54054b.getContentResolver();
        Uri uri = clVar.f54153d;
        int match = f54053a.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* renamed from: a */
    public boolean mo54408a(C21525cl clVar) {
        Uri uri = clVar.f54153d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f54053a.match(clVar.f54153d) != -1;
    }

    /* renamed from: a */
    public C21529cn.C21530a mo54407a(C21525cl clVar, int i) throws IOException {
        InputStream b = m51352b(clVar);
        if (b == null) {
            return null;
        }
        return new C21529cn.C21530a(abr.m50514a(b), C21512ci.C21518d.DISK);
    }
}
