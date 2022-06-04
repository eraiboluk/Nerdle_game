/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nerdle.pkg20011028;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author eraib
 */
public class dokuzlu_oyun extends javax.swing.JFrame {
    private String[] denklem;
    private String[] girilen;
    private int satir=1;
    private int sutun=1;
    private int time;
    /**
     * Creates new form NewJFrame
     */
    public dokuzlu_oyun() {
        girilen = new String[10];
        time=1;
        initComponents();
    }
    public dokuzlu_oyun(String[] denklem) {
        girilen = new String[10];
        this.denklem = new String[10];
        System.arraycopy(denklem, 0, this.denklem, 0,9);
        time=1;
        initComponents();
    }
    public dokuzlu_oyun(String[] denklem,int a) {
        girilen = new String[10];
        this.denklem = new String[10];
        System.arraycopy(denklem, 0, this.denklem, 0,9);
        initComponents();
        time=a;
        DevamEt();
    }
    public void sonucuGoster(){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < denklem.length-1; i++) {
            sb.append(denklem[i]);
        }
        String str = sb.toString();
        JOptionPane.showMessageDialog(null,"Doğru cevap: "+str);
    }
    Timer T=new Timer(1000, new ActionListener() 
    {public void actionPerformed(ActionEvent e)
        {
            label_timer.setText(""+time);
            time++;
        }
    });
    
    public static boolean isNumeric(String string) {
        int intValue;

        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) { 
        }
        return false;
    }
    
    public void DevamEt(){
        int i=0,s=1;
        try {
            File myObj = new File("DevamEt.txt");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();
            myReader.nextLine();
            
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] denklem1 = new String [10];
                for(i=0;i<9;i++)
                    denklem1[i]=String.valueOf(data.charAt(i));
                switch(s){
                    case 1:
                        text_1_1.setText(denklem1[0]);
                        text_1_2.setText(denklem1[1]);
                        text_1_3.setText(denklem1[2]);
                        text_1_4.setText(denklem1[3]);
                        text_1_5.setText(denklem1[4]);
                        text_1_6.setText(denklem1[5]);
                        text_1_7.setText(denklem1[6]);
                        text_1_8.setText(denklem1[7]);
                        text_1_9.setText(denklem1[8]);
                        TahminEt();
                        break;
                    case 2:
                        text_2_1.setText(denklem1[0]);
                        text_2_2.setText(denklem1[1]);
                        text_2_3.setText(denklem1[2]);
                        text_2_4.setText(denklem1[3]);
                        text_2_5.setText(denklem1[4]);
                        text_2_6.setText(denklem1[5]);
                        text_2_7.setText(denklem1[6]);
                        text_2_8.setText(denklem1[7]);
                        text_2_9.setText(denklem1[8]);
                        TahminEt();
                        break;
                    case 3:
                        text_3_1.setText(denklem1[0]);
                        text_3_2.setText(denklem1[1]);
                        text_3_3.setText(denklem1[2]);
                        text_3_4.setText(denklem1[3]);
                        text_3_5.setText(denklem1[4]);
                        text_3_6.setText(denklem1[5]);
                        text_3_7.setText(denklem1[6]);
                        text_3_8.setText(denklem1[7]);
                        text_3_9.setText(denklem1[8]);
                        TahminEt();
                        break;
                    case 4:
                        text_4_1.setText(denklem1[0]);
                        text_4_2.setText(denklem1[1]);
                        text_4_3.setText(denklem1[2]);
                        text_4_4.setText(denklem1[3]);
                        text_4_5.setText(denklem1[4]);
                        text_4_6.setText(denklem1[5]);
                        text_4_7.setText(denklem1[6]);
                        text_4_8.setText(denklem1[7]);
                        text_4_9.setText(denklem1[8]);
                        TahminEt();
                        break;
                    case 5:
                        text_5_1.setText(denklem1[0]);
                        text_5_2.setText(denklem1[1]);
                        text_5_3.setText(denklem1[2]);
                        text_5_4.setText(denklem1[3]);
                        text_5_5.setText(denklem1[4]);
                        text_5_6.setText(denklem1[5]);
                        text_5_7.setText(denklem1[6]);
                        text_5_8.setText(denklem1[7]);
                        text_5_9.setText(denklem1[8]);
                        TahminEt();
                        break;
                    case 6:
                        text_6_1.setText(denklem1[0]);
                        text_6_2.setText(denklem1[1]);
                        text_6_3.setText(denklem1[2]);
                        text_6_4.setText(denklem1[3]);
                        text_6_5.setText(denklem1[4]);
                        text_6_6.setText(denklem1[5]);
                        text_6_7.setText(denklem1[6]);
                        text_6_8.setText(denklem1[7]);
                        text_6_9.setText(denklem1[8]);
                        TahminEt();
                        break;
                }
                s++;
            }
            myReader.close();
        }
         catch (FileNotFoundException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        text_1_2 = new javax.swing.JTextField();
        text_1_1 = new javax.swing.JTextField();
        text_1_3 = new javax.swing.JTextField();
        text_1_4 = new javax.swing.JTextField();
        text_1_5 = new javax.swing.JTextField();
        text_1_6 = new javax.swing.JTextField();
        text_1_7 = new javax.swing.JTextField();
        text_2_2 = new javax.swing.JTextField();
        text_2_1 = new javax.swing.JTextField();
        text_2_3 = new javax.swing.JTextField();
        text_2_4 = new javax.swing.JTextField();
        text_2_5 = new javax.swing.JTextField();
        text_2_6 = new javax.swing.JTextField();
        text_2_7 = new javax.swing.JTextField();
        text_3_2 = new javax.swing.JTextField();
        text_3_1 = new javax.swing.JTextField();
        text_3_3 = new javax.swing.JTextField();
        text_3_4 = new javax.swing.JTextField();
        text_3_5 = new javax.swing.JTextField();
        text_3_6 = new javax.swing.JTextField();
        text_3_7 = new javax.swing.JTextField();
        text_4_2 = new javax.swing.JTextField();
        text_4_1 = new javax.swing.JTextField();
        text_4_3 = new javax.swing.JTextField();
        text_4_4 = new javax.swing.JTextField();
        text_4_5 = new javax.swing.JTextField();
        text_4_6 = new javax.swing.JTextField();
        text_4_7 = new javax.swing.JTextField();
        text_5_2 = new javax.swing.JTextField();
        text_5_1 = new javax.swing.JTextField();
        text_5_3 = new javax.swing.JTextField();
        text_5_4 = new javax.swing.JTextField();
        text_5_5 = new javax.swing.JTextField();
        text_5_6 = new javax.swing.JTextField();
        text_5_7 = new javax.swing.JTextField();
        text_6_2 = new javax.swing.JTextField();
        text_6_1 = new javax.swing.JTextField();
        text_6_3 = new javax.swing.JTextField();
        text_6_4 = new javax.swing.JTextField();
        text_6_5 = new javax.swing.JTextField();
        text_6_6 = new javax.swing.JTextField();
        text_6_7 = new javax.swing.JTextField();
        text_1_8 = new javax.swing.JTextField();
        text_2_8 = new javax.swing.JTextField();
        text_3_8 = new javax.swing.JTextField();
        text_4_8 = new javax.swing.JTextField();
        text_5_8 = new javax.swing.JTextField();
        text_6_8 = new javax.swing.JTextField();
        text_5_9 = new javax.swing.JTextField();
        text_6_9 = new javax.swing.JTextField();
        text_4_9 = new javax.swing.JTextField();
        text_2_9 = new javax.swing.JTextField();
        text_1_9 = new javax.swing.JTextField();
        text_3_9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        label_timer = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 760));
        setPreferredSize(new java.awt.Dimension(620, 760));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("20011028-Onur Eray Bölük");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 700, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        text_1_2.setEditable(false);
        text_1_2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_1_1.setEditable(false);
        text_1_1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        text_1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_1_1ActionPerformed(evt);
            }
        });

        text_1_3.setEditable(false);
        text_1_3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_1_4.setEditable(false);
        text_1_4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_1_5.setEditable(false);
        text_1_5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_1_6.setEditable(false);
        text_1_6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_1_7.setEditable(false);
        text_1_7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_2_2.setEditable(false);
        text_2_2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_2_1.setEditable(false);
        text_2_1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_2_3.setEditable(false);
        text_2_3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_2_4.setEditable(false);
        text_2_4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_2_5.setEditable(false);
        text_2_5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_2_6.setEditable(false);
        text_2_6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_2_7.setEditable(false);
        text_2_7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_3_2.setEditable(false);
        text_3_2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_3_1.setEditable(false);
        text_3_1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_3_3.setEditable(false);
        text_3_3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_3_4.setEditable(false);
        text_3_4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_3_5.setEditable(false);
        text_3_5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_3_6.setEditable(false);
        text_3_6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_3_7.setEditable(false);
        text_3_7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_4_2.setEditable(false);
        text_4_2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_4_1.setEditable(false);
        text_4_1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_4_3.setEditable(false);
        text_4_3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_4_4.setEditable(false);
        text_4_4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_4_5.setEditable(false);
        text_4_5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_4_6.setEditable(false);
        text_4_6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_4_7.setEditable(false);
        text_4_7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_5_2.setEditable(false);
        text_5_2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_5_1.setEditable(false);
        text_5_1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_5_3.setEditable(false);
        text_5_3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_5_4.setEditable(false);
        text_5_4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_5_5.setEditable(false);
        text_5_5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_5_6.setEditable(false);
        text_5_6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_5_7.setEditable(false);
        text_5_7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_6_2.setEditable(false);
        text_6_2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_6_1.setEditable(false);
        text_6_1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_6_3.setEditable(false);
        text_6_3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_6_4.setEditable(false);
        text_6_4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_6_5.setEditable(false);
        text_6_5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_6_6.setEditable(false);
        text_6_6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_6_7.setEditable(false);
        text_6_7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_1_8.setEditable(false);
        text_1_8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_2_8.setEditable(false);
        text_2_8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_3_8.setEditable(false);
        text_3_8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_4_8.setEditable(false);
        text_4_8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_5_8.setEditable(false);
        text_5_8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_6_8.setEditable(false);
        text_6_8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_5_9.setEditable(false);
        text_5_9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        text_5_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_5_9ActionPerformed(evt);
            }
        });

        text_6_9.setEditable(false);
        text_6_9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_4_9.setEditable(false);
        text_4_9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_2_9.setEditable(false);
        text_2_9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_1_9.setEditable(false);
        text_1_9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        text_3_9.setEditable(false);
        text_3_9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(text_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(text_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(text_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(text_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(text_5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(text_6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(text_1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(text_4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(text_5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(text_6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 570, 390));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton2.setText("0");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 50, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton3.setText("1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 50, 50));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton4.setText("2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 50, 50));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton5.setText("3");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 50, 50));

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton6.setText("4");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 50, 50));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton7.setText("5");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 50, 50));

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton8.setText("6");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 50, 50));

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton9.setText("7");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 50, 50));

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton10.setText("8");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 50, 50));

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton11.setText("9");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 50, 50));

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton12.setText("+");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 50, 50));

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton13.setText("-");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 50, 50));

        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton14.setText("*");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 50, 50));

        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton15.setText("/");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 50, 50));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Sonra Bitir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 110, 40));

        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jButton16.setText("=");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 50, 40));

        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton17.setText("Tahmin Et");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 100, 40));

        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton18.setText("Sil");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 110, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 450, 220));

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nerdle/icons/delete-icon.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 40));

        label_timer.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        label_timer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(label_timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 90, 40));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nerdle/icons/Ok-icon.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int isItCorrect(String[] denklem){
        int i=0,a=0,b=0,c=10,d=0;
        
        while(i<9){
            
            if("".equals(denklem[i])){
                return 0;
            }
            i++;
        }
        i=0;
        while(isNumeric(denklem[i])==true){
                
            a=Integer.valueOf(denklem[i]);
            b=b*c;
            b=a+b;
            i++; 
            }
        d=b;
        b=0;
            
        
        while(i<9){
            switch(denklem[i]){
                case "+":
                    i++;
                    while(isNumeric(denklem[i])){
                        a=Integer.valueOf(denklem[i]);
                        b=b*c;
                        b=a+b;
                        i++;
                    }
                    d=d+b;
                    b=0;
                    break;
                case "-":
 
                    i++;
                    while(isNumeric(denklem[i])){
                        a=Integer.valueOf(denklem[i]);
                        b=b*c;
                        b=a+b;
                        i++;
                    }

                    d=d-b;
                    b=0;
                    break;
                case "*":

                    i++;
                    while(isNumeric(denklem[i])){
                        a=Integer.valueOf(denklem[i]);
                        b=b*c;
                        b=a+b;
                        i++;
                    }

                    d=d*b;
                    b=0;
                    break;
                case "/":

                    i++;
                    while(isNumeric(denklem[i])){
                        a=Integer.valueOf(denklem[i]);
                        b=b*c;
                        b=a+b;
                        i++;
                    }

                    d=d/b;
                    b=0;
                    break;
                case "=":

                    i++;
                    while(isNumeric(denklem[i])){
                        a=Integer.valueOf(denklem[i]);
                        b=b*c;
                        b=a+b;
                        i++;
                    }
                    if(d==b)
                        return 1;                   
                    else
                        return 0;
            }
        }
 
        return 0;
    }
    public void renkle(String[] girilen){
        int i,j,count=0;
        for(i=0;i<9;i++){
            
            if(denklem[i].equals(girilen[i]))
                count++;
        }
        if(count==9){
            T.stop();
            JOptionPane.showMessageDialog(null,"KAZANDINIZ!!!"+"\n"+"deneme: "+sutun+"\n"+"Zaman: "+(time-1)); 
            try {
                File myObj = new File("istatislik.txt");
                Scanner myReader = new Scanner(myObj);
                String a=myReader.nextLine();
                String b=myReader.nextLine();
                String c=myReader.nextLine();
                String d=myReader.nextLine();
                String e=myReader.nextLine();
                myReader.close();
                c=String.valueOf(Integer.parseInt(c)+1);
                FileWriter fwrite = new FileWriter("istatislik.txt");
                PrintWriter printWriter = new PrintWriter(fwrite);
                printWriter.print(a+"\n");
                printWriter.print(b+"\n");
                printWriter.print(c+"\n");
                printWriter.print(d+"\n");
                printWriter.print(e+"\n");
                fwrite.close();

            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
            try {
                File myObj = new File("istatislik.txt");
                Scanner myReader = new Scanner(myObj);
                int f=0;
                String a=myReader.nextLine();
                String b=myReader.nextLine();
                String c=myReader.nextLine();
                String d=myReader.nextLine();
                String e=myReader.nextLine();
                myReader.close();
                f+=Integer.parseInt(a);
                f+=Integer.parseInt(b);
                f+=Integer.parseInt(c);
                d=String.valueOf((Integer.parseInt(d)*f+sutun)/(f+1));
                FileWriter fwrite = new FileWriter("istatislik.txt");
                PrintWriter printWriter = new PrintWriter(fwrite);
                printWriter.print(a+"\n");
                printWriter.print(b+"\n");
                printWriter.print(c+"\n");
                printWriter.print(d+"\n");
                printWriter.print(e+"\n");
                fwrite.close();

            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
            try {
                File myObj = new File("istatislik.txt");
                Scanner myReader = new Scanner(myObj);
                int f=0;
                String a=myReader.nextLine();
                String b=myReader.nextLine();
                String c=myReader.nextLine();
                String d=myReader.nextLine();
                String e=myReader.nextLine();
                myReader.close();
                f+=Integer.parseInt(a);
                f+=Integer.parseInt(b);
                f+=Integer.parseInt(c);
                e=String.valueOf((Integer.parseInt(e)*f+time)/(f+1));
                FileWriter fwrite = new FileWriter("istatislik.txt");
                PrintWriter printWriter = new PrintWriter(fwrite);
                printWriter.print(a+"\n");
                printWriter.print(b+"\n");
                printWriter.print(c+"\n");
                printWriter.print(d+"\n");
                printWriter.print(e+"\n");
                fwrite.close();

            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
            ana_menu a = new ana_menu();
            a.setVisible(true);
            this.dispose();
        }
        else if(count<9 && sutun>5){
            
            JOptionPane.showMessageDialog(null, "KAYBETTİNİZ, DENEME HAKKI KALMADI!!!"+"\n"+"Zaman: "+(time-1));
            sonucuGoster();
            try {
                File myObj = new File("istatislik.txt");
                Scanner myReader = new Scanner(myObj);
                String a=myReader.nextLine();
                String b=myReader.nextLine();
                String c=myReader.nextLine();
                String d=myReader.nextLine();
                String e=myReader.nextLine();
                myReader.close();
                b=String.valueOf(Integer.parseInt(b)+1);
                FileWriter fwrite = new FileWriter("istatislik.txt");
                PrintWriter printWriter = new PrintWriter(fwrite);
                printWriter.print(a+"\n");
                printWriter.print(b+"\n");
                printWriter.print(c+"\n");
                printWriter.print(d+"\n");
                printWriter.print(e+"\n");
                fwrite.close();

            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }

            ana_menu a = new ana_menu();
            a.setVisible(true);
            this.dispose();
           
        }
        switch(sutun){
                            case 1:
                                
                                text_1_1.setBackground(Color.red);
                                text_1_2.setBackground(Color.red);
                                text_1_3.setBackground(Color.red);
                                text_1_4.setBackground(Color.red);
                                text_1_5.setBackground(Color.red);
                                text_1_6.setBackground(Color.red);
                                text_1_7.setBackground(Color.red);
                                text_1_8.setBackground(Color.red);
                                text_1_9.setBackground(Color.red);
                                break;
                            case 2: 
                                text_2_1.setBackground(Color.red);
                                        
                                        text_2_2.setBackground(Color.red);
                                    
                                        text_2_3.setBackground(Color.red);
                                    
                                        text_2_4.setBackground(Color.red);
                                    
                                        text_2_5.setBackground(Color.red);
                                    
                                        text_2_6.setBackground(Color.red);
                                        
                                        text_2_7.setBackground(Color.red);
                                     text_2_8.setBackground(Color.red);
                                     text_2_9.setBackground(Color.red);
                                break;
                            case 3:
                               
                                    
                                        text_3_1.setBackground(Color.red);
                                        
                                        text_3_2.setBackground(Color.red);
                                    
                                        text_3_3.setBackground(Color.red);
                                    
                                        text_3_4.setBackground(Color.red);
                                    
                                        text_3_5.setBackground(Color.red);
                                    
                                        text_3_6.setBackground(Color.red);
                                        
                                        text_3_7.setBackground(Color.red);
                                     text_3_8.setBackground(Color.red);
                                     text_3_9.setBackground(Color.red);
                                break;
                            case 4:
                               
                                        text_4_1.setBackground(Color.red);
                                        
                                        text_4_2.setBackground(Color.red);
                                    
                                        text_4_3.setBackground(Color.red);
                                    
                                        text_4_4.setBackground(Color.red);
                                    
                                        text_4_5.setBackground(Color.red);
                                    
                                        text_4_6.setBackground(Color.red);
                                        
                                        text_4_7.setBackground(Color.red);
                                     text_4_8.setBackground(Color.red);
                                     text_4_9.setBackground(Color.red);
                                break;
                            case 5:
                                
                                    
                                        text_5_1.setBackground(Color.red);
                                    
                                        text_5_2.setBackground(Color.red);
                                    
                                        text_5_3.setBackground(Color.red);
                                    
                                        text_5_4.setBackground(Color.red);
                                    
                                        text_5_5.setBackground(Color.red);
                                    
                                        text_5_6.setBackground(Color.red);
                                        
                                        text_5_7.setBackground(Color.red);
                                     text_5_8.setBackground(Color.red);
                                     text_5_9.setBackground(Color.red);
                                break;
                            case 6:
                                
                                    
                                        text_6_1.setBackground(Color.red);
                                    
                                        text_6_2.setBackground(Color.red);
                                    
                                        text_6_3.setBackground(Color.red);
                                   
                                        text_6_4.setBackground(Color.red);
                                    
                                        text_6_5.setBackground(Color.red);
                                    
                                        text_6_6.setBackground(Color.red);
                                      
                                        text_6_7.setBackground(Color.red);
                                    text_6_8.setBackground(Color.red);
                                    text_6_9.setBackground(Color.red);
                                 break;
                        }
                        
                    
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                if(girilen[i].equals(denklem[j])){
                    if(i==j){
                        switch(sutun){
                            case 1:
                                switch(i+1){
                                    case 1: text_1_1.setBackground(Color.green); break;
                                    case 2: text_1_2.setBackground(Color.green); break;
                                    case 3: text_1_3.setBackground(Color.green); break;
                                    case 4: text_1_4.setBackground(Color.green); break;
                                    case 5: text_1_5.setBackground(Color.green); break;
                                    case 6: text_1_6.setBackground(Color.green); break;
                                    case 7: text_1_7.setBackground(Color.green); break;
                                    case 8: text_1_8.setBackground(Color.green); break;
                                    case 9: text_1_9.setBackground(Color.green); break;
                                } break;
                            case 2: 

                                switch(i+1){
                                    case 1:
                                        text_2_1.setBackground(Color.green); break;
                                    case 2:    
                                        text_2_2.setBackground(Color.green); break;
                                    case 3:
                                        text_2_3.setBackground(Color.green); break;
                                    case 4:
                                        text_2_4.setBackground(Color.green); break;
                                    case 5:
                                        text_2_5.setBackground(Color.green); break;
                                    case 6:
                                        text_2_6.setBackground(Color.green); break;
                                    case 7:    
                                        text_2_7.setBackground(Color.green); break;
                                    case 8: text_2_8.setBackground(Color.green); break;
                                    case 9: text_2_9.setBackground(Color.green); break;
                                } break;
                            case 3:
                                switch(i+1){
                                    case 1:
                                        text_3_1.setBackground(Color.green); break;
                                    case 2:    
                                        text_3_2.setBackground(Color.green); break;
                                    case 3:
                                        text_3_3.setBackground(Color.green); break;
                                    case 4:
                                        text_3_4.setBackground(Color.green); break;
                                    case 5:
                                        text_3_5.setBackground(Color.green); break;
                                    case 6:
                                        text_3_6.setBackground(Color.green); break;
                                    case 7:    
                                        text_3_7.setBackground(Color.green); break;
                                    case 8: text_3_8.setBackground(Color.green); break;
                                    case 9: text_3_9.setBackground(Color.green); break;
                                } break;
                            case 4:
                                switch(i+1){
                                    case 1:
                                        text_4_1.setBackground(Color.green); break;
                                    case 2:    
                                        text_4_2.setBackground(Color.green); break;
                                    case 3:
                                        text_4_3.setBackground(Color.green); break;
                                    case 4:
                                        text_4_4.setBackground(Color.green); break;
                                    case 5:
                                        text_4_5.setBackground(Color.green); break;
                                    case 6:
                                        text_4_6.setBackground(Color.green); break;
                                    case 7:    
                                        text_4_7.setBackground(Color.green); break;
                                    case 8: text_4_8.setBackground(Color.green); break;
                                    case 9: text_4_9.setBackground(Color.green); break;
                                } break;
                                
                            case 5:
                                switch(i+1){
                                    case 1:
                                        text_5_1.setBackground(Color.green); break;
                                    case 2:    
                                        text_5_2.setBackground(Color.green); break;
                                    case 3:
                                        text_5_3.setBackground(Color.green); break;
                                    case 4:
                                        text_5_4.setBackground(Color.green); break;
                                    case 5:
                                        text_5_5.setBackground(Color.green); break;
                                    case 6:
                                        text_5_6.setBackground(Color.green); break;
                                    case 7:    
                                        text_5_7.setBackground(Color.green); break;
                                    case 8: text_5_8.setBackground(Color.green); break;
                                    case 9: text_5_9.setBackground(Color.green); break;
                                } break;
                            case 6:
                                switch(i+1){
                                    case 1:
                                        text_6_1.setBackground(Color.green); break;
                                    case 2:    
                                        text_6_2.setBackground(Color.green); break;
                                    case 3:
                                        text_6_3.setBackground(Color.green); break;
                                    case 4:
                                        text_6_4.setBackground(Color.green); break;
                                    case 5:
                                        text_6_5.setBackground(Color.green); break;
                                    case 6:
                                        text_6_6.setBackground(Color.green); break;
                                    case 7:    
                                        text_6_7.setBackground(Color.green); break;
                                    case 8: text_6_8.setBackground(Color.green); break;
                                    case 9: text_6_9.setBackground(Color.green); break;
                                } break;
                        }
                        break;
                    }
                    else{
                        switch(sutun){
                            case 1:
                                switch(i+1){
                                    case 1: text_1_1.setBackground(Color.yellow); break;
                                    case 2: text_1_2.setBackground(Color.yellow); break;
                                    case 3: text_1_3.setBackground(Color.yellow); break;
                                    case 4: text_1_4.setBackground(Color.yellow); break;
                                    case 5: text_1_5.setBackground(Color.yellow); break;
                                    case 6: text_1_6.setBackground(Color.yellow); break;
                                    case 7: text_1_7.setBackground(Color.yellow); break;
                                    case 8: text_1_8.setBackground(Color.yellow); break;
                                    case 9: text_1_9.setBackground(Color.yellow); break;
                                } break;
                            case 2: 

                                switch(i+1){
                                    case 1:
                                        text_2_1.setBackground(Color.yellow); break;
                                    case 2:    
                                        text_2_2.setBackground(Color.yellow); break;
                                    case 3:
                                        text_2_3.setBackground(Color.yellow); break;
                                    case 4:
                                        text_2_4.setBackground(Color.yellow); break;
                                    case 5:
                                        text_2_5.setBackground(Color.yellow); break;
                                    case 6:
                                        text_2_6.setBackground(Color.yellow); break;
                                    case 7:    
                                        text_2_7.setBackground(Color.yellow); break;
                                    case 8: text_2_8.setBackground(Color.yellow); break;
                                    case 9: text_2_9.setBackground(Color.yellow); break;
                                } break;
                            case 3:
                                switch(i+1){
                                    case 1:
                                        text_3_1.setBackground(Color.yellow); break;
                                    case 2:    
                                        text_3_2.setBackground(Color.yellow); break;
                                    case 3:
                                        text_3_3.setBackground(Color.yellow); break;
                                    case 4:
                                        text_3_4.setBackground(Color.yellow); break;
                                    case 5:
                                        text_3_5.setBackground(Color.yellow); break;
                                    case 6:
                                        text_3_6.setBackground(Color.yellow); break;
                                    case 7:    
                                        text_3_7.setBackground(Color.yellow); break;
                                    case 8: text_3_8.setBackground(Color.yellow); break;
                                    case 9: text_3_9.setBackground(Color.yellow); break;
                                } break;
                            case 4:
                                switch(i+1){
                                    case 1:
                                        text_4_1.setBackground(Color.yellow); break;
                                    case 2:    
                                        text_4_2.setBackground(Color.yellow); break;
                                    case 3:
                                        text_4_3.setBackground(Color.yellow); break;
                                    case 4:
                                        text_4_4.setBackground(Color.yellow); break;
                                    case 5:
                                        text_4_5.setBackground(Color.yellow); break;
                                    case 6:
                                        text_4_6.setBackground(Color.yellow); break;
                                    case 7:    
                                        text_4_7.setBackground(Color.yellow); break;
                                    case 8: text_4_8.setBackground(Color.yellow); break;
                                    case 9: text_4_9.setBackground(Color.yellow); break;
                                } break;
                            case 5:
                                switch(i+1){
                                    case 1:
                                        text_5_1.setBackground(Color.yellow); break;
                                    case 2:    
                                        text_5_2.setBackground(Color.yellow); break;
                                    case 3:
                                        text_5_3.setBackground(Color.yellow); break;
                                    case 4:
                                        text_5_4.setBackground(Color.yellow); break;
                                    case 5:
                                        text_5_5.setBackground(Color.yellow); break;
                                    case 6:
                                        text_5_6.setBackground(Color.yellow); break;
                                    case 7:    
                                        text_5_7.setBackground(Color.yellow); break;
                                    case 8: text_5_8.setBackground(Color.yellow); break;
                                    case 9: text_5_9.setBackground(Color.yellow); break;
                                } break;
                            case 6:
                                switch(i+1){
                                    case 1:
                                        text_6_1.setBackground(Color.yellow); break;
                                    case 2:    
                                        text_6_2.setBackground(Color.yellow); break;
                                    case 3:
                                        text_6_3.setBackground(Color.yellow); break;
                                    case 4:
                                        text_6_4.setBackground(Color.yellow); break;
                                    case 5:
                                        text_6_5.setBackground(Color.yellow); break;
                                    case 6:
                                        text_6_6.setBackground(Color.yellow); break;
                                    case 7:    
                                        text_6_7.setBackground(Color.yellow); break;
                                    case 8: text_6_8.setBackground(Color.yellow); break;
                                    case 9: text_6_9.setBackground(Color.yellow); break;
                                } break;
                        }
                        
                    } 
                }
            }
        }
    }
    
    private void text_1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_1_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_1_1ActionPerformed

    private void text_5_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_5_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_5_9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("0"); break;
                    case 2: text_1_2.setText("0"); break;
                    case 3: text_1_3.setText("0"); break;
                    case 4: text_1_4.setText("0"); break;
                    case 5: text_1_5.setText("0"); break;
                    case 6: text_1_6.setText("0"); break;
                    case 7: text_1_7.setText("0"); break;
                    case 8: text_1_8.setText("0"); break;
                    case 9: text_1_9.setText("0"); break;
                } break;
                case 2:

                switch(satir){
                    case 1: text_2_1.setText("0"); break;
                    case 2:
                    text_2_2.setText("0"); break;
                    case 3:
                    text_2_3.setText("0"); break;
                    case 4:
                    text_2_4.setText("0"); break;
                    case 5:
                    text_2_5.setText("0"); break;
                    case 6:
                    text_2_6.setText("0"); break;
                    case 7:
                    text_2_7.setText("0"); break;
                    case 8: text_2_8.setText("0"); break;
                    case 9: text_2_9.setText("0"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("0"); break;
                    case 2:
                    text_3_2.setText("0"); break;
                    case 3:
                    text_3_3.setText("0"); break;
                    case 4:
                    text_3_4.setText("0"); break;
                    case 5:
                    text_3_5.setText("0"); break;
                    case 6:
                    text_3_6.setText("0"); break;
                    case 7:
                    text_3_7.setText("0"); break;
                    case 8: text_3_8.setText("0"); break;
                    case 9: text_3_9.setText("0"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("0"); break;
                    case 2:
                    text_4_2.setText("0"); break;
                    case 3:
                    text_4_3.setText("0"); break;
                    case 4:
                    text_4_4.setText("0"); break;
                    case 5:
                    text_4_5.setText("0"); break;
                    case 6:
                    text_4_6.setText("0"); break;
                    case 7:
                    text_4_7.setText("0"); break;
                    case 8: text_4_8.setText("0"); break;
                    case 9: text_4_9.setText("0"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("0"); break;
                    case 2:
                    text_5_2.setText("0"); break;
                    case 3:
                    text_5_3.setText("0"); break;
                    case 4:
                    text_5_4.setText("0"); break;
                    case 5:
                    text_5_5.setText("0"); break;
                    case 6:
                    text_5_6.setText("0"); break;
                    case 7:
                    text_5_7.setText("0"); break;
                    case 8: text_5_8.setText("0"); break;
                    case 9: text_5_9.setText("0"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("0"); break;
                    case 2:
                    text_6_2.setText("0"); break;
                    case 3:
                    text_6_3.setText("0"); break;
                    case 4:
                    text_6_4.setText("0"); break;
                    case 5:
                    text_6_5.setText("0"); break;
                    case 6:
                    text_6_6.setText("0"); break;
                    case 7:
                    text_6_7.setText("0"); break;
                    case 8: text_6_8.setText("0"); break;
                    case 9: text_6_9.setText("0"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("1"); break;
                    case 2: text_1_2.setText("1"); break;
                    case 3: text_1_3.setText("1"); break;
                    case 4: text_1_4.setText("1"); break;
                    case 5: text_1_5.setText("1"); break;
                    case 6: text_1_6.setText("1"); break;
                    case 7: text_1_7.setText("1"); break;
                    case 8: text_1_8.setText("1"); break;
                    case 9: text_1_9.setText("1"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("1"); break;
                    case 2:
                    text_2_2.setText("1"); break;
                    case 3:
                    text_2_3.setText("1"); break;
                    case 4:
                    text_2_4.setText("1"); break;
                    case 5:
                    text_2_5.setText("1"); break;
                    case 6:
                    text_2_6.setText("1"); break;
                    case 7:
                    text_2_7.setText("1"); break;
                    case 8: text_2_8.setText("1"); break;
                    case 9: text_2_9.setText("1"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("1"); break;
                    case 2:
                    text_3_2.setText("1"); break;
                    case 3:
                    text_3_3.setText("1"); break;
                    case 4:
                    text_3_4.setText("1"); break;
                    case 5:
                    text_3_5.setText("1"); break;
                    case 6:
                    text_3_6.setText("1"); break;
                    case 7:
                    text_3_7.setText("1"); break;
                    case 8: text_3_8.setText("1"); break;
                    case 9: text_3_9.setText("1"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("1"); break;
                    case 2:
                    text_4_2.setText("1"); break;
                    case 3:
                    text_4_3.setText("1"); break;
                    case 4:
                    text_4_4.setText("1"); break;
                    case 5:
                    text_4_5.setText("1"); break;
                    case 6:
                    text_4_6.setText("1"); break;
                    case 7:
                    text_4_7.setText("1"); break;
                    case 8: text_4_8.setText("1"); break;
                    case 9: text_4_9.setText("1"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("1"); break;
                    case 2:
                    text_5_2.setText("1"); break;
                    case 3:
                    text_5_3.setText("1"); break;
                    case 4:
                    text_5_4.setText("1"); break;
                    case 5:
                    text_5_5.setText("1"); break;
                    case 6:
                    text_5_6.setText("1"); break;
                    case 7:
                    text_5_7.setText("1"); break;
                    case 8: text_5_8.setText("1"); break;
                    case 9: text_5_9.setText("1"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("1"); break;
                    case 2:
                    text_6_2.setText("1"); break;
                    case 3:
                    text_6_3.setText("1"); break;
                    case 4:
                    text_6_4.setText("1"); break;
                    case 5:
                    text_6_5.setText("1"); break;
                    case 6:
                    text_6_6.setText("1"); break;
                    case 7:
                    text_6_7.setText("1"); break;
                    case 8: text_6_8.setText("1"); break;
                    case 9: text_6_9.setText("1"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("2"); break;
                    case 2: text_1_2.setText("2"); break;
                    case 3: text_1_3.setText("2"); break;
                    case 4: text_1_4.setText("2"); break;
                    case 5: text_1_5.setText("2"); break;
                    case 6: text_1_6.setText("2"); break;
                    case 7: text_1_7.setText("2"); break;
                    case 8: text_1_8.setText("2"); break;
                    case 9: text_1_9.setText("2"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("2"); break;
                    case 2:
                    text_2_2.setText("2"); break;
                    case 3:
                    text_2_3.setText("2"); break;
                    case 4:
                    text_2_4.setText("2"); break;
                    case 5:
                    text_2_5.setText("2"); break;
                    case 6:
                    text_2_6.setText("2"); break;
                    case 7:
                    text_2_7.setText("2"); break;
                    case 8: text_2_8.setText("2"); break;
                    case 9: text_2_9.setText("2"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("2"); break;
                    case 2:
                    text_3_2.setText("2"); break;
                    case 3:
                    text_3_3.setText("2"); break;
                    case 4:
                    text_3_4.setText("2"); break;
                    case 5:
                    text_3_5.setText("2"); break;
                    case 6:
                    text_3_6.setText("2"); break;
                    case 7:
                    text_3_7.setText("2"); break;
                    case 8: text_3_8.setText("2"); break;
                    case 9: text_3_9.setText("2"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("2"); break;
                    case 2:
                    text_4_2.setText("2"); break;
                    case 3:
                    text_4_3.setText("2"); break;
                    case 4:
                    text_4_4.setText("2"); break;
                    case 5:
                    text_4_5.setText("2"); break;
                    case 6:
                    text_4_6.setText("2"); break;
                    case 7:
                    text_4_7.setText("2"); break;
                    case 8: text_4_8.setText("2"); break;
                    case 9: text_4_9.setText("2"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("2"); break;
                    case 2:
                    text_5_2.setText("2"); break;
                    case 3:
                    text_5_3.setText("2"); break;
                    case 4:
                    text_5_4.setText("2"); break;
                    case 5:
                    text_5_5.setText("2"); break;
                    case 6:
                    text_5_6.setText("2"); break;
                    case 7:
                    text_5_7.setText("2"); break;
                    case 8: text_5_8.setText("2"); break;
                    case 9: text_5_9.setText("2"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("2"); break;
                    case 2:
                    text_6_2.setText("2"); break;
                    case 3:
                    text_6_3.setText("2"); break;
                    case 4:
                    text_6_4.setText("2"); break;
                    case 5:
                    text_6_5.setText("2"); break;
                    case 6:
                    text_6_6.setText("2"); break;
                    case 7:
                    text_6_7.setText("2"); break;
                    case 8: text_6_8.setText("2"); break;
                    case 9: text_6_9.setText("2"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("3"); break;
                    case 2: text_1_2.setText("3"); break;
                    case 3: text_1_3.setText("3"); break;
                    case 4: text_1_4.setText("3"); break;
                    case 5: text_1_5.setText("3"); break;
                    case 6: text_1_6.setText("3"); break;
                    case 7: text_1_7.setText("3"); break;
                    case 8: text_1_8.setText("3"); break;
                    case 9: text_1_9.setText("3"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("3"); break;
                    case 2:
                    text_2_2.setText("3"); break;
                    case 3:
                    text_2_3.setText("3"); break;
                    case 4:
                    text_2_4.setText("3"); break;
                    case 5:
                    text_2_5.setText("3"); break;
                    case 6:
                    text_2_6.setText("3"); break;
                    case 7:
                    text_2_7.setText("3"); break;
                    case 8: text_2_8.setText("3"); break;
                    case 9: text_2_9.setText("3"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("3"); break;
                    case 2:
                    text_3_2.setText("3"); break;
                    case 3:
                    text_3_3.setText("3"); break;
                    case 4:
                    text_3_4.setText("3"); break;
                    case 5:
                    text_3_5.setText("3"); break;
                    case 6:
                    text_3_6.setText("3"); break;
                    case 7:
                    text_3_7.setText("3"); break;
                    case 8: text_3_8.setText("3"); break;
                    case 9: text_3_9.setText("3"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("3"); break;
                    case 2:
                    text_4_2.setText("3"); break;
                    case 3:
                    text_4_3.setText("3"); break;
                    case 4:
                    text_4_4.setText("3"); break;
                    case 5:
                    text_4_5.setText("3"); break;
                    case 6:
                    text_4_6.setText("3"); break;
                    case 7:
                    text_4_7.setText("3"); break;
                    case 8: text_4_8.setText("3"); break;
                    case 9: text_4_9.setText("3"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("3"); break;
                    case 2:
                    text_5_2.setText("3"); break;
                    case 3:
                    text_5_3.setText("3"); break;
                    case 4:
                    text_5_4.setText("3"); break;
                    case 5:
                    text_5_5.setText("3"); break;
                    case 6:
                    text_5_6.setText("3"); break;
                    case 7:
                    text_5_7.setText("3"); break;
                    case 8: text_5_8.setText("3"); break;
                    case 9: text_5_9.setText("3"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("3"); break;
                    case 2:
                    text_6_2.setText("3"); break;
                    case 3:
                    text_6_3.setText("3"); break;
                    case 4:
                    text_6_4.setText("3"); break;
                    case 5:
                    text_6_5.setText("3"); break;
                    case 6:
                    text_6_6.setText("3"); break;
                    case 7:
                    text_6_7.setText("3"); break;
                    case 8: text_6_8.setText("3"); break;
                    case 9: text_6_9.setText("3"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("4"); break;
                    case 2: text_1_2.setText("4"); break;
                    case 3: text_1_3.setText("4"); break;
                    case 4: text_1_4.setText("4"); break;
                    case 5: text_1_5.setText("4"); break;
                    case 6: text_1_6.setText("4"); break;
                    case 7: text_1_7.setText("4"); break;
                    case 8: text_1_8.setText("4"); break;
                    case 9: text_1_9.setText("4"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("4"); break;
                    case 2:
                    text_2_2.setText("4"); break;
                    case 3:
                    text_2_3.setText("4"); break;
                    case 4:
                    text_2_4.setText("4"); break;
                    case 5:
                    text_2_5.setText("4"); break;
                    case 6:
                    text_2_6.setText("4"); break;
                    case 7:
                    text_2_7.setText("4"); break;
                    case 8: text_2_8.setText("4"); break;
                    case 9: text_2_9.setText("4"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("4"); break;
                    case 2:
                    text_3_2.setText("4"); break;
                    case 3:
                    text_3_3.setText("4"); break;
                    case 4:
                    text_3_4.setText("4"); break;
                    case 5:
                    text_3_5.setText("4"); break;
                    case 6:
                    text_3_6.setText("4"); break;
                    case 7:
                    text_3_7.setText("4"); break;
                    case 8: text_3_8.setText("4"); break;
                    case 9: text_2_9.setText("4"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("4"); break;
                    case 2:
                    text_4_2.setText("4"); break;
                    case 3:
                    text_4_3.setText("4"); break;
                    case 4:
                    text_4_4.setText("4"); break;
                    case 5:
                    text_4_5.setText("4"); break;
                    case 6:
                    text_4_6.setText("4"); break;
                    case 7:
                    text_4_7.setText("4"); break;
                    case 8: text_4_8.setText("4"); break;
                    case 9: text_4_9.setText("4"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("4"); break;
                    case 2:
                    text_5_2.setText("4"); break;
                    case 3:
                    text_5_3.setText("4"); break;
                    case 4:
                    text_5_4.setText("4"); break;
                    case 5:
                    text_5_5.setText("4"); break;
                    case 6:
                    text_5_6.setText("4"); break;
                    case 7:
                    text_5_7.setText("4"); break;
                    case 8: text_5_8.setText("4"); break;
                    case 9: text_5_9.setText("4"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("4"); break;
                    case 2:
                    text_6_2.setText("4"); break;
                    case 3:
                    text_6_3.setText("4"); break;
                    case 4:
                    text_6_4.setText("4"); break;
                    case 5:
                    text_6_5.setText("4"); break;
                    case 6:
                    text_6_6.setText("4"); break;
                    case 7:
                    text_6_7.setText("4"); break;
                    case 8: text_6_8.setText("4"); break;
                    case 9: text_6_9.setText("4"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("5"); break;
                    case 2: text_1_2.setText("5"); break;
                    case 3: text_1_3.setText("5"); break;
                    case 4: text_1_4.setText("5"); break;
                    case 5: text_1_5.setText("5"); break;
                    case 6: text_1_6.setText("5"); break;
                    case 7: text_1_7.setText("5"); break;
                    case 8: text_1_8.setText("5"); break;
                    case 9: text_1_9.setText("5"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("5"); break;
                    case 2:
                    text_2_2.setText("5"); break;
                    case 3:
                    text_2_3.setText("5"); break;
                    case 4:
                    text_2_4.setText("5"); break;
                    case 5:
                    text_2_5.setText("5"); break;
                    case 6:
                    text_2_6.setText("5"); break;
                    case 7:
                    text_2_7.setText("5"); break;
                    case 8: text_2_8.setText("5"); break;
                    case 9: text_2_9.setText("5"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("5"); break;
                    case 2:
                    text_3_2.setText("5"); break;
                    case 3:
                    text_3_3.setText("5"); break;
                    case 4:
                    text_3_4.setText("5"); break;
                    case 5:
                    text_3_5.setText("5"); break;
                    case 6:
                    text_3_6.setText("5"); break;
                    case 7:
                    text_3_7.setText("5"); break;
                    case 8: text_3_8.setText("5"); break;
                    case 9: text_3_9.setText("5"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("5"); break;
                    case 2:
                    text_4_2.setText("5"); break;
                    case 3:
                    text_4_3.setText("5"); break;
                    case 4:
                    text_4_4.setText("5"); break;
                    case 5:
                    text_4_5.setText("5"); break;
                    case 6:
                    text_4_6.setText("5"); break;
                    case 7:
                    text_4_7.setText("5"); break;
                    case 8: text_4_8.setText("5"); break;
                    case 9: text_4_9.setText("5"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("5"); break;
                    case 2:
                    text_5_2.setText("5"); break;
                    case 3:
                    text_5_3.setText("5"); break;
                    case 4:
                    text_5_4.setText("5"); break;
                    case 5:
                    text_5_5.setText("5"); break;
                    case 6:
                    text_5_6.setText("5"); break;
                    case 7:
                    text_5_7.setText("5"); break;
                    case 8: text_5_8.setText("5"); break;
                    case 9: text_5_9.setText("5"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("5"); break;
                    case 2:
                    text_6_2.setText("5"); break;
                    case 3:
                    text_6_3.setText("5"); break;
                    case 4:
                    text_6_4.setText("5"); break;
                    case 5:
                    text_6_5.setText("5"); break;
                    case 6:
                    text_6_6.setText("5"); break;
                    case 7:
                    text_6_7.setText("5"); break;
                    case 8: text_6_8.setText("5"); break;
                    case 9: text_6_9.setText("5"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("6"); break;
                    case 2: text_1_2.setText("6"); break;
                    case 3: text_1_3.setText("6"); break;
                    case 4: text_1_4.setText("6"); break;
                    case 5: text_1_5.setText("6"); break;
                    case 6: text_1_6.setText("6"); break;
                    case 7: text_1_7.setText("6"); break;
                    case 8: text_1_8.setText("6"); break;
                    case 9: text_1_9.setText("6"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("6"); break;
                    case 2:
                    text_2_2.setText("6"); break;
                    case 3:
                    text_2_3.setText("6"); break;
                    case 4:
                    text_2_4.setText("6"); break;
                    case 5:
                    text_2_5.setText("6"); break;
                    case 6:
                    text_2_6.setText("6"); break;
                    case 7:
                    text_2_7.setText("6"); break;
                    case 8: text_2_8.setText("6"); break;
                    case 9: text_2_9.setText("6"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("6"); break;
                    case 2:
                    text_3_2.setText("6"); break;
                    case 3:
                    text_3_3.setText("6"); break;
                    case 4:
                    text_3_4.setText("6"); break;
                    case 5:
                    text_3_5.setText("6"); break;
                    case 6:
                    text_3_6.setText("6"); break;
                    case 7:
                    text_3_7.setText("6"); break;
                    case 8: text_3_8.setText("6"); break;
                    case 9: text_3_9.setText("6"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("6"); break;
                    case 2:
                    text_4_2.setText("6"); break;
                    case 3:
                    text_4_3.setText("6"); break;
                    case 4:
                    text_4_4.setText("6"); break;
                    case 5:
                    text_4_5.setText("6"); break;
                    case 6:
                    text_4_6.setText("6"); break;
                    case 7:
                    text_4_7.setText("6"); break;
                    case 8: text_4_8.setText("6"); break;
                    case 9: text_4_9.setText("6"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("6"); break;
                    case 2:
                    text_5_2.setText("6"); break;
                    case 3:
                    text_5_3.setText("6"); break;
                    case 4:
                    text_5_4.setText("6"); break;
                    case 5:
                    text_5_5.setText("6"); break;
                    case 6:
                    text_5_6.setText("6"); break;
                    case 7:
                    text_5_7.setText("6"); break;
                    case 8: text_5_8.setText("6"); break;
                    case 9: text_5_9.setText("6"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("6"); break;
                    case 2:
                    text_6_2.setText("6"); break;
                    case 3:
                    text_6_3.setText("6"); break;
                    case 4:
                    text_6_4.setText("6"); break;
                    case 5:
                    text_6_5.setText("6"); break;
                    case 6:
                    text_6_6.setText("6"); break;
                    case 7:
                    text_6_7.setText("6"); break;
                    case 8: text_6_8.setText("6"); break;
                    case 9: text_6_9.setText("6"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("7"); break;
                    case 2: text_1_2.setText("7"); break;
                    case 3: text_1_3.setText("7"); break;
                    case 4: text_1_4.setText("7"); break;
                    case 5: text_1_5.setText("7"); break;
                    case 6: text_1_6.setText("7"); break;
                    case 7: text_1_7.setText("7"); break;
                    case 8: text_1_8.setText("7"); break;
                    case 9: text_1_9.setText("7"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("7"); break;
                    case 2:
                    text_2_2.setText("7"); break;
                    case 3:
                    text_2_3.setText("7"); break;
                    case 4:
                    text_2_4.setText("7"); break;
                    case 5:
                    text_2_5.setText("7"); break;
                    case 6:
                    text_2_6.setText("7"); break;
                    case 7:
                    text_2_7.setText("7"); break;
                    case 8: text_2_8.setText("7"); break;
                    case 9: text_2_9.setText("7"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("7"); break;
                    case 2:
                    text_3_2.setText("7"); break;
                    case 3:
                    text_3_3.setText("7"); break;
                    case 4:
                    text_3_4.setText("7"); break;
                    case 5:
                    text_3_5.setText("7"); break;
                    case 6:
                    text_3_6.setText("7"); break;
                    case 7:
                    text_3_7.setText("7"); break;
                    case 8: text_3_8.setText("7"); break;
                    case 9: text_3_9.setText("7"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("7"); break;
                    case 2:
                    text_4_2.setText("7"); break;
                    case 3:
                    text_4_3.setText("7"); break;
                    case 4:
                    text_4_4.setText("7"); break;
                    case 5:
                    text_4_5.setText("7"); break;
                    case 6:
                    text_4_6.setText("7"); break;
                    case 7:
                    text_4_7.setText("7"); break;
                    case 8: text_4_8.setText("7"); break;
                    case 9: text_4_9.setText("7"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("7"); break;
                    case 2:
                    text_5_2.setText("7"); break;
                    case 3:
                    text_5_3.setText("7"); break;
                    case 4:
                    text_5_4.setText("7"); break;
                    case 5:
                    text_5_5.setText("7"); break;
                    case 6:
                    text_5_6.setText("7"); break;
                    case 7:
                    text_5_7.setText("7"); break;
                    case 8: text_5_8.setText("7"); break;
                    case 9: text_5_9.setText("7"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("7"); break;
                    case 2:
                    text_6_2.setText("7"); break;
                    case 3:
                    text_6_3.setText("7"); break;
                    case 4:
                    text_6_4.setText("7"); break;
                    case 5:
                    text_6_5.setText("7"); break;
                    case 6:
                    text_6_6.setText("7"); break;
                    case 7:
                    text_6_7.setText("7"); break;
                    case 8: text_6_8.setText("7"); break;
                    case 9: text_6_9.setText("7"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("8"); break;
                    case 2: text_1_2.setText("8"); break;
                    case 3: text_1_3.setText("8"); break;
                    case 4: text_1_4.setText("8"); break;
                    case 5: text_1_5.setText("8"); break;
                    case 6: text_1_6.setText("8"); break;
                    case 7: text_1_7.setText("8"); break;
                    case 8: text_1_8.setText("8"); break;
                    case 9: text_1_9.setText("8"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("8"); break;
                    case 2:
                    text_2_2.setText("8"); break;
                    case 3:
                    text_2_3.setText("8"); break;
                    case 4:
                    text_2_4.setText("8"); break;
                    case 5:
                    text_2_5.setText("8"); break;
                    case 6:
                    text_2_6.setText("8"); break;
                    case 7:
                    text_2_7.setText("8"); break;
                    case 8: text_2_8.setText("8"); break;
                    case 9: text_2_9.setText("8"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("8"); break;
                    case 2:
                    text_3_2.setText("8"); break;
                    case 3:
                    text_3_3.setText("8"); break;
                    case 4:
                    text_3_4.setText("8"); break;
                    case 5:
                    text_3_5.setText("8"); break;
                    case 6:
                    text_3_6.setText("8"); break;
                    case 7:
                    text_3_7.setText("8"); break;
                    case 8: text_3_8.setText("8"); break;
                    case 9: text_3_9.setText("8"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("8"); break;
                    case 2:
                    text_4_2.setText("8"); break;
                    case 3:
                    text_4_3.setText("8"); break;
                    case 4:
                    text_4_4.setText("8"); break;
                    case 5:
                    text_4_5.setText("8"); break;
                    case 6:
                    text_4_6.setText("8"); break;
                    case 7:
                    text_4_7.setText("8"); break;
                    case 8: text_4_8.setText("8"); break;
                    case 9: text_4_9.setText("8"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("8"); break;
                    case 2:
                    text_5_2.setText("8"); break;
                    case 3:
                    text_5_3.setText("8"); break;
                    case 4:
                    text_5_4.setText("8"); break;
                    case 5:
                    text_5_5.setText("8"); break;
                    case 6:
                    text_5_6.setText("8"); break;
                    case 7:
                    text_5_7.setText("8"); break;
                    case 8: text_5_8.setText("8"); break;
                    case 9: text_5_9.setText("8"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("8"); break;
                    case 2:
                    text_6_2.setText("8"); break;
                    case 3:
                    text_6_3.setText("8"); break;
                    case 4:
                    text_6_4.setText("8"); break;
                    case 5:
                    text_6_5.setText("8"); break;
                    case 6:
                    text_6_6.setText("8"); break;
                    case 7:
                    text_6_7.setText("8"); break;
                    case 8: text_6_8.setText("8"); break;
                    case 9: text_6_9.setText("8"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("9"); break;
                    case 2: text_1_2.setText("9"); break;
                    case 3: text_1_3.setText("9"); break;
                    case 4: text_1_4.setText("9"); break;
                    case 5: text_1_5.setText("9"); break;
                    case 6: text_1_6.setText("9"); break;
                    case 7: text_1_7.setText("9"); break;
                    case 8: text_1_8.setText("9"); break;
                    case 9: text_1_9.setText("9"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("9"); break;
                    case 2:
                    text_2_2.setText("9"); break;
                    case 3:
                    text_2_3.setText("9"); break;
                    case 4:
                    text_2_4.setText("9"); break;
                    case 5:
                    text_2_5.setText("9"); break;
                    case 6:
                    text_2_6.setText("9"); break;
                    case 7:
                    text_2_7.setText("9"); break;
                    case 8: text_2_8.setText("9"); break;
                    case 9: text_2_9.setText("9"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("9"); break;
                    case 2:
                    text_3_2.setText("9"); break;
                    case 3:
                    text_3_3.setText("9"); break;
                    case 4:
                    text_3_4.setText("9"); break;
                    case 5:
                    text_3_5.setText("9"); break;
                    case 6:
                    text_3_6.setText("9"); break;
                    case 7:
                    text_3_7.setText("9"); break;
                    case 8: text_3_8.setText("9"); break;
                    case 9: text_3_9.setText("9"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("9"); break;
                    case 2:
                    text_4_2.setText("9"); break;
                    case 3:
                    text_4_3.setText("9"); break;
                    case 4:
                    text_4_4.setText("9"); break;
                    case 5:
                    text_4_5.setText("9"); break;
                    case 6:
                    text_4_6.setText("9"); break;
                    case 7:
                    text_4_7.setText("9"); break;
                    case 8: text_4_8.setText("9"); break;
                    case 9: text_4_9.setText("9"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("9"); break;
                    case 2:
                    text_5_2.setText("9"); break;
                    case 3:
                    text_5_3.setText("9"); break;
                    case 4:
                    text_5_4.setText("9"); break;
                    case 5:
                    text_5_5.setText("9"); break;
                    case 6:
                    text_5_6.setText("9"); break;
                    case 7:
                    text_5_7.setText("9"); break;
                    case 8: text_5_8.setText("9"); break;
                    case 9: text_5_9.setText("9"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("9"); break;
                    case 2:
                    text_6_2.setText("9"); break;
                    case 3:
                    text_6_3.setText("9"); break;
                    case 4:
                    text_6_4.setText("9"); break;
                    case 5:
                    text_6_5.setText("9"); break;
                    case 6:
                    text_6_6.setText("9"); break;
                    case 7:
                    text_6_7.setText("9"); break;
                    case 8: text_6_8.setText("9"); break;
                    case 9: text_6_9.setText("9"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("+"); break;
                    case 2: text_1_2.setText("+"); break;
                    case 3: text_1_3.setText("+"); break;
                    case 4: text_1_4.setText("+"); break;
                    case 5: text_1_5.setText("+"); break;
                    case 6: text_1_6.setText("+"); break;
                    case 7: text_1_7.setText("+"); break;
                    case 8: text_1_8.setText("+"); break;
                    case 9: text_1_9.setText("+"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("+"); break;
                    case 2:
                    text_2_2.setText("+"); break;
                    case 3:
                    text_2_3.setText("+"); break;
                    case 4:
                    text_2_4.setText("+"); break;
                    case 5:
                    text_2_5.setText("+"); break;
                    case 6:
                    text_2_6.setText("+"); break;
                    case 7:
                    text_2_7.setText("+"); break;
                    case 8: text_2_8.setText("+"); break;
                    case 9: text_2_9.setText("+"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("+"); break;
                    case 2:
                    text_3_2.setText("+"); break;
                    case 3:
                    text_3_3.setText("+"); break;
                    case 4:
                    text_3_4.setText("+"); break;
                    case 5:
                    text_3_5.setText("+"); break;
                    case 6:
                    text_3_6.setText("+"); break;
                    case 7:
                    text_3_7.setText("+"); break;
                    case 8: text_3_8.setText("+"); break;
                    case 9: text_3_9.setText("+"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("+"); break;
                    case 2:
                    text_4_2.setText("+"); break;
                    case 3:
                    text_4_3.setText("+"); break;
                    case 4:
                    text_4_4.setText("+"); break;
                    case 5:
                    text_4_5.setText("+"); break;
                    case 6:
                    text_4_6.setText("+"); break;
                    case 7:
                    text_4_7.setText("+"); break;
                    case 8: text_4_8.setText("+"); break;
                    case 9: text_4_9.setText("+"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("+"); break;
                    case 2:
                    text_5_2.setText("+"); break;
                    case 3:
                    text_5_3.setText("+"); break;
                    case 4:
                    text_5_4.setText("+"); break;
                    case 5:
                    text_5_5.setText("+"); break;
                    case 6:
                    text_5_6.setText("+"); break;
                    case 7:
                    text_5_7.setText("+"); break;
                    case 8: text_5_8.setText("+"); break;
                    case 9: text_5_9.setText("+"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("+"); break;
                    case 2:
                    text_6_2.setText("+"); break;
                    case 3:
                    text_6_3.setText("+"); break;
                    case 4:
                    text_6_4.setText("+"); break;
                    case 5:
                    text_6_5.setText("+"); break;
                    case 6:
                    text_6_6.setText("+"); break;
                    case 7:
                    text_6_7.setText("+"); break;
                    case 8: text_6_8.setText("+"); break;
                    case 9: text_6_9.setText("+"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("-"); break;
                    case 2: text_1_2.setText("-"); break;
                    case 3: text_1_3.setText("-"); break;
                    case 4: text_1_4.setText("-"); break;
                    case 5: text_1_5.setText("-"); break;
                    case 6: text_1_6.setText("-"); break;
                    case 7: text_1_7.setText("-"); break;
                    case 8: text_1_8.setText("-"); break;
                    case 9: text_1_9.setText("-"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("-"); break;
                    case 2:
                    text_2_2.setText("-"); break;
                    case 3:
                    text_2_3.setText("-"); break;
                    case 4:
                    text_2_4.setText("-"); break;
                    case 5:
                    text_2_5.setText("-"); break;
                    case 6:
                    text_2_6.setText("-"); break;
                    case 7:
                    text_2_7.setText("-"); break;
                    case 8: text_2_8.setText("-"); break;
                    case 9: text_2_9.setText("-"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("-"); break;
                    case 2:
                    text_3_2.setText("-"); break;
                    case 3:
                    text_3_3.setText("-"); break;
                    case 4:
                    text_3_4.setText("-"); break;
                    case 5:
                    text_3_5.setText("-"); break;
                    case 6:
                    text_3_6.setText("-"); break;
                    case 7:
                    text_3_7.setText("-"); break;
                    case 8: text_3_8.setText("-"); break;
                    case 9: text_3_9.setText("-"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("-"); break;
                    case 2:
                    text_4_2.setText("-"); break;
                    case 3:
                    text_4_3.setText("-"); break;
                    case 4:
                    text_4_4.setText("-"); break;
                    case 5:
                    text_4_5.setText("-"); break;
                    case 6:
                    text_4_6.setText("-"); break;
                    case 7:
                    text_4_7.setText("-"); break;
                    case 8: text_4_8.setText("-"); break;
                    case 9: text_4_9.setText("-"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("-"); break;
                    case 2:
                    text_5_2.setText("-"); break;
                    case 3:
                    text_5_3.setText("-"); break;
                    case 4:
                    text_5_4.setText("-"); break;
                    case 5:
                    text_5_5.setText("-"); break;
                    case 6:
                    text_5_6.setText("-"); break;
                    case 7:
                    text_5_7.setText("-"); break;
                    case 8: text_5_8.setText("-"); break;
                    case 9: text_5_9.setText("-"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("-"); break;
                    case 2:
                    text_6_2.setText("-"); break;
                    case 3:
                    text_6_3.setText("-"); break;
                    case 4:
                    text_6_4.setText("-"); break;
                    case 5:
                    text_6_5.setText("-"); break;
                    case 6:
                    text_6_6.setText("-"); break;
                    case 7:
                    text_6_7.setText("-"); break;
                    case 8: text_6_8.setText("-"); break;
                    case 9: text_6_9.setText("-"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("*"); break;
                    case 2: text_1_2.setText("*"); break;
                    case 3: text_1_3.setText("*"); break;
                    case 4: text_1_4.setText("*"); break;
                    case 5: text_1_5.setText("*"); break;
                    case 6: text_1_6.setText("*"); break;
                    case 7: text_1_7.setText("*"); break;
                    case 8: text_1_8.setText("*"); break;
                    case 9: text_1_9.setText("*"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("*"); break;
                    case 2:
                    text_2_2.setText("*"); break;
                    case 3:
                    text_2_3.setText("*"); break;
                    case 4:
                    text_2_4.setText("*"); break;
                    case 5:
                    text_2_5.setText("*"); break;
                    case 6:
                    text_2_6.setText("*"); break;
                    case 7:
                    text_2_7.setText("*"); break;
                    case 8: text_2_8.setText("*"); break;
                    case 9: text_2_9.setText("*"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("*"); break;
                    case 2:
                    text_3_2.setText("*"); break;
                    case 3:
                    text_3_3.setText("*"); break;
                    case 4:
                    text_3_4.setText("*"); break;
                    case 5:
                    text_3_5.setText("*"); break;
                    case 6:
                    text_3_6.setText("*"); break;
                    case 7:
                    text_3_7.setText("*"); break;
                    case 8: text_3_8.setText("*"); break;
                    case 9: text_3_9.setText("*"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("*"); break;
                    case 2:
                    text_4_2.setText("*"); break;
                    case 3:
                    text_4_3.setText("*"); break;
                    case 4:
                    text_4_4.setText("*"); break;
                    case 5:
                    text_4_5.setText("*"); break;
                    case 6:
                    text_4_6.setText("*"); break;
                    case 7:
                    text_4_7.setText("*"); break;
                    case 8: text_4_8.setText("*"); break;
                    case 9: text_4_9.setText("*"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("*"); break;
                    case 2:
                    text_5_2.setText("*"); break;
                    case 3:
                    text_5_3.setText("*"); break;
                    case 4:
                    text_5_4.setText("*"); break;
                    case 5:
                    text_5_5.setText("*"); break;
                    case 6:
                    text_5_6.setText("*"); break;
                    case 7:
                    text_5_7.setText("*"); break;
                    case 8: text_5_8.setText("*"); break;
                    case 9: text_5_9.setText("*"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("*"); break;
                    case 2:
                    text_6_2.setText("*"); break;
                    case 3:
                    text_6_3.setText("*"); break;
                    case 4:
                    text_6_4.setText("*"); break;
                    case 5:
                    text_6_5.setText("*"); break;
                    case 6:
                    text_6_6.setText("*"); break;
                    case 7:
                    text_6_7.setText("*"); break;
                    case 8: text_6_8.setText("*"); break;
                    case 9: text_6_9.setText("*"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("/"); break;
                    case 2: text_1_2.setText("/"); break;
                    case 3: text_1_3.setText("/"); break;
                    case 4: text_1_4.setText("/"); break;
                    case 5: text_1_5.setText("/"); break;
                    case 6: text_1_6.setText("/"); break;
                    case 7: text_1_7.setText("/"); break;
                    case 8: text_1_8.setText("/"); break;
                    case 9: text_1_9.setText("/"); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("/"); break;
                    case 2:
                    text_2_2.setText("/"); break;
                    case 3:
                    text_2_3.setText("/"); break;
                    case 4:
                    text_2_4.setText("/"); break;
                    case 5:
                    text_2_5.setText("/"); break;
                    case 6:
                    text_2_6.setText("/"); break;
                    case 7:
                    text_2_7.setText("/"); break;
                    case 8: text_2_8.setText("/"); break;
                    case 9: text_2_9.setText("/"); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("/"); break;
                    case 2:
                    text_3_2.setText("/"); break;
                    case 3:
                    text_3_3.setText("/"); break;
                    case 4:
                    text_3_4.setText("/"); break;
                    case 5:
                    text_3_5.setText("/"); break;
                    case 6:
                    text_3_6.setText("/"); break;
                    case 7:
                    text_3_7.setText("/"); break;
                    case 8: text_3_8.setText("/"); break;
                    case 9: text_3_9.setText("/"); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("/"); break;
                    case 2:
                    text_4_2.setText("/"); break;
                    case 3:
                    text_4_3.setText("/"); break;
                    case 4:
                    text_4_4.setText("/"); break;
                    case 5:
                    text_4_5.setText("/"); break;
                    case 6:
                    text_4_6.setText("/"); break;
                    case 7:
                    text_4_7.setText("/"); break;
                    case 8: text_4_8.setText("/"); break;
                    case 9: text_4_9.setText("/"); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("/"); break;
                    case 2:
                    text_5_2.setText("/"); break;
                    case 3:
                    text_5_3.setText("/"); break;
                    case 4:
                    text_5_4.setText("/"); break;
                    case 5:
                    text_5_5.setText("/"); break;
                    case 6:
                    text_5_6.setText("/"); break;
                    case 7:
                    text_5_7.setText("/"); break;
                    case 8: text_5_8.setText("/"); break;
                    case 9: text_5_9.setText("/"); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("/"); break;
                    case 2:
                    text_6_2.setText("/"); break;
                    case 3:
                    text_6_3.setText("/"); break;
                    case 4:
                    text_6_4.setText("/"); break;
                    case 5:
                    text_6_5.setText("/"); break;
                    case 6:
                    text_6_6.setText("/"); break;
                    case 7:
                    text_6_7.setText("/"); break;
                    case 8: text_6_8.setText("/"); break;
                    case 9: text_6_9.setText("/"); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(satir <= 9){
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText("="); break;
                    case 2: text_1_2.setText("="); break;
                    case 3: text_1_3.setText("="); break;
                    case 4: text_1_4.setText("="); break;
                    case 5: text_1_5.setText("="); break;
                    case 6: text_1_6.setText("="); break;
                    case 7: text_1_7.setText("="); break;
                    case 8: text_1_8.setText("="); break;
                    case 9: text_1_9.setText("="); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText("="); break;
                    case 2:
                    text_2_2.setText("="); break;
                    case 3:
                    text_2_3.setText("="); break;
                    case 4:
                    text_2_4.setText("="); break;
                    case 5:
                    text_2_5.setText("="); break;
                    case 6:
                    text_2_6.setText("="); break;
                    case 7:
                    text_2_7.setText("="); break;
                    case 8: text_2_8.setText("="); break;
                    case 9: text_2_9.setText("="); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText("="); break;
                    case 2:
                    text_3_2.setText("="); break;
                    case 3:
                    text_3_3.setText("="); break;
                    case 4:
                    text_3_4.setText("="); break;
                    case 5:
                    text_3_5.setText("="); break;
                    case 6:
                    text_3_6.setText("="); break;
                    case 7:
                    text_3_7.setText("="); break;
                    case 8: text_3_8.setText("="); break;
                    case 9: text_3_9.setText("="); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText("="); break;
                    case 2:
                    text_4_2.setText("="); break;
                    case 3:
                    text_4_3.setText("="); break;
                    case 4:
                    text_4_4.setText("="); break;
                    case 5:
                    text_4_5.setText("="); break;
                    case 6:
                    text_4_6.setText("="); break;
                    case 7:
                    text_4_7.setText("="); break;
                    case 8: text_4_8.setText("="); break;
                    case 9: text_4_9.setText("="); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText("="); break;
                    case 2:
                    text_5_2.setText("="); break;
                    case 3:
                    text_5_3.setText("="); break;
                    case 4:
                    text_5_4.setText("="); break;
                    case 5:
                    text_5_5.setText("="); break;
                    case 6:
                    text_5_6.setText("="); break;
                    case 7:
                    text_5_7.setText("="); break;
                    case 8: text_5_8.setText("="); break;
                    case 9: text_5_9.setText("="); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText("="); break;
                    case 2:
                    text_6_2.setText("="); break;
                    case 3:
                    text_6_3.setText("="); break;
                    case 4:
                    text_6_4.setText("="); break;
                    case 5:
                    text_6_5.setText("="); break;
                    case 6:
                    text_6_6.setText("="); break;
                    case 7:
                    text_6_7.setText("="); break;
                    case 8: text_6_8.setText("="); break;
                    case 9: text_6_9.setText("="); break;
                } break;
            }
            satir++;
        }
    }//GEN-LAST:event_jButton16ActionPerformed
    public void TahminEt(){
        switch(sutun){
            case 1:
                girilen[0]=text_1_1.getText();
                girilen[1]=text_1_2.getText();
                girilen[2]=text_1_3.getText();
                girilen[3]=text_1_4.getText();
                girilen[4]=text_1_5.getText();
                girilen[5]=text_1_6.getText();
                girilen[6]=text_1_7.getText();
                girilen[7]=text_1_8.getText();
                girilen[8]=text_1_9.getText();
                break;
            case 2:
                girilen[0]=text_2_1.getText();
                girilen[1]=text_2_2.getText();
                girilen[2]=text_2_3.getText();
                girilen[3]=text_2_4.getText();
                girilen[4]=text_2_5.getText();
                girilen[5]=text_2_6.getText();
                girilen[6]=text_2_7.getText();
                girilen[7]=text_2_8.getText();
                girilen[8]=text_2_9.getText();
                break;
            case 3:
                girilen[0]=text_3_1.getText();
                girilen[1]=text_3_2.getText();
                girilen[2]=text_3_3.getText();
                girilen[3]=text_3_4.getText();
                girilen[4]=text_3_5.getText();
                girilen[5]=text_3_6.getText();
                girilen[6]=text_3_7.getText();
                girilen[7]=text_3_8.getText();
                girilen[8]=text_3_9.getText();
                break;
            case 4:
                girilen[0]=text_4_1.getText();
                girilen[1]=text_4_2.getText();
                girilen[2]=text_4_3.getText();
                girilen[3]=text_4_4.getText();
                girilen[4]=text_4_5.getText();
                girilen[5]=text_4_6.getText();
                girilen[6]=text_4_7.getText();
                girilen[7]=text_4_8.getText();
                girilen[8]=text_4_9.getText();
                break;
            case 5:
                girilen[0]=text_5_1.getText();
                girilen[1]=text_5_2.getText();
                girilen[2]=text_5_3.getText();
                girilen[3]=text_5_4.getText();
                girilen[4]=text_5_5.getText();
                girilen[5]=text_5_6.getText();
                girilen[6]=text_5_7.getText();
                girilen[7]=text_5_8.getText();
                girilen[8]=text_5_9.getText();
                break;
            case 6:
                girilen[0]=text_6_1.getText();
                girilen[1]=text_6_2.getText();
                girilen[2]=text_6_3.getText();
                girilen[3]=text_6_4.getText();
                girilen[4]=text_6_5.getText();
                girilen[5]=text_6_6.getText();
                girilen[6]=text_6_7.getText();
                girilen[7]=text_6_8.getText();
                girilen[8]=text_6_9.getText();
                break;
        }
        if(isItCorrect(girilen)==1){
            renkle(girilen);
            sutun++;
            satir=1;
        }
        else
            JOptionPane.showMessageDialog(null, "Girilen değer yanlış veya boşluklar var");
        }
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        TahminEt();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if(satir > 1){
            satir--;
            switch(sutun){
                case 1:
                switch(satir){
                    case 1: text_1_1.setText(""); break;
                    case 2: text_1_2.setText(""); break;
                    case 3: text_1_3.setText(""); break;
                    case 4: text_1_4.setText(""); break;
                    case 5: text_1_5.setText(""); break;
                    case 6: text_1_6.setText(""); break;
                    case 7: text_1_7.setText(""); break;
                    case 8: text_1_8.setText(""); break;
                    case 9: text_1_9.setText(""); break;
                } break;
                case 2:

                switch(satir){
                    case 1:
                    text_2_1.setText(""); break;
                    case 2:
                    text_2_2.setText(""); break;
                    case 3:
                    text_2_3.setText(""); break;
                    case 4:
                    text_2_4.setText(""); break;
                    case 5:
                    text_2_5.setText(""); break;
                    case 6:
                    text_2_6.setText(""); break;
                    case 7:
                    text_2_7.setText(""); break;
                    case 8: text_2_8.setText(""); break;
                    case 9: text_2_9.setText(""); break;
                } break;
                case 3:
                switch(satir){
                    case 1:
                    text_3_1.setText(""); break;
                    case 2:
                    text_3_2.setText(""); break;
                    case 3:
                    text_3_3.setText(""); break;
                    case 4:
                    text_3_4.setText(""); break;
                    case 5:
                    text_3_5.setText(""); break;
                    case 6:
                    text_3_6.setText(""); break;
                    case 7:
                    text_3_7.setText(""); break;
                    case 8: text_3_8.setText(""); break;
                    case 9: text_3_9.setText(""); break;
                } break;
                case 4:
                switch(satir){
                    case 1:
                    text_4_1.setText(""); break;
                    case 2:
                    text_4_2.setText(""); break;
                    case 3:
                    text_4_3.setText(""); break;
                    case 4:
                    text_4_4.setText(""); break;
                    case 5:
                    text_4_5.setText(""); break;
                    case 6:
                    text_4_6.setText(""); break;
                    case 7:
                    text_4_7.setText(""); break;
                    case 8: text_4_8.setText(""); break;
                    case 9: text_4_9.setText(""); break;
                } break;
                case 5:
                switch(satir){
                    case 1:
                    text_5_1.setText(""); break;
                    case 2:
                    text_5_2.setText(""); break;
                    case 3:
                    text_5_3.setText(""); break;
                    case 4:
                    text_5_4.setText(""); break;
                    case 5:
                    text_5_5.setText(""); break;
                    case 6:
                    text_5_6.setText(""); break;
                    case 7:
                    text_5_7.setText(""); break;
                    case 8: text_5_8.setText(""); break;
                    case 9: text_5_9.setText(""); break;
                } break;
                case 6:
                switch(satir){
                    case 1:
                    text_6_1.setText(""); break;
                    case 2:
                    text_6_2.setText(""); break;
                    case 3:
                    text_6_3.setText(""); break;
                    case 4:
                    text_6_4.setText(""); break;
                    case 5:
                    text_6_5.setText(""); break;
                    case 6:
                    text_6_6.setText(""); break;
                    case 7:
                    text_6_7.setText(""); break;
                    case 8: text_6_8.setText(""); break;
                    case 9: text_6_9.setText(""); break;
                } break;
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        
        try {
            File myObj = new File("istatislik.txt");
            Scanner myReader = new Scanner(myObj);
            String a=myReader.nextLine();
            String b=myReader.nextLine();
            String c=myReader.nextLine();
            String d=myReader.nextLine();
            String e=myReader.nextLine();
            myReader.close();
            a=String.valueOf(Integer.parseInt(a)+1);
            FileWriter fwrite = new FileWriter("istatislik.txt");
            PrintWriter printWriter = new PrintWriter(fwrite);
            printWriter.print(a+"\n");
            printWriter.print(b+"\n");
            printWriter.print(c+"\n");
            printWriter.print(d+"\n");
            printWriter.print(e+"\n");
            fwrite.close();
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
        
        ana_menu a = new ana_menu();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        T.start();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] stringArray;
        StringBuffer sb = new StringBuffer();
        try {  
            FileWriter fwrite = new FileWriter("DevamEt.txt");
            PrintWriter printWriter = new PrintWriter(fwrite);
            File f0 = new File("DevamEt.txt");             //file to be delete  
            f0.delete();
            f0.createNewFile();
            T.stop();
            printWriter.print(time+"\n");
            for(int i = 0; i < 9; i++) {
                sb.append(denklem[i]);
            }
            printWriter.print(sb.toString()+"\n");
            sb = new StringBuffer();    
                stringArray = new String[10];
                if(!"".equals(text_1_7.getText())){
                    stringArray[0]=text_1_1.getText();
                    stringArray[1]=text_1_2.getText();
                    stringArray[2]=text_1_3.getText();
                    stringArray[3]=text_1_4.getText();
                    stringArray[4]=text_1_5.getText();
                    stringArray[5]=text_1_6.getText();
                    stringArray[6]=text_1_7.getText();
                    stringArray[7]=text_1_8.getText();
                    stringArray[8]=text_1_9.getText();
                
                for(int i = 0; i < stringArray.length-1; i++) {
                   sb.append(stringArray[i]);
                }
                printWriter.print(sb.toString()+"\n");
                
                }
                sb = new StringBuffer();
                
                if(!"".equals(text_2_7.getText())){
                    stringArray[0]=text_2_1.getText();
                    stringArray[1]=text_2_2.getText();
                    stringArray[2]=text_2_3.getText();
                    stringArray[3]=text_2_4.getText();
                    stringArray[4]=text_2_5.getText();
                    stringArray[5]=text_2_6.getText();
                    stringArray[6]=text_2_7.getText();
                    stringArray[7]=text_2_8.getText();
                    stringArray[8]=text_2_9.getText();
                
                for(int i = 0; i < stringArray.length-1; i++) {
                   sb.append(stringArray[i]);
                }
                printWriter.print(sb.toString()+"\n");
                }
                
                sb = new StringBuffer();
                
                if(!"".equals(text_3_7.getText())){
                    stringArray[0]=text_3_1.getText();
                    stringArray[1]=text_3_2.getText();
                    stringArray[2]=text_3_3.getText();
                    stringArray[3]=text_3_4.getText();
                    stringArray[4]=text_3_5.getText();
                    stringArray[5]=text_3_6.getText();
                    stringArray[6]=text_3_7.getText();
                    stringArray[7]=text_3_8.getText();
                    stringArray[8]=text_3_9.getText();
                
                for(int i = 0; i < stringArray.length-1; i++) {
                   sb.append(stringArray[i]);
                }
                printWriter.print(sb.toString()+"\n");
                }
                sb = new StringBuffer();
                
                if(!"".equals(text_4_7.getText())){
                    stringArray[0]=text_4_1.getText();
                    stringArray[1]=text_4_2.getText();
                    stringArray[2]=text_4_3.getText();
                    stringArray[3]=text_4_4.getText();
                    stringArray[4]=text_4_5.getText();
                    stringArray[5]=text_4_6.getText();
                    stringArray[6]=text_4_7.getText();
                    stringArray[7]=text_4_8.getText();
                    stringArray[8]=text_4_9.getText();
                
                for(int i = 0; i < stringArray.length-1; i++) {
                   sb.append(stringArray[i]);
                }
                printWriter.print(sb.toString()+"\n");
                }
                sb = new StringBuffer();
                
                if(!"".equals(text_5_7.getText())){
                    stringArray[0]=text_5_1.getText();
                    stringArray[1]=text_5_2.getText();
                    stringArray[2]=text_5_3.getText();
                    stringArray[3]=text_5_4.getText();
                    stringArray[4]=text_5_5.getText();
                    stringArray[5]=text_5_6.getText();
                    stringArray[6]=text_5_7.getText();
                    stringArray[7]=text_5_8.getText();
                    stringArray[8]=text_5_9.getText();
                
                for(int i = 0; i < stringArray.length-1; i++) {
                   sb.append(stringArray[i]);
                }
                printWriter.print(sb.toString()+"\n");
                }
                sb = new StringBuffer();
                
                if(!"".equals(text_6_7.getText())){
                    stringArray[0]=text_6_1.getText();
                    stringArray[1]=text_6_2.getText();
                    stringArray[2]=text_6_3.getText();
                    stringArray[3]=text_6_4.getText();
                    stringArray[4]=text_6_5.getText();
                    stringArray[5]=text_6_6.getText();
                    stringArray[6]=text_6_7.getText();
                    stringArray[7]=text_6_8.getText();
                    stringArray[8]=text_6_9.getText();
                
                for(int i = 0; i < stringArray.length-1; i++) {
                   sb.append(stringArray[i]);
                }
                printWriter.print(sb.toString()+"\n");
                }
                fwrite.close();
                JOptionPane.showMessageDialog(null,"Oyun Kaydedildi!!!!");
                ana_menu b = new ana_menu();
                b.setVisible(true);
                this.dispose();
        }
        catch (IOException exception) {  
            System.out.println("An unexpected error is occurred.");  
            exception.printStackTrace();  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        sonucuGoster();
    }//GEN-LAST:event_jButton20ActionPerformed

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
            java.util.logging.Logger.getLogger(dokuzlu_oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dokuzlu_oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dokuzlu_oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dokuzlu_oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dokuzlu_oyun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_timer;
    private javax.swing.JTextField text_1_1;
    private javax.swing.JTextField text_1_2;
    private javax.swing.JTextField text_1_3;
    private javax.swing.JTextField text_1_4;
    private javax.swing.JTextField text_1_5;
    private javax.swing.JTextField text_1_6;
    private javax.swing.JTextField text_1_7;
    private javax.swing.JTextField text_1_8;
    private javax.swing.JTextField text_1_9;
    private javax.swing.JTextField text_2_1;
    private javax.swing.JTextField text_2_2;
    private javax.swing.JTextField text_2_3;
    private javax.swing.JTextField text_2_4;
    private javax.swing.JTextField text_2_5;
    private javax.swing.JTextField text_2_6;
    private javax.swing.JTextField text_2_7;
    private javax.swing.JTextField text_2_8;
    private javax.swing.JTextField text_2_9;
    private javax.swing.JTextField text_3_1;
    private javax.swing.JTextField text_3_2;
    private javax.swing.JTextField text_3_3;
    private javax.swing.JTextField text_3_4;
    private javax.swing.JTextField text_3_5;
    private javax.swing.JTextField text_3_6;
    private javax.swing.JTextField text_3_7;
    private javax.swing.JTextField text_3_8;
    private javax.swing.JTextField text_3_9;
    private javax.swing.JTextField text_4_1;
    private javax.swing.JTextField text_4_2;
    private javax.swing.JTextField text_4_3;
    private javax.swing.JTextField text_4_4;
    private javax.swing.JTextField text_4_5;
    private javax.swing.JTextField text_4_6;
    private javax.swing.JTextField text_4_7;
    private javax.swing.JTextField text_4_8;
    private javax.swing.JTextField text_4_9;
    private javax.swing.JTextField text_5_1;
    private javax.swing.JTextField text_5_2;
    private javax.swing.JTextField text_5_3;
    private javax.swing.JTextField text_5_4;
    private javax.swing.JTextField text_5_5;
    private javax.swing.JTextField text_5_6;
    private javax.swing.JTextField text_5_7;
    private javax.swing.JTextField text_5_8;
    private javax.swing.JTextField text_5_9;
    private javax.swing.JTextField text_6_1;
    private javax.swing.JTextField text_6_2;
    private javax.swing.JTextField text_6_3;
    private javax.swing.JTextField text_6_4;
    private javax.swing.JTextField text_6_5;
    private javax.swing.JTextField text_6_6;
    private javax.swing.JTextField text_6_7;
    private javax.swing.JTextField text_6_8;
    private javax.swing.JTextField text_6_9;
    // End of variables declaration//GEN-END:variables
}
