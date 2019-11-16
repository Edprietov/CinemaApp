/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 * @author Edisson
 */
public class screenDAO {
    
    connectionDB con = new connectionDB();//Objeto para conectarse a la base de datos
    Connection cn = con.conexion();
    
        public void create(Movie newMovie){
           try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO MOVIES(Title,Runtime,Rating,Genre,Is3D,Is4D,Languages,ReleaseDate) VALUES(?,?,?,NULL,NULL,NULL,NULL,NULL)");
            pps.setString(1,newMovie.getTitle() );
            pps.setInt(2,newMovie.getRuntime() );
            pps.setString(3,newMovie.getRating() );
           /* pps.setString(4,newMovie.getReleaseDate() );
            pps.setBoolean(5,newMovie.isIs3D() );
            pps.setBoolean(6,newMovie.isIs4D() );
            pps.setString(7,newMovie.getGenre() );
            pps.setString(8,newMovie.getLanguages() );*/
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos guardados");
        } catch (Exception e) {
          
        }
    }
    
    
    
    
}
