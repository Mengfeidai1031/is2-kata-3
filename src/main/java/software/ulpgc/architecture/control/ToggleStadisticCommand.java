package software.ulpgc.architecture.control;

import org.jfree.chart.JFreeChart;
import software.ulpgc.apps.windows.CustomBarchartLoader;
import software.ulpgc.apps.windows.JFreeBarchartDisplay;

import javax.swing.*;

public class ToggleStadisticCommand implements Command {
    private final CustomBarchartLoader loader;
    private final JFreeBarchartDisplay display;

    public ToggleStadisticCommand(CustomBarchartLoader loader, JFreeBarchartDisplay display) {
        this.loader = loader;
        this.display = display;
    }

    private int i = 0;

    @Override
    public void execute() {
        display.show(loader.loadBarchart(i++%2));
    }
}
