package com.jdtp.introduction.dao;

/**
 *
 * @author jhoja
 */
public class UserDAO {
    private static final String SQL_SELECT = "SELECT id, cedula, nombre, email, telefono FROM registro";
    private static final String SQL_INSERT = "INSERT INTO registro(cedula, nombre, email, telefono)VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE registro SET cedula = ?, nombre=?, email = ?, telefono=? WHERE id=?";
    private static final String SQL_UPDATE_CEDULA = "UPDATE registro SET cedula = ? WHERE id=?";
    private static final String SQL_UPDATE_NOMBRE = "UPDATE registro SET nombre = ? WHERE id = ?";
    private static final String SQL_UPDATE_EMAIL = "UPDATE registro SET email = ? WHERE id = ?";
    private static final String SQL_UPDATE_TELEFONO = "UPDATE registro SET telefono = ? WHERE id=?";
    private static final String SQL_DELETE = "DELETE FROM registro WHERE id = ?";
    
    
    
}
