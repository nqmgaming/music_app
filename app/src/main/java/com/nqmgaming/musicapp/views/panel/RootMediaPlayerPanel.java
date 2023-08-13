package com.nqmgaming.musicapp.views.panel;

import android.content.Context;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;

import com.nqmgaming.musicapp.R;
import com.realgear.multislidinguppanel.BasePanelView;
import com.realgear.multislidinguppanel.MultiSlidingUpPanelLayout;

public class RootMediaPlayerPanel extends BasePanelView {
    public RootMediaPlayerPanel(@NonNull Context context, MultiSlidingUpPanelLayout panelLayout) {
        super(context, panelLayout);

        getContext().setTheme(R.style.Theme_MusicApp);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_root_mediaplayer, this, true);
    }

    @Override
    public void onCreateView() {
        // The panel will be collapsed on start of application
        this.setPanelState(MultiSlidingUpPanelLayout.COLLAPSED);

        // The panel will slide up and down
        this.setSlideDirection(MultiSlidingUpPanelLayout.SLIDE_VERTICAL);

        // Sets the panels peak height
        this.setPeakHeight(getResources().getDimensionPixelSize(R.dimen.mediaplayer_bar_height));
    }

    @Override
    public void onBindView() {

    }

    @Override
    public void onPanelStateChanged(int panelSate) {

    }
}
