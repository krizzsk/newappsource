package com.veriff.sdk.camera.core.impl;

import android.util.ArrayMap;
import com.veriff.sdk.camera.core.impl.Config;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p220q5.C6179a;
import p783rw.C19372d;

public class OptionsBundle implements Config {
    private static final OptionsBundle EMPTY_BUNDLE;
    public static final Comparator<Config.Option<?>> ID_COMPARE;
    public final TreeMap<Config.Option<?>, Map<Config.OptionPriority, Object>> mOptions;

    static {
        C6179a aVar = new C6179a(5);
        ID_COMPARE = aVar;
        EMPTY_BUNDLE = new OptionsBundle(new TreeMap(aVar));
    }

    public OptionsBundle(TreeMap<Config.Option<?>, Map<Config.OptionPriority, Object>> treeMap) {
        this.mOptions = treeMap;
    }

    public static OptionsBundle emptyBundle() {
        return EMPTY_BUNDLE;
    }

    public static OptionsBundle from(Config config) {
        if (OptionsBundle.class.equals(config.getClass())) {
            return (OptionsBundle) config;
        }
        TreeMap treeMap = new TreeMap(ID_COMPARE);
        for (Config.Option next : config.listOptions()) {
            Set<Config.OptionPriority> priorities = config.getPriorities(next);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority next2 : priorities) {
                arrayMap.put(next2, config.retrieveOptionWithPriority(next, next2));
            }
            treeMap.put(next, arrayMap);
        }
        return new OptionsBundle(treeMap);
    }

    public boolean containsOption(Config.Option<?> option) {
        return this.mOptions.containsKey(option);
    }

    public void findOptions(String str, Config.OptionMatcher optionMatcher) {
        for (Map.Entry next : this.mOptions.tailMap(Config.Option.create(str, Void.class)).entrySet()) {
            if (((Config.Option) next.getKey()).getId().startsWith(str)) {
                if (!((C19372d) optionMatcher).mo51781a((Config.Option) next.getKey())) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public Config.OptionPriority getOptionPriority(Config.Option<?> option) {
        Map map = this.mOptions.get(option);
        if (map != null) {
            return (Config.OptionPriority) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + option);
    }

    public Set<Config.OptionPriority> getPriorities(Config.Option<?> option) {
        Map map = this.mOptions.get(option);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    public Set<Config.Option<?>> listOptions() {
        return Collections.unmodifiableSet(this.mOptions.keySet());
    }

    public <ValueT> ValueT retrieveOption(Config.Option<ValueT> option) {
        Map map = this.mOptions.get(option);
        if (map != null) {
            return map.get((Config.OptionPriority) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + option);
    }

    public <ValueT> ValueT retrieveOptionWithPriority(Config.Option<ValueT> option, Config.OptionPriority optionPriority) {
        Map map = this.mOptions.get(option);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + option);
        } else if (map.containsKey(optionPriority)) {
            return map.get(optionPriority);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + option + " with priority=" + optionPriority);
        }
    }

    public <ValueT> ValueT retrieveOption(Config.Option<ValueT> option, ValueT valuet) {
        try {
            return retrieveOption(option);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }
}
