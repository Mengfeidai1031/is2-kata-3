package software.ulpgc.apps.windows;

import software.ulpgc.architecture.control.ToggleStadisticCommand;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.put("next", new ToggleStadisticCommand(new CustomBarchartLoader(), mainFrame.getBarchartDisplay()));
        mainFrame.setVisible(true);
    }
}
