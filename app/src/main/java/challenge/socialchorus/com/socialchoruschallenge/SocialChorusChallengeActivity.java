package challenge.socialchorus.com.socialchoruschallenge;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import challenge.socialchorus.com.socialchoruschallenge.fragments.UnoFragment;

public class SocialChorusChallengeActivity extends AppCompatActivity {
    private SwipeLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_chorus_challenge);
        frameLayout = (SwipeLayout) findViewById(R.id.activity_property_animation);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.activity_property_animation, new UnoFragment(), "First").commit();

    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            if (getSupportFragmentManager().getBackStackEntryCount() == 2) {
                frameLayout.animate().xBy(-0.5f * frameLayout.getTranslationX()).setDuration(5000).start();
                getSupportFragmentManager().popBackStack();
            } else if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
                frameLayout.animate().xBy(-1.0f * frameLayout.getTranslationX()).setDuration(5000).start();
                getSupportFragmentManager().popBackStack();

            }

        }
    }
}

