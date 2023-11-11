package org.example.structural.proxypattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    List<String> bannedSites = new ArrayList<>();

    @Override
    public void connectTo(String serverhost) throws Exception {
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");

        if(bannedSites.contains(serverhost.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverhost);
    }

}
