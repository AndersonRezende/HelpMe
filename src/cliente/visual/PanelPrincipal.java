/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.visual;

import cliente.enumeracao.EnumTiposChamados;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelPrincipal extends JPanel implements ActionListener, ItemListener
{
    private ArrayList<String> tiposChamados;
    private JPanel panelPrincipal;
    private JPanel panelOpcoesChamados;
    private JPanel panelDetalhesChamados[];
    
    private JTextField textFieldDetalhesChamados[];
    private JLabel labelDetalhesChamados[];
    private JLabel labelTitulo;
    
    private JCheckBox checkBoxOpcoes[];
    
    private JButton buttonEnviar;
    
    private Font fontLabel;
    
    
    
    public PanelPrincipal()
    {
        panelPrincipal = this;
        panelPrincipal.setLayout(new BorderLayout());
        
        fontLabel = new Font(Font.SERIF, Font.BOLD, 25);
        labelTitulo = new JLabel("SELECIONE AS OPÇÕES DESEJADAS");
        labelTitulo.setFont(fontLabel);
        labelTitulo.setHorizontalAlignment(JLabel.CENTER);
        
        
        tiposChamados = new ArrayList();
        for(EnumTiposChamados opcao : EnumTiposChamados.values())
        {   tiposChamados.add(opcao.getOpcaoParaMenu());   }
        
        
        panelOpcoesChamados = new JPanel(new GridLayout(tiposChamados.size(), 1));
        panelOpcoesChamados.setBorder(BorderFactory.createTitledBorder("Tipos de chamados"));
        
        panelDetalhesChamados = new JPanel[tiposChamados.size()];
        labelDetalhesChamados = new JLabel[tiposChamados.size()];
        textFieldDetalhesChamados = new JTextField[tiposChamados.size()];
        checkBoxOpcoes = new JCheckBox[tiposChamados.size()];
        
        for(int index = 0; index < tiposChamados.size(); index++)
        {
            panelDetalhesChamados[index] = new JPanel(new GridLayout(2,2));
            panelDetalhesChamados[index].setBorder(BorderFactory.createLineBorder(Color.black));
            
            checkBoxOpcoes[index] = new JCheckBox(tiposChamados.get(index));
            checkBoxOpcoes[index].addItemListener(this);
            labelDetalhesChamados[index] = new JLabel("Informe detalhes sobre o problema:");
            textFieldDetalhesChamados[index] = new JTextField(25);
            labelDetalhesChamados[index].setVisible(false);
            textFieldDetalhesChamados[index].setVisible(false);
            
            panelDetalhesChamados[index].add(checkBoxOpcoes[index]);
            panelDetalhesChamados[index].add(new JLabel(""));
            panelDetalhesChamados[index].add(labelDetalhesChamados[index]);
            panelDetalhesChamados[index].add(textFieldDetalhesChamados[index]);
            
            panelOpcoesChamados.add(panelDetalhesChamados[index]);
        }
        
        buttonEnviar = new JButton("ABRIR CHAMADO");
        buttonEnviar.setFont(new Font(Font.SERIF, Font.BOLD, 15));
        buttonEnviar.addActionListener(this);
        
        panelPrincipal.add(panelOpcoesChamados, BorderLayout.CENTER);
        panelPrincipal.add(buttonEnviar, BorderLayout.SOUTH);
        panelPrincipal.add(labelTitulo, BorderLayout.NORTH);
        panelPrincipal.add(new JLabel("                                     "), BorderLayout.WEST);
        panelPrincipal.add(new JLabel("                                     "), BorderLayout.EAST);
    }

    
    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        for(int index = 0; index < checkBoxOpcoes.length; index++)
        {
            if(e.getSource() == checkBoxOpcoes[index] && e.getStateChange() == ItemEvent.SELECTED)
            {
                labelDetalhesChamados[index].setVisible(true);
                textFieldDetalhesChamados[index].setVisible(true);
            }
            if(e.getSource() == checkBoxOpcoes[index] && e.getStateChange() == ItemEvent.DESELECTED)
            {
                labelDetalhesChamados[index].setVisible(false);
                textFieldDetalhesChamados[index].setVisible(false);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        for(int index = 0; index < checkBoxOpcoes.length; index++)
        {
            if(checkBoxOpcoes[index].isSelected() == true)
            {
                //Cria um objeto mensagem e passa os parametros e depois envia
            }
        }
    }
}
