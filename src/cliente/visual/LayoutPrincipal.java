/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.visual;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LayoutPrincipal extends JFrame
{
    private Container container = getContentPane();
    private JPanel panel;
    private JPanel panelPrincipal;
    
    public LayoutPrincipal()
    {
        super("Help Me");
        panelPrincipal = new PanelPrincipal();
        panel = new JPanel(new BorderLayout());
        panel.add(panelPrincipal, BorderLayout.CENTER);
        container.add(panel);
        
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
