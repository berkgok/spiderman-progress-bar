package the.amazing.spidermanprogressbar;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SpidermanProgressBarLafManagerListener implements LafManagerListener {

    public SpidermanProgressBarLafManagerListener() {
        updateSpidermanProgressBarUI();
    }

    @Override
    public void lookAndFeelChanged(@NotNull LafManager lafManager) {
        updateSpidermanProgressBarUI();
    }

    private static void updateSpidermanProgressBarUI() {
        UIManager.put("ProgressBarUI", SpidermanProgressBarUi.class.getName());
        UIManager.getDefaults().put(SpidermanProgressBarUi.class.getName(), SpidermanProgressBarUi.class);
    }
}
