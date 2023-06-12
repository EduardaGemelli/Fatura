
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class consumo_energia extends javax.swing.JFrame {
 
    String nota = "";
    int r=0;
    
    double taxas = 45.35;
    double valorTotal = 0;
    double kwh = 0;
    double consumo = 0;
    
    public consumo_energia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jl_vencimento = new javax.swing.JLabel();
        jtf_vencimento = new javax.swing.JTextField();
        jl_unidadeC = new javax.swing.JLabel();
        jtf_unidadeC = new javax.swing.JTextField();
        jl_kwh = new javax.swing.JLabel();
        jtf_kwh = new javax.swing.JTextField();
        jtf_valorTotal = new javax.swing.JTextField();
        jb_nota = new javax.swing.JButton();
        jl_img = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jl_nome = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        jl_sexo = new javax.swing.JLabel();
        jtf_sexo = new javax.swing.JTextField();
        jl_cpf = new javax.swing.JLabel();
        jtf_cpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf_telefone = new javax.swing.JTextField();
        jl_nascimento = new javax.swing.JLabel();
        jtf_nascimento = new javax.swing.JTextField();
        jl_email = new javax.swing.JLabel();
        jtf_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jl_rua = new javax.swing.JLabel();
        jtf_rua = new javax.swing.JTextField();
        jl_numero = new javax.swing.JLabel();
        jtf_num = new javax.swing.JTextField();
        jl_bairro = new javax.swing.JLabel();
        jtf_bairro = new javax.swing.JTextField();
        jl_cep = new javax.swing.JLabel();
        jtf_cep = new javax.swing.JTextField();
        jl_cidade = new javax.swing.JLabel();
        jtf_cidade = new javax.swing.JTextField();
        jl_estado = new javax.swing.JLabel();
        jtf_estado = new javax.swing.JTextField();
        jb_calculo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_consumo = new javax.swing.JTextField();
        jb_reset = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FATURA");

        jl_vencimento.setText("Data vencimento:");

        jtf_vencimento.setText(" / /");

        jl_unidadeC.setText("Unidade consumidora:");

        jtf_unidadeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_unidadeCActionPerformed(evt);
            }
        });

        jl_kwh.setText("KwH:");

        jb_nota.setText("Gerar Nota");
        jb_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_notaActionPerformed(evt);
            }
        });

        jl_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/luz.png"))); // NOI18N
        jl_img.setText("jLabel4");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais:"));

        jl_nome.setText("Nome completo:");

        jtf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nomeActionPerformed(evt);
            }
        });

        jl_sexo.setText("Sexo:");

        jl_cpf.setText("CPF:");

        jLabel2.setText("Telefone:");

        jl_nascimento.setText("Data nascimento:");

        jtf_nascimento.setText(" / /");

        jl_email.setText("E-mail:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_nome)
                    .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtf_email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_nascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(jtf_sexo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_cpf, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_telefone, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jtf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jLabel3.setText("Preencha todos os dados corretamente.");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados residência:"));

        jl_rua.setText("Rua:");

        jl_numero.setText("Número:");

        jl_bairro.setText("Bairro:");

        jl_cep.setText("CEP:");

        jl_cidade.setText("Cidade:");

        jl_estado.setText("Estado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_cidade)
                    .addComponent(jtf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_cep)
                    .addComponent(jtf_num)
                    .addComponent(jl_numero, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jl_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_estado))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_rua)
                    .addComponent(jl_numero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_bairro, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jtf_cep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_estado)
                    .addComponent(jl_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jb_calculo.setText("Calcular Valor ");
        jb_calculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calculoActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Taxas:"));

        jLabel4.setText("Tarifa: R$0,80");

        jLabel5.setText("Ilum. pública: R$42,10");

        jLabel6.setText("Imposto: R$2,45");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel7.setText("Consumo:");

        jtf_consumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_consumoActionPerformed(evt);
            }
        });

        jb_reset.setText("Nova consulta");
        jb_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_reset))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_calculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jl_kwh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_consumo)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(jtf_vencimento))
                                .addGap(47, 47, 47)
                                .addComponent(jtf_kwh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_unidadeC)
                            .addComponent(jtf_unidadeC, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jl_unidadeC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_unidadeC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jl_img))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_kwh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_vencimento, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jtf_kwh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_valorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_calculo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_reset))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nomeActionPerformed

    private void jb_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_notaActionPerformed
        String nome = jtf_nome.getText();
        String sexo = jtf_sexo.getText();
        String cpf = jtf_cpf.getText();
        String nascimento = jtf_nascimento.getText();
        String telefone = jtf_telefone.getText();
        String email = jtf_email.getText();
        String unidadeConsumidora = jtf_unidadeC.getText();
        String rua = jtf_rua.getText();
        String numero = jtf_num.getText();
        String bairro = jtf_bairro.getText();
        String cidade = jtf_cidade.getText();
        String estado = jtf_estado.getText();
        String cep = jtf_cep.getText();
        String vencimento = jtf_vencimento.getText();
              
        
                if(nome.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo Nome.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                } 
                if(nascimento.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo Data de nascimento.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                if(telefone.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo Telefone.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                } 
                if(cpf.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo CPF.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                if(email.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo E-mail.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                if(rua.length() == 0){
                     JOptionPane.showMessageDialog(null, "Preencher o campo Rua.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                if(numero.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo Número.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                if(bairro.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo Bairro.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                if(cidade.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo Cidade.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                if(estado.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo Estado.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                if(cep.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo CEP.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                if(sexo.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo Sexo.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                if(unidadeConsumidora.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo Unidade Consumidora.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                if(vencimento.length() == 0){
                    JOptionPane.showMessageDialog(null, "Preencher o campo data de vencimento.", "Atenção!", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                
                
                    
            String nota = "Dados cliente: \n" + " Nome: "+jtf_nome.getText()+"\n Sexo: " +jtf_sexo.getText() + 
                "\n Portador(a) do CPF: "+jtf_cpf.getText()+ "\n Data de nascimento: "+jtf_nascimento.getText() + 
                "\n Celular: "+jtf_telefone.getText() + "\n E-mail: "+jtf_email.getText() + 
                "\n\nDados residência: \n" + " Unidade consumidora: "+jtf_unidadeC.getText() + "\n Rua: " +jtf_rua.getText() + 
                "\n Número:" + jtf_num.getText()+ "\n Bairro: "+jtf_bairro.getText()+ "\n CEP: " +jtf_cep.getText() + "\n kWh: "+jtf_kwh.getText() + 
                "\n Data de vencimento: " + jtf_vencimento.getText() + "\n Valor total: R$"+jtf_valorTotal.getText();
                
                byte[] buff=nota.getBytes(); 
                
                    try{
                        r++;
                        RandomAccessFile raf = new RandomAccessFile("C:\\consumoEnergia\\fatura" +jtf_nome.getText()+".txt", "rw");
                        raf.write(buff);
            
                    }
                    catch(IOException ex){
                        ex.printStackTrace();
                    }
                
           
                
    }//GEN-LAST:event_jb_notaActionPerformed

    private void jtf_unidadeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_unidadeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_unidadeCActionPerformed

    private void jb_calculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calculoActionPerformed
        try{
            
            consumo = Double.parseDouble(jtf_consumo.getText());
            kwh = Double.parseDouble(jtf_kwh.getText());
            jtf_valorTotal.setText(Double.toString(valorTotal));
            
            valorTotal = (consumo * kwh) + taxas;
            
        }
        catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Formato incorreto! Digite um número.", "Atenção!", JOptionPane.WARNING_MESSAGE);
           return;
        }
        if(consumo == 0){
            JOptionPane.showMessageDialog(null, "Preencher o campo Consumo.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(kwh == 0){
            JOptionPane.showMessageDialog(null, "Preencher o campo kWh.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_jb_calculoActionPerformed

    private void jtf_consumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_consumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_consumoActionPerformed

    private void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_resetActionPerformed
        jtf_nome.setText(" ");
        jtf_sexo.setText(" ");
        jtf_cpf.setText(" ");
        jtf_nascimento.setText(" ");
        jtf_telefone.setText(" ");
        jtf_email.setText(" ");
        jtf_unidadeC.setText(" ");
        jtf_rua.setText(" ");
        jtf_num.setText(" ");
        jtf_bairro.setText(" ");
        jtf_cidade.setText(" ");
        jtf_estado.setText(" ");
        jtf_cep.setText(" ");
        jtf_vencimento.setText(" ");
        jtf_kwh.setText(" ");
        jtf_consumo.setText(" ");
        jtf_valorTotal.setText(" ");
        
    }//GEN-LAST:event_jb_resetActionPerformed

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
            java.util.logging.Logger.getLogger(consumo_energia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consumo_energia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consumo_energia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consumo_energia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consumo_energia().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jb_calculo;
    private javax.swing.JButton jb_nota;
    private javax.swing.JButton jb_reset;
    private javax.swing.JLabel jl_bairro;
    private javax.swing.JLabel jl_cep;
    private javax.swing.JLabel jl_cidade;
    private javax.swing.JLabel jl_cpf;
    private javax.swing.JLabel jl_email;
    private javax.swing.JLabel jl_estado;
    private javax.swing.JLabel jl_img;
    private javax.swing.JLabel jl_kwh;
    private javax.swing.JLabel jl_nascimento;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_numero;
    private javax.swing.JLabel jl_rua;
    private javax.swing.JLabel jl_sexo;
    private javax.swing.JLabel jl_unidadeC;
    private javax.swing.JLabel jl_vencimento;
    private javax.swing.JTextField jtf_bairro;
    private javax.swing.JTextField jtf_cep;
    private javax.swing.JTextField jtf_cidade;
    private javax.swing.JTextField jtf_consumo;
    private javax.swing.JTextField jtf_cpf;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_estado;
    private javax.swing.JTextField jtf_kwh;
    private javax.swing.JTextField jtf_nascimento;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JTextField jtf_num;
    private javax.swing.JTextField jtf_rua;
    private javax.swing.JTextField jtf_sexo;
    private javax.swing.JTextField jtf_telefone;
    private javax.swing.JTextField jtf_unidadeC;
    private javax.swing.JTextField jtf_valorTotal;
    private javax.swing.JTextField jtf_vencimento;
    // End of variables declaration//GEN-END:variables
}
