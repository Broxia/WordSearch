/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.WordSearchManager;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.JFileChooser;

/**
 *
 * @author DennisList
 */
public class WordSearchForm extends javax.swing.JFrame
{

    private DefaultListModel listModel = new DefaultListModel();
    private WordSearchManager wsm;
    private String option;

    /**
     * Creates new form WordSearchForm
     */
    public WordSearchForm()
    {
        wsm = new WordSearchManager();
        initComponents();
        listAll();
        counter();
        setLocationRelativeTo(null);
        lstResults.setModel(listModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btngrpSearchType = new javax.swing.ButtonGroup();
        lblQuery = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstResults = new javax.swing.JList();
        pnlSearchType = new javax.swing.JPanel();
        rbtnBeginsWith = new javax.swing.JRadioButton();
        rbtnContains = new javax.swing.JRadioButton();
        rbtnEndswith = new javax.swing.JRadioButton();
        rbtnExact = new javax.swing.JRadioButton();
        pnlStyle = new javax.swing.JPanel();
        chkbxCaseSensitive = new javax.swing.JCheckBox();
        pnlLimitation = new javax.swing.JPanel();
        cmbbxLimitation = new javax.swing.JComboBox();
        btnClose = new javax.swing.JButton();
        lblCount = new javax.swing.JLabel();
        lblCountDone = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mniNewFile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WordSearch");

        lblQuery.setText("Query:");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClearActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchActionPerformed(evt);
            }
        });

        lblResult.setText("Result:");

        jScrollPane1.setViewportView(lstResults);

        pnlSearchType.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search Type"));
        pnlSearchType.setName(""); // NOI18N

        btngrpSearchType.add(rbtnBeginsWith);
        rbtnBeginsWith.setSelected(true);
        rbtnBeginsWith.setText("Begins with");

        btngrpSearchType.add(rbtnContains);
        rbtnContains.setText("Contains");

        btngrpSearchType.add(rbtnEndswith);
        rbtnEndswith.setText("Ends with");

        btngrpSearchType.add(rbtnExact);
        rbtnExact.setText("Exact");

        org.jdesktop.layout.GroupLayout pnlSearchTypeLayout = new org.jdesktop.layout.GroupLayout(pnlSearchType);
        pnlSearchType.setLayout(pnlSearchTypeLayout);
        pnlSearchTypeLayout.setHorizontalGroup(
            pnlSearchTypeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlSearchTypeLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(pnlSearchTypeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(rbtnBeginsWith)
                    .add(rbtnContains)
                    .add(rbtnEndswith)
                    .add(rbtnExact))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSearchTypeLayout.setVerticalGroup(
            pnlSearchTypeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlSearchTypeLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(rbtnBeginsWith)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rbtnContains)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rbtnEndswith)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rbtnExact)
                .addContainerGap())
        );

        pnlStyle.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Style"));

        chkbxCaseSensitive.setText("Case sensitive");
        chkbxCaseSensitive.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chkbxCaseSensitiveActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlStyleLayout = new org.jdesktop.layout.GroupLayout(pnlStyle);
        pnlStyle.setLayout(pnlStyleLayout);
        pnlStyleLayout.setHorizontalGroup(
            pnlStyleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlStyleLayout.createSequentialGroup()
                .add(17, 17, 17)
                .add(chkbxCaseSensitive)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStyleLayout.setVerticalGroup(
            pnlStyleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlStyleLayout.createSequentialGroup()
                .addContainerGap()
                .add(chkbxCaseSensitive)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlLimitation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Limitation"));

        cmbbxLimitation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "10", "20", "50", "100" }));

        org.jdesktop.layout.GroupLayout pnlLimitationLayout = new org.jdesktop.layout.GroupLayout(pnlLimitation);
        pnlLimitation.setLayout(pnlLimitationLayout);
        pnlLimitationLayout.setHorizontalGroup(
            pnlLimitationLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlLimitationLayout.createSequentialGroup()
                .add(23, 23, 23)
                .add(cmbbxLimitation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLimitationLayout.setVerticalGroup(
            pnlLimitationLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlLimitationLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(cmbbxLimitation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseActionPerformed(evt);
            }
        });

        lblCount.setText("Count:");

        mnFile.setText("File");

        mniNewFile.setIcon(new javax.swing.ImageIcon("D:\\Dropbox\\Netbeans projects\\WordSearch\\WordSearch\\Files-icon.png")); // NOI18N
        mniNewFile.setText("New file");
        mniNewFile.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mniNewFileActionPerformed(evt);
            }
        });
        mnFile.add(mniNewFile);

        jMenuBar1.add(mnFile);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblQuery)
                    .add(lblResult))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(lblCount)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lblCountDone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 157, Short.MAX_VALUE)
                        .add(btnClose, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .add(txtSearch, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(pnlLimitation, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(btnSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnClear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(pnlSearchType, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(pnlStyle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblQuery)
                    .add(btnClear)
                    .add(btnSearch)
                    .add(txtSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblResult)
                    .add(layout.createSequentialGroup()
                        .add(pnlSearchType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pnlStyle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pnlLimitation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 302, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnClose)
                    .add(layout.createSequentialGroup()
                        .add(2, 2, 2)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(lblCount, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblCountDone, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkbxCaseSensitiveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkbxCaseSensitiveActionPerformed
    {//GEN-HEADEREND:event_chkbxCaseSensitiveActionPerformed
    }//GEN-LAST:event_chkbxCaseSensitiveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCloseActionPerformed
    {//GEN-HEADEREND:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchActionPerformed
    {//GEN-HEADEREND:event_btnSearchActionPerformed
        listModel.clear();
        if (rbtnBeginsWith.isSelected() == true)
        {
            beginsWith();
        }
        else if (rbtnContains.isSelected() == true)
        {
            contains();
        }
        else if (rbtnEndswith.isSelected() == true)
        {
            endsWith();
        }
        else if (rbtnExact.isSelected() == true)
        {
            exact();
        }
        counter();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
        txtSearch.setText("");
        listModel.clear();
        counter();
    }//GEN-LAST:event_btnClearActionPerformed

    private void mniNewFileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mniNewFileActionPerformed
    {//GEN-HEADEREND:event_mniNewFileActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(WordSearchForm.this);
        fc.get
    }//GEN-LAST:event_mniNewFileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
            //Do nothing
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new WordSearchForm().setVisible(true);
            }
        });
    }

    public void listAll()
    {
        try
        {
            for (Object list : wsm.getList())
            {
                listModel.addElement(list.toString());
            }
        }
        catch (Exception e)
        {
            System.out.println("ERROR - " + e.getMessage());
        }
    }

    public void counter()
    {
        int i = listModel.getSize();
        String nr = Integer.toString(i);
        lblCountDone.setText(nr);
    }

    private void beginsWith()
    {
        option = cmbbxLimitation.getSelectedItem().toString();
        try
        {
            ArrayList all = wsm.beginsWith(txtSearch.getText(), chkbxCaseSensitive.isSelected());

            switch (option)
            {
                case "None":
                    for (Object list : all)
                    {
                        listModel.addElement(list.toString());
                    }
                    break;
                case "10":
                    for (int i = 0; i < 10; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "20":
                    for (int i = 0; i < 20; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "50":
                    for (int i = 0; i < 50; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "100":
                    for (int i = 0; i < 100; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
            }
        }
        catch (Exception e)
        {
            System.out.println("ERROR - " + e.getMessage());
        }
    }

    private void contains()
    {
        option = cmbbxLimitation.getSelectedItem().toString();
        try
        {
            ArrayList all = wsm.contains(txtSearch.getText(), chkbxCaseSensitive.isSelected());

            switch (option)
            {
                case "None":
                    for (Object list : all)
                    {
                        listModel.addElement(list.toString());
                    }
                    break;
                case "10":
                    for (int i = 0; i < 10; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "20":
                    for (int i = 0; i < 20; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "50":
                    for (int i = 0; i < 50; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "100":
                    for (int i = 0; i < 100; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
            }
        }
        catch (Exception e)
        {
            System.out.println("ERROR - " + e.getMessage());
        }
    }

    private void endsWith()
    {
        option = cmbbxLimitation.getSelectedItem().toString();
        try
        {
            ArrayList all = wsm.endsWith(txtSearch.getText(), chkbxCaseSensitive.isSelected());

            switch (option)
            {
                case "None":
                    for (Object list : all)
                    {
                        listModel.addElement(list.toString());
                    }
                    break;
                case "10":
                    for (int i = 0; i < 10; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "20":
                    for (int i = 0; i < 20; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "50":
                    for (int i = 0; i < 50; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "100":
                    for (int i = 0; i < 100; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
            }
        }
        catch (Exception e)
        {
            System.out.println("ERROR - " + e.getMessage());
        }
    }

    private void exact()
    {
        option = cmbbxLimitation.getSelectedItem().toString();
        try
        {
            ArrayList all = wsm.exact(txtSearch.getText(), chkbxCaseSensitive.isSelected());

            switch (option)
            {
                case "None":
                    for (Object list : all)
                    {
                        listModel.addElement(list.toString());
                    }
                    break;
                case "10":
                    for (int i = 0; i < 10; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "20":
                    for (int i = 0; i < 20; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "50":
                    for (int i = 0; i < 50; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
                case "100":
                    for (int i = 0; i < 100; i++)
                    {
                        listModel.addElement(all.get(i));
                    }
                    break;
            }
        }
        catch (Exception e)
        {
            System.out.println("ERROR - " + e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup btngrpSearchType;
    private javax.swing.JCheckBox chkbxCaseSensitive;
    private javax.swing.JComboBox cmbbxLimitation;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblCountDone;
    private javax.swing.JLabel lblQuery;
    private javax.swing.JLabel lblResult;
    private javax.swing.JList lstResults;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem mniNewFile;
    private javax.swing.JPanel pnlLimitation;
    private javax.swing.JPanel pnlSearchType;
    private javax.swing.JPanel pnlStyle;
    private javax.swing.JRadioButton rbtnBeginsWith;
    private javax.swing.JRadioButton rbtnContains;
    private javax.swing.JRadioButton rbtnEndswith;
    private javax.swing.JRadioButton rbtnExact;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
