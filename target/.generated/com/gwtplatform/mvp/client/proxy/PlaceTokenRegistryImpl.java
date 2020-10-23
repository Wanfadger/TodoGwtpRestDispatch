package com.gwtplatform.mvp.client.proxy;

import java.util.Set;
import java.util.HashSet;
import com.gwtplatform.mvp.shared.proxy.PlaceTokenRegistry;

public class PlaceTokenRegistryImpl implements PlaceTokenRegistry {
    public Set<String> getAllPlaceTokens() {
        Set<String> placeTokens = new HashSet<String>();

        placeTokens.add("/home");

        return placeTokens;
    }
}
