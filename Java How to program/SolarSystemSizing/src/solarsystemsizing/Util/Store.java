package solarsystemsizing.Util;

import solarsystemsizing.Model.*;
import java.util.ArrayList;

public class Store {
    public static ArrayList<Panel> getPanels(){
        ArrayList<Panel> panels = new ArrayList<>();
        panels.add(new Panel(100, 12, 18));
        panels.add(new Panel(110, 12, 18));
        panels.add(new Panel(150, 12, 18));
        panels.add(new Panel(200, 24, 36));
        panels.add(new Panel(220, 24, 36));
        panels.add(new Panel(275, 24, 36));
        panels.add(new Panel(300, 24, 36));
        panels.add(new Panel(350, 24, 36));
        return panels;
    }
}
