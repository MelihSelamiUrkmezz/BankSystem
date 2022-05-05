import DepartmanClasslari.CMudur;
import DepartmanClasslari.CMusteri;
import DepartmanClasslari.CTemsilci;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author melih
 */
public class GirisSayfasi extends javax.swing.JFrame {

 Veritabani_Konfigrasyon db=new Veritabani_Konfigrasyon();
    
    
    public GirisSayfasi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kullanici_adi = new javax.swing.JTextField();
        r_temsilci = new javax.swing.JRadioButton();
        r_mudur = new javax.swing.JRadioButton();
        r_musteri = new javax.swing.JRadioButton();
        giris_butonu = new javax.swing.JButton();
        l_mesaj = new javax.swing.JLabel();
        sifre = new javax.swing.JPasswordField();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 200, 0, 0));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("BANKA GİRİŞ PANELİ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(192, 192, 192))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kullanıcı Adı:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Şifre:");

        kullanici_adi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_adiActionPerformed(evt);
            }
        });

        r_temsilci.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(r_temsilci);
        r_temsilci.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r_temsilci.setForeground(new java.awt.Color(255, 255, 255));
        r_temsilci.setText("Temsilci");

        r_mudur.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(r_mudur);
        r_mudur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r_mudur.setForeground(new java.awt.Color(255, 255, 255));
        r_mudur.setText("Müdür");

        r_musteri.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(r_musteri);
        r_musteri.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r_musteri.setForeground(new java.awt.Color(255, 255, 255));
        r_musteri.setText("Müşteri");

        giris_butonu.setBackground(new java.awt.Color(51, 51, 51));
        giris_butonu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        giris_butonu.setForeground(new java.awt.Color(255, 255, 255));
        giris_butonu.setText("Giriş Yap");
        giris_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_butonuActionPerformed(evt);
            }
        });

        l_mesaj.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l_mesaj.setForeground(new java.awt.Color(255, 255, 255));

        image.setForeground(new java.awt.Color(255, 255, 255));
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/bank_128.png"))); // NOI18N
        image.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(image)
                            .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(r_musteri)
                .addGap(158, 158, 158)
                .addComponent(r_mudur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(r_temsilci)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(giris_butonu)
                .addGap(249, 249, 249))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_musteri)
                    .addComponent(r_mudur)
                    .addComponent(r_temsilci))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(giris_butonu)
                .addGap(18, 18, 18)
                .addComponent(l_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullanici_adiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_adiActionPerformed
        
    }//GEN-LAST:event_kullanici_adiActionPerformed

    private void giris_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_butonuActionPerformed
        l_mesaj.setText("");
        
        String k_adi=kullanici_adi.getText();
        String k_sifre=new String(sifre.getPassword());
        
        if(r_mudur.isSelected()){
            
            String m_sorgu="Select * from mudur where kullaniciadi = ? and sifre = ?";
            
            try {
                db.psqlquery=db.con.prepareStatement(m_sorgu);
                db.psqlquery.setString(1,k_adi);
                db.psqlquery.setString(2,k_sifre);
                ResultSet res=db.psqlquery.executeQuery();
                
                if(res.next()){
                    
                    int id=res.getInt("id");
                    String AdSoyad=res.getString("AdSoyad");
                    String telefon=res.getString("Telefon");
                    String tcno=res.getString("TcNo");
                    String adres=res.getString("Adres");
                    String email=res.getString("Eposta");
                    String k2_adi=res.getString("kullaniciadi");
                    String k2_sifre=res.getString("sifre");
                    
                    CMudur mudur=new CMudur(id, AdSoyad, telefon, tcno, adres, email, k2_adi, k_sifre);
                    
                    l_mesaj.setText("Müdür girişi başarılı.");
                    
                }
                else{
                    l_mesaj.setText("Hatalı kullanıcı adı veya şifre.");
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(GirisSayfasi.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        }
        else if(r_musteri.isSelected()){
            
            String mus_sorgu="Select * from musteri where kullaniciadi= ? and sifre = ?";
            
            try {
                db.psqlquery=db.con.prepareStatement(mus_sorgu);
                db.psqlquery.setString(1, k_adi);
                db.psqlquery.setString(2, k_sifre);
                ResultSet res=db.psqlquery.executeQuery();
                
                if(res.next()){
                    
                    int id=res.getInt("id");
                    String AdSoyad=res.getString("AdSoyad");
                    String telefon=res.getString("Telefon");
                    String tcno=res.getString("TcNo");
                    String adres=res.getString("Adres");
                    String email=res.getString("Eposta");
                    String k2_adi=res.getString("kullaniciadi");
                    String k2_sifre=res.getString("sifre");
                    
                    CMusteri musteri=new CMusteri(id, AdSoyad, telefon, tcno, adres, email, k2_adi, k_sifre);
                    
                    
                    
                    l_mesaj.setText("Müşteri girişi başarılı.");
                    
                }
                else{
                    
                    l_mesaj.setText("Hatalı kullanıcı adı veya şifre.");
                    
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(GirisSayfasi.class.getName()).log(Level.SEVERE, null, ex);
            }
               
        }        
        else if(r_temsilci.isSelected()){
            
            String t_sorgu="Select * from temsilci where kullaniciadi= ? and sifre = ?";
            
            try {
                db.psqlquery=db.con.prepareStatement(t_sorgu);
                db.psqlquery.setString(1,k_adi);
                db.psqlquery.setString(2,k_sifre);
                ResultSet res=db.psqlquery.executeQuery();
                
                if(res.next()){
                    
                    int id=res.getInt("id");
                    String AdSoyad=res.getString("AdSoyad");
                    String telefon=res.getString("Telefon");
                    String tcno=res.getString("TcNo");
                    String adres=res.getString("Adres");
                    String email=res.getString("Eposta");
                    String k2_adi=res.getString("kullaniciadi");
                    String k2_sifre=res.getString("sifre");
                    
                    CTemsilci temsilci=new CTemsilci(id, AdSoyad, tcno, tcno, adres, email, k2_adi, k_sifre);
                    
                    
                    l_mesaj.setText("Temsilci girişi başarılı.");
                    
                }
                
                else{
                    
                    l_mesaj.setText("Hatalı kullanıcı adı veya şifre.");
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(GirisSayfasi.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{
            
            l_mesaj.setText("Lütfen bir departman seçiniz!");
            
        }

    }//GEN-LAST:event_giris_butonuActionPerformed

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
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisSayfasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton giris_butonu;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kullanici_adi;
    private javax.swing.JLabel l_mesaj;
    private javax.swing.JRadioButton r_mudur;
    private javax.swing.JRadioButton r_musteri;
    private javax.swing.JRadioButton r_temsilci;
    private javax.swing.JPasswordField sifre;
    // End of variables declaration//GEN-END:variables
}