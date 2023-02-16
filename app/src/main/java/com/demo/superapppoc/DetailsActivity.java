package com.demo.superapppoc;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.superapppoc.fragments.Addepar;
import com.demo.superapppoc.fragments.BlackRock;
import com.demo.superapppoc.fragments.Metrix;

import io.ionic.portals.PortalView;

public class DetailsActivity extends AppCompatActivity {

    public static final String PORTAL_ID = "portalId";
    PortalView portalView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        switch (getIntent().getExtras().getInt(PORTAL_ID)) {
            case 0:
            case 3:
                loadFragment(new Addepar());
                break;
            case 1:
            case 4:
                loadFragment(new Metrix());
                break;
            case 2:
            case 5:
                loadFragment(new BlackRock());
                break;
        }
    }

    public int findUnusedId() {
        int fID = 0;
        while (findViewById(++fID) != null) ;
        return fID;
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}