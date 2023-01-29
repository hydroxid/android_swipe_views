package kanban;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem (int position) {
        Fragment fragment = null;
        if (position == 0)
            fragment = new BacklogFragment();
        else if (position == 1)
            fragment = new TodoFragment();
        else if (position == 2)
            fragment = new InprogressFragment();
        else if (position == 3)
            fragment = new CompleteFragment();
        return fragment;
    }

    @Override
    public int getCount()
    {
        return 4;
    }

    @Override
    public CharSequence getPageTitle (int position)
    {
        String title = null;
        if (position == 0)
            title = "Backlog";
        else if (position == 1)
            title = "Todo";
        else if (position == 2)
            title = "Inprogress";
        else if (position == 3)
            title = "Complete";
        return title;
    }
}
