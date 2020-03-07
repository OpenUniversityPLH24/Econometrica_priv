/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package econometrica_priv;

import Connections.DBManager;
import econometrica_GUI.MainForm;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author vborotis
 */
public class Econometrica_priv {

    final String msg = new String();
    protected static EntityManager em;
    protected static DBManager dbm;
    
   public static void main(String[] args) throws ParseException, FileNotFoundException, SQLException {
        
        
        
        if (em == null)
        {
            //ΚΛΗΣΗ FINAL CLASS DbConnectHelper ΓΙΑ ΣΥΝΔΕΣΗ ΣΤΗ ΒΑΣΗ
            //ΚΑΙ ΔΗΜΙΟΥΡΓΙΑ entity factory ΚΑΙ entity manager
            DBManager.connect();
            em = DBManager.getEm();
        }

    MainForm mf = new MainForm();
    mf.setVisible(true);
    mf.pack();
    RefineryUtilities.centerFrameOnScreen(mf);
    mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
    }
}

