/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import javax.swing.RootPaneContainer;

/**
 *
 * @author Asus
 */
public class FRMQuanLi extends javax.swing.JFrame{

    private FRMQuanLiDatPhong datPhong;
    private FRMNhanVien nhanVien;
    private FRMKhachHang khachHang;
    private FRMDangNhap dangNhap;
    private FRMQuanLiThongKe thongKe;
    private FRMQuanLiMatHang matHang;
    private FRMQuanLiPhong phong;

    /**
     * Creates new form FRMQuanLiNhanVien
     */
    public FRMQuanLi() {
        initComponents();
        jButtonDatPhong.setBackground(new Color(255, 0, 255));
        FRMQuanLiDatPhong datPhong = new FRMQuanLiDatPhong();
        setTitle("Quản lí đặt phòng");
        jLayeredPane1.add(datPhong.getFRMDDP());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonThanhToan = new javax.swing.JButton();
        jButtonKhachHang = new javax.swing.JButton();
        jButtonNhanVien = new javax.swing.JButton();
        jButtonMatHang = new javax.swing.JButton();
        jButtonThongKe = new javax.swing.JButton();
        jButtonPhong = new javax.swing.JButton();
        jButtonDatPhong = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonDangXuat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelNgay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonThanhToan.setText("Quản lí thanh toán ");
        jButtonThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThanhToanActionPerformed(evt);
            }
        });

        jButtonKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonKhachHang.setText("Quản lí khách hàng");
        jButtonKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKhachHangActionPerformed(evt);
            }
        });

        jButtonNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonNhanVien.setText("Quản lí nhân viên");
        jButtonNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhanVienActionPerformed(evt);
            }
        });

        jButtonMatHang.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonMatHang.setText("Quản lí mặt hàng");
        jButtonMatHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatHangActionPerformed(evt);
            }
        });

        jButtonThongKe.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonThongKe.setText("Quản lí thống kê");
        jButtonThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongKeActionPerformed(evt);
            }
        });

        jButtonPhong.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonPhong.setText("Quản lí phòng");
        jButtonPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPhongActionPerformed(evt);
            }
        });

        jButtonDatPhong.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonDatPhong.setText("Quản lí đặt phòng");
        jButtonDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDatPhongActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(152, 69, 173));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\PhatTrienUngDung\\baiTapLonCKPTUD\\iCon\\logo.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jButtonDangXuat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButtonDangXuat.setForeground(new java.awt.Color(255, 0, 51));
        jButtonDangXuat.setText("ĐĂNG XUẤT");
        jButtonDangXuat.setPreferredSize(new java.awt.Dimension(112, 50));
        jButtonDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangXuatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ngày :");

        jLabelNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNgay.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNgay.setText("45 : 56 : 56");
        jLabelNgay.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên: Nguyễn Hoàng Thái");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã NV");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButtonDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNgay))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1202, 422));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jButtonThanhToan)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonKhachHang)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangXuatActionPerformed
        dangNhap = new FRMDangNhap();
        dangNhap.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonDangXuatActionPerformed
    
    public void xoaMauButton(){
        jButtonDatPhong.setBackground(null);
        jButtonKhachHang.setBackground(null);
        jButtonNhanVien.setBackground(null);
        jButtonThongKe.setBackground(null);
        jButtonMatHang.setBackground(null);
        jButtonPhong.setBackground(null);
        jButtonThanhToan.setBackground(null);
    }
    private void jButtonDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDatPhongActionPerformed
        // TODO add your handling code here:
        xoaMauButton();
        jLayeredPane1.removeAll();
        jButtonDatPhong.setBackground(new Color(255, 0, 255));
        FRMQuanLiDatPhong datPhong = new FRMQuanLiDatPhong();
        setTitle("Quản lí đặt phòng");
        jLayeredPane1.add(datPhong.getFRMDDP());
    }//GEN-LAST:event_jButtonDatPhongActionPerformed

    private void jButtonThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThanhToanActionPerformed
        // TODO add your handling code here:
        xoaMauButton();
        jLayeredPane1.removeAll();
        jButtonThanhToan.setBackground(new Color(255,0,255
        ));
        setTitle("Quản lí nhân viên");
        FRMThanhToan thanhToan = new FRMThanhToan();
        jLayeredPane1.add(thanhToan.getFRMThanhToan());
    }//GEN-LAST:event_jButtonThanhToanActionPerformed

    private void jButtonNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNhanVienActionPerformed
        // TODO add your handling code here:
        xoaMauButton();
        jLayeredPane1.removeAll();
        jButtonNhanVien.setBackground(new Color(255,0,255));
        setTitle("Quản lí nhân viên");
        nhanVien = new FRMNhanVien();
        jLayeredPane1.add(nhanVien.getNhanVien());
    }//GEN-LAST:event_jButtonNhanVienActionPerformed
    
    private void jButtonKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKhachHangActionPerformed
        // TODO add your handling code here:
         xoaMauButton();
         jLayeredPane1.removeAll();
         jButtonKhachHang.setBackground(new Color(255, 0, 255));
         setTitle("Quản lí khách hàng");
         khachHang = new FRMKhachHang();
         jLayeredPane1.add(khachHang.getFRMKhachHang());
    }//GEN-LAST:event_jButtonKhachHangActionPerformed

    private void jButtonThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongKeActionPerformed
        // TODO add your handling code here:
        xoaMauButton();
        jLayeredPane1.removeAll();
        jButtonThongKe.setBackground(new Color(255, 0, 255));
        setTitle("Quản lí thống kê");
        thongKe = new FRMQuanLiThongKe();
        jLayeredPane1.add(thongKe.getFRMThongKe());
    }//GEN-LAST:event_jButtonThongKeActionPerformed

    private void jButtonMatHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatHangActionPerformed
        // TODO add your handling code here:
        xoaMauButton();
        jLayeredPane1.removeAll();
        jButtonMatHang.setBackground(new Color(255, 0, 255));
        setTitle("Quản lí mặt hàng");
        matHang = new FRMQuanLiMatHang();
        jLayeredPane1.add(matHang.getFRMMatHang());
    }//GEN-LAST:event_jButtonMatHangActionPerformed

    private void jButtonPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPhongActionPerformed
        // TODO add your handling code here:
         xoaMauButton();
        jLayeredPane1.removeAll();
        jButtonPhong.setBackground(new Color(255, 0, 255));
        setTitle("Quản lí phòng");
        phong = new FRMQuanLiPhong();
        jLayeredPane1.add(phong.getFRMQuanLiPhong());
    }//GEN-LAST:event_jButtonPhongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMQuanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new FRMQuanLi().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDangXuat;
    private javax.swing.JButton jButtonDatPhong;
    private javax.swing.JButton jButtonKhachHang;
    private javax.swing.JButton jButtonMatHang;
    private javax.swing.JButton jButtonNhanVien;
    private javax.swing.JButton jButtonPhong;
    private javax.swing.JButton jButtonThanhToan;
    private javax.swing.JButton jButtonThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNgay;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    
}
