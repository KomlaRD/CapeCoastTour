package com.example.capecoasttour;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.capecoasttour.fragments.AccomodationFragment;
import com.example.capecoasttour.fragments.BeachFragment;
import com.example.capecoasttour.fragments.CastleFragment;
import com.example.capecoasttour.fragments.EateryFragment;
import com.example.capecoasttour.fragments.HomeFragment;

public class ViewPageAdapter extends FragmentStateAdapter {
    public ViewPageAdapter(@NonNull MainActivity fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new AccomodationFragment();
            case 2:
                return new BeachFragment();
            case 3:
                return new EateryFragment();
            case 4:
                return new CastleFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
