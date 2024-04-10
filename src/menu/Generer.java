/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;*/
/*import static javafx.scene.text.Font.font;
import javafx.scene.text.FontWeight;*/
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Generer extends InfoPerso2 {
     public void btn() {
        com.itextpdf.text.Font  titleFont = FontFactory.getFont(FontFactory.TIMES_BOLD, 18);
	com.itextpdf.text.Font subtitleFont = FontFactory.getFont(FontFactory.TIMES_BOLD, 15);
	com.itextpdf.text.Font  textFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
        
        Connection connect = null;
        Document docs = new Document();
        //information personnelles
        
        String nom= null;
        String tel= null;
        String email= null;
        String localisation= null;
        String competences= null;
        String loisir= null;
        String profil= null;
        
        //experiences professionnelles
        
        String formation= null;
        String experience= null;

        try{
             Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/cv_builder" , "root" , "");
            PreparedStatement ps = connect.prepareStatement("select * from cvbuilderdatabase");
	    ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                nom = "Nom :"+" "+resultSet.getString(1);
                tel = "Telephone :"+" "+resultSet.getString(2);
                email = "Email :"+" "+resultSet.getString(3);
                localisation = "Localisation :"+" "+resultSet.getString(4);
                competences = "Competences :"+" "+resultSet.getString(5);
                loisir = "Loisir :"+" "+resultSet.getString(6);
                profil = "Profil :"+" "+resultSet.getString(7);
                
                //experiences pro
                formation = "Formation :"+" "+resultSet.getString(8);
                experience = "Experience :"+" "+resultSet.getString(9);
            }
            PdfWriter writer = PdfWriter.getInstance(docs, new FileOutputStream("C:\\Users\\ACER\\3D Objects\\CV_généré.pdf"));
                docs.open();
                

                Paragraph Nom = new Paragraph(nom,titleFont);
                docs.add(Nom);
                
                Paragraph I = new Paragraph("\nINFORMATIONS PERSONNELLES", FontFactory.getFont(FontFactory.HELVETICA,18,Font.BOLD,BaseColor.BLUE));
		docs.add(I);
                
                Paragraph Ye = new Paragraph("-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-");
                docs.add(Ye);
                
                Paragraph Tel = new Paragraph(tel,subtitleFont);
                docs.add(Tel);
                
                Paragraph Email = new Paragraph(email,subtitleFont);
                docs.add(Email);
                
                Paragraph Localisation = new Paragraph(localisation,subtitleFont);
                docs.add(Localisation);
                
                Paragraph Competences = new Paragraph(competences,subtitleFont);
                docs.add(Competences);
                
                Paragraph Loisir = new Paragraph(loisir,subtitleFont);
                docs.add(Loisir);
                
                Paragraph Profil = new Paragraph(profil,subtitleFont);
                docs.add(Profil);
                
                Paragraph E = new Paragraph("\nEXPERIENCE PROFESSIONEL", FontFactory.getFont(FontFactory.HELVETICA,18,Font.BOLD,BaseColor.BLUE));
		docs.add(E);
                
                Paragraph Y = new Paragraph("-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-");
                docs.add(Y);
                
                Paragraph Formation = new Paragraph(formation,subtitleFont);
                docs.add(Formation);
                
                Paragraph Experience = new Paragraph(experience,subtitleFont);
                docs.add(Experience);
                
                //Declaration
	        Paragraph D = new Paragraph("\nDeclaration:", titleFont);
		docs.add(D);
		Paragraph DL = new Paragraph("Je declare  que les informations fournies ci-dessus sont vraies et exactes.", textFont);
		docs.add(DL);
				         
		 //Signature
		Paragraph S = new Paragraph("Date:______________________                   Signature:__________________________", textFont);
		docs.add(S);
				         
		 docs.addCreationDate();
				         
				         

        

        
        docs.close();
        writer.close();
        
        
            System.out.println("successful");
             //  alert

           JOptionPane.showMessageDialog(null, "votre cv a été généré avec success");
        }catch(Exception e){
            System.out.println(e);
        }
     }
    
}
