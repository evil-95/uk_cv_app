/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Genererphoto extends InfoPerso1{
     public void btn() {
        com.itextpdf.text.Font  titleFont = FontFactory.getFont(FontFactory.TIMES_BOLD, 18);
	com.itextpdf.text.Font subtitleFont = FontFactory.getFont(FontFactory.TIMES_BOLD, 12);
	com.itextpdf.text.Font  textFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
        
        Connection connect = null;
        Document document = new Document();
        
        //image
        String image= null;
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
            PreparedStatement ps = connect.prepareStatement("SELECT * FROM cvbuilderphotodatabase");
	    ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                //photo
                image = resultSet.getString(10);
                
                //info personelles
                nom ="   \t"+resultSet.getString(1);
                tel = "TEL :"+" "+resultSet.getString(2);
                email ="Email :"+" "+ resultSet.getString(3);
                localisation ="Localisation :" +" "+resultSet.getString(4);
                competences = "Competences :"+" "+resultSet.getString(5);
                loisir = "Loisir :"+" "+resultSet.getString(6);
                profil = "Profil :"+" "+resultSet.getString(7);
                
                //experiences pro
                formation = "Formation :"+" "+resultSet.getString(8);
                experience = "Experience :"+" "+resultSet.getString(9);
            }
            
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\CV_photo.pdf"));
                document.open();
                
                Paragraph Image = new Paragraph(image,titleFont);
                document.add(Image);

                Paragraph Nom = new Paragraph(nom,titleFont);
                document.add(Nom);
                
                Paragraph I = new Paragraph("\nINFORMATIONS PERSONNELLES", FontFactory.getFont(FontFactory.HELVETICA,18,Font.BOLD,BaseColor.BLUE));
		document.add(I);
                
                Paragraph Ye = new Paragraph("--------------------------------------------------------------------------------------------");
                document.add(Ye);
                
                Paragraph Tel = new Paragraph(tel,subtitleFont);
                document.add(Tel);
                
                Paragraph Email = new Paragraph(email,subtitleFont);
                document.add(Email);
                
                Paragraph Localisation = new Paragraph(localisation,subtitleFont);
                document.add(Localisation);
                
                Paragraph Competences = new Paragraph(competences,subtitleFont);
                document.add(Competences);
                
                Paragraph Loisir = new Paragraph(loisir,subtitleFont);
                document.add(Loisir);
                
                Paragraph Profil = new Paragraph(profil,subtitleFont);
                document.add(Profil);
                
                Paragraph E = new Paragraph("\nEXPERIENCE PROFESSIONEL", FontFactory.getFont(FontFactory.HELVETICA,18,Font.BOLD,BaseColor.BLUE));
		document.add(E);
                
                Paragraph Y = new Paragraph("--------------------------------------------------------------------------------------------");
                document.add(Y);
                
                Paragraph Formation = new Paragraph(formation,subtitleFont);
                document.add(Formation);
                
                Paragraph Experience = new Paragraph(experience,subtitleFont);
                document.add(Experience);
                
                //Declaration
	        Paragraph D = new Paragraph("\nDeclaration:", titleFont);
		document.add(D);
		Paragraph DL = new Paragraph("Je declare par la presente que les informations fournies ci-dessus sont vraies et exactes.", textFont);
		document.add(DL);
				         
		 //Signature
		Paragraph S = new Paragraph("Date:______________________                   Signature:__________________________", textFont);
		document.add(S);
				         
		 document.addCreationDate();
            
        
        
        
//          Font font = new Font();
//          Paragraph p = new Paragraph( );
          
//        Font f = new Font(Font.FontFamily.HELVETICA, 25.0f, Font.BOLD,BaseColor.BLUE);
////        Chunk c = new Chunk("Name " + firstNF.getText(), f);
////        c.setBackground(BaseColor.RED);
//        Paragraph p = new Paragraph();
//        p.add(firstNF.getText());
      /*  Paragraph[] paragraph ={
            new Paragraph("image"+jLabel12.getText()),
            new Paragraph("INFORMATIONS PERSONELLES",FontFactory.getFont(FontFactory.HELVETICA,18,Font.BOLD,BaseColor.BLUE) ),
            new Paragraph("------------------------------------------------------------------------"),
//            new Paragraph(new Chunk("Notes: ")),
            new Paragraph("Nom et prenom :" + jTextField1.getSelectedText()),
            new Paragraph("Tel :"+ jTextField2.getText()),
            new Paragraph("Email :"+ jTextField3.getText()),
            //new Paragraph("D.O.B :"+d.getValue().toString()),
           // new Paragraph("state :"+statel.getValue()),
            //new Paragraph("City :"+cityF.getText()),
           // new Paragraph("Nationality :"+nationl.getValue()),
            new Paragraph("Localisation :"+ jComboBox1.getSelectedItem().toString()),
            //new Paragraph("Gender :"+sex1.getValue()),
            new Paragraph("Competence :" +jTextArea1.getText()),
            new Paragraph("Langue :" +jTextArea2.getText()),
            new Paragraph("Loisir :" +jTextArea3.getText()),
            new Paragraph("Profil :"+jTextArea4.getText()),
            new Paragraph("EXPERIENCES PROFESSIONNELLES",FontFactory.getFont(FontFactory.HELVETICA,18,Font.BOLD, BaseColor.BLUE) ),
            new Paragraph("------------------------------------------------------------------------"),
            new Paragraph(),
            new Paragraph("formations : "+jTextArea5.getText()),
            new Paragraph("experiences : "+jTextArea6.getText()),*/
            /*new Paragraph("*"+skill2.getText()),
            new Paragraph("*"+skill3.getText()),
            new Paragraph(),
            new Paragraph("PREVIOUS JOBS DONE",FontFactory.getFont(FontFactory.HELVETICA,18, BaseColor.BLUE)),
            new Paragraph("------------------------------------------------------------------------"),
            new Paragraph(),
            new Paragraph("Previous Company :"+comF.getText()),
            new Paragraph("Department :"+deptF.getText()),
            new Paragraph("Previous Company :"+comF2.getText()),
            new Paragraph("Department :"+deptF2.getText()),
            new Paragraph(),
            new Paragraph("QUALIFICATION",FontFactory.getFont(FontFactory.HELVETICA,18, BaseColor.BLUE)),
            new Paragraph("------------------------------------------------------------------------"),
            new Paragraph(),
            new Paragraph("primary certificate :"+jsceF.getText()),
            new Paragraph("Secondary certificate :"+ssceF.getText()),
            new Paragraph("Tertiary certificate :"+bsceF.getText()),*/
            
            
      //  };

      /*  for (int i =0;i<paragraph.length;i++){
            document.add(paragraph[i]);
        }*/
        
        document.close();
        
        writer.close();
        
        
            System.out.println("successful");
             // create a alert
           //Alert a = new Alert(AlertType.CONFIRMATION);
           JOptionPane.showMessageDialog(null, "votre cv a été généré avec success");
           //a.show();
        }catch(Exception e){
            System.out.println(e);
        }
     }
    
}
