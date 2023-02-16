package com.demo.superapppoc;

import android.app.Application;

import io.ionic.liveupdates.LiveUpdate;
import io.ionic.portals.PortalManager;

public class SuperApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PortalManager.register("eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIzMTc3MDE4In0.LnTrNncc-HyBkYxeJIf0NNntxhx8dFSx6Exh9Zc92Udj84rH0v2MLmuzg34nVDe2T2ujqu8ZJUf32IXg-_vKAoCIgNRgsj4J9ADPrqzVKj7HyC7afOGWX49v4Nn5We2pfU--ccMy98mTl9zcRIjEydd03nE9X4mwx1aAWITri4QrnfYXpzitxPyzsIA9M5NL-oickuy41TTXX1fwmyJdlTRg_g5oLNbz95F4CTOJc962zi909XAu-sf_ZFOk0gFlSZsKpWVAmDH47gB3S9zk8Viw_uDCumZ_mmH7KdhKm1pUGA7exnHTR_1kUk5CrFIWS_aT37R46OS7aq0gH8E4Cw");
        PortalManager.newPortal("MiniAppTwo")
                .setLiveUpdateConfig(this, new LiveUpdate("98896a02"))
                .create();

        PortalManager.newPortal("MiniAppSix")
                .setLiveUpdateConfig(this, new LiveUpdate("a73ce9e3"))
                .create();

        PortalManager.newPortal("MiniAppSeven")
                .setStartDir("webapp")
                .setLiveUpdateConfig(this, new LiveUpdate("4f877d32"))
                .create();
    }
}
