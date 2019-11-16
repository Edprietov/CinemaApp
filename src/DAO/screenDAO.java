/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;

/**
 * @author Edisson
 */
public class screenDAO {
    
    connectionDB con = new connectionDB();//Objeto para conectarse a la base de datos
    Connection cn = con.conexion();
    
    
    
    
}
