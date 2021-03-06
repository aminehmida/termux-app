package com.termux.view;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

import com.termux.terminal.TerminalSession;

/**
 * Input and scale listener which may be set on a {@link TerminalView} through
 * {@link TerminalView#setOnKeyListener(TerminalKeyListener)}.
 * <p/>
 * TODO: Rename to TerminalViewClient.
 */
public interface TerminalKeyListener {

    /** Callback function on scale events according to {@link ScaleGestureDetector#getScaleFactor()}. */
    float onScale(float scale);

    /** On a single tap on the terminal if terminal mouse reporting not enabled. */
    void onSingleTapUp(MotionEvent e);

    boolean shouldBackButtonBeMappedToEscape();

    int getLeftKey();
    int getRightKey();
    int getUpKey();
    int getDownKey();
    int getPgUpKey();
    int getPgDownKey();
    int getTabKey();
    int getInsertKey();
    int getHomeKey();
    int getUderscoreKey();
    int getPipeKey();
    int getEscapeKey();
    int getHatKey();
    int getJmbBackKey();
    int getJmbForwardKey();
    int getEmacsXKey();
    int getShowVolKey();
    int getWriteModeKey();

    void copyModeChanged(boolean copyMode);

    boolean onKeyDown(int keyCode, KeyEvent e, TerminalSession session);

    boolean onKeyUp(int keyCode, KeyEvent e);

    boolean readControlKey();

    boolean readAltKey();

    boolean onCodePoint(int codePoint, boolean ctrlDown, TerminalSession session);

}
