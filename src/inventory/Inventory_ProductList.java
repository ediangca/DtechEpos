/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import inventory.form.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Inventory_ProductList extends javax.swing.JPanel {

    /**
     * Creates new form Inventory_ProductList
     */
    public DefaultTableModel dtm_product;

    public Inventory_Mainframe inventory_mainframe;
    Inventory_ProductCategoryForm inventory_productcategoryform;
    Inventory_ProductUnitForm inventory_productunitform;
    Inventory_ProductDiscountScheme inventory_productdiscountscheme;
    
    Inventory_ProductForm inventory_productform;
    Inventory_ProductCostForm inventory_productcostform;
    Inventory_ProductPriceForm inventory_productpriceform;

    public Connection connection = null;
    Statement statement;
    ResultSet result;

    public Inventory_ProductList(Inventory_Mainframe inventory_mainframe) {
        initComponents();
        this.inventory_mainframe = inventory_mainframe;
        this.connection = inventory_mainframe.connection;
        dtm_product = (DefaultTableModel) jTable1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        but_new = new javax.swing.JButton();
        but_edit = new javax.swing.JButton();
        field_search = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        but_unit = new javax.swing.JButton();
        but_category = new javax.swing.JButton();
        but_discountscheme = new javax.swing.JButton();

        jButton4.setText("SHOW MORE FILTER");

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setOpaque(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(204, 204, 0)));
        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("LIST OF PRODUCT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setOpaque(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product No.", "Short Description", "Type", "Category", "Qty", "IsActive", "Created", "Updated"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(250);
            jTable1.getColumnModel().getColumn(2).setMinWidth(70);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(3).setMinWidth(70);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(4).setMinWidth(50);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(5).setMinWidth(20);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(20);
            jTable1.getColumnModel().getColumn(6).setMinWidth(130);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(130);
            jTable1.getColumnModel().getColumn(7).setMinWidth(130);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(130);
        }
        jTable1.getTableHeader().setFont(new java.awt.Font("sansserif", 0, 10));

        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        but_new.setText("NEW");
        but_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_newActionPerformed(evt);
            }
        });

        but_edit.setText("EDIT");
        but_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_editActionPerformed(evt);
            }
        });

        field_search.setText("Search here. .");
        field_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                field_searchFocusLost(evt);
            }
        });
        field_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(field_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_new, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(but_edit)
                        .addComponent(but_new)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Properties", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N
        jPanel5.setOpaque(false);

        jButton5.setText("Item Cost");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Item Price");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Print All");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jButton8.setContentAreaFilled(false);

        jButton10.setText("View");
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setText("Print");
        jButton12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jButton12.setContentAreaFilled(false);

        but_unit.setText("Unit");
        but_unit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        but_unit.setContentAreaFilled(false);
        but_unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_unitActionPerformed(evt);
            }
        });

        but_category.setText("Category");
        but_category.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        but_category.setContentAreaFilled(false);
        but_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_categoryActionPerformed(evt);
            }
        });

        but_discountscheme.setText("Discount Scheme");
        but_discountscheme.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        but_discountscheme.setContentAreaFilled(false);
        but_discountscheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_discountschemeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but_unit, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(but_category, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(but_discountscheme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but_category, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_discountscheme, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void but_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_newActionPerformed
        // TODO add your handling code here:
        inventory_productform = new Inventory_ProductForm(inventory_mainframe, true, this);
        inventory_productform.setVisible(true);
    }//GEN-LAST:event_but_newActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() > -1 && jTable1.getSelectedColumn() > -1) {
            jTable1.setToolTipText(jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void but_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_editActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() < 0) {
            JOptionPane.showConfirmDialog(this, "Please select a product first on the table to edit.", "D-TECH INFORMATION", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String Product_No = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        inventory_productform = new Inventory_ProductForm(inventory_mainframe, true, this, Product_No);
        inventory_productform.setVisible(true);
    }//GEN-LAST:event_but_editActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() < 0) {
            JOptionPane.showConfirmDialog(this, "Please select a product first on the table to edit.", "D-TECH INFORMATION", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String Product_No = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        inventory_productform = new Inventory_ProductForm(inventory_mainframe, true, this, Product_No);
        inventory_productform.setEnableallComponent(false);
        inventory_productform.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() < 0) {
            inventory_productcostform = new Inventory_ProductCostForm(inventory_mainframe, true, this);
            inventory_productcostform.showQuery("SELECT * FROM productcostlist p;");
            inventory_productcostform.setVisible(true);
        } else {
            String Product_No = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();

            inventory_productcostform = new Inventory_ProductCostForm(inventory_mainframe, true, this, Product_No);
            inventory_productcostform.showQuery("SELECT * FROM productcostlist p where product = "
                    + "(select concat(`p`.`Product_No.`,' - ',`p`.`Short_Description`) AS `concat(p.``product_no.``,' - ',p.short_description)` "
                    + "from `product` `p` where (`p`.`Product_No.` = '" + Product_No + "'));");
            inventory_productcostform.setVisible(true);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() < 0) {
            inventory_productpriceform = new Inventory_ProductPriceForm(inventory_mainframe, true, this);
            inventory_productpriceform.showQuery("SELECT * FROM productpricelist p;");
            inventory_productpriceform.setVisible(true);
        } else {
            String Product_No = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();

            inventory_productpriceform = new Inventory_ProductPriceForm(inventory_mainframe, true, this, Product_No);
            inventory_productpriceform.showQuery("SELECT * FROM productpricelist p where product = "
                    + "(select concat(`p`.`Product_No.`,' - ',`p`.`Short_Description`) AS `concat(p.``product_no.``,' - ',p.short_description)` "
                    + "from `product` `p` where (`p`.`Product_No.` = '" + Product_No + "'));");
            inventory_productpriceform.setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void but_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_unitActionPerformed
        // TODO add your handling code here:
        inventory_productunitform = new Inventory_ProductUnitForm(inventory_mainframe, true, this, connection);
        inventory_productunitform.setVisible(true);
    }//GEN-LAST:event_but_unitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() < 0) {
            JOptionPane.showConfirmDialog(this, "Please select a product first on the table to delete.", "D-TECH INFORMATION", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int x = JOptionPane.showConfirmDialog(this, "Do you really want to delete the selected product?", "CONFIRMATION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (x == JOptionPane.YES_OPTION) {
            try {
                statement = connection.createStatement();
                statement.executeUpdate("update `product` set cancelflag = 1, isactive = 0 where `Product_No.` ='" + jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "'");

                JOptionPane.showConfirmDialog(this, "Product Successfully Deleted!", "INFORMATION", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);

                statement.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void but_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_categoryActionPerformed
        // TODO add your handling code here:
        inventory_productcategoryform = new Inventory_ProductCategoryForm(inventory_mainframe, true, this, connection);
        inventory_productcategoryform.setVisible(true);
    }//GEN-LAST:event_but_categoryActionPerformed

    private void field_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_searchFocusGained
        // TODO add your handling code here:
        if (field_search.getText().equalsIgnoreCase("Search here. .")) {
            field_search.setText(null);
        }
    }//GEN-LAST:event_field_searchFocusGained

    private void field_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_searchFocusLost
        // TODO add your handling code here:
        if (field_search.getText().isEmpty()) {
            field_search.setText("Search here. .");
        }
    }//GEN-LAST:event_field_searchFocusLost

    private void field_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_searchKeyReleased
        // TODO add your handling code here:
        showQuery("SELECT * FROM productlist p where `product_no.` like '%" + field_search.getText() + "%' || `short_description` like '%" + field_search.getText() + "%'");
    }//GEN-LAST:event_field_searchKeyReleased

    private void but_discountschemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_discountschemeActionPerformed
        // TODO add your handling code here:
        inventory_productdiscountscheme = new Inventory_ProductDiscountScheme(inventory_mainframe, true, this, connection);
        inventory_productdiscountscheme.setVisible(true);
    }//GEN-LAST:event_but_discountschemeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_category;
    private javax.swing.JButton but_discountscheme;
    private javax.swing.JButton but_edit;
    private javax.swing.JButton but_new;
    private javax.swing.JButton but_unit;
    private javax.swing.JTextField field_search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void resettable() {
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Product No.", "Short Description", "Type", "Category", "Qty", "IsActive", "Created", "Updated"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(250);
            jTable1.getColumnModel().getColumn(2).setMinWidth(70);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(3).setMinWidth(70);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(4).setMinWidth(50);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(5).setMinWidth(20);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(20);
            jTable1.getColumnModel().getColumn(6).setMinWidth(130);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(130);
            jTable1.getColumnModel().getColumn(7).setMinWidth(130);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(130);
        }
        dtm_product = (DefaultTableModel) jTable1.getModel();
    }

    public void showQuery(String query) {
        resettable();
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while (result.next()) {
//                Product_No., Short_Description, Type, Category, Quantity, isActive, Datetime_Created, Datetime_Updated
                dtm_product.addRow(new Object[]{result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4),
                    result.getDouble(5),
                    result.getBoolean(6),
                    result.getString(7),
                    result.getString(8)});
            }
            statement.close();
            result.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}