package com.github.paolorotolo.appintroexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroViewPager;

public class DisableSwipeIntro extends AppIntro2 {
    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(SampleSlide.newInstance(R.layout.intro_2_disable));
        addSlide(SampleSlide.newInstance(R.layout.intro2_2_disable));
        addSlide(SampleSlide.newInstance(R.layout.intro3_2_disable));
    }

    private void loadMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
    }

    public void getStarted(View v) {
        loadMainActivity();
    }

    public void toggleNextPageSwipeLock(View v) {
        AppIntroViewPager pager = getPager();
        boolean pagingState = pager.isNextPagingEnabled();
        pagingState = !pagingState;
        setNextPageSwipeLock(pagingState);
    }

    public void toggleSwipeLock(View v) {
        AppIntroViewPager pager = getPager();
        boolean pagingState = pager.isPagingEnabled();
        pagingState = !pagingState;
        setSwipeLock(pagingState);
    }

    public void toggleProgressButton(View v) {
        boolean progressButtonState = isProgressButtonEnabled();
        progressButtonState = !progressButtonState;
        setProgressButtonEnabled(progressButtonState);
    }
}
