package com.amazonaws.regions;

import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RegionMetadata {
    private final List<Region> regions;

    public RegionMetadata(List<Region> list) {
        if (list != null) {
            this.regions = Collections.unmodifiableList(new ArrayList(list));
            return;
        }
        throw new IllegalArgumentException("regions cannot be null");
    }

    private static String getHost(String str) {
        String host = URI.create(str).getHost();
        if (host != null) {
            return host;
        }
        return URI.create(UrlPrivacyValidator.HTTP_SCHEME + str).getHost();
    }

    public Region getRegion(String str) {
        for (Region next : this.regions) {
            if (next.getName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public Region getRegionByEndpoint(String str) {
        String host = getHost(str);
        for (Region next : this.regions) {
            Iterator<String> it = next.getServiceEndpoints().values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (host.equals(getHost(it.next()))) {
                        return next;
                    }
                }
            }
        }
        throw new IllegalArgumentException(C25541a.m63881k("No region found with any service for endpoint ", str));
    }

    public List<Region> getRegions() {
        return this.regions;
    }

    public List<Region> getRegionsForService(String str) {
        LinkedList linkedList = new LinkedList();
        for (Region next : this.regions) {
            if (next.isServiceSupported(str)) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }

    public String toString() {
        return this.regions.toString();
    }
}
