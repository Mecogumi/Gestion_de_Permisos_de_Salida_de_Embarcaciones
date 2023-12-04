package org.littleboat.View;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;


public class TableButtonsRenderer extends DefaultTableCellRenderer {
    
    private final ButtonsType buttonsType;

    public TableButtonsRenderer(ButtonsType buttonsType) {
        this.buttonsType = buttonsType;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,int row, int column) {

        JPanel panel;
        switch (buttonsType) {
            case BUTTONS_SHIP:
                panel = new ShipTableButtons();
                break;
            case BUTTONS_OWNER:
                panel = new OwnerTableButtons();
                break;
            case BUTTONS_CREWMATE:
                panel = new CrewmatesTable();
                break;
            default:
                throw new IllegalArgumentException("Invalid component type");
        }

        setPanelBackground(panel, isSelected);
        return panel;
    }

    private void setPanelBackground(JPanel panel, boolean isSelected) {
        boolean isValidPanel = panel instanceof ShipTableButtons || panel instanceof OwnerTableButtons||panel instanceof CrewmatesTable;
        if (isValidPanel==true) {
            if (!isSelected) {
                panel.setBackground(Color.WHITE);
            }else
                panel.setBackground(getBackground());
        }else{
            System.out.println("el panel no es uno que sea valido");
        }
    }
}
