package ATCS;

/**
 * Created with IntelliJ IDEA.
 * User: Elod-Arpad
 * Date: 11/2/13
 * Time: 3:19 PM
 */
public class MainWindow extends javax.swing.JFrame {


    Airport airport;

    /** Creates new form MainWindow */
    private MainWindow() {
        this.airport = Airport.getInstance();
        initComponents();
        AirportSymbol airportSymbol = new AirportSymbol(airport);
        airport.setSymbol(airportSymbol);
        planesPanel.add(airportSymbol);
        airportSymbol.setBounds(planesPanel.getBounds());
        airportSymbol.setVisible(true);
        setWeatherLabel(airport.getWeatherCondition());
        weatherSlider.setValue(airport.getWeatherCondition());
    }

    private static class SingletonHolder {
        private static final MainWindow INSTANCE = new MainWindow();
    }

    /**
     *
     * @return
     */
    protected static MainWindow getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private void setWeatherLabel(int weather) {
        switch (weather) {
            case 0: weatherLabel.setText("No fuel consumption"); landingDeniedLabel.setVisible(false); break;
            case 1: weatherLabel.setText("1 fuel/step"); landingDeniedLabel.setVisible(false); break;
            case 2: weatherLabel.setText("2 fuel/step"); landingDeniedLabel.setVisible(false); break;
            case 3: weatherLabel.setText("3 fuel/step"); landingDeniedLabel.setVisible(true); break;
            case 4: weatherLabel.setText("Meteor rain!!!"); landingDeniedLabel.setVisible(true); break;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sOptionsDialog = new javax.swing.JDialog();
        speedSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        sOptionsOK = new javax.swing.JButton();
        sOptionsCancel = new javax.swing.JButton();
        defectSlider = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        currentSpeed = new javax.swing.JLabel();
        currentProbability = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        arrivingFuelField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        departingFuelField = new javax.swing.JTextField();
        takeRoleDialog = new javax.swing.JDialog();
        takeRoleOK = new javax.swing.JButton();
        takeRoleCancel = new javax.swing.JButton();
        airportLocationBox = new javax.swing.JComboBox();
        addressField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        connectButton = new javax.swing.JButton();
        newPlane = new javax.swing.JButton();
        planesPanel = new javax.swing.JPanel();
        sOptions = new javax.swing.JButton();
        takeRoleButton = new javax.swing.JButton();
        weatherSlider = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        weatherLabel = new javax.swing.JLabel();
        landingDeniedLabel = new javax.swing.JLabel();
        sendPlane = new javax.swing.JButton();
        destinationBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        sOptionsDialog.setTitle("Simulation options");
        sOptionsDialog.setBounds(new java.awt.Rectangle(750, 0, 400, 300));

        speedSlider.setMajorTickSpacing(6);
        speedSlider.setMaximum(1300);
        speedSlider.setMinimum(1000);
        speedSlider.setPaintTicks(true);
        speedSlider.setSnapToTicks(true);
        speedSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        speedSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                speedSliderMouseReleased(evt);
            }
        });

        jLabel1.setText("Speed of the airplanes");

        sOptionsOK.setText("Apply");
        sOptionsOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sOptionsOKActionPerformed(evt);
            }
        });

        sOptionsCancel.setText("Close");
        sOptionsCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sOptionsCancelActionPerformed(evt);
            }
        });

        defectSlider.setMajorTickSpacing(2);
        defectSlider.setPaintTicks(true);
        defectSlider.setSnapToTicks(true);
        defectSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                defectSliderMouseReleased(evt);
            }
        });

        jLabel2.setText("Probability of defect");

        currentSpeed.setText("jLabel3");

        currentProbability.setText("jLabel3");

        jLabel4.setText("Fuel for arriving planes");

        arrivingFuelField.setText("jTextField1");
        arrivingFuelField.setInputVerifier(new FuelVerifier());

        jLabel5.setText("Fuel for departing planes");

        departingFuelField.setText("jTextField2");

        javax.swing.GroupLayout sOptionsDialogLayout = new javax.swing.GroupLayout(sOptionsDialog.getContentPane());
        sOptionsDialog.getContentPane().setLayout(sOptionsDialogLayout);
        sOptionsDialogLayout.setHorizontalGroup(
                sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sOptionsDialogLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(sOptionsDialogLayout.createSequentialGroup()
                                                .addComponent(sOptionsOK)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                                                .addComponent(sOptionsCancel))
                                        .addGroup(sOptionsDialogLayout.createSequentialGroup()
                                                .addGroup(sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(sOptionsDialogLayout.createSequentialGroup()
                                                                .addGroup(sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(currentSpeed)
                                                                        .addComponent(jLabel1))
                                                                .addGap(18, 18, 18))
                                                        .addGroup(sOptionsDialogLayout.createSequentialGroup()
                                                                .addGroup(sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(currentProbability)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5))
                                                                .addGap(29, 29, 29)))
                                                .addGroup(sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(defectSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                                        .addComponent(speedSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                                        .addGroup(sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(departingFuelField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(arrivingFuelField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))))
                                .addContainerGap())
        );
        sOptionsDialogLayout.setVerticalGroup(
                sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sOptionsDialogLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(sOptionsDialogLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(currentSpeed))
                                        .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(sOptionsDialogLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(currentProbability))
                                        .addComponent(defectSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(arrivingFuelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(departingFuelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                .addGroup(sOptionsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sOptionsOK)
                                        .addComponent(sOptionsCancel))
                                .addContainerGap())
        );

        takeRoleDialog.setTitle("What airport is this?");
        takeRoleDialog.setBounds(new java.awt.Rectangle(750, 350, 300, 200));
        takeRoleDialog.setMinimumSize(new java.awt.Dimension(300, 200));

        takeRoleOK.setText("OK");
        takeRoleOK.setEnabled(false);
        takeRoleOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeRoleOKActionPerformed(evt);
            }
        });

        takeRoleCancel.setText("Cancel");
        takeRoleCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeRoleCancelActionPerformed(evt);
            }
        });

        airportLocationBox.setEnabled(false);
        airportLocationBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airportLocationBoxActionPerformed(evt);
            }
        });

        addressField.setText("localhost");

        jLabel7.setText("Address of central database");

        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout takeRoleDialogLayout = new javax.swing.GroupLayout(takeRoleDialog.getContentPane());
        takeRoleDialog.getContentPane().setLayout(takeRoleDialogLayout);
        takeRoleDialogLayout.setHorizontalGroup(
                takeRoleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(takeRoleDialogLayout.createSequentialGroup()
                                .addGroup(takeRoleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(takeRoleDialogLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(takeRoleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(takeRoleDialogLayout.createSequentialGroup()
                                                                .addGap(53, 53, 53)
                                                                .addComponent(connectButton))
                                                        .addGroup(takeRoleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(takeRoleDialogLayout.createSequentialGroup()
                                                                        .addComponent(takeRoleOK)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(takeRoleCancel))
                                                                .addGroup(takeRoleDialogLayout.createSequentialGroup()
                                                                        .addComponent(jLabel7)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(takeRoleDialogLayout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(airportLocationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(108, Short.MAX_VALUE))
        );
        takeRoleDialogLayout.setVerticalGroup(
                takeRoleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(takeRoleDialogLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(takeRoleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(connectButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(airportLocationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(takeRoleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(takeRoleCancel)
                                        .addComponent(takeRoleOK))
                                .addGap(272, 272, 272))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Air Traffic Control");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        newPlane.setText("New Plane");
        newPlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPlaneActionPerformed(evt);
            }
        });

        planesPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        planesPanel.setName("planesPanel"); // NOI18N
        planesPanel.setPreferredSize(new java.awt.Dimension(534, 478));
        planesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planesPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout planesPanelLayout = new javax.swing.GroupLayout(planesPanel);
        planesPanel.setLayout(planesPanelLayout);
        planesPanelLayout.setHorizontalGroup(
                planesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 520, Short.MAX_VALUE)
        );
        planesPanelLayout.setVerticalGroup(
                planesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 474, Short.MAX_VALUE)
        );

        sOptions.setText("Simulation options");
        sOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sOptionsActionPerformed(evt);
            }
        });

        takeRoleButton.setText("Take role");
        takeRoleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeRoleButtonActionPerformed(evt);
            }
        });

        weatherSlider.setMajorTickSpacing(1);
        weatherSlider.setMaximum(4);
        weatherSlider.setPaintTicks(true);
        weatherSlider.setSnapToTicks(true);
        weatherSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                weatherSliderMouseReleased(evt);
            }
        });

        jLabel3.setText("Weather");

        weatherLabel.setText("jLabel4");

        landingDeniedLabel.setForeground(new java.awt.Color(255, 51, 51));
        landingDeniedLabel.setText("LANDING DENIED!");

        sendPlane.setText("Send Plane");
        sendPlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPlaneActionPerformed(evt);
            }
        });

        destinationBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UNSPECIFIED" }));

        jLabel6.setText("Destination");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(weatherLabel)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                                .addComponent(weatherSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(planesPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(72, 72, 72)
                                                        .addComponent(newPlane))
                                                .addComponent(landingDeniedLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(destinationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(sendPlane)
                                        .addComponent(sOptions)
                                        .addComponent(takeRoleButton))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(planesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(newPlane)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(destinationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sendPlane)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(takeRoleButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(weatherLabel))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(landingDeniedLabel)
                                                .addComponent(weatherSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newPlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPlaneActionPerformed
        Airplane newplane = airport.newPlane();
        planesPanel.add(newplane);
        planesPanel.setComponentZOrder(newplane, 0);
        newplane.setBounds(planesPanel.getBounds());
        newplane.setVisible(true);
    }//GEN-LAST:event_newPlaneActionPerformed

    private void sOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sOptionsActionPerformed
        defectSlider.setValue(airport.getProbabilityForDefect());
        speedSlider.setValue(speedSlider.getMaximum() - airport.getSimulationSpeed());
        currentSpeed.setText(Integer.toString(speedSlider.getValue()));
        currentProbability.setText(Double.toString((double)defectSlider.getValue()/100) + "%");
        arrivingFuelField.setText(Integer.toString(airport.getFuelForArrivingPlanes()));
        departingFuelField.setText(Integer.toString(airport.getFuelForDepartingPlanes()));
        sOptionsDialog.setVisible(true);
    }//GEN-LAST:event_sOptionsActionPerformed

    private void sOptionsOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sOptionsOKActionPerformed
        airport.setProbabilityForDefect(defectSlider.getValue());
        airport.setSimulationSpeed(speedSlider.getMaximum() - ((speedSlider.getValue() == speedSlider.getMaximum()) ? speedSlider.getMaximum() - 1 : speedSlider.getValue()));
        airport.setFuelForArrivingPlanes(Integer.parseInt(arrivingFuelField.getText()));
        airport.setFuelForDepartingPlanes(Integer.parseInt(departingFuelField.getText()));
    }//GEN-LAST:event_sOptionsOKActionPerformed

    private void sOptionsCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sOptionsCancelActionPerformed
        sOptionsDialog.setVisible(false);
    }//GEN-LAST:event_sOptionsCancelActionPerformed

    private void speedSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speedSliderMouseReleased
        currentSpeed.setText(Integer.toString(speedSlider.getValue()));
    }//GEN-LAST:event_speedSliderMouseReleased

    private void defectSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defectSliderMouseReleased
        currentProbability.setText(Double.toString((double)defectSlider.getValue()/100) + "%");
    }//GEN-LAST:event_defectSliderMouseReleased

    private void planesPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planesPanelMouseClicked
        airport.planes.get("1").setHeading(evt.getPoint());
    }//GEN-LAST:event_planesPanelMouseClicked

    private void takeRoleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeRoleButtonActionPerformed

        takeRoleDialog.setVisible(true);
    }//GEN-LAST:event_takeRoleButtonActionPerformed

    private void weatherSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weatherSliderMouseReleased
        airport.setWeatherCondition(weatherSlider.getValue());
        setWeatherLabel(weatherSlider.getValue());
    }//GEN-LAST:event_weatherSliderMouseReleased

    private void sendPlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPlaneActionPerformed
        Airplane newplane = null;
        if (destinationBox.getSelectedItem().equals("UNSPECIFIED"))
            newplane = airport.newLeavingPlane();
        else
            newplane = airport.newLeavingPlane((String)destinationBox.getSelectedItem());

        planesPanel.add(newplane);
        planesPanel.setComponentZOrder(newplane, 0);
        newplane.setBounds(planesPanel.getBounds());
        newplane.setVisible(true);
        airport.sendPlane(newplane);
    }//GEN-LAST:event_sendPlaneActionPerformed

    private void takeRoleOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeRoleOKActionPerformed
        this.setTitle(this.getTitle() + " " + airportLocationBox.getSelectedItem().toString());
        airport.setCity(airportLocationBox.getSelectedItem().toString());
        airport.setupNewNet();

        String[] responseArray = airport.getCommunicator(addressField.getText()).getDestinations();
        if (responseArray != null) {
            for (String aLocation : responseArray) {
                destinationBox.addItem(aLocation);
            }
            destinationBox.setEnabled(true);
        }
        takeRoleDialog.setVisible(false);
        takeRoleButton.setEnabled(false);
    }//GEN-LAST:event_takeRoleOKActionPerformed

    private void takeRoleCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeRoleCancelActionPerformed
        takeRoleDialog.setVisible(false);
    }//GEN-LAST:event_takeRoleCancelActionPerformed

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        String[] responseArray = airport.getCommunicator(addressField.getText()).getEverything();
        if (responseArray != null) {
            for (String aLocation : responseArray) {
                airportLocationBox.addItem(aLocation);
            }
            airportLocationBox.setEnabled(true);
            connectButton.setEnabled(false);
        } else
            addressField.setText("Bad host!");
    }//GEN-LAST:event_connectButtonActionPerformed

    private void airportLocationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airportLocationBoxActionPerformed
        takeRoleOK.setEnabled(true);
    }//GEN-LAST:event_airportLocationBoxActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (!airport.communicatorIsNull()) airport.getCommunicator("").finalize();
    }//GEN-LAST:event_formWindowClosing


    protected void saidHelloActionPerformed(String newPort) {
        destinationBox.addItem(newPort);
    }


    protected void saidByeActionPerformed(String leavingPort) {
        destinationBox.removeItem(leavingPort);
    }

    protected void newIncomingPlaneActionPerformed(String ID, int fuel) {
        Airplane newplane = airport.newIncomingPlane(ID, fuel);
        planesPanel.add(newplane);
        planesPanel.setComponentZOrder(newplane, 0);
        newplane.setBounds(planesPanel.getBounds());
        newplane.setVisible(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainWindow.getInstance().setVisible(true);
            }
        });
        System.runFinalization();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JComboBox airportLocationBox;
    private javax.swing.JTextField arrivingFuelField;
    private javax.swing.JButton connectButton;
    private javax.swing.JLabel currentProbability;
    private javax.swing.JLabel currentSpeed;
    private javax.swing.JSlider defectSlider;
    private javax.swing.JTextField departingFuelField;
    private javax.swing.JComboBox destinationBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel landingDeniedLabel;
    private javax.swing.JButton newPlane;
    private javax.swing.JPanel planesPanel;
    private javax.swing.JButton sOptions;
    private javax.swing.JButton sOptionsCancel;
    private javax.swing.JDialog sOptionsDialog;
    private javax.swing.JButton sOptionsOK;
    private javax.swing.JButton sendPlane;
    private javax.swing.JSlider speedSlider;
    private javax.swing.JButton takeRoleButton;
    private javax.swing.JButton takeRoleCancel;
    private javax.swing.JDialog takeRoleDialog;
    private javax.swing.JButton takeRoleOK;
    private javax.swing.JLabel weatherLabel;
    private javax.swing.JSlider weatherSlider;
    // End of variables declaration//GEN-END:variables

}

